public abstract class ABS
{
    int x,y;

    void abcmethod(int x, int y)
    {
        System.out.println("X = "+x+" "+"Y = "+y);
    }

    abstract void Shape();
    abstract void Area();
}