package org.jannsen.mccoupon.client.response;

import org.jannsen.mccoupon.client.response.status.Status;
import org.jannsen.mcreverse.api.entity.offer.Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OfferResponse extends Response {

    private List<Offer> response;

    public OfferResponse(Status status) {
        super(status);
    }

    public OfferResponse(Offer response) {
        this(Collections.singletonList(response));
    }

    public OfferResponse(List<Offer> response) {
        this.response = response;
    }

    @Override
    public List<Offer> getResponse() {
        return response != null ? response : new ArrayList<>();
    }
}
