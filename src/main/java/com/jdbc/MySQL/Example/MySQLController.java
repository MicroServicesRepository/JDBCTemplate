/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.MySQL.Example;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dkeziah
 */
@RestController
@Repository
public class MySQLController {

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public void run() throws Exception {
       
    }
}
