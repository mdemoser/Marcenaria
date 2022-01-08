package MoveisCasa;

public class Loja {

    public static void main(String[] args) {

        Cadeira cadeirasJantar = new Cadeira(" Familia", 5.5, 4);
        cadeirasJantar.Confeccao(5);

        Mesa mesa1 = new Mesa("mesa de jantar", 2.0,  "jequitiba", 15);
        System.out.println(mesa1);
        mesa1.estoqueAtual(3);
        System.out.println(mesa1);

    }


}
