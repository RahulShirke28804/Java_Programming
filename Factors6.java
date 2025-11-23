////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Factors6.java
//  Description :   Display factors of user defined number with a different method for reusability
//  Author :        Rahul Ajay Shirke
//  Date :          19-10-2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int i = 0;

        for(i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
} // End of Number class

class Factors6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();        
        
        Number nobj = new Number();
        nobj.DisplayFactors(iValue);
    }
}