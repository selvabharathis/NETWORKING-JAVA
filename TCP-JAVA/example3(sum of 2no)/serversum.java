import java.util.*;
import java.net.*;
import java.io.*;

class serversum
{
public static void main(String args[])throws Exception
{
ServerSocket s=new ServerSocket(2222);
Socket ss=s.accept();
Scanner ip=new Scanner(ss.getInputStream());
int a=ip.nextInt();
int b=ip.nextInt();
PrintWriter pw=new PrintWriter(ss.getOutputStream(),true);
pw.println(a+b);
s.close();
ss.close();
pw.close();
}
}