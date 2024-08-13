package lanchonete.atendimento;

public class Atendente {
    public void servirMesa(){
        pegarPedidoBalcao();
        pegarLancheCozinha();
        System.out.println("Servindo mesa.");
    }

    private void pegarLancheCozinha(){
        System.out.println("Pegando lache na cozinha.");
    }

    public void receberPagamento(){
        System.out.println("Recebendo pagamento.");
    }

    // Ação não  poderá prosseguir
//    void trocarGas(){
//        System.out.println("Atendente trocando o gás.");
//    }

    private void pegarPedidoBalcao(){
        System.out.println("Pegando pedido no balcão.");
    }
}