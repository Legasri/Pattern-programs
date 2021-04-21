import java.io.*;
import java.util.*;
class Pattern3
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the n value:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.print("* ");
}
System.out.println();
}
}
}