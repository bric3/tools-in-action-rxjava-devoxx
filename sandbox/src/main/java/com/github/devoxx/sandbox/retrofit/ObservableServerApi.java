package com.github.devoxx.sandbox.retrofit;

import java.util.List;
import com.github.devoxx.sandbox.model.Actor;
import com.github.devoxx.sandbox.model.Movie;
import com.github.devoxx.sandbox.model.Synopsis;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface ObservableServerApi {


    @GET("/movies")
    Observable<List<Movie>> movies();

    @GET("/movies/cast/{id}")
    Observable<List<Actor>> actors(@Path("id") String id);

    @GET("/movies/synopsis/{id}")
    Observable<Synopsis> synopsis(@Path("id") String id);

    @GET("/movies/translation/{id}/{lang}")
    Observable<Movie> translation(@Path("id") String id, @Path("lang") String lang);

    @GET("/movies/traduction/{id}/{lang}")
    @Deprecated
    Observable<Movie> traduction(@Path("id") String id, @Path("lang") String lang);

    @GET("/movie/random")
    Observable<Movie> random();

    @GET("/search/{id}")
    Observable<Movie> search(@Path("id") String id);

}
