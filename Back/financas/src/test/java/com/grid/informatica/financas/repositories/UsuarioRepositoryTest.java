package com.grid.informatica.financas.repositories;

import com.grid.informatica.financas.model.entity.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class UsuarioRepositoryTest {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Test
    void deveVerificarAExistenciaDeUmEmail() {

        // Cenário
        Usuario usuario = Usuario.builder()
                .nome("usuario3")
                .email("usuario3@gmail.com")
                .senha("1234")
                .build();
        usuarioRepository.save(usuario);

        // Ação/Execução
        boolean result = usuarioRepository.existsByEmail("usuario3@gmail.com");

        // Verificação
        Assertions.assertTrue(result);
    }

    @Test
    void deveRetornarFalsoQuandoNaoHouverUsuarioCadastradoComoEmail(){

        // cenário
        usuarioRepository.deleteAll();

        //ação
        boolean result = usuarioRepository.existsByEmail("rcm@gmail.com");

        //Verificação
        org.assertj.core.api.Assertions.assertThat(result).isFalse();
    }

}
