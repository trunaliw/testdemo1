package junitmockitowhenthenreturn;

import java.util.Collections;
import java.util.List;

/**
 * Data Access Object for Employee Class. For simplicity we are making this
 * class Singleton
 * 
 * @author VINOD KUMAR KASHYAP
 *
 */
public class EmployeeDAO {

	// creating an object
	private static EmployeeDAO employeeDAO = new EmployeeDAO();

	/*
	 * private constructor. No objects of this class be created with new
	 * EmployeeDAO(). Use getInstance() instead
	 */
	private EmployeeDAO() {
	}

	// static method to create object
	public static EmployeeDAO getInstance() {
		return employeeDAO;
	}

	// add employee
	public Employee getEmployee(Long employeeId) {
		return null;
	}

	// list all employees
	public List<Employee> getAll() {
		return Collections.emptyList();
	}

	// add employee
	public String addEmployee(Employee employee) {
		return employee.getEmployeeName();
	}

	// update employee
	public String updateEmployee(Employee employee) {
		return employee.getEmployeeName();
	}

	// delete employee
	public String deleteEmployee(Long employeeId) {
		return null;
	}

	// get all awards
	public int getAwards(Long employeeId) {
		return 0;
	}
}
