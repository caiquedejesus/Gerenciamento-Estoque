package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public String servidor, banco, passaword, user;
    public Connection conexao;
    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_senai_java";
        this.user = "root";
        this.passaword = "bcd127";

    }
    public void connectDriver() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.passaword);
        }catch (SQLException erro){
            System.out.println(erro);
        }
    }
}
