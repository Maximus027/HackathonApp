package nyc.c4q.maxrosado.hackathonapp.services;

import nyc.c4q.maxrosado.hackathonapp.models.Hiking;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 2/18/17.
 */

public interface HikingApi {

    //http://nycgovparks.org/bigapps/DPR_Hiking_001.xml
    @GET("bigapps/DPR_Hiking_001.xml")
    Call<Hiking> getFacility();
}
