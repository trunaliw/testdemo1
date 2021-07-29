package junitmockitowhenthenreturn;

/**
 * Model class of Employee
 * 
 * @author VINOD KUMAR KASHYAP
 *
 */
public class Employee {

	private Long employeeId;
	private String employeeName;
	private String bloodGroup;
	private String gender;
	private int awards;

	// parameterized constructor for creating objects
	public Employee(Long employeeId, String employeeName, String bloodGroup, String gender, int awards) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.awards = awards;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAwards() {
		return awards;
	}

	public void setAwards(int awards) {
		this.awards = awards;
	}

}
