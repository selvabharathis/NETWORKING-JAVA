import java.util.*;
import java.net.*;
import java.io.*;

class clientsum
{
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",2222);
Scanner ip=new Scanner(System.in);
System.out.println("enter a:");
int a=ip.nextInt();
System.out.println("enter b:");
int b=ip.nextInt();
PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
pw.println(a);
pw.println(b);
Scanner ip2=new Scanner(s.getInputStream());
int sum=ip2.nextInt();
System.out.println("sum="+sum);
s.close();
pw.close();
}
}

