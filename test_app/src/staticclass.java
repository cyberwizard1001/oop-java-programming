public class staticclass {
    int a;
    static int b;

    staticclass()
    {
        a++;
        b++;
    }

    public void print()
    {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
