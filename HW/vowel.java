// This prograam checks if a alphabet is vowel or not 
// It takes a character as input from the user
class vowel
{
    char a;
    void init(char alpha)
    {
        a=alpha;
    }
    void calc_Print()
    {
        switch (a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("The letter is a vowel");
            break;
            default:
            System.out.println("Not a vowel");
            break;
        }
    }
    public static void main(char alpha)
    {
        vowel obj=new vowel();
        obj.init(alpha);
        obj.calc_Print();
    }
}
