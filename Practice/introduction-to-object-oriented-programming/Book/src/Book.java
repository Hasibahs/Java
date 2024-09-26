public class Book
{

    private int noOfCopies;


    Book(int noOfCopies)
    {
        this.noOfCopies = noOfCopies;
    }

    //getters
    public int getNoOfCopies()
    {
        return noOfCopies;
    }


    //setters
    public void setNoOfCopies(int noOfCopies)
    {
        if (noOfCopies > 0)
        {
            this.noOfCopies = noOfCopies;
        }
    }

    //methods
    public void increaseCopies(int copies)
    {
        setNoOfCopies(this.noOfCopies + copies);
    }

    public void decreaseCopies(int copies)
    {
        setNoOfCopies(this.noOfCopies - copies);
    }

}
