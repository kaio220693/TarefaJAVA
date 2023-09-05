public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double preco, int quantidadePortas) {
        super(marca, modelo, ano, preco);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    public void informacaoCarro(){
        imprimirInformacoes();
        System.out.println("Quantidade de Portas" + quantidadePortas);

    }
}
