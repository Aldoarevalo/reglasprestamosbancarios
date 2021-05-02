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

import py.gov.prestamosbancarios.reglas.Dto.genericos.CodeudorDTO;

/**
 *
 * @author Aldo2
 */
@Service
public class CodeudorService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${URL_PRES_API}")
    String urlPresAPi;

    @Value("${LOGIN_PRES}")
    String login;

    @Value("${SENHA_PRES}")
    String senha;

    public CodeudorDTO buscarCodeudor(String ci) {

        CodeudorDTO retorno = new CodeudorDTO();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String uri = urlPresAPi + "my-json-server.typicode.com/Aldoarevalo/repoaldo/posts?ci=" + ci;

        String resp = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();

        try {
            JSONObject obj = new JSONArray(resp).getJSONObject(0);
            retorno.setNroci(obj.getString("CI_NROCI"));
            retorno.setBancoPres(obj.getString("SOPRE5J_BANC_PRES"));
            retorno.setRela(obj.getString("SOPRE5J_RELA"));
            retorno.setNumeroRela(obj.getString("SOPRE5J_NUME_RELA"));
            retorno.setCuentaCode(obj.getString("SOPRE5J_CUEN_CODE"));
            retorno.setBancoCode(obj.getString("SOPRE5J_BANC_CODE"));
            retorno.setCodBan(obj.getString("MPRB_CODBAN"));
            retorno.setCodpra(obj.getString("MPRB_CODPRA"));
            retorno.setMprgNropra(obj.getString("MPRB_NROPRA"));
            retorno.setMonto(obj.getString("MPRB_MONTO"));
            retorno.setCancuo(obj.getString("MPRB_CANCUO"));
            retorno.setMoncancu(obj.getString("MPRB_MONCANCU"));
            retorno.setSaldo(obj.getString("MPRB_SALDO"));
            retorno.setApellido(obj.getString("MPDE_APELLI"));
            retorno.setNombre(obj.getString("MPDE_NOMBRE"));
            retorno.setCondic(obj.getString("MPDE_CONDIC"));
            retorno.setCate(obj.getString("PRCAT_CATE"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return retorno;
    }

}
