import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Integer numero;
        String agencia;
        String nomeCliente;


        System.out.println("Bem-vindo ao Banco Gabs - DIO! \nPor favor, se registre:\n");

        System.out.println("Por favor, digite o número de sua agência com o traço:\nExemplo: 067-8\n");
        agencia = sc.nextLine();

        System.out.println("Agora, digite o número da conta conta:\n");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu nome completo:\n");
        nomeCliente = sc.nextLine();

        Conta novaConta = new Conta(numero, agencia, nomeCliente);

        System.out.println("Para cadastro de uma nova conta, é necessário realizar um depósito inicial! \nDigite o valor a ser depositado:");

        Double primeiroDeposito = sc.nextDouble();
        sc.nextLine();

        novaConta.deposito(primeiroDeposito);

        System.out.println(novaConta);

        sc.close();

    }
}

