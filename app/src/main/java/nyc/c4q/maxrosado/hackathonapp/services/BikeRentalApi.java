package nyc.c4q.maxrosado.hackathonapp.services;

import nyc.c4q.maxrosado.hackathonapp.models.bike_models.BikeRental;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 2/18/17.
 */

public interface BikeRentalApi {

    //https://api.citybik.es/v2/networks/citi-bike-nyc
    @GET("v2/networks/citi-bike-nyc")
    Call<BikeRental> getNetworks();
}
