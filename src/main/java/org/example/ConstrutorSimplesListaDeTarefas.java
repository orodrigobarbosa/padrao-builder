package org.example;

//************CONCRETE BUILDER************ precisa implementar a interface abstrata Builder
public class ConstrutorSimplesListaDeTarefas implements ConstrutorListaDeTarefas {

    //INSTANCIA A CLASSE (Product)
    //ATRIBUTO
    private ListaDeTarefas listaDeTarefas;

    //OPERATIONS / MÉTHODS
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
    public org.example.ListaDeTarefas construir() {
        return listaDeTarefas;
    }

}
