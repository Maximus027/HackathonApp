package nyc.c4q.maxrosado.hackathonapp.services;

import nyc.c4q.maxrosado.hackathonapp.models.Parks;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 2/18/17.
 */

public interface ParksApi {

    //https://www.nycgovparks.org/bigapps/DPR_Parks_001.xml
    @GET("bigapps/DPR_Parks_001.xml")
    Call<Parks> getFacility();
}
