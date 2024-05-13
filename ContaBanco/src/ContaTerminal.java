import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("coloca o nuemro da conta");
        int Numero = in.nextInt();

        System.out.println("coloca o numero da agencia");
        String Agencia = in.nextLine();

        System.out.println("coloca o teu nome");
        String Nome = in.nextLine();


        System.out.println("coloca o saldo");
        double Saldo = in.nextDouble();


        System.out.println("Ola" + Nome +", obrigado por criar uma conta em nosso banco, sua agência é" + Agencia +", conta" + Numero + "e seu saldo "+ Saldo+ "ja esta disponivel para saque");



    }


}
