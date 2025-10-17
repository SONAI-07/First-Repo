package org.example.proto.service;



import org.example.proto.model.employee;
import org.springframework.stereotype.Service;
import org.example.proto.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;


@Service

public class Employee_service {

    @Autowired
    private employeeRepository EmployeeRepository;

 //GetMapping
    public employee getEmployee(Long id) {
        Optional<employee> object = EmployeeRepository.findById(id);
        if (object.isPresent()) {
            return object.get();
        } else throw new RuntimeException("Employee Not Found or Fired");
    }



   //Put_Mapping
    public employee updated_holidays(Long id , int update) {
        Optional<employee> object = EmployeeRepository.findById(id);
        employee Employee = null;
        if (object.isPresent() && update > 0 && update <= 5) {
            Employee = object.get();
            if (Employee.getGranted_Holidays() > 0) {

                if (Employee.getGranted_Holidays() - update > 0) {
                    Employee.setGranted_Holidays(Employee.getGranted_Holidays() - update);
                    EmployeeRepository.save(Employee);
                } else
                    throw new RuntimeException("Employee:" + Employee.getEmployee_name() + "exhausted Granted Holidays");

            } else throw new RuntimeException("Employee Not Found or Update is invalid");
        }
        return Employee;
    }




   //Put_Mapping
    public employee Use_paid(Long id, int update) {
        Optional<employee> caller = EmployeeRepository.findById(id);
        employee Taker = null;
        if (caller.isPresent()) {
            Taker = caller.get();

            if ((Taker.getPaid_Holidays()-update) > 0) {
                Taker.setPaid_Holidays(Taker.getPaid_Holidays()-update);
                Taker.setBasic_salary(Taker.getBasic_salary() - (update * 500));
                EmployeeRepository.save(Taker);
            } else throw new RuntimeException("Employee:" + Taker.getEmployee_name() + "exhausted Paid Holidays");

        }else throw new RuntimeException("Employee Not Found or Fired Recently");

        return Taker;
    }


}











