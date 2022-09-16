package horarioDia;

import java.util.Calendar;
import java.util.Date;

public class QualHorarioDoDia {

    private String dia = "Bom dia!";
    private String noite = "Boa noite!";
    private String tarde = "Boa tarde!";

    private Date verHora = Calendar.getInstance().getTime();
    private static final Horarios horarioDoDia = new Horarios();

    public String expressaoASerUtilizada(Integer verHora){
        if(verHora >= horarioDoDia.MEIA_NOITE && verHora < horarioDoDia.MEIO_DIA){
            return dia;
        } if(verHora >= horarioDoDia.MEIO_DIA && verHora < horarioDoDia.SEIS_DA_NOITE){
            return tarde;
        }else{
            return noite;
        }
    }

}
