package nyc.c4q.maxrosado.hackathonapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarynking on 2/18/17.
 */

public class BikeRental {

    private List<BikeNetwork> networks = null;
    private final static long serialVersionUID = 4142664090985548974L;

    public List<BikeNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<BikeNetwork> networks) {
        this.networks = networks;
    }

    public List<BikeLocation> getBikeLocation() {
        List<BikeLocation> result = new ArrayList<>();
        if (networks != null && !networks.isEmpty()) {
            for (int i = 0; i < networks.size(); i++) {
                BikeNetwork bikeNetwork = networks.get(i);
                if (bikeNetwork != null) {
                    BikeLocation bikeLocation = bikeNetwork.getLocation();
                    if (bikeLocation != null) {
                        result.add(bikeLocation);
                    }
                }
            }
        }
        return result;
    }

}

