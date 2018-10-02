import java.io.*;
import java.util.*;
import java.net.*;

class client
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket("localhost",2222);
DataInputStream din=new DataInputStream(System.in);
System.out.println("enter message:");
String str=din.readLine();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeBytes(str);
dout.close();
s.close();
}
}