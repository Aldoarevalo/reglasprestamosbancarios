package py.gov.prestamosbancarios.reglas.resources;

import py.gov.prestamosbancarios.reglas.Dto.genericos.AporteOutDTO;
import py.gov.prestamosbancarios.reglas.Dto.genericos.DatosBasicosDTO;
import py.gov.prestamosbancarios.reglas.Dto.genericos.CodeudorDTO;
import py.gov.prestamosbancarios.reglas.service.solicitud.CodeudorService;
import py.gov.prestamosbancarios.reglas.service.solicitud.AporteService;
import py.gov.prestamosbancarios.reglas.service.solicitud.CalculosPlanillaCuotaService;
import py.gov.prestamosbancarios.reglas.service.solicitud.DatosBasicosService;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Aldo2
 */
@Api(value = "API REST Solicitud de Prestamo ")
@RestController
@RequestMapping("/api/Solicitud de Prestamos")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class SolicituddePrestamos {

    @Autowired
    AporteService aporteService;

    @Autowired
    CodeudorService codeudorService;

    @Autowired
    CalculosPlanillaCuotaService calculoCuotaService;

    @Autowired
    DatosBasicosService datosBasicosService;

    @ApiOperation(value = "Retorna los datos de Aportes, aguinaldos, empleados Activos y empleados Activos Adicionales")
    @RequestMapping(value = "/aportes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> aportes(@RequestParam("Padron") String padron) {
        AporteOutDTO db = new AporteOutDTO();

        try {
            return ResponseEntity.ok(aporteService.buscarAportes(padron));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(db);
        }
    }

    @ApiOperation(value = "Retorna los datos de Codeudores")
    @RequestMapping(value = "/DatosCodeudores", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getCodeudor(@RequestParam("Cedula") String ci) {
        CodeudorDTO db = new CodeudorDTO();
        try {
            return ResponseEntity.ok(codeudorService.buscarCodeudor(ci));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(db);
        }
    }

    @ApiOperation(value = "calculo planilla cuota")
    @RequestMapping(value = "/calculo-planilla-cuota", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> calculoPlanilhaCuota(@RequestParam("mont") double mont, @RequestParam("tasa") double tasa,
            @RequestParam("plazo") double plazo) {
        try {
            return ResponseEntity.ok(calculoCuotaService.calculosPlanilhaCuota(mont, tasa, plazo));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @ApiOperation(value = "Retorna los datos Basicos de los Clientes")
    @RequestMapping(value = "/DatosBasicos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getDatos(@RequestParam("Padron") String padron, @RequestParam("Cedula") int ci) {
        DatosBasicosDTO db = new DatosBasicosDTO();
        try {
            return ResponseEntity.ok(datosBasicosService.getdatos(padron, ci));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(db);
        }
    }

}
