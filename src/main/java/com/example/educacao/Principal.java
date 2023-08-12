package com.example.educacao;

import java.sql.SQLException;

import com.example.educacao.dao.AlunoDAO;
import com.example.educacao.dao.ConnectionManager;
import com.example.educacao.model.Aluno;

public class Principal {
    public static void main(String[] args) {
        try(var conn = ConnectionManager.getConnection()){
            var alunoDAO = new AlunoDAO(conn);
            var aluno = new Aluno();
            aluno.setNome("Bruno");
            alunoDAO.insert(aluno);
            System.out.println("Aluno inserido com sucesso");
        } catch(SQLException e){
            System.err.println("Não foi possivel conectar ao BD");
        }catch(RuntimeException e){
            System.err.println("Não foi possivel inserir o aluno no BD");
        }
    }
}
