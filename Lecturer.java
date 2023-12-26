import java.util.List;

public class Lecturer extends Research {

	List<Course> courses;

	public Lecturer(int socialSecurityNumber, String name, String email, String researchArea) {
		super(socialSecurityNumber, name, email, researchArea);
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}