package org.example;

//CONCRETE BUILDER
public class ConstrutorSimplesListaDeTarefas implements ConstrutorListaDeTarefas {

    //INSTANCIA A CLASSE
    private org.example.ListaDeTarefas listaDeTarefas;

    //OPERATIONS
    public ConstrutorSimplesListaDeTarefas() {
        this.listaDeTarefas = new org.example.ListaDeTarefas();
    }

    @Override
    public void adicionarTarefa(String tarefa) {
        listaDeTarefas.adicionarTarefa(tarefa);
    }

    public void adicionarTarefas(String... tarefas) {
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
    public org.example.ListaDeTarefas construir() {
        return listaDeTarefas;
    }

}
