package com.arun.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JSONPlaceholder {

    @GET("posts")
    Call<List<Post>> getPost();

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
