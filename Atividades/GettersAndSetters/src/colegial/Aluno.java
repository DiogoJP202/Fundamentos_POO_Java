package colegial;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        idade = novaIdade;
    }
}