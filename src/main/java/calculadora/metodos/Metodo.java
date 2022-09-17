package calculadora.metodos;

import java.util.Scanner;

public class Metodo {

    private OperacaoEscolhida escolha = new OperacaoEscolhida();

    public Object escolhaMetodo(){
        switch (qualMetodo()){
            case 1:
                return escolha.escolhaSoma();
            case 2:
                return escolha.escolhaSubtracao();
            case 3:
                return escolha.escolhaDivisao();
            case 4:
                return escolha.escolhaMultiplicao();
            default:
                return "Opção Inválida";
        }
    }
    public Integer qualMetodo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação você deseja realizar:");
        System.out.println("Opção 1 = Soma");
        System.out.println("Opção 2 = Subtração");
        System.out.println("Opção 2 = Divisão");
        System.out.println("Opção 2 = Multiplicação");
        Integer numMetodo = sc.nextInt();
        return numMetodo;
    }
}
