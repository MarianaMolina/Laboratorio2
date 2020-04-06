package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import com.uca.capas.domain.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/agregarUsuario")
	public String enviarForm(Usuario usuario) {
		return "Agregar Usuario";
	}
	
	@PostMapping("/agregarUsuario")
	public String procesarForm(Usuario usuario) {
		return "mostrarMensaje";
	}
}
