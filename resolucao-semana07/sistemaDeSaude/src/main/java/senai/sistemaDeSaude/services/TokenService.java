package senai.sistemaDeSaude.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TokenService {

    private final JwtDecoder jwtDecoder;

    public void ValidaToken(String token, String perfil){
        String tokenReal = token.split(" ")[1];

        List<String> perfisToken = List.of(
        jwtDecoder.decode(tokenReal).getClaim("scope").toString().split(" "));

        if(!perfisToken.contains(perfil)){
            throw new RuntimeException("Perfil não autorizado" + perfil);
        }
    }

}
