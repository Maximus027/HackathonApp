package nyc.c4q.maxrosado.hackathonapp.models.bike_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tarynking on 2/18/17.
 */
public class Network implements Serializable
{

    @SerializedName("company")
    @Expose
    private List<String> company = null;
    @SerializedName("gbfs_href")
    @Expose
    private String gbfsHref;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stations")
    @Expose
    private List<Station> stations = null;
    private final static long serialVersionUID = -9207349238758441231L;

    public List<String> getCompany() {
        return company;
    }

    public void setCompany(List<String> company) {
        this.company = company;
    }

    public String getGbfsHref() {
        return gbfsHref;
    }

    public void setGbfsHref(String gbfsHref) {
        this.gbfsHref = gbfsHref;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

}
