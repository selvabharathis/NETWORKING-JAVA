import java.io.*;
import java.util.*;
import java.net.*;

class server
{
public static void main(String args[]) throws Exception
{
ServerSocket s=new ServerSocket(2222);
Socket ss=s.accept();
DataInputStream dis=new DataInputStream(ss.getInputStream());
String str=dis.readLine();
System.out.println("message from client:"+str);
dis.close();
s.close();
ss.close();
}
}