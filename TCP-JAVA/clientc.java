import java.io.*;
import java.net.*;
import java.util.*;

class clientc
{
public static void main(String args[])throws Exception 
{
Socket s=new Socket("localhost",2500);
Scanner ip=new Scanner(System.in);
System.out.println("enter something:");
String str=ip.next();
PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
pw.println(str);
Scanner ip1=new Scanner(s.getInputStream());
String str1=ip1.next();
System.out.println("message from server:"+str1);
ip1.close();
pw.close();
s.close();
}
}