package org.jannsen.mccoupon.client.response;

import org.jannsen.mccoupon.client.response.status.Status;
import org.jannsen.mcreverse.api.entity.stream.OfferImage;

public class OfferImageResponse extends Response {

    private OfferImage response;

    public OfferImageResponse(Status status) {
        super(status);
    }

    public OfferImageResponse(OfferImage response) {
        this.response = response;
    }

    @Override
    public OfferImage getResponse() {
        return response;
    }
}
