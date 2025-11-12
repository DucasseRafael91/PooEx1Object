package pooEx1Object;

public class City {
    
    private String cityName;
    private String country;
    private int numberOfResidents;

    public City(String cityName, String country, int numberOfResidents) {
    	setCityName(cityName);
    	setCountry(country);
    	setNumberOfResidents(numberOfResidents);
    }
    
    public String getCityName() {
        return cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    

    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    

    public int getNumberOfResidents() {
        return numberOfResidents;
    }
    
    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }
}
