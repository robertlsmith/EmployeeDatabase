package employeedatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import employeedatabase.entity.Employee;
import employeedatabase.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.ok("Employee successfully added");
    }

    @PostMapping("/remove")
    public ResponseEntity<String> removeEmployee(@RequestParam String soeid) {
        Optional<Employee> employeeOptional = employeeRepository.findBySoeid(soeid);
        if (employeeOptional.isPresent()) {
            employeeRepository.delete(employeeOptional.get());
            return ResponseEntity.ok("Successfully removed employee");
        } else {
            return ResponseEntity.badRequest().body("Employee not found");
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchEmployee(@RequestParam String soeid) {
        Optional<Employee> employeeOptional = employeeRepository.findBySoeid(soeid);
        if (employeeOptional.isPresent()) {
            return ResponseEntity.ok(employeeOptional.get());
        } else {
            return ResponseEntity.badRequest().body("No employee found");
        }
    }
}
