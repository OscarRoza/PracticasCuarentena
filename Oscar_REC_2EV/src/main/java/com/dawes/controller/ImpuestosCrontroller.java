package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dawes.modelo.ImpuestosVO;
import com.dawes.servicios.ServicioImpuestosImpl;

@Controller
@RequestMapping("/controladorImpuestos")
public class ImpuestosCrontroller {

	@Autowired
	ServicioImpuestosImpl si;

	@RequestMapping("/listaImpuestos")
	public String listaImpuestos(Model modelo) {
		modelo.addAttribute("listaImpuestos", si.findAll());
		return "/impuestos/listaImpuestos";
	}

	@RequestMapping("/insertarImpuesto")
	public String insertarImpuesto(Model modelo) {
		modelo.addAttribute("impuestos", new ImpuestosVO());
		return "/impuestos/formInsertarImpuesto";
	}

	@RequestMapping("/inserccionImpuesto")
	public String inserccionAlumno(@ModelAttribute ImpuestosVO impuestos, Model modelo) {
		si.save(impuestos);
		modelo.addAttribute("listaAlumno", si.findAll());
		return "/impuestos/listaImpuestos";

	}
}
