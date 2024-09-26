public class MyChar
{
    private char ch;

    MyChar(char ch)
    {
        this.ch = ch;
    }

    public int getCh()
    {
        int ABC = (int) ch;
        return ABC;
    }

    public boolean isVowel()
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        } else return false;
    }

    public boolean isDigit()
    {
        if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
        {
            return true;
        } else return false;
    }

    public boolean isAlphabet()
    {
        if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) // between a to z and A to Z
        {
            return true;
        }
        return false;
    }

    public boolean isConsonent()
    {
        if (isAlphabet() && !isVowel())
        {
            return true;
        }
        return false;
    }

    public static void printLowerCaseAlphabets()
    {
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.println(ch);

        }
    }

    public static void printUpperCaseAlphabets()
    {
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println(ch);

        }

    }


}
