package br.org.vanderleialvarengajr.exercicioTarefas;

public class TesteListaTarefas {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        System.out.println("Número de tarefas: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Tarefa 01");
        lista.adicionarTarefa("Tarefa 01");
        lista.adicionarTarefa("Tarefa 02");

        System.out.println("Número de tarefas: " + lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();

        lista.removerTarefa("Tarefa 01");
        System.out.println("Número de tarefas: " + lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();
    }
}
