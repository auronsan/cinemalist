package example.anshor.androidretrofit.service;

import example.anshor.androidretrofit.model.City;
import example.anshor.androidretrofit.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by anshor on 7/19/16.
 */
public interface ApiInterface {

    @GET("api/jadwal-bioskop")
    Call<City> getCity();

    @GET("api/jadwal-bioskop")
    Call<Movie> getMovie(
            @Query("id") String id);

}