import java.util.*;
import java.io.*;
import java.net.*;

class clientudp
{
public static void main(String args[]) throws Exception
{
DatagramSocket ds=new DatagramSocket();
InetAddress inet=InetAddress.getByName("localhost");
Scanner s=new Scanner(System.in);
System.out.println("enter your name:");
String str=s.next();
DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),inet,2222);
ds.send(dp);
ds.close();
}
}