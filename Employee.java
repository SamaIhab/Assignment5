package assignment5;

public class Employee {
	private int ID;
	private String firstName;
	private String lastName;

	public void setVariables(int id, String first, String last) {
		ID=id;
		firstName=first;
		lastName=last;
	}
	
	public void printVariables() {
		System.out.println("First Name: "+ firstName + "\nLast name: "+ lastName+ "\nID: " +ID);
	}
	
}
