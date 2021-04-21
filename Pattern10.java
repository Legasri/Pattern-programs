import java.io.*;
import java.util.*;
class Pattern10
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the n value:");
n=in.nextInt();
System.out.println("* ");
for(int i=2;i<=n-1;i++)
{
System.out.print("* ");
for(int j=1;j<=i-2;j++)
{
System.out.print("  ");
}
System.out.print("* ");
System.out.println();
}
for(int k=1;k<=n;k++)
{
System.out.print("* ");
}
}
}
