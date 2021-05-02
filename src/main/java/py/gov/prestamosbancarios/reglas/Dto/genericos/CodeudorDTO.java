package py.gov.prestamosbancarios.reglas.Dto.genericos;

/**
 *
 * @author Aldo2
 */
public class CodeudorDTO {

    private String bancoPres;
    private String rela;
    private String numeroRela;
    private String cuentaCode;
    private String bancoCode;
    private String nroci;
    private String codBan;
    private String codpra;
    private String mprgNropra;
    private String monto;
    private String prcint;
    private String prccom;
    private String cancuo;
    private String ncancu;
    private String impcuo;
    private String saldo;
    private String apellido;
    private String nombre;
    private String condic;
    private String cate;

    public String getNroci() {
        return nroci;
    }

    public void setNroci(String CI_NROCI) {
        nroci = CI_NROCI;
    }

    public String getBancoPres() {
        return bancoPres;
    }

    public void setBancoPres(String sOPRE5J_BANC_PRES) {
        bancoPres = sOPRE5J_BANC_PRES;
    }

    public String getRela() {
        return rela;
    }

    public void setRela(String sOPRE5J_RELA) {
        rela = sOPRE5J_RELA;
    }

    public String getNumeroRela() {
        return numeroRela;
    }

    public void setNumeroRela(String sOPRE5J_NUME_RELA) {
        numeroRela = sOPRE5J_NUME_RELA;
    }

    public String getCuentaCode() {
        return cuentaCode;
    }

    public void setCuentaCode(String sOPRE5J_CUEN_CODE) {
        cuentaCode = sOPRE5J_CUEN_CODE;
    }

    public String getBancoCode() {
        return bancoCode;
    }

    public void setBancoCode(String sOPRE5J_BANC_CODE) {
        bancoCode = sOPRE5J_BANC_CODE;
    }

    public String getCodBan() {
        return codBan;
    }

    public void setCodBan(String mPRB_CODBAN) {
        codBan = mPRB_CODBAN;
    }

    public String getCodpra() {
        return codpra;
    }

    public void setCodpra(String mPRB_CODPRA) {
        codpra = mPRB_CODPRA;
    }

    public String getMprgNropra() {
        return mprgNropra;
    }

    public void setMprgNropra(String mPRB_NROPRA) {
        mprgNropra = mPRB_NROPRA;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String mPRB_MONTO) {
        monto = mPRB_MONTO;
    }

    public String getCancuo() {
        return cancuo;
    }

    public void setCancuo(String mPRB_CANCUO) {
        cancuo = mPRB_CANCUO;
    }

    public String getMoncancu() {
        return ncancu;
    }

    public void setMoncancu(String mPRB_MONCANCU) {
        ncancu = mPRB_MONCANCU;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String mPRB_SALDO) {
        saldo = mPRB_SALDO;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String mPDE_APELLI) {
        apellido = mPDE_APELLI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String mPDE_NOMBRE) {
        nombre = mPDE_NOMBRE;
    }

    public String getCondic() {
        return condic;
    }

    public void setCondic(String mPDE_CONDIC) {
        condic = mPDE_CONDIC;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String pRCAT_CATE) {
        cate = pRCAT_CATE;
    }

}
