package com.itquasar.multiverse.jmacro.commands.datax.commands.ldap;

import lombok.extern.log4j.Log4j2;

import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Properties;

@Log4j2
public class LDAPUtil {

    public static DirContext getContext(Properties props) {
        DirContext ctx = null;
        try {
            ctx = new InitialDirContext(props);
        } catch (NamingException e) {
            LOGGER.error("Error initializing LDAP context.", e);
        }
        return ctx;
    }
}
