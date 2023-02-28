package org.jannsen.mccoupon.client.request;

public class OfferImageRequest extends Request {

    private String name;

    public OfferImageRequest(String apiUrl) {
        super(apiUrl);
    }

    public OfferImageRequest setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getPath() {
        return "/offers/image/?name=" + name;
    }
}
