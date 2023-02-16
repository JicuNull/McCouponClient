package org.jannsen.mccoupon.client.request;

public class OffersRequest extends Request {

    private boolean showAll;

    public OffersRequest(String apiUri) {
        super(apiUri);
    }

    public OffersRequest setShowAll(boolean enabled) {
        this.showAll = enabled;
        return this;
    }

    @Override
    public String getPath() {
        return "/offers" + (showAll ? "/all" : "");
    }
}
