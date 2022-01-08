package MoveisCasa;

public class Cadeira extends Moveis implements Encomenda{

    int qut = 0;

    public Cadeira(String nome, double medida, int qut){
        super(nome, medida);

        this.qut = qut;

    }

    public void Confeccao(int prazoDias) {
        System.out.println("Cadeiras " + getNome()+ ". Entregue em " + prazoDias + " dias");
    }
}
