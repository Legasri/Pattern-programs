import java.io.*;
import java.util.Scanner;
class Pattern9
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter n value:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*  ");
}
System.out.println();
}
for(int k=n-1;k>0;k--)
{
for(int l=1;l<=k;l++)
{
System.out.print("*  ");
}
System.out.println();
}
}
}
