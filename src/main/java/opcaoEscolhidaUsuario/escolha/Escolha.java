package opcaoEscolhidaUsuario.escolha;

import calculadora.Calculadora;
import emprestimo.Emprestimo;

public class Escolha {

    private Calculadora calc = new Calculadora();
    private Emprestimo emprestimo = new Emprestimo();

    public Calculadora escolhaCalculadora(){
        return calc;
    }

    public Emprestimo escolhaEmprestimo(){
        return emprestimo;
    }
}
