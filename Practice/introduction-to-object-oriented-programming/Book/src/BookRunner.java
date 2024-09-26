public class BookRunner
{
    public static void main(String[] args)
    {
        Book artOfComputerProgramming = new Book(16);
        Book effectiveJava = new Book(20);
        Book cleanCode = new Book(25);

        System.out.println(artOfComputerProgramming.getNoOfCopies());

        //set the copy
        artOfComputerProgramming.setNoOfCopies(20);

        //increase the copy
        artOfComputerProgramming.increaseCopies(50);

        //decrease the copy
        artOfComputerProgramming.decreaseCopies(30);

        //print the copy
        System.out.println(artOfComputerProgramming.getNoOfCopies());

    }
}
