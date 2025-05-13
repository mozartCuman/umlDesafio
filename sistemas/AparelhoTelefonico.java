package sistemas;

import java.util.Scanner;
//import pivot.Pivot;

sealed interface AparelhoTelefonico permits Iphone {

    Scanner scan = new Scanner(System.in);

    void fazerChamada();/*{

        System.out.print("Digite o número: ");
        scan.skip("\\R?");
        String numero = scan.nextLine();

        System.out.println("Ligando para: " + numero + " ...");

        scan.close();
    }*/

    void receberChamada();/*{

        System.out.println(" Recebendo chamada!!!");
        
        System.out.println(" Atender chamada??? Sim[S] Não[N]");
        scan.skip("\\R?");
        String atender = scan.nextLine();

        if (atender.trim().toLowerCase().startsWith("n")) {
            for (var i = 0; i < atender.length(); i++) {

                System.out.println((i + 1) + "° chamada TRIM TRIM TRIM");
                
            }
        } else if(atender.trim().toLowerCase().startsWith("n")) {
             System.out.println(" Chamada atendida!!!!");}

        scan.close();
    }*/

    void encerrarChamada(); /*{

        byte encerrar;

        do {
            try {
                System.out.println("\n\n Deseja encerrar a chamada???: Sim[0] Não[1]");
                encerrar = scan.nextByte();

                if (encerrar == 0) {
                    System.out.println("Chamada encerrada.");
                    //Pivot.controle();
                } else if (encerrar == 1) {
                    System.out.println("Chamada continua...");
                } else {
                    System.out.println("Entrada inválida! Digite apenas 0 (Sim) ou 1 (Não).");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite Zero[0] para SIM e Um[1] para Não!!!");
                scan.next(); 
                encerrar = -1; 
            }
        } while (encerrar != 0 || encerrar != 1);
    }*/

}