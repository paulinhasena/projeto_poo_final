// Pessoa.java
// Aqui eu só fiz a classe Pessoa, que serve pra ator e diretor

package Exerciciofinal;

public class Pessoa {
    private String nome;
    private String nacionalidade;

    // Construtor pra criar a pessoa já com nome e nacionalidade
    public Pessoa(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Só pra pegar o nome
    public String getNome() {
        return nome;
    }

    // Só pra pegar a nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }

    // Mostra os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Nacionalidade: " + nacionalidade);
    }
}