package nyc.c4q.maxrosado.hackathonapp.models.bike_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by tarynking on 2/18/17.
 */
public class Station implements Serializable
{

    @SerializedName("empty_slots")
    @Expose
    private Long emptySlots;
    @SerializedName("extra")
    @Expose
    private Extra extra;
    @SerializedName("free_bikes")
    @Expose
    private Long freeBikes;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    private final static long serialVersionUID = 846976242562991070L;

    public Long getEmptySlots() {
        return emptySlots;
    }

    public void setEmptySlots(Long emptySlots) {
        this.emptySlots = emptySlots;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public Long getFreeBikes() {
        return freeBikes;
    }

    public void setFreeBikes(Long freeBikes) {
        this.freeBikes = freeBikes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
