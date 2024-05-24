package org.example;


//************CONCRETE BUILDER************ CONSTRUTOR CONCRETO
//Implementa a interface builder (ConstutorListaDeTarefas) para construir e montar aspartes do Produto
//é aqui que toda a lógica para adicionar, remover, limpar tarefas e construir a lista é definida.

public class ConstrutorSimplesListaDeTarefas implements ConstrutorListaDeTarefas {

    //INSTANCIA A CLASSE  LISTA DE TAREFAS(Product)
    //ATRIBUTO
    private ListaDeTarefas listaDeTarefas;

    //OPERATIONS / MÉTODO CONSTRUTOR
    public ConstrutorSimplesListaDeTarefas() {
        this.listaDeTarefas = new ListaDeTarefas();
    }

    @Override
    public void adicionarTarefa(String tarefa) {
        listaDeTarefas.adicionarTarefa(tarefa);
    }

    public void adicionarTarefas(String... tarefas) { // (...) varargs PERMITE PASSAR UM NÚMERO VARIÁVEL DE STRINGS PARA ESSE MÉTODO)
        for (String tarefa : tarefas) {
            listaDeTarefas.adicionarTarefa(tarefa);
        }
    }

    @Override
    public void removerTarefa(String tarefa) {
        listaDeTarefas.removerTarefa(tarefa);
    }

    @Override
    public void limparTarefas() {
        listaDeTarefas.limparTarefas();
    }

    @Override
    public ListaDeTarefas construir() {
        return listaDeTarefas;
    }


}
