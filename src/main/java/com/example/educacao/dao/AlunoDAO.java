package com.example.educacao.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.educacao.model.Aluno;

/* DAO - Data Access Object: ele que vai fazer o acesso a uma determinada tabela no BD. */

public class AlunoDAO extends DAO{   
    public AlunoDAO(Connection conn) {
        super(conn);        
    }

    public void insert(Aluno aluno) {        
        try {
            var sql = "insert into aluno (nome) values (?)";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, aluno.getNome());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }        
    }

    public void insertNota(int idDisciplina, double nota){
        var sql = "update aluno set nota" + idDisciplina + " = ? where matricula = ?";
    }
}
