import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = entrada.nextInt();

        System.out.println("Digite o número da Agência e dígito:");
        String agencia = entrada.nextLine();

        System.out.println("Digite o nome do titular da conta:");
        String nomeCliente = entrada.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta 
        em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo de " +
        saldo + " já está disponível para saque.");

        entrada.close();
    }
}