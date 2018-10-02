import java.rmi.*;
import java.rmi.server.*;
public class addimp extends UnicastRemoteObject implements addinf
{
addimp() throws RemoteException
{
}
public int add(int a,int b) throws RemoteException
{
return a+b;
}
}