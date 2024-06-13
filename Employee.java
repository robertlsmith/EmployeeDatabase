import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private String SOEID;
    private String firstName;
    private String lastName;
    private String department;
    private String jobLocation;
    private String jobTitle;
    private String dateHired;
    private static List<Employee> employees = new ArrayList<>();

    public Employee(String SOEID, String firstName, String lastName, String department, String jobLocation, String jobTitle, String dateHired) {
        this.SOEID = SOEID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.jobLocation = jobLocation;
        this.jobTitle = jobTitle;
        this.dateHired = dateHired;

        addEmployee(this);
    }


    public boolean checkSOEID (String SOEID){
        for(Employee emp: employees){
            if(emp.getSOEID().equals(SOEID)){
                return true;
            }
        }
        return false;
    }

    public void addEmployee(Employee emp){
        if(!checkSOEID(emp.getSOEID())){
            employees.add(this);
        }
    }

    public String getSOEID() {
        return SOEID;
    }

    public void setSOEID(String SOEID) {
        this.SOEID = SOEID;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public void displayEmployeeDetails() {
        System.out.println("SOEID: " + SOEID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Job Location: " + jobLocation);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Hiring Date: " + dateHired);
    }

    public static void findEmployeeBySOEID(String SOEID) {
        for (Employee emp : employees) {
            if (emp.getSOEID().equals(SOEID)) {
                System.out.println(emp.fullName());
                return;
            } 
        }
        System.out.println("No employee with matching SOEID");
    }

    public static void removeEmployeeBySOEID(String SOEID) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getSOEID().equals(SOEID)) {
                iterator.remove();
                System.out.println("Successfully removed employee.");
                return;
            }
        }
        System.out.println("No Employee with matching SOEID");
    }

    public static void displayAllEmployees() {
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
            System.out.println();
        }
    }

    public static void listEmployeesByDepartment(String department) {
        for (Employee emp : employees) {
            if (emp.getDepartment().equalsIgnoreCase(department)) {
                emp.displayEmployeeDetails();
                System.out.println();
            }
        }
    }
    
    public static void listEmployeesByJobTitle(String jobTitle) {
        for (Employee emp : employees) {
            if (emp.getJobTitle().equalsIgnoreCase(jobTitle)) {
                emp.displayEmployeeDetails();
                System.out.println();
            }
        }
    }

    public static void listEmployeesByJobLocation(String location) {
        for (Employee emp : employees) {
            if (emp.getJobLocation().equalsIgnoreCase(location)) {
                emp.displayEmployeeDetails();
                System.out.println();
            }
        }
    }
 

    public void updateDetails(String SOEID, String firstName, String lastName, String department, String jobLocation, String jobTitle, String dateHired) {
        this.SOEID = SOEID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.jobLocation = jobLocation;
        this.jobTitle = jobTitle;
        this.dateHired = dateHired;
        System.out.println("Employee details updated successfully.");
    }

    public static void sortEmployeesByName() {
        employees.sort(Comparator.comparing(Employee::fullName));
        displayAllEmployees();
    }
    
    public static void sortEmployeesByDateHired(){
        employees.sort(Comparator.comparing(Employee::getDateHired));
        displayAllEmployees();
    }
 
}