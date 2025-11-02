
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;


public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            ListaAluno stub = (ListaAluno) registry.lookup("ListaAluno");
            System.out.println("Digite a matricula do aluno que deseja procurar: ");
            int matricula = scanner.nextInt();

            Aluno aluno = stub.buscarAlunoPorMatricula(matricula);

            if(aluno == null){
                System.out.println("Aluno não encontrado");
            }
            else{
                System.out.println(aluno);
            }

            System.out.println("\nLista de todos os Alunos: \n");
            List<Aluno> alun = stub.listarAlunos();

            for(Aluno a: alun){
                System.out.println(a);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
    
}
