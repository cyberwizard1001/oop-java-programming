

public class const2 {
//Student name setter

    private String student_name;

    const2(String name)
    {
        student_name = name;
    }

    const2()
    {
        student_name = "Unknown";
    }

    public void printname()
    {
        System.out.println(student_name);
    }
}
