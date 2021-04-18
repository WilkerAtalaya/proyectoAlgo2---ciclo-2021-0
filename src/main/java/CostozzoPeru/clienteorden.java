
package CostozzoPeru;

public class clienteorden {
    String clienteo;
    String prendao;
    String fechaentregao;

    public clienteorden(String nombreo, String prendao, String fechaentregao) {
        this.clienteo = nombreo;
        this.prendao = prendao;
        this.fechaentregao = fechaentregao;
    }

    public String getNombreo() {
        return clienteo;
    }

    public void setNombreo(String nombreo) {
        this.clienteo = nombreo;
    }

    public String getPrendao() {
        return prendao;
    }

    public void setPrendao(String prendao) {
        this.prendao = prendao;
    }

    public String getFechaentregao() {
        return fechaentregao;
    }

    public void setFechaentregao(String fechaentregao) {
        this.fechaentregao = fechaentregao;
    }
    
    
}
