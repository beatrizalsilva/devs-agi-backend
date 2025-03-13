package devsagi.semana07.poo.classe;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Mini Cooper", "SE", 2025);
        meuCarro.mostrarInformacoes();

        meuCarro.acelerar();
        meuCarro.frear();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jin");
        pessoa.setIdade(32);

        pessoa.exibirInformacoes();
    }
}