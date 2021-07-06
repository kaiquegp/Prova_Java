package ProvaJava;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int resp;
        
        Conta conta = new Conta ("", 0, "", 0, "");
              
        conta.BemVindo();
        
        conta.Status1();
        
         do{
            System.out.println("\nO que você deseja realizar agora: \n 1- Saque \n 2-Depósito \n 3- Ver rendimento mensal  \n 4- Ver Saldo  \nDigite Aqui:");
            int escolha = sc.nextInt();
            if (escolha < 1 || escolha > 5){
                while(escolha < 1 || escolha > 5){
                System.out.println("Digite uma opção valída:");
                escolha = sc.nextInt();
                }
            }

            switch (escolha){
                case 1: 
                    System.out.println("\nSaldo atual: "+ conta.Saldo);
                    System.out.println("Digite o valor do saque: ");
                    int saque = sc.nextInt();
                    conta.Saque(saque);
                break;

                case 2:
                    System.out.println("\nSaldo atual: "+ conta.Saldo);
                    System.out.println("Digite o valor do depósito: ");
                    int dep = sc.nextInt();
                    conta.Deposito(dep);
                break;

                case 3:
                    conta.CalculoRendimento();
                break;

                case 4:
                    conta.Saldo();
                break;           
            }
        System.out.println("Deseja realizar uma nova operação? \n1-Sim \n2-Não");
        resp = sc.nextInt();
        }while(resp == 1);
        
        conta.Saida();
       
    }
}
