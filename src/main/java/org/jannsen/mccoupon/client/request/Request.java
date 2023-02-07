package org.jannsen.mccoupon.client.request;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.HttpContent;
import com.google.gson.Gson;

public abstract class Request {

    private final transient String apiUri;

    public Request(String apiUri) {
        this.apiUri = apiUri;
    }

    public abstract String getPath();

    public String getUrl() {
        return apiUri + getPath();
    }

    public HttpContent getContent() {
        return ByteArrayContent.fromString("application/json", new Gson().toJson(this));
    }
}
