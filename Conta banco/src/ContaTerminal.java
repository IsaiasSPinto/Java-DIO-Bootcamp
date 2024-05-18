import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws  Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por Favor digite o numero da conta !");

        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por Favor digite o numero da Agencia !");

        String agencia = sc.nextLine();

        System.out.println("Por Favor digite o seu Nome !");

        String nome = sc.nextLine();

        System.out.println("Por Favor digite o saldo a ser depositado !");

        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " +  nome + "," +
                " obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + "," +
                " conta " +  numero +
                " e seu saldo " +  saldo + " já está disponível para saque");
    }
}