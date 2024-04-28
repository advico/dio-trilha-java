import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Conta (no formato XXX-X):");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por último, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); // Fechar o scanner após o uso
    }
}
