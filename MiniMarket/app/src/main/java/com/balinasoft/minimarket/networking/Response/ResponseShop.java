package com.balinasoft.minimarket.networking.Response;

import com.balinasoft.minimarket.models.Shops.Shop;

/**
 * Created by Microsoft on 19.07.2016.
 */
public class ResponseShop extends BaseResponse {
    public Shop getResult() {
        return result;
    }

    public void setResult(Shop result) {
        this.result = result;
    }

    Shop result;
}
