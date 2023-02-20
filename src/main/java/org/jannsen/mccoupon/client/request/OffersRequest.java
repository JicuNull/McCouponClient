package org.jannsen.mccoupon.client.request;

import org.jannsen.mccoupon.client.entity.OfferType;

public class OffersRequest extends Request {

    private OfferType type;

    public OffersRequest(String apiUri) {
        super(apiUri);
    }

    public OffersRequest setType(OfferType type) {
        this.type = type;
        return this;
    }

    @Override
    public String getPath() {
        return "/offers" + (type == OfferType.ALL ? "/all" : "");
    }
}
