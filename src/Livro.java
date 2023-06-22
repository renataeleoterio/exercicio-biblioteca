public class Livro {
    String titulo;
    String autor;
    double preco;
    int anoCriacao;

    public Livro(String titulo, String autor, double preco, int anoCriacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.anoCriacao = anoCriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String toString(){
        return "Livro: " + titulo + "\nAutor: " + autor + "\nPreço: R$" + preco + "\nAno de Criação: " + anoCriacao;
    }
}
