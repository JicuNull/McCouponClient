package org.jannsen.mccoupon.client.response;

import org.jannsen.mccoupon.client.response.status.Status;
import org.jannsen.mcreverse.api.entity.redeem.Code;

public class CodeResponse extends Response {

    private Code response;

    public CodeResponse(Status status) {
        super(status);
    }

    public CodeResponse(Code response) {
        this.response = response;
    }

    @Override
    public Code getResponse() {
        return response;
    }
}
