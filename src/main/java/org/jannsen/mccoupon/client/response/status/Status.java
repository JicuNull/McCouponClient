package org.jannsen.mccoupon.client.response.status;

public class Status {

    private final String type, message;

    public Status() {
        this.type = ErrorStatus.OK;
        this.message = "";
    }

    public Status(Class<?> errorClass, String message) {
        this.type = errorClass.getSimpleName();
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
