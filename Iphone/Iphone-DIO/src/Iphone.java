

 public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
    
    //ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando a música ");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando uma música:" + musica);
       
    }

    //AparelhoTelefonico
    @Override
    public void ligar(String num) {
        System.out.println("Ligando para o número " + num);
       
    }

    @Override
    public void atender() {
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

   
    //NavegadorDeInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

  
}
