import java.util.Date;

public class Project {

	float hours;
	String name;
	Date startingDate;
	Date endDate;

	public Project(float hours, String name, Date startingDate, Date endDate) {
		this.hours = hours;
		this.name = name;
		this.startingDate = startingDate;
		this.endDate = endDate;
	}
}