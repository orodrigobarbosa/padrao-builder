package org.example;


//************ DIRECTOR************

public class DiretorListaDeTarefas {

    //INSTANCIA A INTERFACE - QUE CONTÉM OS MÉTODOS
    private ConstrutorListaDeTarefas construtor;


    //OPERATIONS - MÉTODO CONSTRUTOR
    public DiretorListaDeTarefas(ConstrutorListaDeTarefas construtor) {
        this.construtor = construtor;
    }

    //METHOD
    public ListaDeTarefas construirListaDeTarefas(String... tarefas) {
        construtor.adicionarTarefas(tarefas);
        return construtor.construir();

    }


    //MÉTODO COM UM foreach
    public void adicionarTarefas(String... tarefas) {
        for (String tarefa : tarefas) {
            construirListaDeTarefas().adicionarTarefa(tarefa);
        }
    }
}
