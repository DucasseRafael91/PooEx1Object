package pooEx1Object;

public class PooEx1Object {

    public static void main(String[] args) {

        Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
        Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
        Person boris = new Person("Johnson", "Boris", 56, "Downing Street à Londres", new City("New York", "Etats-Unis"));
        Person depardieu = new Person("Depardieu", "Gerard", 72, "Moscou", new City("Chateauroux", "France"));
        Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York", "Etats-Unis"));
        Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "Etats-Unis"));

        Person[] listOfPersons = {manu, sarkozy, boris, depardieu, kravitz, lawrence};

        System.out.println("Liste des personnalités");
        for (Person person : listOfPersons) {
            System.out.println(person);
        }

        System.out.println("---------------------");
        System.out.println("Liste après notre filtre");

        for (Person person : listOfPersons) {
        	if(person.getAdress().contains("Paris") || person.getCityOfBirth().getCountry() == "France") {
        		 System.out.println(person);		
        	}
        }
    }
}
