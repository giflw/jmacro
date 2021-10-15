package com.itquasar.multiverse.jmacro.commands.io.commands.request

import org.apache.hc.client5.http.fluent.Content
import org.apache.hc.core5.http.ClassicHttpResponse
import org.apache.hc.core5.http.ContentType
import org.apache.hc.core5.http.HttpEntity
import org.apache.hc.core5.http.io.HttpClientResponseHandler
import org.apache.hc.core5.http.io.entity.EntityUtils

class ResponseAndContentHttpresponseHandler implements HttpClientResponseHandler<Tuple> {

    /**
     * Read the entity from the response body and pass it to the entity handler
     * method if the response was successful (a 2xx status code). If no response
     * body exists, this returns null. If the response was unsuccessful (&gt;= 300
     * status code), throws an {@link org.apache.hc.client5.http.HttpResponseException}.
     */
    @Override
    Tuple handleResponse(final ClassicHttpResponse response) throws IOException {
        final HttpEntity entity = response.getEntity()
        return new Tuple(response, entity == null ? null : handleEntity(entity))
    }

    Content handleEntity(HttpEntity entity) throws IOException {
        return entity != null && entity.contentType != null ? new Content(EntityUtils.toByteArray(entity), ContentType.parse(entity.getContentType())) : Content.NO_CONTENT;
    }
}
