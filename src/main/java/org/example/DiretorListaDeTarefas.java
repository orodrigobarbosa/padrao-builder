package org.example;


//************ DIRECTOR************



public class DiretorListaDeTarefas {

    //INSTANCIA A INTERFACE - QUE CONTÉM OS ATRIBUTOS
    private ConstrutorListaDeTarefas construtor;


    //OPERATIONS - CONSTRUCTOr
    public DiretorListaDeTarefas(ConstrutorListaDeTarefas construtor) {
        this.construtor = construtor;
    }

    //METHOD
    public ListaDeTarefas construirListaDeTarefas(String... tarefas) {
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
