import java.util.ArrayList;
import java.util.List;

public class Research extends Employee {

	String researchArea;
	List<Project> projects;

	public Research(int socialSecurityNumber, String name, String email, String researchArea) {
		super(socialSecurityNumber, name, email);
		this.researchArea = researchArea;
		this.projects = new ArrayList<>();
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}