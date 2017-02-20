package nyc.c4q.maxrosado.hackathonapp.services;

import nyc.c4q.maxrosado.hackathonapp.models.Basketball;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 2/18/17.
 */

public interface BasketballApi {

    //http://nycgovparks.org/bigapps/DPR_Basketball_001.xml
    @GET("bigapps/DPR_Basketball_001.xml")
    Call<Basketball> getFacility();
}
