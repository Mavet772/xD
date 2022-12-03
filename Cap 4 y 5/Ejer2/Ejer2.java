// Ejer 4.25

public class Ejer2
{
    
    public static void main(String[] args)
    {
        int Contar = 1;

        while(Contar <= 10)
        {
            System.out.println(Contar % 2 == 1 ? "***" : "++++++++");
            ++Contar;
        }
    }
}
