package Estados;

// Class é trocado por enum
public enum EstadoBrasileiro{
    SAO_PAULO("SP", "Sâo Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piaui"),
    MARANHAO("MA", "Maranhâo");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla(){
        return this.sigla;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNomeMaiusculo(){
        return this.nome.toUpperCase();
    }
}