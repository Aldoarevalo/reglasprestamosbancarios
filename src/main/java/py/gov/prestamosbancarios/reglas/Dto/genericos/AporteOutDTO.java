package py.gov.prestamosbancarios.reglas.Dto.genericos;

import java.util.List;

/**
 *
 * @author Aldo2
 */
public class AporteOutDTO {

	private List<AguinaldoDTO> aguinaldo;
	private List<EmpleadoActivoDTO> empleadoActivo;
	private List<EmpleadoActivoAdicionalDTO> empleadoActivoAdicional;

	public List<AguinaldoDTO> getAguinaldo() {
		return aguinaldo;
	}

	public void setAguinaldo(List<AguinaldoDTO> aguinaldo) {
		this.aguinaldo = aguinaldo;
	}

	public List<EmpleadoActivoDTO> getEmpleadoActivo() {
		return empleadoActivo;
	}

	public void setEmpleadoActivo(List<EmpleadoActivoDTO> empleadoActivo) {
		this.empleadoActivo = empleadoActivo;
	}

	public List<EmpleadoActivoAdicionalDTO> getEmpleadoActivoAdicional() {
		return empleadoActivoAdicional;
	}

	public void setEmpleadoActivoAdicional(List<EmpleadoActivoAdicionalDTO> empleadoActivoAdicional) {
		this.empleadoActivoAdicional = empleadoActivoAdicional;
	}

}
