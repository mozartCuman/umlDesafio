package principal;

import java.util.Scanner;

import pivot.Pivot;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        byte menu;
        try {
            System.out.println(" Bem vindo ao novo IPHONE");

            do{
                System.out.print("\n\n Pressione [0] para Fechar o celular: ");
                System.out.print("\n\n Pressione [1] para abrir o menu:     ");
                menu = scan.nextByte();

                try {
                    if (menu == 0) {
                        System.out.println("Obrigado por testar!!!!");
                        System.exit(0);
                    }{Pivot.controle();}
                } catch (Exception e) { 
                    System.out.println("\n\n Digite apenas 0 ou 1 \n\n");
                }
            }while(true);
        } finally {scan.close();}
        

        
    }

    
}