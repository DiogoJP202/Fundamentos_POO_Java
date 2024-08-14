package colegial;

public class Escola{
    public static void main(String[] args){
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(19);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
}