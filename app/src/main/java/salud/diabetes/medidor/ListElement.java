package salud.diabetes.medidor;

public class ListElement {

    public String fecha;
    public String cetonas;
    public String glucosa;
    public String cuando;
    public String observaciones;
    public String unidades;


    public ListElement(String fecha, String cetonas, String glucosa, String cuando, String observaciones, String unidades) {
        this.fecha = fecha;
        this.cetonas = cetonas;
        this.glucosa = glucosa;
        this.cuando = cuando;
        this.observaciones = observaciones;
        this.unidades = unidades;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCetonas() {
        return cetonas;
    }

    public void setCetonas(String cetonas) {
        this.cetonas = cetonas;
    }

    public String getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(String glucosa) {
        this.glucosa = glucosa;
    }

    public String getCuando() {
        return cuando;
    }

    public void setCuando(String cuando) {
        this.cuando = cuando;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }
}
