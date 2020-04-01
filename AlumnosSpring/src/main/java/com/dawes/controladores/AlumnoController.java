package com.dawes.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.AlumnoVO;
import com.dawes.servicios.ServicioAlumnoImpl;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/controladorAlumno")
public class AlumnoController {

	@Autowired
	ServicioAlumnoImpl sa;

	@RequestMapping("/listaAlumno")
	public String listaAlumno(Model modelo) {
		modelo.addAttribute("listaAlumno", sa.findAll());
		return "/alumno/mostrarAlumnos";
	}

	@RequestMapping("/insertarAlumno")
	public String insertarAlumno(Model modelo) {
		modelo.addAttribute("alumno", new AlumnoVO());
		return "/alumno/insertarAlumno";
	}

	@RequestMapping("/inserccionAlumno")
	public String inserccionAlumno(@ModelAttribute AlumnoVO alumno, Model modelo) {
		sa.save(alumno);
		modelo.addAttribute("listaAlumno", sa.findAll());
		return "/alumno/mostrarAlumnos";

	}

	@RequestMapping("/eliminarAlumno")
	public String eliminarAlumno(@RequestParam int id, Model modelo) {
		sa.deleteById(id);
		modelo.addAttribute("listaAlumno", sa.findAll());
		return "/alumno/mostrarAlumnos";
	}
}
