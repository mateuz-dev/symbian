package com.example.symbian.remote;

public class APIUtils {

    private static final String API_URL = "http://10.107.144.6:3000/";

    public static RouterInterface symbianInterface(){

        return RetrofitClient.getClient(API_URL)
                .create(RouterInterface.class);
    }
}
