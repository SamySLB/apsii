package  Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    // Método 1: imprime os nomes das figuras
    public void imprimeFiguras() {
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getNomeFigura());
        }
    }

   
    public double getMaiorAreaDeFigura() {
        double maior = 0.0;
        for (FiguraGeometrica f : figuras) {
            double area = f.calculaArea();
            if (area > maior) {
                maior = area;
            }
        }
        return maior;
    }

    // Método 3: retorna a soma de todas as áreas
    public double getAreaTotal() {
        double soma = 0.0;
        for (FiguraGeometrica f : figuras) {
            soma += f.calculaArea();
        }
        return soma;
    }
}
