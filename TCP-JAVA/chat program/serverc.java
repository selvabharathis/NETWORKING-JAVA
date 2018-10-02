import java.io.*;
import java.util.*;
import java.net.*;

class serverc
{
public static void main(String args[])throws Exception
{

ServerSocket s=new ServerSocket(2500);
Socket ss=s.accept();
while(true)
{
Scanner ip=new Scanner(ss.getInputStream());
String str=ip.nextLine();
System.out.println("message from client:"+str);
Scanner ip1=new Scanner(System.in);
System.out.println("enter ur message:");
String str1=ip1.nextLine();
PrintWriter pw=new PrintWriter(ss.getOutputStream());
pw.println(str1);
pw.flush();
}
}
}