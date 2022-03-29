package com.itquasar.multiverse.jmacro.installer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public interface KeyFunctions {

    default PrivateKey readPrivateKey(Path keyFile, String keyAlgorithm) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(keyAlgorithm).generatePrivate(this.readKey(keyFile));
    }

    default PublicKey readPublicKey(Path keyFile, String keyAlgorithm) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        return readPublicKey(this.readKey(keyFile), keyAlgorithm);
    }

    default PublicKey readPublicKey(String key, String keyAlgorithm) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return readPublicKey(this.readKey(key), keyAlgorithm);
    }

    default PublicKey readPublicKey(PKCS8EncodedKeySpec key, String keyAlgorithm) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(keyAlgorithm).generatePublic(key);
    }

    default PKCS8EncodedKeySpec readKey(Path keyFile) throws IOException {
        return readKey(Files.readString(keyFile));
    }

    default PKCS8EncodedKeySpec readKey(String pkcs8Pem) {
        pkcs8Pem = pkcs8Pem.replace("-----BEGIN PRIVATE KEY-----", "");
        pkcs8Pem = pkcs8Pem.replace("-----END PRIVATE KEY-----", "");
        pkcs8Pem = pkcs8Pem.replaceAll("\\s+", "");
        // Base64 decode the result
        byte[] pkcs8EncodedBytes = Base64.getDecoder().decode(pkcs8Pem);
        // extract the private key
        return new PKCS8EncodedKeySpec(pkcs8EncodedBytes);
    }
}
