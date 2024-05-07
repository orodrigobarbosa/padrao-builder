package org.example;

public class Main {
    public static void main(String[] args) {

            org.example.ConstrutorListaDeTarefas construtor = new org.example.ConstrutorSimplesListaDeTarefas();

            org.example.DiretorListaDeTarefas diretor = new org.example.DiretorListaDeTarefas(construtor);

            org.example.ListaDeTarefas listaDeTarefas = diretor.construirListaDeTarefas("Lavar a louça", "Limpar o quarto", "Fazer compras");

            System.out.println("Tarefas:");

            listaDeTarefas.imprimirTarefas();
        }
    }