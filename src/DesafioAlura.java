import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {

        double saldoBanco = 2500.00;
        String nome = "Rômulo dos Santos Teixeira";
        String contaBanco = "Conta Corrente";
        Scanner leitura = new Scanner(System.in);
        int recebeOperacao;
        double saque;

        System.out.println("****************************************");
        System.out.println("Informações da conta: ");
        System.out.println("Nome do dono da conta: " + nome);
        System.out.println("Saldo do dono da conta: " + saldoBanco);
        System.out.println("tipo de conta: " + contaBanco);
        System.out.println("****************************************");

        System.out.println("Digite o número equivalente a operação que você deseja fazer: ");
        System.out.println("1 - Consultar saldo: ");
        System.out.println("2 - depositar na conta: ");
        System.out.println("3 - sacar da conta: ");
        System.out.println("4 - encerrar a operação: ");
        recebeOperacao = leitura.nextInt();

        while (recebeOperacao != 4) {

            if (recebeOperacao == 1) {
                System.out.println("seu saldo do banco é: " + saldoBanco);
            } else if (recebeOperacao == 2) {
                System.out.println("Qual o valor que você deseja depositar?");
                saldoBanco += leitura.nextDouble();
                System.out.println("seu saldo atual é: " + saldoBanco);

            } else if (recebeOperacao == 3) {
                System.out.println("Qual valor você deseja sacar?");
                saque = leitura.nextDouble();
                if (saldoBanco < saque) {
                    System.out.println("seu saldo é insuficiente!");
                } else {
                    saldoBanco -= saque;
                    System.out.println("seu saldo atual é: " + saldoBanco);
                }
            } else {
                System.out.println("operação inválida");
            }

            System.out.println("Digite o número equivalente a operação que você deseja fazer: ");
            System.out.println("1 - Consultar saldo: ");
            System.out.println("2 - depositar na conta: ");
            System.out.println("3 - sacar da conta: ");
            System.out.println("4 - encerrar a operação: ");
            recebeOperacao = leitura.nextInt();
        }


    }
}
