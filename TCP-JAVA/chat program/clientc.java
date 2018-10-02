import java.io.*;
import java.net.*;
import java.util.*;

class clientc
{
public static void main(String args[])throws Exception 
{

Socket s=new Socket("localhost",2500);
while(true)
{
Scanner ip=new Scanner(System.in);
System.out.println("enter something:");
String str=ip.nextLine();
PrintWriter pw=new PrintWriter(s.getOutputStream());
pw.println(str);
pw.flush();
Scanner ip1=new Scanner(s.getInputStream());
String str1=ip1.nextLine();
System.out.println("message from server:"+str1);
}
}
}