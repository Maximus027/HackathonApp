package nyc.c4q.maxrosado.hackathonapp.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by tarynking on 2/18/17.
 */

//https://www.nycgovparks.org/bigapps/DPR_Parks_001.xml

@Root(name = "parks")
public class Parks {

    @Element(name="parsererror", required = false)
    Parsererror parsererror;


    @ElementList(name = "facility", inline = true, required = false)
    List<Facility> facility;



    public Parsererror getParsererror() { return this.parsererror; }
    public void setParsererror(Parsererror _value) { this.parsererror = _value; }


    public List<Facility> getFacility() { return this.facility; }
    public void setFacility(List<Facility> _value) { this.facility = _value; }



    public static class Parsererror {

        @ElementList(name = "h3", inline = true, required = false)
        List<String> h3;


        @Element(name="div", required = false)
        Div div;


        @Attribute(name="style", required = false)
        String style;



        public List<String> getH3() { return this.h3; }
        public void setH3(List<String> _value) { this.h3 = _value; }


        public Div getDiv() { return this.div; }
        public void setDiv(Div _value) { this.div = _value; }


        public String getStyle() { return this.style; }
        public void setStyle(String _value) { this.style = _value; }


    }

    public static class Div {

        @Attribute(name="style", required = false)
        String style;



        public String getStyle() { return this.style; }
        public void setStyle(String _value) { this.style = _value; }


    }

    public static class Facility {

        @Element(name="Prop_ID", required = false)
        String prop_ID;


        @Element(name="Name", required = false)
        String name;


        @Element(name="Location", required = false)
        String location;


        @Element(name="Zip", required = false)
        String zip;



        public String getProp_ID() { return this.prop_ID; }
        public void setProp_ID(String _value) { this.prop_ID = _value; }


        public String getName() { return this.name; }
        public void setName(String _value) { this.name = _value; }


        public String getLocation() { return this.location; }
        public void setLocation(String _value) { this.location = _value; }


        public String getZip() { return this.zip; }
        public void setZip(String _value) { this.zip = _value; }


    }
}
