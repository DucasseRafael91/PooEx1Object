package pooEx1Object;

public class City {
    
    private String cityName;
    private String country;
    private int numberOfResidents;

    public City(String cityName, String country, int numberOfResidents) {
    	
        if (numberOfResidents < 0) {
            throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif");
        }
        
    	setCityName(cityName);
    	setCountry(country);
    	setNumberOfResidents(numberOfResidents);
    }
    
    public City(String cityName,int numberOfResidents) {
    	
        if (numberOfResidents < 0) {
            throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif");
        }
        
    	setCityName(cityName);
    	setCountry("unknown");
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
    	
        if (numberOfResidents < 0) {
            throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif");
        }
        
        this.numberOfResidents = numberOfResidents;
    }
    
    @Override
    public String toString() {
        return  "[ville : " + cityName + "] [pays : " + country + "] [nombre d'habitants : " + numberOfResidents + "]\n";
    }
}
