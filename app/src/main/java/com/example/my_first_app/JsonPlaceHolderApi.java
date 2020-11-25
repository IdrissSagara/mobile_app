package com.example.my_first_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts/1")
    Call<List<Post>> getPosts();
}
