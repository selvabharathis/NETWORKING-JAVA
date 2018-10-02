import java.rmi.*;
public class addserver
{
public static void main(String args[]) throws Exception
{
addimp a=new addimp();
Naming.rebind("rmi://localhost:2222/selva/",a);
}
}