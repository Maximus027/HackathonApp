package nyc.c4q.maxrosado.hackathonapp.models.bike_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by tarynking on 2/18/17.
 */
public class Extra implements Serializable
{

    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("last_updated")
    @Expose
    private Long lastUpdated;
    @SerializedName("renting")
    @Expose
    private Long renting;
    @SerializedName("returning")
    @Expose
    private Long returning;
    @SerializedName("uid")
    @Expose
    private String uid;
    private final static long serialVersionUID = -5860707890416206874L;

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getRenting() {
        return renting;
    }

    public void setRenting(Long renting) {
        this.renting = renting;
    }

    public Long getReturning() {
        return returning;
    }

    public void setReturning(Long returning) {
        this.returning = returning;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
