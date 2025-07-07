package src.com.vetias.java.temperaturedata.beans;

public class Location {
    private String name;
    private double latitude;
    private double longituted;
    private String descripition;
    private String country;
    private String city;
    private String address;
    private String postalcode;

    public void setname(String aName) {
        name =aName;
    }
    public String getName() {
        return name;
    }  
    
    public void setname(double latitude) {
        latitude = latitude;
    }
    
    public double getLatitude() {
        return latitude;
    }

    public double getLongitutde() {
        return  longituted;
    }

    public String getAddress() {
        return address;
    }

    
    public String getPostalCode() {
        return postalcode;
    }

    public String getcountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longituted = longitude;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalcode = postalCode;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {      
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longituted +
                ", address='" + address + '\'' +
                ", postalCode='" + postalcode + '\'' +
                ", contact='" + country + '\'' +
                '}';
    }
}               
    

    
