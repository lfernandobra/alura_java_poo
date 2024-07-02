import java.util.Calendar;

public class Carro {
    String modelo, cor;
    int ano;

    void fichaTecnica() {
        System.out.println("Modelo : " + modelo);
        System.out.println("Ano : " + ano);
        System.out.println("Cor : " + cor);
    }

    int idadeCarro() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) - ano;
    }

}
