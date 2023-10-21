package com.grid.informatica.financas.services.interfaces;

import com.grid.informatica.financas.model.entity.Usuario;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);
    Usuario salvarUsuario(Usuario usuario);
    void validarEmail(String email);
}
