/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Usuario;
import Modelo.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller 
public class Controlador {
    
    @Autowired
    UsuarioDAO usuario_db;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    //@RequestMapping(value="/profesor", method = RequestMethod.GET)
        @RequestMapping(value="clase1/usuario", method = RequestMethod.GET)
        
    public ModelAndView usuario(ModelMap model,HttpServletRequest request) {
        /*String p = request.getParameter("nombre1");
         Profesor prof = profesor_db.getPersona(p);*/
        //String p="";
        //String q="";
        //try {
          String p = request.getParameter("nombre1");
          String q = request.getParameter("contrasenia ");
        //}
        //catch(Exception e) {
          // String info = "";
            //model.addAttribute("info", info+"no haz llenado ningun campo");
            //return new ModelAndView("error", model);
        //}
        
        //este es un cambio en el codigo
       String info = "";
        
        /*if (p.equals("") && q.equals("")){
            model.addAttribute("info", info+"no haz llenado ningun campo");
            return new ModelAndView("error",model);
        }
        
        else{*/
       
       // Usuario usuer = usuario_db.setCorreo(r);
       Usuario usuer = usuario_db.getUs(p);
      // Usuario usuer = usuario_db.getCont(q);
        
       
        
        
        
        
        
        
        if (usuer == null){
            model.addAttribute("info", info+"No  es valido el usuario");
        }else{
            info="";
            model.addAttribute("info", info+"bienbenido");
            //model.addAttribute("usuario", usuer);
        }
        return new ModelAndView("usuario",model);
    
    }
    }
//}
