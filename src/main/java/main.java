import horarioDia.QualHorarioDoDia;

import java.util.Date;

public class main {
    public static void main(String [] args){
       QualHorarioDoDia expressao = new QualHorarioDoDia();
       String cumprimento = expressao.expressaoASerUtilizada();
       System.out.println(cumprimento);
    }
}
