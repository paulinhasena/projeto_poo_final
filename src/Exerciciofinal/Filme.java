// Filme.java
// Aqui eu fiz a classe Filme, que tem uma lista de atores e um diretor

package Exerciciofinal;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    // Construtor pra criar o filme já com os dados principais
    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.atores = new ArrayList<>();
    }

    // Só pra pegar o nome do filme
    public String getNome() {
        return nome;
    }

    // Pra colocar o diretor no filme
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    // Pra adicionar um ator na lista de atores do filme
    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    // Mostra as informações do filme, do diretor e dos atores
    public void exibirInformacoes() {
        System.out.println("Filme: " + nome);
        System.out.println("Lançamento: " + dataLancamento);
        System.out.println("Orçamento: R$ " + orcamento);
        System.out.println("Descrição: " + descricao);
        if (diretor != null) {
            System.out.print("Diretor: ");
            diretor.exibirDados();
        }
        System.out.println("Atores:");
        for (Ator ator : atores) {
            System.out.print("- ");
            ator.exibirDados();
        }
        System.out.println();
    }
}
