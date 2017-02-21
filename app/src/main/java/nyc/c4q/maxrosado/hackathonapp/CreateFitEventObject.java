package nyc.c4q.maxrosado.hackathonapp;

/**
 * Created by maxrosado on 2/20/17.
 */

public class CreateFitEventObject {
    private Long _id; // for cupboard
    private String username;
    private String sportSelected;
    private String skillLevel;
    private int numberOfPlayers;
    private int month;
    private int day;
    private int year;
    private int hour;
    private int minute;
    private String nightDay;

    public void set_id(Long _id) {
        this._id = _id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSportSelected(String sportSelected) {
        this.sportSelected = sportSelected;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setNightDay(String nightDay) {
        this.nightDay = nightDay;
    }

    public Long get_id() {
        return _id;
    }

    public String getUsername() {
        return username;
    }

    public String getSportSelected() {
        return sportSelected;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getNightDay() {
        return nightDay;
    }
}
