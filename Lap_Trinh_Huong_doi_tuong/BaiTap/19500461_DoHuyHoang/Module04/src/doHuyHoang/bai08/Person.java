/**
 * 
 */
package doHuyHoang.bai08;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Person {
	protected String lastName;
	protected String firstName;
	
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
	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		return String.format("%s %-10s", firstName, lastName);
	}
	
	
	
}
