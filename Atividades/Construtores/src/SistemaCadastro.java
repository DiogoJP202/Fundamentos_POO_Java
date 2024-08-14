public class SistemaCadastro{
    public static void main(String[] args){
        // Criamos uma pessoa no sistema.
        Pessoa marcos = new Pessoa("25085465422", "Marcos");

        // Definimos o endereço de marcos
        marcos.setEndereco("Rua das marias");

        // E como definir o nome e o cpf do marcos ?
        // >> Null - Null
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}