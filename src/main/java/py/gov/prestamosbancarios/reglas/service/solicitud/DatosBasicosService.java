package py.gov.prestamosbancarios.reglas.service.solicitud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import py.gov.prestamosbancarios.reglas.Dto.genericos.DatosBasicosDTO;

/**
 *
 * @author Aldo2
 */
@Service
public class DatosBasicosService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${URL_PRES_API}")
    String urlPresAPi;

    @Value("${LOGIN_PRES}")
    String login;

    @Value("${SENHA_PRES}")
    String senha;

    public DatosBasicosDTO getdatos(String padron, int cedula) {

        DatosBasicosDTO retorno = new DatosBasicosDTO();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String uri = urlPresAPi + "my-json-server.typicode.com/Aldoarevalo/repoaldo/datosbasicos?padron=" + padron + "&cedula=" + cedula;

        String resp = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();
        try {
            JSONObject obj = new JSONArray(resp).getJSONObject(0);
            retorno.setPadron(obj.getString("CLI_PAD"));
            retorno.setBanco(obj.getString("CLI_BAN"));
            retorno.setCedula(obj.getString("CLI_CEDU"));
            retorno.setNombres(obj.getString("CLI_NOM"));
            retorno.setApellidos(obj.getString("CLI_APEL"));
            retorno.seDireccionParticular(obj.getString("PAR_DIR"));
            retorno.seDireccionLaboral(obj.getString("CLI_LABOR"));
            retorno.setNombreConyuge(obj.getString("PRBEN_CONY_NOMB"));
            retorno.setApellidoConyuge(obj.getString("PRBEN_CONY_APEL"));
            retorno.setCedulaConyuge(obj.getString("PRBEN_CONY_CEDU"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return retorno;
    }

}
