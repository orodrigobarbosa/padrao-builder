package org.example;

public class Main {
    public static void main(String[] args) {

/*
Utiliza o Diretor para construir um objeto usando um Builder espefíco

 Cria um ConstrutorSimplesListaDeTarefas, passa para o DiretorListaDeTarefas e, em seguida, constrói uma ListaDeTarefas usando o método construirListaDeTarefas do diretor.
 */
        // Instanciando o objeto ConstrutorSimplesListaDeTarefas que implementa a interface ConstrutorListaDeTarefas
        ConstrutorListaDeTarefas construtor = new ConstrutorSimplesListaDeTarefas();

        // Instanciando a classe diretora passando o construtor
        DiretorListaDeTarefas diretor = new DiretorListaDeTarefas(construtor);


        // Usando a classe diretora para construir o objeto ListaDeTarefas, passando valores
        ListaDeTarefas listaDeTarefas = diretor.construirListaDeTarefas("Lavar a louça", "Limpar o quarto", "Fazer compras");

        System.out.println("Tarefas: ");

        // Utilizando o objeto criado acima para chamar o método imprimir, criado na classe produto
        listaDeTarefas.imprimirTarefas();



/*
        System.out.println("---Utilizando a classe diretora para acrescentar tarefas à lista de tarefas---");
        diretor.adicionarTarefas("lavar o carro, dar banho no cachorro");
        listaDeTarefas.imprimirTarefas();


/*

        /*
        System.out.println("-------------");
        listaDeTarefas.limparTarefas();
        listaDeTarefas.imprimirTarefas();
        listaDeTarefas.adicionarTarefa("Estudar para prova");
        listaDeTarefas.imprimirTarefas();
        */

    }


}