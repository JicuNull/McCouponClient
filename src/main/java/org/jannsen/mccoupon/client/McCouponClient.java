package org.jannsen.mccoupon.client;

import org.jannsen.mccoupon.client.request.OffersRequest;
import org.jannsen.mccoupon.client.request.CodeRequest;
import org.jannsen.mccoupon.client.response.CodeResponse;
import org.jannsen.mccoupon.client.response.OfferResponse;

public class McCouponClient extends McCouponBase {

    private final String API_URI;

    public McCouponClient(String apiUri) {
        this.API_URI = apiUri;
    }

    public OfferResponse getOffers() {
        return queryGet(new OffersRequest(API_URI), OfferResponse.class);
    }

    public CodeResponse getCode(int id) {
        return queryGet(new CodeRequest(API_URI).setId(id), CodeResponse.class);
    }
}
