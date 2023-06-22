import java.util.Arrays;

public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(int tamanho) {
        this.livros = new Livro[tamanho];
    }

    public boolean insereLivro(Livro livro) {
        //percorre o array, se retornar nulo vai iserir o livro, do contrário, retorna falso.
        for (int i = 0; i < livros.length; i++){
            if (livros[i] == null) {
                livros[i] = livro;
                return true;
            }
        }
        return false;
    }

    //metodo recebe uma string titulo e retorna um objeto do tipo livro, que é o livro com aquele titulo
    //retorna null caso nao haja o livro solicitado na biblioteca
    public Livro procuraLivroPorTitulo(String titulo) {
        for(Livro livro : livros) {
            if(livro != null && livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    //metodo para verificar desconto, recebe string titulo e retorna o valor do desconto do livro
    //se o livro não estiver na biblioteca retorna -1
    //apenas livros novos possuem desconto
    public double verificaDesconto(String titulo) {
        for(Livro livro : livros) {
            if(livro != null && livro.getTitulo().equals(titulo)){
                if (livro instanceof Novo livroNovo) {
                    return livroNovo.getDesconto();
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }

    //imprime edicoes dos livros antigos
    public void imprimeEdicoes() {
        for (Livro livro : livros) {
            if (livro instanceof Antigo livroAntigo) {
                System.out.println("Titulo: " + livroAntigo.getTitulo());
                System.out.println("Edição: " + livroAntigo.getNumeroEdicao());
                System.out.println();
            }
        }
    }


    //metodo para imprimir as informações dos livros em ordem decrescente de ano de criação
    public void imprimeLivroPorAno() {
        //copyOf para o array original não ser alterado
        Livro[] livrosOrdenados= Arrays.copyOf(livros, livros.length);
        //Arrays.sort para ordenar o array livrosOrdenados em ordem descrescente
        //utilizando um comparador customizado usando uma expressao lambda
        Arrays.sort(livrosOrdenados, (livro1, livro2) -> Integer.compare(livro2.getAnoCriacao(), livro1.getAnoCriacao()));

        for (Livro livro : livrosOrdenados) {
            if (livro != null) {
                System.out.println(livro.toString());
                System.out.println();
            }
        }
    }

    public double calculaMediaPreco(){
        double somaPrecos = 0;
        int contador = 0;

        //percorre o array de livros, verifica se livro não é nulo e soma o preço do livro a variavel somaPrecos
        //incrementa livro no contador
        for(Livro livro : livros) {
            if (livro != null){
                somaPrecos += livro.getPreco();
                contador++;
            }
        }
        //se nao houver livros no array, retorna 0
        if (contador == 0) {
            return 0;
        }

        return somaPrecos / contador;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public String toString() {
        //StringBuilder para concatenar strings sem criar novos objetos de string a cada concatenação
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca:\n");
        for(Livro livro : livros) {
            if (livro != null){
                sb.append(livro.toString()).append("\n\n");
            }
        }
        return sb.toString();
    }
}
