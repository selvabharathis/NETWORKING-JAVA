import java.rmi.*;
public class addclient
{
public static void main(String args[])throws Exception
{
String url="rmi://localhost:2222/selva/";
addinf ai=(addinf)Naming.lookup(url);
System.out.println("sum="+ai.add(5,1));
}
}