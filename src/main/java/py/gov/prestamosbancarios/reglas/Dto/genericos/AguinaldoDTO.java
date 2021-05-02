package py.gov.prestamosbancarios.reglas.Dto.genericos;

/**
 *
 * @author Aldo2
 */
public class AguinaldoDTO {

    private Long padron;
    private Long codigoBanco;
    private Long cedulaIdentidad;
    private Long aporteAguinaldo;
    private Long cantidadCuota;
    private Long importeCuota;
    private Long fechaLiquidacion;
    private Long totalValorPago;
    private String fechaInicio;

    public Long getPadron() {
        return padron;
    }

    public void setPadron(Long padron) {
        this.padron = padron;
    }

    public Long getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Long codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Long getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(Long cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public Long getAporteAguinaldo() {
        return aporteAguinaldo;
    }

    public void setAporteAguinaldo(Long aporteAguinaldo) {
        this.aporteAguinaldo = aporteAguinaldo;
    }

    public Long getCantidadCuota() {
        return cantidadCuota;
    }

    public void setCantidadCuota(Long cantidadCuota) {
        this.cantidadCuota = cantidadCuota;
    }

    public Long getImporteCuota() {
        return importeCuota;
    }

    public void setImporteCuota(Long importeCuota) {
        this.importeCuota = importeCuota;
    }

    public Long getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(Long fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public Long getTotalValorPago() {
        return totalValorPago;
    }

    public void setTotalValorPago(Long totalValorPago) {
        this.totalValorPago = totalValorPago;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
