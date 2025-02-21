package pratica.poo.classeseobjetos;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status() {
        // this é uma referência à instância atual do objeto
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void escrever() {
        if (this.tampada == true) {
            System.out.println("Não posso escrever, pois a caneta está fechada!");
        } else {
            System.out.println("Estou escrevendo!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
