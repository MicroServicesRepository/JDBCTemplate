/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.MySQL.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author dkeziah
 */
public class MicroServiceDAOImpl implements MicroServiceDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public String createTable() {
        jdbcTemplate.execute("CREATE TABLE customers(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
        return "Created";
    }

}
