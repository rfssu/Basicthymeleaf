/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pws.uploadata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lenovo
 */

@Controller
public class DataController {
    
    @RequestMapping("/")
    public String register(){
        return "info";
    }
    
    @PostMapping("/save")
    public String save(){
        return "info-view";
    }
}
