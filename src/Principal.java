public class Principal {
    public static void main(String[] args) throws Exception {
        Iphone ip = new Iphone();

        //AparelhoTelefonico aparelhoTelefonico = new Iphone();
        AparelhoTelefonico aparelhoTelefonico = ip;
        NavegadorInternet navegadorInternet = ip;
        ReprodutorMusical reprodutorMusical = ip;

        System.out.println("exibindo funcionalidades do aparelho telefonico!");
        //aparelhoTelefonico.ligar("92 98888-0000");
        //aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("exibindo funcionalidades do navegador!");
        //navegadorInternet.exibirPagina("https://www.linkedin.com/in/michael-trindade-772b06108/");
        //navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        System.out.println("exibindo funcionalidades do reprodutor musical!");
        //reprodutorMusical.selecionarMusica("Ando Devagar");
        //reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        
    }
}
