package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    // Construtores
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

  
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public DataAniversario getDataAniversario() { return dataAniversario; }
    public void setDataAniversario(DataAniversario dataAniversario) { this.dataAniversario = dataAniversario; }

    // Aqui vai o método equals- compara dois objetos para verificar igualdade
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // compara se é o mesmo objeto
        if (!(obj instanceof Aniversariante)) return false; // verifica se o objeto é do tipo correto

        Aniversariante outro = (Aniversariante) obj;
        return this.nome.equalsIgnoreCase(outro.nome) &&
               this.dataAniversario.equals(outro.dataAniversario);
    }
}

