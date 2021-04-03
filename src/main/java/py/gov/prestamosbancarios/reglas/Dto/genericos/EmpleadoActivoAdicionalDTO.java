package py.gov.prestamosbancarios.reglas.Dto.genericos;
/**
 *
 * @author Aldo2
 */
public class EmpleadoActivoAdicionalDTO {
        private Long Padron;
	private Long cantidadAportesPago;
	private String fechaUltimoPago;

        
        public Long getPadron() {
		return Padron;
	}

	public void setPadron(Long padron) {
		this.Padron = padron;
	}
	public Long getCantidadAportesPago() {
		return cantidadAportesPago;
	}

	public void setCantidadAportesPago(Long cantidadAportesPago) {
		this.cantidadAportesPago = cantidadAportesPago;
	}

	public String getFechaUltimoPago() {
		return fechaUltimoPago;
	}

	public void setFechaUltimoPago(String fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
	}

}
