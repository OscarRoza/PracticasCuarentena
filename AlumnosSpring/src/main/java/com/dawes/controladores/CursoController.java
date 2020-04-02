package com.dawes.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dawes.modelo.CursosVO;
import com.dawes.servicios.ServicioCursosImpl;

@Controller
@RequestMapping("/controladorCursos")
public class CursoController {

	@Autowired
	ServicioCursosImpl sc;

	@RequestMapping("/listaCurso")
	public String listaCurso(Model modelo) {
		modelo.addAttribute("listaCurso", sc.findAll());
		return "/curso/mostrarCursos";
	}

	@RequestMapping("/insertarCurso")
	public String insertarCurso(Model modelo) {
		modelo.addAttribute("curso", new CursosVO());
		return "/curso/insertarCurso";
	}

	@RequestMapping("/inserccionCurso")
	public String inserccionCurso(@ModelAttribute CursosVO curso, Model modelo) {
		sc.save(curso);
		modelo.addAttribute("listaCurso", sc.findAll());
		return "/curso/mostrarCursos";
	 }
}
