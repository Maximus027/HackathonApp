package nyc.c4q.maxrosado.hackathonapp.models;

/**
 * Created by tarynking on 2/18/17.
 */

import java.io.Serializable;

public class BikeLocation implements Serializable
{

    private String city;
    private String country;
    private Float latitude;
    private Float longitude;
    private final static long serialVersionUID = -195582776218441468L;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

}
