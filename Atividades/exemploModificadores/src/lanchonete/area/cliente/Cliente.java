package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolhendo o lanche.");
    }

    public void fazerPedido(){
        System.out.println("Fazendo o pedido.");
    }

    public void pagarConta(){
        consultarSaldoDoAplicativo();
        System.out.println("Pagando a conta.");
    }

    // Trocado para Private
    private void consultarSaldoDoAplicativo(){
        System.out.println("Consultando saldo no aplicativo.");
    }

    // Quem pegará será o atendente.
//    public void pegarPedidoBalcao(){
//        System.out.println("Pegando o pedido no balcão.");
//    }
}
