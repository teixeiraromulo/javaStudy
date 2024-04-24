import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int numeroDaSorte = random.nextInt(1001);
        int chute; // Movendo a declaração da variável chute para fora do loop
        int contador = 0;

        System.out.println("O programa gerou um número aleatório entre 0 e 1000, tente adivinhar!");

        do {
            System.out.println("Insira seu chute:");
            chute = leitura.nextInt(); // Atribuindo o valor dentro do loop
            contador++;

            if (chute > numeroDaSorte) {
                System.out.println("Você chutou muito alto.");
            } else if (chute < numeroDaSorte) {
                System.out.println("Você chutou muito baixo.");
            } else {
                System.out.println("Você acertou, o número era " + numeroDaSorte);
                System.out.println("Você demorou " + contador + " tentativas.");
            }
        } while (chute != numeroDaSorte);
    }
}
