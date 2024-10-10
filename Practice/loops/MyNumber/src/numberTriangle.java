public class numberTriangle
{
    private int num;

    public numberTriangle(int num)
    {
        this.num = num;
    }

    public void printNumberTriangle()
    {
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}