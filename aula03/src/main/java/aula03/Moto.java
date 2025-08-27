package aula03;

public class Moto extends veiculo {
	
	private int cilindradas;
	
public Moto(String modelo, int ano, int cilindradas) {
	super(modelo,ano);
	this.cilindradas = cilindradas;
}

@Override
public void imprimirDetalhes() {
	super.imprimirDetalhes();
	System.out.println("N de cilindradas:" + this.cilindradas);
	}
}

