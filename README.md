# revisao1.java
05/08
Exercícios Práticos de revisão
1. Desenvolva uma classe Livraria com os atributos:
   • livro
   • número de páginas
   • gênero
   • quantidade de livros
   • preço
   ➤ E os métodos: ContaPaginas, retornaAutor, precoTotal.
   ➤ Desenvolva a classe principal, que cria um objeto de livraria. inicializa os atributos e utiliza os métodos.
   
   ///
   
   public class livraria {
    private String livro;
    private String autor;
    private int numeroPaginas;
    private String genero;
    private int quantidade;
    private double preco;
   
    public livraria(String livro, String autor, int numeroPaginas, String genero, int quantidade, double preco) {
        this.livro = livro;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int contaPaginas() {
        return numeroPaginas * quantidade;
    }

    public String retornaAutor() {
        return autor;
    }

    public double precoTotal() {
        return preco * quantidade;
    }

    public void exibirDados() {
        System.out.println("Livro: " + livro);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Preço Unitário: R$" + preco);
        System.out.println("Total de Páginas (estoque): " + contaPaginas());
        System.out.println("Preço Total em Estoque: R$" + precoTotal());
    }
}
  ///
   
   public class main {
    public static void main(String[] args) {
        livraria livro1 = new livraria(
            "Crepúsculo",
            "Stephenie Meyer",
            10000,
            "Fantasia",
            5,
            100.10
        );

   Exibindo informações
   livro1.exibirDados();
    }
}

///

2. Desenvolva uma classe Cidade com os atributos:
   • nome
   • estado
   • populaçao
   • extensão
   ➤ E os métodos: AumentaoPopulacao e mostraDados.
   ➤ Desenvolva a classe Principal que cria um array de 5 cidades, entra com os dados, calcula a média da população e mostra todos os dados das cidades.
   
    ///
   public class Cidade {
    private String nome;
    private String estado;
    private int numeroPopulacao;
    private int extensao;

    public Cidade(String nome, String estado, int numeroPopulacao, int extensao) {
        this.nome = nome;
        this.estado = estado;
        this.numeroPopulacao = numeroPopulacao;
        this.extensao = extensao;
    }

    public int aumentaPopulacao() {
        return numeroPopulacao + 1;
    }

    public String mostraDados() {
        return nome + ", " + estado;
    }

    public void exibirDados() {
        System.out.println("Nome da cidade: " + nome);
        System.out.println("Estado da cidade: " + estado);
        System.out.println("Número da população: " + numeroPopulacao);
        System.out.println("Número da extensão: " + extensao);
        System.out.println("Aumento da população: " + aumentaPopulacao());
        System.out.println("Mostra dados: " + mostraDados());
    }
}

///

public class main {
    public static void main(String[] args) {
        livraria livro1 = new livraria(
            "Crepúsculo",
            "Stephenie Meyer",
            10000,
            "Fantasia",
            5,
            100.10
        );
        
  livro1.exibirDados();
    }
}
///
   
