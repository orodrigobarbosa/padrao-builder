package org.example;

public abstract interface ConstrutorListaDeTarefas {

    //Attributes
    void adicionarTarefa(String tarefa);
    void adicionarTarefas(String... tarefas); //... significa que o método pode aceitar um número variável de tarefas
    void removerTarefa(String tarefa);
    void limparTarefas();


//Operations (BuildPart)
    org.example.ListaDeTarefas construir();
}

