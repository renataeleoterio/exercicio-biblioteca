public class Novo extends Livro{
    private double desconto;

    public Novo(String titulo, String autor, double preco, int anoCriacao, double desconto){
        super(titulo, autor, preco, anoCriacao);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String toString(){
        return super.toString() + "\nDesconto: " + desconto + "%";
    }
}
