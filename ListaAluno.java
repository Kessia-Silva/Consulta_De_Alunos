
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ListaAluno extends Remote{

    List<Aluno> listarAlunos() throws RemoteException;
    Aluno buscarAlunoPorMatricula(int matricula) throws RemoteException;


    
}
