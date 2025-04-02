package desafio_aula03.animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
        cachorro.abanarRabo();
        gato.arranharMoveis();
    }
}
