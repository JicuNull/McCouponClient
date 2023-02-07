package org.jannsen.mccoupon.client.request;

public class OffersRequest extends Request {

    public OffersRequest(String apiUri) {
        super(apiUri);
    }

    @Override
    public String getPath() {
        return "/offers";
    }
}
