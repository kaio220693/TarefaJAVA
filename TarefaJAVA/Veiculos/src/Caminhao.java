public class Caminhao extends Veiculo{
    private int cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double preco, int cargaMaxima) {
        super(marca, modelo, ano, preco);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public void informacaoCaminhao(){
        imprimirInformacoes();
        System.out.println("Quantidade de Portas" + cargaMaxima);
    }
}
