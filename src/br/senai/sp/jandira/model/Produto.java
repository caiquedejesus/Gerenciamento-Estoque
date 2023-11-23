package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

    String nome, fornecedor;
    int codico, qualidade, preco;
    public void cadastrarProduto() {
        System.out.println("//Informe o nome do produto");
        nome = scanner.nextLine();
        System.out.println("//Informe o fornecedor do produto: ");
        fornecedor = scanner.nextLine();
        System.out.println("//informe o codico do produto: ");
        codico = scanner.nextInt();
        System.out.println("//Innforme o preco: ");
        preco = scanner.nextInt();
        System.out.println("//Informe a quantidade: ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodico() {
        return codico;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
