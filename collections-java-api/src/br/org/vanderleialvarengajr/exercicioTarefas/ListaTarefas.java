package br.org.vanderleialvarengajr.exercicioTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListaTarefas {
    private final List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!descricao.isBlank())
        {
            Predicate<Tarefa> predicateToRemove = p -> p.getDescricao().equalsIgnoreCase(descricao);
            listaTarefas.removeIf(predicateToRemove);
        }
    }

    public int obterNumeroTotalTarefas()
    {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas()
    {
        System.out.println(listaTarefas);
    }
}
