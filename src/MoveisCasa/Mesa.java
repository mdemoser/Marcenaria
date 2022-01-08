package MoveisCasa;

public class Mesa extends Moveis implements Estoque  {

    private String tipoDeMadeira;
    private int estoque;

    public Mesa(String nome, double medida, String tipoDeMadeira, int estoque) {
        super(nome, medida);

        this.tipoDeMadeira = tipoDeMadeira;
        this.estoque = estoque;
    }

    public String toString() {
        return getNome() + " medida " + getMedida() + " feita de " + tipoDeMadeira + " em estoque " + estoque;
    }


    public int estoqueAtual(int venda) {

        return estoque -= venda;
    }


}