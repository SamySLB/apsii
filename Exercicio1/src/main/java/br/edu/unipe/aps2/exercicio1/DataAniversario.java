package br.edu.unipe.aps2.exercicio1;

public class DataAniversario {

    private int dia;
    private int mes;

    // Construtor 
    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    // Getters e setters- ajudam a manter o encapsulamento
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DataAniversario)) return false;

        DataAniversario outra = (DataAniversario) obj;
        return this.dia == outra.dia && this.mes == outra.mes;
    }
}

