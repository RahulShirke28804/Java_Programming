////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Factorial1.java
//  Description :   Calculate the factorial of a given number
//  Author :        Rahul Ajay Shirke
//  Date :          25-10-2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            return 1;
        }

        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }
        
        return iFact;
    }
} // End of Number class

class Factorial1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();        
        

        Number nobj = new Number();

        iRet = nobj.CalculateFactorial(iValue);

        System.out.println("Factorial is : "+iRet);

        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}
