
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
    public static void main(String[] args) {
        try {
            ImplementsListaAluno server = new ImplementsListaAluno();
            ListaAluno stub = (ListaAluno) UnicastRemoteObject.exportObject(server, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ListaAluno", stub);
            System.out.println("Servidor Pronto");
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
