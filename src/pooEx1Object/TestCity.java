package pooEx1Object;

public class TestCity {
    
    public static void main(String[] args) {
        
        City toulouse = new City("Toulouse", "France", 450000);
        City paris = new City("Paris", "France", 2000000);
        City londres = new City("Londres", "Angleterre", 1000000);
        City rabat = new City("Rabat",577000);
        
        System.out.print("\nMETHODE TOSTRING\n\n");
        
        System.out.println(toulouse);
        toulouse.setNumberOfResidents((toulouse.getNumberOfResidents() + 20000));
        System.out.println(toulouse);
        System.out.println(paris);
        System.out.println(londres);
        System.out.println(rabat);
        rabat.setCountry("Maroc");
        System.out.println(rabat);
        
        System.out.print("\nMETHODE DISPLAY\n\n");
        
        toulouse.display();
        rabat.display();
        
        System.out.print("\nAFFICHAGE DU NOMBRE DE VILLES \n\n");
        
        System.out.println(City.getNumberOfCities());   
    }
}
