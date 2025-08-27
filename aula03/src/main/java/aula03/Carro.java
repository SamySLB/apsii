package aula03;

public class Carro extends veiculo{
	private int numPortas;
	
public Carro(String modelo, int ano,int numPortas) {
	super(modelo,ano);
	this.numPortas = numPortas;
}

@Override
public void imprimirDetalhes() {
	super.imprimirDetalhes();
	System.out.println("N de portas:" + this.numPortas);
}

public int getNumPortas() {
	return numPortas;
}

public void setNumPortas(int numPortas) {
	this.numPortas = numPortas;
}

}
