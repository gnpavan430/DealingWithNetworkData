package consistent4444.dealingwithnetworkdata;

/**
 * Created by x085271 on 10/21/2017.
 */

public class Earthquake {
    String magnitude;

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    String date;
    String location;
    Earthquake(String magnitude,String date, String location){

    }
}
