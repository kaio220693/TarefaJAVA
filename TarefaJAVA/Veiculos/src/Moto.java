public class Moto extends Veiculo{
    private int cilidrada;

    public Moto(String marca, String modelo, int ano, double preco, int cilidrada) {
        super(marca, modelo, ano, preco);
        this.cilidrada = cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public void informacaoMoto(){
        imprimirInformacoes();
        System.out.println("Quantidade de cilindrada" + cilidrada);
    }
}
