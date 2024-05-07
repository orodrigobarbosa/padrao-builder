package org.example;

import java.util.ArrayList;
import java.util.List;

//PRODUCT

public class ListaDeTarefas {

    //ATRIBUTO
    private List<String> tarefas;


    //OPERACOES
    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        tarefas.remove(tarefa);
    }

    public void limparTarefas() {
        tarefas.clear();
    }

    public void imprimirTarefas() {
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

}
