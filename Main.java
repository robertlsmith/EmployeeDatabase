public class Main {
    public static void main(String[] args) {
        Employee Rohit = new Employee("RI11111", "Rohit", "Inampudi", "EO&T", "Tampa, Florida", "Summer Analyst", "June 3rd, 2024");

        Employee.displayAllEmployees();
        Employee.removeEmployeeBySOEID("RI11111");
        Employee.displayAllEmployees();

    }
}
