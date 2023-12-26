import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название университета:");
        String univName = scanner.nextLine();
        University university = new University(univName);

        System.out.println("Введите количество факультетов:");
        int facultiesNum = scanner.nextInt();
        scanner.nextLine();
        List<Faculty> faculties = new ArrayList<>(facultiesNum);

        for (int i = 0; i < facultiesNum; i++) {
            System.out.println("Введите название факультета:");
            String facultyName = scanner.nextLine();
            Faculty faculty = new Faculty(facultyName);

            System.out.println("Введите данные декана:");
            System.out.println("Введите социальный номер декана:");
            int deanSocialNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите ФИО декана:");
            String deanName = scanner.nextLine();
            System.out.println("Введите email декана:");
            String deanEmail = scanner.nextLine();
            Dean dean = new Dean(deanSocialNum, deanName, deanEmail);

            faculty.setDean(dean);

            System.out.println("Введите общее количество сотрудников:");
            int employeesNum = scanner.nextInt();
            scanner.nextLine();
            List<Employee> employees = new ArrayList<>(employeesNum);

            System.out.println("Сколько из них являются научными сотрудниками?");
            int researchNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Сколько из них являются лекторами?");
            int lecturerNum = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < employeesNum - researchNum; j++) {
                System.out.println("Введите данные cотрудника:");
                System.out.println("Введите социальный номер cотрудника:");
                int employeeSocialNum = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите ФИО cотрудника:");
                String employeeName = scanner.nextLine();
                System.out.println("Введите email cотрудника:");
                String employeeEmail = scanner.nextLine();
                Employee employee = new Employee(employeeSocialNum, employeeName, employeeEmail);
                employees.add(employee);
            }

            for (int j = 0; j < researchNum - lecturerNum; j++) {
                System.out.println("Введите данные научного cотрудника:");
                System.out.println("Введите социальный номер научного cотрудника:");
                int employeeSocialNum = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите ФИО научного cотрудника:");
                String employeeName = scanner.nextLine();
                System.out.println("Введите email научного cотрудника:");
                String employeeEmail = scanner.nextLine();
                System.out.println("Введите область исследований научного cотрудника:");
                String researchArea = scanner.nextLine();
                Research employee = new Research(employeeSocialNum, employeeName, employeeEmail, researchArea);
                employees.add(employee);
            }

            for (int j = 0; j < lecturerNum; j++) {
                System.out.println("Введите данные лектора:");
                System.out.println("Введите социальный номер лектора:");
                int employeeSocialNum = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите ФИО лектора:");
                String employeeName = scanner.nextLine();
                System.out.println("Введите email лектора:");
                String employeeEmail = scanner.nextLine();
                System.out.println("Введите область исследований лектора:");
                String researchArea = scanner.nextLine();
                Lecturer employee = new Lecturer(employeeSocialNum, employeeName, employeeEmail, researchArea);
                Course course1 = new Course(1, "Курс1", 3.5F);
                Course course2 = new Course(2, "Курс2", 2);
                List<Course> courses = new ArrayList();
                courses.add(course1);
                courses.add(course2);
                employee.setCourses(courses);
                employees.add(employee);
            }

            faculty.setEmployees(employees);

            System.out.println("Введите количество кафедр:");
            int institutesNum = scanner.nextInt();
            scanner.nextLine();
            List<Institute> institutes = new ArrayList<>(institutesNum);

            for (int j = 0; j < institutesNum; j++){
                System.out.println("Введите название кафедры:");
                String instituteName = scanner.nextLine();
                System.out.println("Введите адрес кафедры:");
                String instituteAddress = scanner.nextLine();
                Institute institute = new Institute(instituteName, instituteAddress);
                institutes.add(institute);
            }
            faculty.setInstitutes(institutes);
            faculties.add(faculty);
        }
        university.setFaculties(faculties);

        System.out.println("Университет: " + university.name);
        System.out.println("Факультеты: ");

        for (Faculty faculty : university.faculties){
            System.out.println("Название: " + faculty.name);
            System.out.println("Декан: " + faculty.dean.name);
            System.out.println("Email декана: " + faculty.dean.email);
            System.out.println("Количество сотрудников: " + faculty.numberOfEmployees);

            for (Employee employee : faculty.employees){
                System.out.println("Сотрудник: " + employee.name);
                System.out.println("Email сотрудника: " + employee.name);
                if (employee instanceof Research){
                    System.out.println("Область исследований: " + ((Research) employee).researchArea);
                    if (employee instanceof Lecturer){
                        System.out.println("Ведёт курсы:");
                        for (Course course : ((Lecturer) employee).courses){
                            System.out.println("Название курса: " + course.name);
                            System.out.println("Число часов в неделю: " + course.weeklyDuration);
                        }
                    }
                }
            }

            System.out.println("Кафедры:");
            for (Institute institute : faculty.institutes){
                System.out.println("Кафедра " + institute.name);
                System.out.println("Адрес: " + institute.address);
            }
        }
    }
}
