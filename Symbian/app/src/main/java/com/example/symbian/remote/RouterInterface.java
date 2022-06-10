package com.example.symbian.remote;

import com.example.symbian.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RouterInterface {

    @POST("user/createUser")
    Call<User> createUser(@Body User user);
}
