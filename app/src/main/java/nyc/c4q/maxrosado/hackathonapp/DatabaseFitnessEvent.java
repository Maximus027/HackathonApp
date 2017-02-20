package nyc.c4q.maxrosado.hackathonapp;

/**
 * Created by tarynking on 2/19/17.
 */

public class DatabaseFitnessEvent {

    String userName;
    String activityType;
    String startTime;
    String startDate;
    String latitude;
    String longitude;
    String shortDesc;
    String UserImage;
    String activityJoinerBadge;
    String activityCreatorBadge;

    private Long _id;


    DatabaseFitnessEvent() {
        this.userName = "unknown";
        this.activityType = "unknown";
        this.UserImage = "unknown";
        this.startTime = "unknown";
        this.startDate = "unknown";
        this.latitude = "unknown";
        this.longitude = "unknown";
        this.shortDesc = "unknown";
        this.UserImage = "unknown";
        this.activityJoinerBadge = "unknown";
        this.activityCreatorBadge = "unknown";
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getUserImage() {
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public String getActivityJoinerBadge() {
        return activityJoinerBadge;
    }

    public void setActivityJoinerBadge(String activityJoinerBadge) {
        this.activityJoinerBadge = activityJoinerBadge;
    }

    public String getActivityCreatorBadge() {
        return activityCreatorBadge;
    }

    public void setActivityCreatorBadge(String activityCreatorBadge) {
        this.activityCreatorBadge = activityCreatorBadge;
    }
}

