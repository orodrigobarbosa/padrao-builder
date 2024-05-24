package org.example;

import java.util.ArrayList;
import java.util.List;

//************PRODUCT************
//representa o objeto complexo a ser construído (Uma Lista De Tarefas)

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

    //O PADRÃO PERMITE IMPRIMIR TODAS AS TAREFAS ARMAZENADAS NA LISTA "TAREFAS" com o método abaixo
    public void imprimirTarefas() {
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

}
