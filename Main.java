public class Main {
    public static void main(String[] args) {
        Employee Rohit = new Employee("RI16517", "Rohit", "Inampudi", "EO&T", "Tampa, Florida", "Summer Analyst", "June 3rd, 2024");
        Employee R = new Employee("RI16518", "Rohit", "Inampudi", "EO&T", "Tampa, Florida", "Summer Analyst", "June 3rd, 2024");
        Employee O = new Employee("RI16519", "Rohit", "Inampudi", "EO&T", "Tampa, Florida", "Summer Analyst", "June 3rd, 2024");
        Employee H = new Employee("RI16511", "Rohit", "Inampudi", "EO&T", "Tampa, Florida", "Summer Analyst", "June 3rd, 2024");
        Employee I = new Employee("RI16512", "Rohit", "Inampudi", "EO&T", "Tampa, Florida", "Summer Analyst", "June 3rd, 2024");


        Employee.displayAllEmployees();
        Employee.removeEmployeeBySOEID("RI16517");
        Employee.displayAllEmployees();

    }
}
