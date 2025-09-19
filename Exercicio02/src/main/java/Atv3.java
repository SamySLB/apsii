// =============================
// Questão 1 - Classe muito grande
// =============================

// Código ruim (Classe Deus com tudo junto)
class SistemaAcademico {
    public void cadastrarAluno() {}
    public void calcularMedia() {}
    public void emitirRelatorio() {}
    public void enviarEmail() {}
    public void processarPagamento() {}
    // ... +3000 linhas
}

// Refatorado (separando responsabilidades)
class CadastroAluno {
    public void cadastrarAluno() {}
}
class CalculadoraMedia {
    public void calcularMedia() {}
}
class Relatorio {
    public void emitirRelatorio() {}
}
class Notificacao {
    public void enviarEmail() {}
}
class Pagamento {
    public void processarPagamento() {}
}



// =============================
// Questão 2 - Código duplicado
// =============================

// Código ruim (duplicação em vários módulos)
class Carrinho {
    public double calcularFrete(double peso) { return peso * 10; }
}
class PrecoFinal {
    public double calcularFrete(double peso) { return peso * 10; }
}
class Relatorio {
    public double calcularFrete(double peso) { return peso * 10; }
}

// Refatorado (centralização da regra)
class CalculadoraFrete {
    public static double calcular(double peso) { return peso * 10; }
}
class Carrinho {
    public double calcularFrete(double peso) { return CalculadoraFrete.calcular(peso); }
}
class PrecoFinal {
    public double calcularFrete(double peso) { return CalculadoraFrete.calcular(peso); }
}
class Relatorio {
    public double calcularFrete(double peso) { return CalculadoraFrete.calcular(peso); }
}



// =============================
// Questão 3 - Muitos parâmetros
// =============================

// Código ruim
void gerarRelatorioFinanceiro(int mes, int ano, String usuario,
    String departamento, String formato, boolean detalhado,
    boolean incluirImpostos, boolean ordenarPorData) {}

// Refatorado (Objeto parâmetro)
class RelatorioRequest {
    int mes;
    int ano;
    String usuario;
    String departamento;
    String formato;
    boolean detalhado;
    boolean incluirImpostos;
    boolean ordenarPorData;
}
void gerarRelatorioFinanceiro(RelatorioRequest req) {}



// =============================
// Questão 4 - Condicionais aninhadas
// =============================

// Código ruim
if (funcionario.getCargo().equals("Gerente")) {
    if (funcionario.getTempoDeServico() > 5) {
        if (funcionario.getDepartamento().equals("Financeiro")) {
            // cálculo de bônus especial
        }
    }
}

// Refatorado (Polimorfismo / Early Return)
class RegraBonus {
    public boolean aplica(Funcionario f) { return false; }
}
class RegraGerenteFinanceiro extends RegraBonus {
    @Override
    public boolean aplica(Funcionario f) {
        return f.getCargo().equals("Gerente") &&
               f.getTempoDeServico() > 5 &&
               f.getDepartamento().equals("Financeiro");
    }
}



// =============================
// Questão 5 - Nomes genéricos
// =============================

// Código ruim
public void doIt() {
    int a = 10;
    int x1 = 20;
    int temp = a + x1;
}

// Refatorado
public void calcularSoma() {
    int numero1 = 10;
    int numero2 = 20;
    int soma = numero1 + numero2;
}



// =============================
// Questão 6 - Código duplicado
// =============================

// Código ruim
class Pedido {
    public double calcularTotal(double preco, int qtd) { return preco * qtd; }
}
class CarrinhoDeCompras {
    public double calcularTotal(double preco, int qtd) { return preco * qtd; }
}
class RelatorioFinanceiro {
    public double calcularTotal(double preco, int qtd) { return preco * qtd; }
}

// Refatorado
class CalculadoraTotal {
    public static double calcular(double preco, int qtd) { return preco * qtd; }
}



// =============================
// Questão 7 - Inveja dos Dados
// =============================

// Código ruim
class Funcionario {
    public double salarioBase;
    public double descontos;
    public double bonus;
}
class RelatorioFinanceiro {
    public double calcularPagamento(Funcionario f) {
        return f.salarioBase + f.bonus - f.descontos;
    }
}

// Refatorado
class Funcionario {
    public double salarioBase;
    public double descontos;
    public double bonus;

    public double calcularPagamento() {
        return salarioBase + bonus - descontos;
    }
}
class RelatorioFinanceiro {
    public double calcularPagamento(Funcionario f) {
        return f.calcularPagamento();
    }
}

