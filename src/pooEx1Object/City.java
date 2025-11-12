package pooEx1Object;

public class City {
    
	//Attributs de la classe
    private String cityName;
    private String country;
    private int numberOfResidents;
    private static  int numberOfCities;

    // Constructeurs
    public City(String cityName, String country, int numberOfResidents) {
    	/**
    	 * Constructeur qui rend pour argument le nom de la ville, le pays et le nombre d'habitants
    	 * param cityName : nom de la ville
    	 * param country : Pays de la ville
    	 * param numberOfResidents : nombre d'habitants
    	 * return : none
    	 */
    	
        if (numberOfResidents < 0) {
            throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif");
        }
        
    	setCityName(cityName);
    	setCountry(country);
    	setNumberOfResidents(numberOfResidents);
    	numberOfCities = numberOfCities + 1 ;
    }
    
    public City(String cityName,int numberOfResidents) {
    	/**
    	 * Constructeur qui rend pour argument le nom de la ville et le nombre d'habitants
    	 * param cityName : nom de la ville
    	 * param numberOfResidents : nombre d'habitants
    	 * return : none
    	 */
    	
        if (numberOfResidents < 0) {
            throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif");
        }
        
    	setCityName(cityName);
    	setCountry("unknown");
    	setNumberOfResidents(0);
    	numberOfCities = numberOfCities + 1 ;
    }
    
    public City(String cityName, String country) {
    	/**
    	 * Constructeur qui rend pour argument le nom de la ville et le pays
    	 * param cityName : nom de la ville
    	 * param country : Pays de la ville
    	 * return : none
    	 */
    	
    	setCityName(cityName);
    	setCountry(country);
    	numberOfCities = numberOfCities + 1 ;
    }
    
    // Getter et Setter
    public String getCityName() {
    	/**
    	 * Getter pour obtenir le nom de la ville
    	 */
        return cityName;
    }
    
    public void setCityName(String cityName) {
    	/**
    	 * Setter pour definir le nom de la ville
    	 */
        this.cityName = cityName;
    }
    

    public String getCountry() {
    	/**
    	 * Getter pour obtenir le pays
    	 */
        return country;
    }
    
    public void setCountry(String country) {
    	/**
    	 * Setter pour definir le pays
    	 */
        this.country = country;
    }
    

    public int getNumberOfResidents() {
    	/**
    	 * Getter pour obtenir le nombre d'habitants
    	 */
        return numberOfResidents;
    }
    
    public void setNumberOfResidents(int numberOfResidents) {
    	/**
    	 * Setter pour definir le nombre d'habitants
    	 */
    	
        if (numberOfResidents < 0) {
            throw new RuntimeException("Le nombre d'habitants ne peut pas être négatif");
        }
        
        this.numberOfResidents = numberOfResidents;
    }
    
    public static  int getNumberOfCities() {
    	/**
    	 * Getter pour obtenir le nombre de villes iniatilisés
    	 */
        return numberOfCities;
    }
    

    @Override
    public String toString() {
    	/**
    	 * Methode ToString
    	 */
    	
    	if(numberOfResidents == 0) {
    		 return  cityName + " , " + country ;
    	}
        return  cityName + " , " + country + " , population " + cityName + " " + numberOfResidents + " d'habitants" ;
    }
    
    public void display() {
    	/**
    	 * Méthode Display
    	 */
        System.out.println("Ville de " + cityName + " en " + country + " ayant " + numberOfResidents);
    }
}
