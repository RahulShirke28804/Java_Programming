////////////////////////////////////////////////////////
//
//  File name :     Factors3.java
//  Description :   Display factors of user defined number using buffered reader
//  Author :        Rahul Ajay Shirke
//  Date :          19-10-2025
//
////////////////////////////////////////////////////////

// Checked exception

import java.io.*;
import java.util.*;


class Factors3
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int i = 0;

        System.out.println("Enter number : ");
        
        iNo = Integer.parseInt(bobj.readLine());

        for(i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}