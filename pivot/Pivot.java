package pivot;

import java.util.Scanner;

import sistemas.Iphone;

public class Pivot {

    

    public static void controle(){
        Scanner scan = new Scanner(System.in);
        Iphone iphone = new Iphone() {
            
        };
        
        byte escolha = -1;

        do{
            System.out.println("Reprodutor de música [1]: "
            + "Ligações [2]: "
            + "Navegador [3]: "
            + "Voltar [0]: ");
            escolha = scan.nextByte();

            switch (escolha) {
                case 1:

                    while(true){
                        System.out.println("\n\n Abrindo reprodutos musical \n\n ");
                        System.out.println("Selecionar música [1]: ");
                        System.out.println("Tocar musica [2]: ");
                        System.out.println("Pausar música [3]: ");
                        System.out.println("Voltar [0]: ");
                        byte escolha1 = scan.nextByte();
                        
                        if(escolha1 == 0){
                            break;
                        }else {
                            switch (escolha1) {
                                case 1:
                                    iphone.selecionarMusica();
                                    break;

                                case 2:
                                    iphone.tocarMusica();
                                    break;
                                    
                                case 3:
                                    iphone.pausarMusica();
                                    break;
                            
                                default:
                                    break;
                            }
                        }
                    }

                    break;
                case 2:

                    while(true){
                        System.out.println("\n\n Abrindo telefone \n\n ");
                        System.out.println("Fazer ligação [1]: ");
                        System.out.println("Aceitar ligação [2]: ");
                        System.out.println("Encerrar [3]: ");
                        System.out.println("Voltar [0]: ");
                        byte escolha1 = scan.nextByte();
                        
                        if(escolha1 == 0){
                            break;
                        }else {
                            switch (escolha1) {
                                case 1:
                                    iphone.fazerChamada();
                                    break;

                                case 2:
                                    iphone.receberChamada();
                                    break;
                                    
                                case 3:
                                    iphone.encerrarChamada();
                                    break;
                            
                                default:
                                    break;
                            }
                        }
                    }
                    
                    break;
                case 3:
                
                String url = null;

                while(true){
                        System.out.println("\n\n Abrindo reprodutos musical \n\n ");
                        System.out.println("Fazer ligação [1]: ");
                        System.out.println("Aceitar ligação [2]: ");
                        System.out.println("Encerrar [3]: ");
                        System.out.println("Voltar [0]: ");
                        byte escolha1 = scan.nextByte();
                        
                        if(escolha1 == 0){
                            break;
                        }else {
                            switch (escolha1) {
                                case 1:
                                    System.out.print("Digite o site: ");
                                    scan.skip("\\R?");
                                    url = scan.nextLine();

                                    iphone.abrirPagina(url);;
                                    break;

                                case 2:
                                    if (url.isEmpty() == true){
                                        System.out.print("Digite o site: ");
                                        scan.skip("\\R?");
                                        url = scan.nextLine();

                                        iphone.abrirPagina(url);
                                    }{iphone.atualizarPagina(url);}
                                        
                                    break;
                                    
                                case 3:
                                    iphone.encerrarChamada();
                                    break;
                            
                                default:
                                    break;
                            }
                        }
                    }
                    
                    break;
            
            
                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            }

        }while(escolha != 0);

        scan.close();
    }
    
}
