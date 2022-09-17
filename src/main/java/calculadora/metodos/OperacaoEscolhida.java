package calculadora.metodos;

import calculadora.metodos.operacoes.Divisao;
import calculadora.metodos.operacoes.Multiplicacao;
import calculadora.metodos.operacoes.Soma;
import calculadora.metodos.operacoes.Subtracao;

public class OperacaoEscolhida {

    private Soma soma = new Soma();
    private Subtracao subtracao = new Subtracao();
    private Divisao divisao = new Divisao();
    private Multiplicacao multiplicacao = new Multiplicacao();

    public Soma escolhaSoma(){
        return soma;
    }
    public Subtracao escolhaSubtracao(){
        return subtracao;
    }
    public Divisao escolhaDivisao(){
        return divisao;
    }
    public Multiplicacao escolhaMultiplicao(){
        return multiplicacao;
    }

}
