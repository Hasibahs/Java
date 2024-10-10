public class Triangle
{
    private int number;

    public Triangle(int number)
    {
        this.number = number;
    }

    public void printTriangle()
    {
        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("k");
            }
            System.out.println("l");
        }
    }
}
