//package nyc.c4q.maxrosado.hackathonapp;
//
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//import com.google.gson.reflect.TypeToken;
//
//import java.lang.reflect.Type;
//import java.util.Collections;
//import java.util.List;
//
//import nyc.c4q.maxrosado.hackathonapp.models.BikeLocation;
//import nyc.c4q.maxrosado.hackathonapp.models.BikeNetwork;
//
///**
// * Created by tarynking on 2/18/17.
// */
//public class BikeNetworkSerializer implements JsonDeserializer<BikeNetwork> {
//    @Override
//    public BikeNetwork deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//        JsonObject jsonObject = json.getAsJsonObject();
//
//        String name = jsonObject.getAsJsonPrimitive("name").getAsString();
//        String href = jsonObject.getAsJsonPrimitive("href").getAsString();
//
//        BikeLocation location = context.deserialize(jsonObject.getAsJsonObject("location"), BikeLocation.class);
//
//        BikeNetwork bikeNetwork = new BikeNetwork();
//        bikeNetwork.setName(name);
//        bikeNetwork.setHref(href);
//        bikeNetwork.setLocation(location);
//
//        List<String> companies;
//        JsonElement companyObject = jsonObject.get("company");
//        if (companyObject.isJsonArray()) {
//            companies = context.deserialize(companyObject, new TypeToken<List<String>>() {
//            }.getType());
//        } else if (companyObject.isJsonNull()) {
//            companies = Collections.emptyList();
//        } else {
//            companies = Collections.singletonList(companyObject.getAsString());
//        }
//        bikeNetwork.setCompany(companies);
//
//
//        return bikeNetwork;
//    }
//}
