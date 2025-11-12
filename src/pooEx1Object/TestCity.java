package pooEx1Object;

public class TestCity {
    
    public static void main(String[] args) {
        
        City toulouse = new City("Toulouse", "France", 450000);
        City paris = new City("Paris", "France", 2000000);
        City londres = new City("Londres", "Angleterre", 1000000);
        
        System.out.println(toulouse.getCityName() + " " + toulouse.getCountry() + " " + toulouse.getNumberOfResidents());
        System.out.println(paris.getCityName() + " " + paris.getCountry() + " " + paris.getNumberOfResidents());
        System.out.println(londres.getCityName() + " " + londres.getCountry() + " " + londres.getNumberOfResidents());
        
        toulouse.setNumberOfResidents((toulouse.getNumberOfResidents() + 20000));
        
        System.out.println(toulouse.getCityName() + " " + toulouse.getCountry() + " " + toulouse.getNumberOfResidents());
    }
}
