/**
 * 
 */
package doHuyHoang.bai07;

/**
 * @author Do-Huy-Hoang
 *
 */
public abstract class Employee {
	private String firstName;
	private String lastName;
	private String SSN;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param sSN
	 */
	public Employee(String firstName, String lastName, String sSN) {
		setFirstName(firstName);
		setLastName(lastName);
		setSSN(sSN);
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s", firstName, lastName, SSN);
	}
	public abstract double salary();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		return true;
	}
	
}
