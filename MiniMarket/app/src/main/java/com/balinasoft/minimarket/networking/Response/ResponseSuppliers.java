package com.balinasoft.minimarket.networking.Response;

import com.balinasoft.minimarket.models.modelUsers.Supplier;

import java.util.ArrayList;

/**
 * Created by Microsoft on 24.06.2016.
 */
public class ResponseSuppliers extends BaseResponse{
    public ArrayList<Supplier> getResult() {
        return result;
    }

    public void setResult(ArrayList<Supplier> result) {
        this.result = result;
    }

    ArrayList<Supplier> result;
}
