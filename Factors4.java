////////////////////////////////////////////////////////
//
//  File name :     Factors4.java
//  Description :   Display factors of user defined number using buffered reader
//  Author :        Rahul Ajay Shirke
//  Date :          19-10-2025
//
////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;


class Factors4
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int i = 0;

        System.out.println("Enter number : ");
        
        try
        {
            iNo = Integer.parseInt(bobj.readLine());
        }
        catch(IOException iobj)
        {}

        for(i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}