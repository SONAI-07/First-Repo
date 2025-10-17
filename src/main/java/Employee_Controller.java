

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.example.proto.model.employee;
import org.example.proto.service.Employee_service;



@RestController
@RequestMapping("/employees")

public class Employee_Controller
{
   Employee_service employee_service = new Employee_service();

    @GetMapping ("/{id}")
    public employee GetEmployee(@PathVariable Long id)
    {
        return employee_service.getEmployee(id);
    }

    @PutMapping ("/{id}/use-Granted_leaves")
    public employee updated_holidays(@PathVariable Long id, @RequestParam int update)
     {
         return employee_service.updated_holidays(id, update);
     }


    @PutMapping ("/{id}/use-Paid_leaves")
    public employee Paid_leaves(@PathVariable Long id, @RequestParam int update)
    {
        return employee_service.Use_paid(id,update);
    }


}
