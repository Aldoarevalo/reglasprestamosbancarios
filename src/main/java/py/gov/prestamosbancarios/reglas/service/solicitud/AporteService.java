package py.gov.prestamosbancarios.reglas.service.solicitud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import py.gov.prestamosbancarios.reglas.Dto.genericos.AguinaldoDTO;
import py.gov.prestamosbancarios.reglas.Dto.genericos.AporteOutDTO;
import py.gov.prestamosbancarios.reglas.Dto.genericos.EmpleadoActivoAdicionalDTO;
import py.gov.prestamosbancarios.reglas.Dto.genericos.EmpleadoActivoDTO;
/**
 *
 * @author Aldo2
 */
@Service
public class AporteService {

	@Autowired
	RestTemplate restTemplate;

	@Value("${URL_PRES_API}")
	String urlPresAPi;

	public AporteOutDTO buscarAportes(String padron) {

		AporteOutDTO retorno = new AporteOutDTO();

		retorno.setAguinaldo(getDadosAguinaldo(padron));
		retorno.setEmpleadoActivo(getDadosEmpleadoActivo(padron));
		retorno.setEmpleadoActivoAdicional(getDadosEmpleadoActivoAdicional(padron));

		return retorno;
	}

	private List<AguinaldoDTO> getDadosAguinaldo(String padron) {
		List<AguinaldoDTO> retorno = new ArrayList<AguinaldoDTO>();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String uri = urlPresAPi + "my-json-server.typicode.com/Aldoarevalo/repoaldo/aguinaldo?padron=" + padron;

		String resp = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();

		try {
			JSONParser parser = new JSONParser();
			JSONArray lista = (JSONArray) parser.parse(resp);

			lista.forEach(x -> {
				JSONObject obj = (JSONObject) x;

				AguinaldoDTO aguinaldo = new AguinaldoDTO();
				aguinaldo.setPadron((Long) obj.get("AACAA_PADR"));
				aguinaldo.setCodigoBanco((Long) obj.get("AACAA_BANC"));
				aguinaldo.setCedulaIdentidad((Long) obj.get("AACAA_CEDU"));
				aguinaldo.setAporteAguinaldo((Long) obj.get("AACAA_APOR_AGUI"));
				aguinaldo.setCantidadCuota((Long) obj.get("AACAA_CANT_CUOT"));
				aguinaldo.setImporteCuota((Long) obj.get("AACAA_IMPO_CUOT"));
				aguinaldo.setFechaLiquidacion((Long) obj.get("AACAA_AAMD_LIQU"));
				aguinaldo.setTotalValorPago((Long) obj.get("AACAA_TOTA_PAGA"));
				aguinaldo.setFechaInicio((String) obj.get("AACAA_AAMM_INIC"));

				retorno.add(aguinaldo);

			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

	private List<EmpleadoActivoDTO> getDadosEmpleadoActivo(String padron) {

		List<EmpleadoActivoDTO> retorno = new ArrayList<EmpleadoActivoDTO>();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String uri = urlPresAPi + "my-json-server.typicode.com/Aldoarevalo/repoaldo/aporteemp?cuenta=" + padron;

		String resp = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();

		try {
			JSONParser parser = new JSONParser();
			JSONArray lista = (JSONArray) parser.parse(resp);

			lista.forEach(x -> {
				JSONObject obj = (JSONObject) x;

				EmpleadoActivoDTO empleadoActivo = new EmpleadoActivoDTO();
				empleadoActivo.setPadron((Long) obj.get("APW117_PADR"));
				empleadoActivo.setCedulaIdentidad((Long) obj.get("APW117_CEDU"));
				empleadoActivo.setAnoAntiguedad((Long) obj.get("APW117_AANO_ANTI"));
				empleadoActivo.setMesAntiguedad((Long) obj.get("APW117_MMES_ANTI"));
				empleadoActivo.setDiaAntiguedad((Long) obj.get("APW117_DDIA_ANTI"));
				empleadoActivo.setTotalValorAportado((Long) obj.get("APW117_TOTA_APOR"));
				empleadoActivo.setUltimoSueldo((Long) obj.get("APW117_ULTI_SUEL"));

				retorno.add(empleadoActivo);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

	private List<EmpleadoActivoAdicionalDTO> getDadosEmpleadoActivoAdicional(String padron) {
		List<EmpleadoActivoAdicionalDTO> retorno = new ArrayList<EmpleadoActivoAdicionalDTO>();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String uri = urlPresAPi + "my-json-server.typicode.com/Aldoarevalo/repoaldo/empactivoadc?padron=" + padron;

		String resp = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();

		try {
			JSONParser parser = new JSONParser();
			JSONArray lista = (JSONArray) parser.parse(resp);

			lista.forEach(x -> {
				JSONObject obj = (JSONObject) x;
				EmpleadoActivoAdicionalDTO empleadoActivoAdicional = new EmpleadoActivoAdicionalDTO();
                                empleadoActivoAdicional.setPadron((Long) obj.get("PADEMAC"));
				empleadoActivoAdicional.setFechaUltimoPago((String) obj.get("fechaUltimoPago"));
				empleadoActivoAdicional.setCantidadAportesPago((Long) obj.get("cantidadAportesPago"));

				retorno.add(empleadoActivoAdicional);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

}
