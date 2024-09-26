public class MyChar
{
    private char ch;

    MyChar(char ch)
    {
        this.ch = ch;
    }

    public char getCh()
    {
        return ch;
    }

    public boolean isVowel()
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        } else return false;
    }

    public boolean isConsonent()
    {
        return false;
    }

    public boolean isDigit()
    {
        if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
        {
            return true;
        } else return false;
    }


}
