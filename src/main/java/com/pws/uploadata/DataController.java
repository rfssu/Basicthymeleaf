/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pws.uploadata;

import java.io.IOException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author ACER
 */
@Controller
public class DataController {
    @ResponseBody
    @RequestMapping("/hello")
    public String data(
            @RequestParam(value = "varA") String nama,
            @RequestParam(value = "varB") String tgl
    )
    
    @RequestMapping("/nexthalaman")
    //@ResponseBody
    public String next(@RequestParam(value = "varA") String nama,
            @RequestParam(value = "varB") String tgl,
            @RequestParam(value = "foto") MultipartFile gambar,
            Model kurir
            
    )throws IOException{  
        byte[] img = gambar.getBytes();
        String base64Image = Base64.encodeBase64String(img);
        String imglink= "data:image/png;base64,".concat(base64Image);
        kurir.addAttribute("name", nama);
        kurir.addAttribute("Bdate", tgl);
        kurir.addAttribute("Pict", imglink);
        
        
        return "viewpage";
    }
    
}