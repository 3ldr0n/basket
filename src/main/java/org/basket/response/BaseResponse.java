package org.basket.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BaseResponse {
    private String message;
    private Object data;

    public BaseResponse(String message) {
        this.message = message;
    }
}
