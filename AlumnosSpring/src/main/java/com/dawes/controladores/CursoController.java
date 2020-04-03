package com.dawes.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/modificarCurso")
	public String modificarCurso(@RequestParam int idcurso, Model modelo) {
		modelo.addAttribute("curso", sc.findById(idcurso).get());
		return "/curso/modificacionCurso";

	}

	@RequestMapping("cursomodificado")
	public String cursomodificado(@ModelAttribute CursosVO modificarCurso, Model modelo) {
		sc.save(modificarCurso);
		modelo.addAttribute("listaCurso", sc.findAll());
		return "/curso/mostrarCursos";
	}

	@RequestMapping("/eliminarCurso")
	public String eliminarCurso(@RequestParam int idcurso, Model modelo) {
		try {
			sc.deleteById(idcurso);
			modelo.addAttribute("listaCurso", sc.findAll());
			return "/curso/mostrarCursos";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return "/error";

		}
	}

}
