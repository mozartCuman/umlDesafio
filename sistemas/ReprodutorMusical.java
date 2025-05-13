package sistemas;

//import java.util.Scanner;

sealed interface ReprodutorMusical permits Iphone {
    
    void tocarMusica();/* {
        System.out.println("Musica tocando!!!");
    }*/

    void pausarMusica();/*{
        System.out.println("Musica pausada");
    }*/

    void selecionarMusica();/*{
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga o nome da música: ");
        scan.skip("\\R?");
        String musica = scan.nextLine();

        System.out.println("Música: " + musica + " tocando!!!");

        scan.close();
    }*/
}
