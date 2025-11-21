////////////////////////////////////////////////////////
//
//  File name :     Factors5.java
//  Description :   Display factors of user defined number using buffered reader
//  Author :        Rahul Ajay Shirke
//  Date :          19-10-2025
//
////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;


class Factors5
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int i = 0;

        System.out.println("Enter number : ");
        
        // Not a good programming practice
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