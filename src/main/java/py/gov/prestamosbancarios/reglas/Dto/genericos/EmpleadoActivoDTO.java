package py.gov.prestamosbancarios.reglas.Dto.genericos;

/**
 *
 * @author Aldo2
 */
public class EmpleadoActivoDTO {

    private Long padron;
    private Long cedulaIdentidad;
    private Long anoAntiguedad;
    private Long mesAntiguedad;
    private Long diaAntiguedad;
    private Long totalValorAportado;
    private Long ultimoSueldo;

    public Long getPadron() {
        return padron;
    }

    public void setPadron(Long padron) {
        this.padron = padron;
    }

    public Long getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(Long cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public Long getAnoAntiguedad() {
        return anoAntiguedad;
    }

    public void setAnoAntiguedad(Long anoAntiguedad) {
        this.anoAntiguedad = anoAntiguedad;
    }

    public Long getMesAntiguedad() {
        return mesAntiguedad;
    }

    public void setMesAntiguedad(Long mesAntiguedad) {
        this.mesAntiguedad = mesAntiguedad;
    }

    public Long getDiaAntiguedad() {
        return diaAntiguedad;
    }

    public void setDiaAntiguedad(Long diaAntiguedad) {
        this.diaAntiguedad = diaAntiguedad;
    }

    public Long getTotalValorAportado() {
        return totalValorAportado;
    }

    public void setTotalValorAportado(Long totalValorAportado) {
        this.totalValorAportado = totalValorAportado;
    }

    public Long getUltimoSueldo() {
        return ultimoSueldo;
    }

    public void setUltimoSueldo(Long ultimoSueldo) {
        this.ultimoSueldo = ultimoSueldo;
    }

}
