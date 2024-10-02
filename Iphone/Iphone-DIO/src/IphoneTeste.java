
import java.util.Scanner;
 
 public class IphoneTeste {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Iphone iphone = new Iphone();
 
         
         //Reprodutor musical
         System.out.println("Escolha a música a ser tocada: ");
         String musica = input.nextLine();
         iphone.selecionarMusica(musica);
         iphone.tocar();
         iphone.pausar();

        //Telefone
         System.out.println("Disque o número do telefone: ");
         String num = input.next();

         iphone.ligar(num);
         iphone.atender();
         iphone.iniciarCorreioVoz();

         //Navegador
         System.out.println("Digite a página de internet: ");
         String url = input.nextLine();

         iphone.exibirPagina(url);
         iphone.adicionarNovaAba();
         iphone.atualizarPagina();

         input.close();

     }
 }
