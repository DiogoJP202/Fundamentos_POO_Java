package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche hamburger no balcão.");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adionando suco no balcão.");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    // Trocado para Private
    private void prepararLanche(){
        System.out.println("Preparando lanche tipo: hamburger.");
    }

    // Trocado para Private
    private void prepararVitamina(){
        System.out.println("Preparando suco.");
    }

    // Trocado para Private
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    // Trocado para Private
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando: Pão, Salada, Ovo e Carne.");
    }

    // Trocado para Private
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando: Fruta, Leite e Água.");
    }

    // Trocado para Private
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes.");
    }

    // Trocado para Private
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador.");
    }

    // Trocado para Private
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hamburger.");
    }

    // Ação não  poderá prosseguir
//    public void pedirTrocaDeGas(Atendente funcionario){
//        funcionario.trocarGas();
//    }

    // Trocado para Private
    private void pedirTrocaDeGas(Almoxarife funcionario){
        funcionario.trocarGas();
    }

    // Trocado para Default
    void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}