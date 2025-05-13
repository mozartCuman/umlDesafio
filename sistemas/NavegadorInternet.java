package sistemas;

//import java.util.Scanner;

sealed interface NavegadorInternet permits Iphone {
    
    
    
    

    void abrirPagina(String url);/*{

        Scanner scan = new Scanner(System.in);
        
            System.out.println(" Digite o URL:");
            scan.skip("\\R?");
            String vUrl = scan.nextLine();
            

            System.out.println(" Redirecionando para: " + vUrl);

            scan.close();
    }*/

    void atualizarPagina(String url);/*{

        System.out.println("\n\nAtualizando página:" 
            + " " + url
            + " Obrigado pela espera!!!");
    }

    public static void fecharPagina(){

        System.out.println("Página fechada");
    }*/

    void fecharPagina();/*{
       System.out.println("Página fechada"); 
    }*/
}
