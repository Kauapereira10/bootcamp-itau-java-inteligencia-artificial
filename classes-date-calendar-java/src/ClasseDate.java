import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseDate {

    public static void main(String[] args) {
        Date agora = new Date();
        System.out.println("Data/Hora atual: " + agora);

        long milissegundos = agora.getTime();
        System.out.println("Milissegundos desde 1970: " + milissegundos);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dataFormatada = sdf.format(agora);
        System.out.println("\nData Formatada: " + dataFormatada);

        Date date2 = new Date(agora.getTime() - (1000 * 60 * 60));
        if (agora.after(date2)) {
            System.out.println("data1 ocorre ANTES de data2");
        }

        if (date2.after(agora)) {
            System.out.println("data2 ocorre DEPOIS de data1");

        }
    }

}
