package org.example.proto.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class employee
{
	@Id
	private Long employee_id;
    private String employee_name;
    private int Granted_Holidays ;
    private  int Paid_Holidays ;
    private Long basic_salary ;


    public employee()
    {
        this.Granted_Holidays = 5;
        this.Paid_Holidays = 10 ;
    }



  // getters-setters


    public Long getEmployee_id()
        {
            return employee_id;
        }

        public void setEmployee_id(Long employee_id)
        {
            this.employee_id = employee_id;
        }

    public String getEmployee_name()
    {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
    this.employee_name = employee_name;
    }

public int getGranted_Holidays()
    {
        return Granted_Holidays;
    }
    public void setGranted_Holidays(int Granted_Holidays)
    {
        this.Granted_Holidays = Granted_Holidays ;
    }


    public int getPaid_Holidays()
    {
        return Paid_Holidays;
    }
    public void setPaid_Holidays(int Paid_Holidays)
    {
        this.Paid_Holidays = Paid_Holidays;
    }

    public Long getBasic_salary()
    {
        return basic_salary;
    }
    public void setBasic_salary(Long basics_salary) {
        this.basic_salary = basics_salary;
    }



    }
