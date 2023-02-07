package org.jannsen.mccoupon.client.request;

public class CodeRequest extends Request {

    private int id;

    public CodeRequest(String apiUrl) {
        super(apiUrl);
    }

    public CodeRequest setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String getPath() {
        return "/code/?id=" + id;
    }
}
