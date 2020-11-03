public class Employee extends Person{

    double ann_salary;
    int year;
    String insurance;

    Employee()
    {
        setName("Nirmal");
        ann_salary = 10000;
        year = 2020;
        insurance = "";
    }

    Employee(String ins)
    {
        ann_salary = 10000;
        year = 2020;
        insurance = "";
        insurance = ins;
    }

    public double getSalary()
    {
        return ann_salary;
    }

    public int getYear()
    {
        return year;
    }

    public String getInsurance()
    {
        return insurance;
    }

    public boolean equals(Employee e)
    {
        return insurance.equals(e.insurance);
    }


}
