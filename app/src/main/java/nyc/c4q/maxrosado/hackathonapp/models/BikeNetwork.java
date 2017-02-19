package nyc.c4q.maxrosado.hackathonapp.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tarynking on 2/18/17.
 */

public class BikeNetwork implements Serializable
{

    private List<String> company = null;
    private String href;
    private BikeLocation location;
    private String name;
    private final static long serialVersionUID = 136745345633175627L;

    public List<String> getCompany() {
        return company;
    }

    public void setCompany(List<String> company) {
        this.company = company;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public BikeLocation getLocation() {
        return location;
    }

    public void setLocation(BikeLocation location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
