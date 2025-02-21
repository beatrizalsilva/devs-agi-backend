package pratica.poo.classeseobjetos;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    private String editora;
    boolean lido;

    public void status() {
        System.out.println("\nTítulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);
        System.out.println("Editora: " + this.editora);
        System.out.println("Já leu?: " + this.lido);
    }

    public void ler() {
        if (this.lido) {
            System.out.println("Leitura cloncluída.");
        } else {
            System.out.println("Iniciar leitura!");
            this.lido = true;
        }
        }

    private void marcarComoNaoLido() {
        this.lido = false;
    }

    public void releitura() {
        System.out.println("Reiniciando a leitura do livro ...");
        marcarComoNaoLido();
    }
}
