/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madrid.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
@CrossOrigin //Permite que otros servidores accedan a sus servicios sin restrinccion
public class ControladorMensaje {
 /*   @Autowired RepositorioMensaje rm;
    @RequestMapping(value="/guardar-mensaje", method=RequestMethod.GET,
            headers=("Accept=text/html"))
    public String guardarMensaje(){
        rm.save(new Mensaje("Mi primer registro en MongoDB"));
                return "Mensaje Guardado";
*/
    @RequestMapping(value="mensaje", method=RequestMethod.POST,
            headers={"application/json"})
    public Estatus guardar(@RequestBody String json){
        System.out.println(json);
        
        Estatus e=new Estatus();
        e.setSuccess(true);
        return e;
    }
    
}
