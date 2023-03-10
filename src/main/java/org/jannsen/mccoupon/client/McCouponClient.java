package org.jannsen.mccoupon.client;

import org.jannsen.mccoupon.client.entity.OfferType;
import org.jannsen.mccoupon.client.request.OfferImageRequest;
import org.jannsen.mccoupon.client.request.OffersRequest;
import org.jannsen.mccoupon.client.request.CodeRequest;
import org.jannsen.mccoupon.client.response.CodeResponse;
import org.jannsen.mccoupon.client.response.OfferImageResponse;
import org.jannsen.mccoupon.client.response.OfferResponse;
import org.jannsen.mcreverse.api.entity.offer.Offer;

public class McCouponClient extends McCouponBase {

    private final String API_URI;

    public McCouponClient(String apiUri) {
        this.API_URI = apiUri;
    }

    public OfferResponse getOffers() {
        return getOffers(OfferType.STANDARD);
    }

    public OfferResponse getOffers(OfferType type) {
        return queryGet(new OffersRequest(API_URI).setType(type), OfferResponse.class);
    }

    public CodeResponse getCode(int id) {
        return queryGet(new CodeRequest(API_URI).setId(id), CodeResponse.class);
    }

    public OfferImageResponse getOfferImage(Offer offer) {
        return queryGet(new OfferImageRequest(API_URI).setName(offer.getImageBaseName()), OfferImageResponse.class);
    }
}
