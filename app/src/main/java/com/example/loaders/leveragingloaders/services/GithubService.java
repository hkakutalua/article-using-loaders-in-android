package com.example.loaders.leveragingloaders.services;

import com.example.loaders.leveragingloaders.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by henrick on 4/2/18.
 */

public interface GithubService {
    @GET("users")
    Call<List<User>> getUsers();
}