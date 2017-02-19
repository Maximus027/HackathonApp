package nyc.c4q.maxrosado.hackathonapp.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by tarynking on 2/18/17.
 */
//http://nycgovparks.org/bigapps/DPR_Hiking_001.xml

@Root(name = "hiking")
public class Hiking {

    @ElementList(name = "facility", inline = true, required = false)
    List<Facility> facility;



    public List<Facility> getFacility() { return this.facility; }
    public void setFacility(List<Facility> _value) { this.facility = _value; }



    public static class Facility {

        @Element(name="Prop_ID", required = false)
        String prop_ID;


        @Element(name="Name", required = false)
        String name;


        @Element(name="Location", required = false)
        String location;


        @Element(name="Park_Name", required = false)
        String park_Name;


        @Element(name="Length", required = false)
        String length;


        @Element(name="Difficulty", required = false)
        String difficulty;


        @Element(name="Other_Details", required = false)
        String other_Details;


        @Element(name="Accessible", required = false)
        String accessible;


        @Element(name="Limited_Access", required = false)
        String limited_Access;


        @Element(name="lat", required = false)
        String lat;


        @Element(name="lon", required = false)
        String lon;



        public String getProp_ID() { return this.prop_ID; }
        public void setProp_ID(String _value) { this.prop_ID = _value; }


        public String getName() { return this.name; }
        public void setName(String _value) { this.name = _value; }


        public String getLocation() { return this.location; }
        public void setLocation(String _value) { this.location = _value; }


        public String getPark_Name() { return this.park_Name; }
        public void setPark_Name(String _value) { this.park_Name = _value; }


        public String getLength() { return this.length; }
        public void setLength(String _value) { this.length = _value; }


        public String getDifficulty() { return this.difficulty; }
        public void setDifficulty(String _value) { this.difficulty = _value; }


        public String getOther_Details() { return this.other_Details; }
        public void setOther_Details(String _value) { this.other_Details = _value; }


        public String getAccessible() { return this.accessible; }
        public void setAccessible(String _value) { this.accessible = _value; }


        public String getLimited_Access() { return this.limited_Access; }
        public void setLimited_Access(String _value) { this.limited_Access = _value; }


        public String getLat() { return this.lat; }
        public void setLat(String _value) { this.lat = _value; }


        public String getLon() { return this.lon; }
        public void setLon(String _value) { this.lon = _value; }


    }
}