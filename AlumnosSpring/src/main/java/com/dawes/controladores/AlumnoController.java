package com.dawes.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dawes.servicios.ServicioAlumnoImpl;

@Controller
@RequestMapping("/controladorAlumno")
public class AlumnoController {

	@Autowired
	ServicioAlumnoImpl sa;

	@RequestMapping("/listaAlumno")
	public String listaAlumno(Model modelo) {
		modelo.addAttribute("alumnos", sa.findAll());
		return "/alumno/mostrarAlumnos";
	}
}
