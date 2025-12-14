package itsqmeta.com.actividad1.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexControler {

@GetMapping("/inicio")
public String home(){
return "index";

}
}
