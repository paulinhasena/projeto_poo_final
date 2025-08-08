// Catalogofilmes.java
// Esse é o menu principal, onde dá pra cadastrar e pesquisar filmes, atores e diretores

package Exerciciofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogofilmes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();
        List<Ator> atores = new ArrayList<>();
        List<Diretor> diretores = new ArrayList<>();

        int opcao;
        // Aqui começa o menu, fica rodando até escolher sair
        do {
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Cadastrar ator");
            System.out.println("3 - Cadastrar diretor");
            System.out.println("4 - Associar filme com atores e diretor");
            System.out.println("5 - Pesquisar filme");
            System.out.println("0 - Finalizar");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Cadastro de filme
                    System.out.print("Nome do filme: ");
                    String nomeFilme = sc.nextLine();
                    System.out.print("Data de lançamento: ");
                    String data = sc.nextLine();
                    System.out.print("Orçamento: ");
                    double orcamento = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    filmes.add(new Filme(nomeFilme, data, orcamento, descricao));
                    System.out.println("Filme cadastrado!\n");
                    break;
                case 2:
                    // Cadastro de ator
                    System.out.print("Nome do ator: ");
                    String nomeAtor = sc.nextLine();
                    System.out.print("Nacionalidade: ");
                    String nacAtor = sc.nextLine();
                    atores.add(new Ator(nomeAtor, nacAtor));
                    System.out.println("Ator cadastrado!\n");
                    break;
                case 3:
                    // Cadastro de diretor
                    System.out.print("Nome do diretor: ");
                    String nomeDir = sc.nextLine();
                    System.out.print("Nacionalidade: ");
                    String nacDir = sc.nextLine();
                    diretores.add(new Diretor(nomeDir, nacDir));
                    System.out.println("Diretor cadastrado!\n");
                    break;
                case 4:
                    // Associação de filme com diretor e atores
                    System.out.print("Nome do filme para associar: ");
                    String nomeAssoc = sc.nextLine();
                    Filme filmeAssoc = null;
                    for (Filme f : filmes) {
                        if (f.getNome().equalsIgnoreCase(nomeAssoc)) {
                            filmeAssoc = f;
                            break;
                        }
                    }
                    if (filmeAssoc == null) {
                        System.out.println("Filme não encontrado.\n");
                        break;
                    }
                    System.out.print("Nome do diretor para associar: ");
                    String nomeDirAssoc = sc.nextLine();
                    Diretor dirAssoc = null;
                    for (Diretor d : diretores) {
                        if (d.getNome().equalsIgnoreCase(nomeDirAssoc)) {
                            dirAssoc = d;
                            break;
                        }
                    }
                    if (dirAssoc != null) {
                        filmeAssoc.setDiretor(dirAssoc);
                    }
                    System.out.print("Quantos atores deseja associar? ");
                    int qtdAtores = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < qtdAtores; i++) {
                        System.out.print("Nome do ator: ");
                        String nomeAtorAssoc = sc.nextLine();
                        for (Ator a : atores) {
                            if (a.getNome().equalsIgnoreCase(nomeAtorAssoc)) {
                                filmeAssoc.adicionarAtor(a);
                                break;
                            }
                        }
                    }
                    System.out.println("Associação realizada!\n");
                    break;
                case 5:
                    // Pesquisa de filme
                    System.out.print("Nome do filme para pesquisar: ");
                    String nomePesq = sc.nextLine();
                    boolean encontrado = false;
                    for (Filme f : filmes) {
                        if (f.getNome().equalsIgnoreCase(nomePesq)) {
                            f.exibirInformacoes();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Filme não encontrado.\n");
                    }
                    break;
                case 0:
                    // Sai do programa
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 0);

        sc.close();
    }
}
