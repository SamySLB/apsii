package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> lista;

    public MinhaAgendaDeAniversarios() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void adicionar(Aniversariante a) {
        if (!lista.contains(a)) { // usa o equals do Aniversariante
            lista.add(a);
        }
    }

    @Override
    public void remover(Aniversariante a) {
        lista.remove(a);
    }

    @Override
    public Aniversariante buscarPorNome(String nome) {
        for (Aniversariante a : lista) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void listarTodos() {
        for (Aniversariante a : lista) {
            System.out.println(a.getNome() + " - " + a.getDataAniversario());
        }
    }
}
