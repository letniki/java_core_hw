package task1;

public class Geo {
    private double lat;
    private double lng;
    public Geo(double lat, double lng){
    this.lat = lat;
    this.lng = lng;
    }
    public double getLat() {
        return lat;
    }
    public double getLng() {
        return lng;
    }
    public void setLat (double lat){
        this.lat = lat;
    }
    public void setLng(double lng){
        this.lng = lng;
    }

    public String toString() {
        return "{" + lat + ", " + lng + '}';
    }
}
