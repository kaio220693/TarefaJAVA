public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro(" GM", " Celta", 2002, 15.000, 2);
        Moto moto = new Moto(" YAMAHA"," XT660",2012, 48.000,660);
        Caminhao caminhao = new Caminhao(" SCANIA", " 113", 1991, 100.000,  25000);
        System.out.println("Informações do carro");
        carro.informacaoCarro();
        System.out.println("===================================");
        System.out.println("Informações do motoo");
        moto.informacaoMoto();
        System.out.println("===================================");
        System.out.println("Informações do caminhao");
        caminhao.informacaoCaminhao();
    }
}
