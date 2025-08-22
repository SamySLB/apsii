package br.edu.unipe.aps2.exercicio1;

public interface AgendaDeAniversarios {
    void adicionar(Aniversariante a);
    void remover(Aniversariante a);
    Aniversariante buscarPorNome(String nome);
    void listarTodos();
}
//interface criada para implementar o que esta em MinhaAgendaDeAniversarios
