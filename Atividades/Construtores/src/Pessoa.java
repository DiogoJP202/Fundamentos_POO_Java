public class Pessoa{
    private String nome;
    private String cpf;
    private String endereco;

    // Método construtor
    // O nome deverá ser igual ao nome da classe
    public Pessoa (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    // Define valores Default a classe
    public Pessoa(){
        this("--", "sem Nome");
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}