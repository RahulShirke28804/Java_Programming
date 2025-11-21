////////////////////////////////////////////////////////
//
//  File name :     Factors2.java
//  Description :   Display factors of user defined number
//  Author :        Rahul Ajay Shirke
//  Date :          19-10-2025
//
////////////////////////////////////////////////////////

import java.util.*;


class Factors1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int i = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        for(i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}