package org.jannsen.mccoupon.client;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;
import org.jannsen.mccoupon.client.request.Request;
import org.jannsen.mccoupon.client.response.Response;
import org.jannsen.mccoupon.client.response.status.ErrorStatus;
import org.jannsen.mccoupon.client.response.status.Status;

import java.io.IOException;

class McCouponBase {

    private final HttpRequestFactory factory = new NetHttpTransport().createRequestFactory();
    private final Gson gson = new Gson();

    <T extends Response> T queryGet(Request request, Class<T> clazz)  {
        try {
            String url = request.getUrl();
            HttpRequest httpRequest = factory.buildGetRequest(new GenericUrl(url));
            return query(httpRequest, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createInstance(clazz);
    }

    private <T extends Response> T query(HttpRequest request, Class<T> clazz) {
        try {
            return gson.fromJson(request.execute().parseAsString(), clazz);
        } catch (HttpResponseException e) {
            e.printStackTrace();
        } catch (IOException ignored) {}
        return createInstance(clazz);
    }

    private <T extends Response> T createInstance(Class<T> clazz) {
        try {
            Status status = new Status(ErrorStatus.class, ErrorStatus.UNDEFINED_ERROR);
            return clazz.getConstructor(Status.class).newInstance(status);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
