package org.example;

import java.util.ArrayList;
import java.util.List;

//************PRODUCT************

public class ListaDeTarefas {

    //ATRIBUTO
    // uma lista
    private List<String> tarefas;


    //OPERACOES / CHAMAM OS MÉTODOS DA CLASSE ConstrutorSimplesListaDeTarefas
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

    //O PADRÃO PERMITE IMPRIMIR TODAS AS TAREFAS ARMAZENADAS NA LISTA "TAREFAS"

    public void imprimirTarefas() {
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

}
