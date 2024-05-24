package org.example;


//************ DIRETOR************
/*
Constrói um objeto usando a interface Builder.
É o diretor que controla o processo de construção usando a interface builder (ConstrutorListaDeTarefas)
invocando os métodos em uma ordem específica.
 */

public class DiretorListaDeTarefas {

    //INSTANCIA A INTERFACE - QUE CONTÉM OS MÉTODOS
    private ConstrutorListaDeTarefas construtor;


    //OPERATIONS - MÉTODO CONSTRUTOR IMPLEMENTANDO A CLASSE DIRETOR
    public DiretorListaDeTarefas(ConstrutorListaDeTarefas construtor) {
        this.construtor = construtor;
    }

    //MÉTODO INVOCANDO O PRODUTO
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
