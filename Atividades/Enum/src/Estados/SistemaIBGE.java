package Estados;

// SistemaIBGE.java
public class SistemaIBGE{
    public static void main(String[] args){
        // Declarando que a variavel será do tipo Enum "EstadoBrasileiro" e que se chamará de "estado"
        for(EstadoBrasileiro estado: EstadoBrasileiro.values()){
            System.out.println(estado.getSigla() + " - " + estado.getNome());
        }

        // Selecionando valor isolado
        EstadoBrasileiro estadoBrasileiro = EstadoBrasileiro.RIO_JANEIRO;
        System.out.print(estadoBrasileiro.getNome() + " - " + estadoBrasileiro.getSigla() + " - " + estadoBrasileiro.getNomeMaiusculo());
    }
}