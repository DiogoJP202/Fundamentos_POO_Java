package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();

        // Só a classe Cozinheiro poderar chamar esses métodos
//        cozinheiro.lavarIngredientes();
//        cozinheiro.baterVitaminaLiquidificador();
//        cozinheiro.selecionarIngredientesVitamina();
//        cozinheiro.prepararLanche();
//        cozinheiro.prepararVitamina();
//        cozinheiro.prepararVitamina();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Almoxarife almoxarife = new Almoxarife();
        // Só a classe Almoxarife poderar chamar esses métodos
//        almoxarife.controlarEntrada();
//        almoxarife.controlarSaida();

//        almoxarife.entregarIngredientes();
//        almoxarife.trocarGas();

        Atendente atendente = new Atendente();

        // Só o atendente verá essa ação
       // atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servirMesa();

        // Método virou private
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // O cliente não pegará o pedido.
        // cliente.pegarPedidoBalcao();

        // Só o cliente verá
        // cliente.consultarSaldoDoAplicativo();

        // Ação não  poderá prosseguir
        // cozinheiro.pedirTrocaDeGas(atendente);

        // Só a classe Cozinheiro poderar chamar esses métodos
//        cozinheiro.pedirTrocaDeGas(almoxarife);
    }
}
