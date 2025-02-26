package pratica.poo.classeseobjetos;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String editora;
    private boolean lido;

    public Livro(String titulo, String autor, int paginas, String editora, boolean lido) {
        this. titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editora = editora;
        this.lido = lido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return this.paginas;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return this.editora;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }
    public boolean isLido() {
        return this.lido;
    }

    public void ler() {
        if (this.lido) {
            System.out.println("O livro já foi lido.");
        } else {
            System.out.println("Iniciar leitura ...");
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

    public void status() {
        System.out.println("\n📖 Detalhes do Livro:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Páginas: " + this.getPaginas());
        System.out.println("Editora: " + this.getEditora());
        System.out.println("Já leu?: " + this.isLido());
    }
}
