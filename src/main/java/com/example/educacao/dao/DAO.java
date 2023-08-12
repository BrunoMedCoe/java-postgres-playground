package com.example.educacao.dao;

import java.sql.Connection;
//import java.sql.SQLException;

public class DAO {
    protected Connection conn;

    public DAO(Connection conn){
        this.conn = conn;
    }
}
