public class const1 {
    int x;
    int y;

    //Point

    public const1(int initialX, int initialY)
    {
        x = initialX;
        y = initialY;
    }

    public const1()
    {
        x = 0;
        y = 0;
    }

    public void translate(int dx, int dy)
    {
        x = x + dx;
        y = y + dy;
    }
}
