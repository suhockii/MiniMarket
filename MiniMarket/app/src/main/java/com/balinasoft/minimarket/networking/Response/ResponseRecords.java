package com.balinasoft.minimarket.networking.Response;

import com.balinasoft.minimarket.models.Service;

import java.util.ArrayList;

/**
 * Created by Microsoft on 13.07.2016.
 */
public class ResponseRecords extends BaseResponse{
    public ArrayList<Service> getResult() {
        return result;
    }

    public void setResult(ArrayList<Service> result) {
        this.result = result;
    }

    ArrayList<Service> result;
}
