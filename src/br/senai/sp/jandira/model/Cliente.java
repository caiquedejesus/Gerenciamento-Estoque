package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    String nome, sobrenome;
    long cpf, rg;
    public void cadastrarCliente(){
        System.out.println("Informe seu nome: ");
        nome =  scanner.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = scanner.nextLong();
        System.out.println("Informe seu Rg: ");
        rg = scanner.nextLong();
        scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }
}
