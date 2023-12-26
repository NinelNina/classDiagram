import java.util.ArrayList;
import java.util.List;

public class University {

	String name;
	List<Faculty> faculties;

	public University(String name) {
		this.name = name;
		this.faculties = new ArrayList<>();
	}

	public List<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}
}