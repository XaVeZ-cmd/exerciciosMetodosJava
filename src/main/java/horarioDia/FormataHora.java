package horarioDia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataHora {

    public String formtatador(Date hora) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(hora).replaceAll(":", "").toString();
    }

}
