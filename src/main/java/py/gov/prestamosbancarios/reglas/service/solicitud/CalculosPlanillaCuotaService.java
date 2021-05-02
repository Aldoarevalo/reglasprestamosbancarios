package py.gov.prestamosbancarios.reglas.service.solicitud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 *
 * @author Aldo2
 */
@Service
public class CalculosPlanillaCuotaService {

    public Map<String, Integer> calculosPlanilhaCuota(double mont, double tasa, double plazo) {

        double part1 = ((tasa / 100) / 12) * Math.pow((1 + ((tasa / 100) / 12)), plazo);

        double part2 = (Math.pow((1 + ((tasa / 100) / 12)), plazo)) - 1;

        double result = mont * (part1 / part2);

        int resultInt = (int) Math.ceil(result);

        Map<String, Integer> ret = new HashMap<String, Integer>();
        ret.put("resultado", resultInt);

        return ret;
    }

}
