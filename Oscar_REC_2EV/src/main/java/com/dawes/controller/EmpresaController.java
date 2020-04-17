package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.EmpresaVO;
import com.dawes.servicios.ServicioEmpresaImpl;

@Controller
@RequestMapping("/controladorEmpresas")
public class EmpresaController {

	@Autowired
	ServicioEmpresaImpl se;

	@RequestMapping("/listaEmpresas")
	public String listaEmpresas(Model modelo) {
		modelo.addAttribute("listaEmpresas", se.findAll());
		return "/empresas/listaEmpresas";
	}

	@RequestMapping("/insertarEmpresa")
	public String insertarEmpresa(Model modelo) {
		modelo.addAttribute("empresas", new EmpresaVO());
		return "/empresas/formInsertarEmpresa";
	}

	@RequestMapping("/inserccionEmpresa")
	public String inserccionEmpresa(@ModelAttribute EmpresaVO empresas, Model modelo) {
		se.save(empresas);
		modelo.addAttribute("listaEmpresas", se.findAll());
		return "/empresas/listaEmpresas";

	}
	
	@RequestMapping("/mostrarImpuestosEmpresa")
	public String mostrarImpuestosEmpresa(@RequestParam int idempresa, Model modelo) {
		modelo.addAttribute("empresa",se.findById(idempresa).get());
		return "empresas/mostrarImpuestosEmpresa";
	}

	@RequestMapping("/eliminarEmpresa")
	public String eliminarEmpresa(@RequestParam int idempresa, Model modelo) {
		se.deleteById(idempresa);
		modelo.addAttribute("listaEmpresas", se.findAll());
		return "/empresas/listaEmpresas";
	}
}
