package aula03;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Carro c1 = new Carro("Modelo A", 2000, 4);
		Moto m1 = new Moto("Modelo b", 2020, 10);
		
		System.out.println("Modelo:");
		c1.setModelo(teclado.nextLine());
		
		
		System.out.println("Ano:");
		c1.setAno(teclado.nextInt());
		
		
		System.out.println("número de portas:");
		c1.setNumPortas(teclado.nextInt());
		
		c1.imprimirDetalhes();
	}

}
