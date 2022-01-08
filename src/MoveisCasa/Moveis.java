package MoveisCasa;

public abstract class Moveis {

    private String nome;
    private double medida;



    public Moveis() {

    }

    public Moveis(String nome, double medida ) {
        this.nome = nome;
        this.medida =  medida;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }





}
