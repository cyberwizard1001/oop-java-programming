public class Two_main {

    static public void main(String[] args)
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("ins1");

        System.out.println("Emp1: "+emp1.getName());
        emp1.setName("Naveen");
        System.out.println("Emp1 after modification: "+emp1.getName());

        System.out.println("Emp2:\n"+emp2.getName()+"\n"+emp2.getSalary()+"\n"+emp2.getYear());

        emp1.insurance = "ins1";

        System.out.println("Insurance equal:"+emp2.equals(emp1));
    }
}
