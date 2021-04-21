import java.io.*;
import java.util.*;
class Pattern8
{
public static void main(String args[])
{
int n,num=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the n value:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
for(int k=1;k<=n-i;k++)
{
System.out.print("  ");
}
for(int j=1;j<=i;j++)
{
System.out.print(num++ +"   ");
}
System.out.println();
}
}
}