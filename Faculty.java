import java.util.ArrayList;
import java.util.List;

public class Faculty {

	String name;
	Dean dean;
	List<Institute> institutes;
	int numberOfEmployees;
	List<Employee> employees;

	public Faculty(String name) {
		this.name = name;
		this.institutes = new ArrayList<>();
		this.employees = new ArrayList<>();
	}

	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public List<Institute> getInstitutes() {
		return institutes;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public Dean getDean() {
		return dean;
	}

	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
		this.numberOfEmployees = employees.size() + 1;
	}

	public void setDean(Dean dean) {
		this.dean = dean;
	}
}