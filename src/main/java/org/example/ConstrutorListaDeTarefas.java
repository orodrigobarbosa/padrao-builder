package org.example;

public abstract interface ConstrutorListaDeTarefas {


    //************BUILDER(Construtor) ABSTRACT************
/*
O padrão organiza a construção de objetos em uma série de etapas (construirParedes,
construirPorta, etc.). Para criar um objeto você executa uma série de etapas em um objeto
builder. A parte importante é que você não precisa chamar todas as etapas. Você chama apenas
aquelas etapas que são necessárias para a produção de uma configuração específica de um
objeto
 */

    //Métodos
    void adicionarTarefa(String tarefa);

    void adicionarTarefas(String... tarefas); //... significa que o método pode aceitar um número variável de tarefas

    void removerTarefa(String tarefa);

    void limparTarefas();


    //Operations (BuildPart)
    ListaDeTarefas construir();


}

