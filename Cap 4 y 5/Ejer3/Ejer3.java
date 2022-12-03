// Ejer 4.26

public class Ejer3 
{
    public static void main (String[] args)
    {
        int Line = 10;
        
        while(Line>=1)
        {
            int Col = 1;

            while(Col<=10)
            {
                System.out.print(Line % 2 == 1 ? "<" : ">");
                ++Col;
            }

            --Line;
            System.out.println();
        }
    }  
}
