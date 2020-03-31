package com.dawes.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dawes.servicios.ServicioAlumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	ServicioAlumno SA;

	@RequestMapping("/listaAlumno")
	public String listaAlumno(Model modelo) {
		modelo.addAttribute("listaAlumno", SA.findAll());
		return "alumno/listaAlumno";
	}
}
