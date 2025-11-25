////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DigitsAddition.java
//  Description :   Display the digits in reverse order
//  Author :        Rahul Ajay Shirke
//  Date :          25-10-2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class DigitsAddition
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();        
        

        Digit dobj = new Digit();

        iRet = dobj.SumDigits(iValue);

        System.out.println("Addition of the Digits is : "+iRet);

        // Important
        sobj = null;
        dobj = null;

        System.gc();
    }
}
