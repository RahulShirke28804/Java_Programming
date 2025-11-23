////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     PerfectNumber6.java
//  Description :   check if the number is perfect or not
//  Author :        Rahul Ajay Shirke
//  Date :          23-10-2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Rerverse Loop
        for(i = (iNo / 2); i >= 1; i--)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
            if(iSum > iNo)
            {
                break;
            }
        }
        
        return (iSum == iNo);
    }
} // End of Number class

class PerfectNumber6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();        
        
        Number nobj = new Number();
        bRet =  nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is a perfect number");
        }
        else
        {
            System.out.println(iValue+" is not a perfect number");
        }

        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}
