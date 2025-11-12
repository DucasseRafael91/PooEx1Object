package pooEx1Object;

public class Person {
	
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private City CityOfBirth;
    
    public Person(String lastName, String firstName, int age, String adress, City CityOfBirth) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
        setCityOfBirth(CityOfBirth);
    }
    
    public Person(String lastName, String firstName, int age) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress("unknown");
    }
    
    public Person(String lastName, String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(0);
        setAdress("unknown");
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
	
    @Override
    public String toString() {
        return  "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", adress=" + adress + ", Born City=" + CityOfBirth + "]";
    }

}
