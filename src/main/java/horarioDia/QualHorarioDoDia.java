package horarioDia;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class QualHorarioDoDia {

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    private Date hora =  Calendar.getInstance().getTime();
    private String horaAtual = sdf.format(hora).replaceAll(":", "").toString();

    private String dia = "Bom dia!";
    private String noite = "Boa noite!";
    private String tarde = "Boa tarde!";
    private Horarios horarioDoDia;

    public Integer verHora(){
        return parseInt(horaAtual);
    }

    public String expressaoASerUtilizada(){
        this.horaAtual = horaAtual;
        if(verHora() >= horarioDoDia.MEIA_NOITE && verHora() < horarioDoDia.MEIO_DIA){
            return dia;
        } if(verHora() >= horarioDoDia.MEIO_DIA && verHora() < horarioDoDia.SEIS_DA_NOITE){
            return tarde;
        }else{
            return noite;
        }
    }

    public String enviaCumprimento(){
        return expressaoASerUtilizada();
    }

}
