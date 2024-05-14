package org.example;

public class Main {
    public static void main(String[] args) {


        //instanciando a interface com o objeto abaixo
        ConstrutorListaDeTarefas construtor = new ConstrutorSimplesListaDeTarefas();

        //instanciando a classe diretora
        DiretorListaDeTarefas diretor = new DiretorListaDeTarefas(construtor);


        //instanciando a classe product passando valores
        ListaDeTarefas listaDeTarefas = diretor.construirListaDeTarefas("Lavar a louça", "Limpar o quarto", "Fazer compras");

        System.out.println("Tarefas: ");

        //chama o método de imprimir as tarefas, da classe listaDeTarefas
        listaDeTarefas.imprimirTarefas();

/*
        System.out.println("---------- utilizando a classe diretora para acrescentar tarefas à lista de tarefas");
        diretor.adicionarTarefas("lavar o carro, dar banho no cachorro");
        listaDeTarefas.imprimirTarefas();

 */


        /*
        System.out.println("-------------");
        listaDeTarefas.limparTarefas();
        listaDeTarefas.imprimirTarefas();
        listaDeTarefas.adicionarTarefa("Estudar para prova");
        listaDeTarefas.imprimirTarefas();
        */

    }


}