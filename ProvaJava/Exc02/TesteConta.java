package ProvaJava;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        
        int resp;
        
        Conta contaTs = new Conta ("Marcelinho",2761,"07",200.00,"25/02/2020");
    
        
       contaTs.Status();
        
        do{
            System.out.println("O que você deseja realizar agora: \n 1- Saque \n 2-Depósito \n 3- Ver rendimento mensal  \n 4- Ver Saldo  \nDigite Aqui:");
            int escolha = sc.nextInt();
            if (escolha < 1 || escolha > 5){
                while(escolha < 1 || escolha > 5){
                System.out.println("Digite uma opção valída:");
                escolha = sc.nextInt();
                }
            }

            switch (escolha){
                case 1:
                    System.out.println("\nSaldo atual: "+ contaTs.Saldo);
                    contaTs.Saque(100);
                break;

                case 2:
                    System.out.println("\nSaldo atual: "+ contaTs.Saldo);
                    contaTs.Deposito(900);
                break;

                case 3:
                    contaTs.CalculoRendimento();
                break;

                case 4:
                    contaTs.Saldo();
                break;           
            }
        System.out.println("Deseja realizar uma nova operação? \n1-Sim \n2-Não");
        resp = sc.nextInt();
        }while(resp == 1);
        
        contaTs.Saida();
   }
}

