import java.io.Serializable;

public class Aluno implements Serializable{
    private int matricula;
    private String nome;
    private double media;

    public Aluno(int matricula, double media, String nome) {
        this.matricula = matricula;
        this.media = media;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString(){
        return String.format("Matrícula: %d Nome: %s, Media: %.2f", matricula, nome, media);
    }

}