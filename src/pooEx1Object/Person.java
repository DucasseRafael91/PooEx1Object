package pooEx1Object;

public class Person {
	
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private static int numberOfPerson;
    private City CityOfBirth;
    
    
    public Person(String lastName, String firstName, int age, String adress, City CityOfBirth) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
        setCityOfBirth(CityOfBirth);
        numberOfPerson = numberOfPerson + 1;
        
    }
    
    public Person(String lastName, String firstName, int age) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress("unknown");
        numberOfPerson = numberOfPerson + 1;
    }
    
    public Person(String lastName, String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(0);
        setAdress("unknown");
        numberOfPerson = numberOfPerson + 1;
    }

    
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public City getCityOfBirth() {
		return CityOfBirth;
	}

	public void setCityOfBirth(City cityOfBirth) {
		CityOfBirth = cityOfBirth;
	}
	
    public static  int getNumberOfPerson() {
        return numberOfPerson;
    }
	
    @Override
    public String toString() {
        return  lastName + " , " + firstName + " , " + age + "ans , habitant " + adress + " , Ville de naissance : " + CityOfBirth;
    }

}
