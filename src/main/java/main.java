import horarioDia.Saudacao;
import opcoes.Opcao;


public class main {
    public static void main(String [] args){
        Saudacao saudacao = new Saudacao();
        System.out.println(saudacao.horaSaudacao());

        Opcao opcaoUsuario = new Opcao();
        opcaoUsuario.escolhaUsuario();
    }
}
