////////////////////////////////////////////////////////
//
//  File name :     Factors1.java
//  Description :   Display factors
//  Author :        Rahul Ajay Shirke
//  Date :          18-10-2025
//
////////////////////////////////////////////////////////

class Factors1
{
    public static void main(String A[])
    {
        int iNo = 12;
        int i = 0;

        for(i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}