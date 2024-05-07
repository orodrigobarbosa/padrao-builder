package org.example;

public class DiretorListaDeTarefas {

    //INSTANCIA A INTERFACE - QUE CONTÉM OS ATRIBUTOS
    private org.example.ConstrutorListaDeTarefas construtor;


    //OPERATIONS - CONSTRUCTOS
    public DiretorListaDeTarefas(org.example.ConstrutorListaDeTarefas construtor) {
        this.construtor = construtor;
    }

    public org.example.ListaDeTarefas construirListaDeTarefas(String... tarefas) {
        construtor.adicionarTarefas(tarefas);
        return construtor.construir();
    }


    //foreach
    public void adicionarTarefas(String... tarefas) {
        for (String tarefa : tarefas) {
            construirListaDeTarefas().adicionarTarefa(tarefa);
        }
    }
}
