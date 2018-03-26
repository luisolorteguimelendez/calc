/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.certicom.ittsaboletoelectronicoservice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis
 */
@RestController
public class BoletoElectronicoController {

    @RequestMapping(value = "/api/boletoelectronico/create", method = RequestMethod.POST)
    public String create(HttpServletRequest request,
            HttpServletResponse response,
            @RequestBody String nombre) {

        return "Hola " + nombre;

    }
}
