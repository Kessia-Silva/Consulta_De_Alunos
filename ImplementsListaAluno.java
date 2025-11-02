
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ImplementsListaAluno implements ListaAluno{
    private List<Aluno> alun;
    public ImplementsListaAluno(){
        this.alun = new ArrayList<>();
        AddAlun();
    }

    private void AddAlun(){
        alun.add(new Aluno(1, 7, "Alana Ferreira"));
        alun.add(new Aluno(2, 6, "Antonio Miguel"));
        alun.add(new Aluno(3, 9, "Pedro Costa"));
    }


    @Override
    public List<Aluno> listarAlunos() throws RemoteException {
        return alun;
    }

    @Override
    public Aluno buscarAlunoPorMatricula(int matricula) throws RemoteException {
        for(Aluno a: alun){
            if(a.getMatricula() == matricula){
                return a;
            }
        }
        return null;
    }
    
}
