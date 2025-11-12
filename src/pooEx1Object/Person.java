package pooEx1Object;

public class Person {
	
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    
    public Person(String lastName, String firstName, int age, String adress) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        setAdress(adress);
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
	
    @Override
    public String toString() {
        return  "[lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", adress=" + adress;
    }

}
