package pratica.poo.classeseobjetos;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.modelo = "CIS";

        c1.destampar();
        c1.escrever();

        Livro romance = new Livro("O Duque e Eu", "Julia Quinn", 238, "Arqueiro", false);

        romance.status();
        romance.ler();
    }
}