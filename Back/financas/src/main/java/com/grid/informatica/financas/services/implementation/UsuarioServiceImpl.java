package com.grid.informatica.financas.services.implementation;

import com.grid.informatica.financas.model.entity.Usuario;
import com.grid.informatica.financas.repositories.UsuarioRepository;
import com.grid.informatica.financas.services.exceptions.RegraNegocioException;
import com.grid.informatica.financas.services.interfaces.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }
    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }
    @Override
    public void validarEmail(String email) {
        if(usuarioRepository.existsByEmail(email)) {
            throw new RegraNegocioException("Já existe um email cadastrado com esse nome!");
        };
    }
}
