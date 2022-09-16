package horarioDia;

import java.util.Calendar;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class Saudacao {
    public String horaSaudacao(){
        Date horaAtual = Calendar.getInstance().getTime();

        QualHorarioDoDia expressao = new QualHorarioDoDia();
        FormataHora formataHora = new FormataHora();

        Integer horaFormatada = parseInt(formataHora.formtatador(horaAtual));

        String mensagem = expressao.expressaoASerUtilizada(horaFormatada);

       return mensagem;
    }
}
