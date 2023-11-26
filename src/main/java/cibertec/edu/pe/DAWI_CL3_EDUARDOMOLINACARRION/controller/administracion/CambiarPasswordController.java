package cibertec.edu.pe.DAWI_CL3_EDUARDOMOLINACARRION.controller.administracion;


import cibertec.edu.pe.DAWI_CL3_EDUARDOMOLINACARRION.repository.UsuarioRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class CambiarPasswordController {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public CambiarPasswordController(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/frmcambio")
    public String mostrarFormularioCambioPassword(Model model, Authentication authentication) {
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "administracion/frmcambio";
    }

}