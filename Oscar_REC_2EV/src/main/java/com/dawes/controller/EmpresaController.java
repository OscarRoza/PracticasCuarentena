package com.dawes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/eliminarEmpresa")
	public String eliminarEmpresa(@RequestParam int idempresa, Model modelo) {
		se.deleteById(idempresa);
		modelo.addAttribute("listaEmpresas", se.findAll());
		return "/empresas/listaEmpresas";
	}
}
