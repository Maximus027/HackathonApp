package nyc.c4q.maxrosado.hackathonapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by tarynking on 2/18/17.
 */
public class BikeRental implements Serializable
{

    @SerializedName("network")
    @Expose
    private Network network;
    private final static long serialVersionUID = 5387557171926702746L;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

}
