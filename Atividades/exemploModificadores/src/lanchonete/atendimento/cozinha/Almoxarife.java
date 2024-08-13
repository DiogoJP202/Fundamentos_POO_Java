package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens.");
    }

    private void controlarSaida(){
        System.out.println("Controlando a saída dos itens.");
    }

    // Moficador trocado para Default
    void entregarIngredientes(){
        System.out.println("Entregando ingredientes.");
        // Aqui ficaria o código que controlará a saída.
    }

    // Moficador trocado para Default
    void trocarGas(){
        System.out.println("Almoxarife trocando o gás.");
    }
}
