package py.gov.prestamosbancarios.reglas.Dto.genericos;
/**
 *
 * @author Aldo2
 */
public class DatosBasicosDTO {
        private String Padron;
        private String Banco;
        private String Cedula;
        private String Nombres;
        private String Apellidos;
        private String DireccionParticular;
        private String DireccionLaboral;
	private String NombreConyuge;
	private String ApellidoConyuge;
	private String CedulaConyuge;
        
           public String getPadron() {
		return Padron;
	}

	public void setPadron(String padron) {
		Padron = padron;
	}
        
           public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}
        
        public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}
        
          public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}
        
         public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
       
           public String getDireccionParticular() {
		return DireccionParticular;
	}

	public void seDireccionParticular(String direccionParticular) {
		DireccionParticular = direccionParticular;
	}
        
        public String getDireccionLaboral() {
		return DireccionLaboral;
	}

	public void seDireccionLaboral(String direccionLaboral) {
		DireccionLaboral = direccionLaboral;
	}
     
	public String getNombreConyuge() {
		return NombreConyuge;
	}

	public void setNombreConyuge(String nombreConyuge) {
		NombreConyuge = nombreConyuge;
	}

	public String getApellidoConyuge() {
		return ApellidoConyuge;
	}

	public void setApellidoConyuge(String apellidoConyuge) {
		ApellidoConyuge = apellidoConyuge;
	}

	public String getCedulaConyuge() {
		return CedulaConyuge;
	}

	public void setCedulaConyuge(String cedulaConyuge) {
		CedulaConyuge = cedulaConyuge;
	}

}
