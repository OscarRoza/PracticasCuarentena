package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dawes.servicios.ServicioImpuestosImpl;

@Controller
@RequestMapping("controladorImpuestos")
public class ImpuestosCrontroller {

	@Autowired
	ServicioImpuestosImpl si;

	@RequestMapping("/listaImpuestos")
	public String listaImpuestos(Model modelo) {
		modelo.addAttribute("listaImpuestos", si.findAll());
		return "/impuestos/listaImpuestos";
	}
}
