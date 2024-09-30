package br.com.exemplo.aula;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("Test")
class PacienteControllerTestExemploAula {

    @Autowired
    MockMvc mvc;

    @MockBean // Mock da validação e decode do nosso JWT
    // Podemos realizar o mock de resposta do jwtDecoder,
    // ou apenas usar o mockBean para que ele não retorne erro
    private JwtDecoder jwtDecoder;

//    @WithMockUser // Cria usuario e senha ficticios
    // Funciona para o basic auth
    // para o método
    // chamadas de endpoint


    @Test
    void listarPacientes() throws Exception {
        mvc.perform(get("/pacientes")
                        .with(
                                SecurityMockMvcRequestPostProcessors.jwt()
                                // Gera um JWT fake para o test
                        )

                )
                .andExpect(status().isOk())
        ;
    }

    @Test
    void adicionarPaciente() throws Exception {
        mvc.perform(post("/pacientes")
                        .with(SecurityMockMvcRequestPostProcessors.jwt())
                        .header("Authorization","token fake")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                             {
                                 "nome": "texto",
                                 "dataNascimento": "10/10/1010",
                                 "cpf": "texto",
                                 "telefone": "texto",
                                 "email": "texto",
                                 "idEndereco": 1
                             }"""))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("texto"));

    }


}