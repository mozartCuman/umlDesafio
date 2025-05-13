package sistemas;

import java.util.Scanner;

public non-sealed abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private boolean ligar;
    private boolean desligar;
    private String url;




    public boolean getLigar() {
        System.out.print("Está ligado!!!");
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }
    public boolean getDesligar() {
        return desligar;
    }

    public void setDesligar(boolean desligar) {
        this.desligar = desligar;
        
    }

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    //NavegadorInternet.java<
    @Override
    public void abrirPagina(String url){

            System.out.println(" Redirecionando para: " + url); 
    }

    @Override
    public void atualizarPagina(String url){

        System.out.println("\n\nAtualizando página:" 
            + " " + url
            + " Obrigado pela espera!!!");
    }

    @Override
    public void fecharPagina(){
        System.out.println("Página fechada"); 
     }
     //NavegadorInternet.java>


     //RerodutorMusical.java<
     @Override
     public void tocarMusica(){
        System.out.println("Musica tocando!!!");
    }

    @Override
    public void pausarMusica(){
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga o nome da música: ");
        scan.skip("\\R?");
        String musica = scan.nextLine();

        System.out.println("Música: " + musica + " tocando!!!");

        scan.close();
    }
     //RerodutorMusical.java>

     //AparelhoTelefonico.java<
    @Override
    public void fazerChamada(){
        System.out.print("Digite o número: ");
        scan.skip("\\R?");
        String numero = scan.nextLine();

        System.out.println("Ligando para: " + numero + " ...");

        scan.close();
    }

    @Override
    public void receberChamada(){

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
    }

    @Override
    public void encerrarChamada() {

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
    }
     //AparelhoTelefonico.java>

}
