package opcoes;

import opcoes.escolha.Escolha;

import java.util.Scanner;

public class Opcao {

   private Escolha escolha = new Escolha();

    public String escolhaUsuario(){
        switch (qualOpcao()){
            case 1:
                return escolha.escolhaCalculadora().calcula();
            case 2:
                return escolha.escolhaEmprestimo().empresta();
            default:
                return "Opção Inválida";
        }
    }

    public Integer qualOpcao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual opção você prefere:");
        System.out.println("Opção 1 = Calculadora");
        System.out.println("Opção 2 = Cálculo de Empréstimo");
        Integer numOpcao = sc.nextInt();
        return numOpcao;
    }
}
