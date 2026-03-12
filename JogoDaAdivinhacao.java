import java.util.Random;
import java.util.Scanner;
//Random é usado pra gerar um número aleatório.

public class JogoDaAdivinhacao {
    public static void main(String[] args) {

        int numeroSecreto = new Random().nextInt(100) + 1;
        int tentativas = 0;

        while (tentativas < 10) {
            tentativas++;

            // Obter palpite do usuário
            System.out.println("Digite seu palpite (" + (tentativas) + "ª tentativa):");
            Scanner scanner = new Scanner(System.in);
            int palpite = scanner.nextInt();

            // Verificar se o palpite é correto
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você adivinhou o número secreto em " + tentativas + " tentativas!");
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("Seu palpite é maior que o número secreto.");
            } else {
                System.out.println("Seu palpite é menor que o número secreto.");
            }
        }

        if (tentativas == 10) {
            System.out.println("Você não conseguiu adivinhar o número secreto em 10 tentativas. O número secreto era "
                    + numeroSecreto + ".");
        }

    }

}