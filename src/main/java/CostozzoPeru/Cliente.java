package CostozzoPeru;

import java.io.*;

public class Cliente implements Serializable{
    private String nombre;
    private String apellido;
    private String genero;
    private int celular;
    private String direccion;
    private String empresa;
    private int ruc;

    //Tallas del cliente
    private double talla1;
    private double talla2;
    private double talla3;
    private double talla4;
    private double talla5;
    private double talla6;
    private double talla7;
    private double talla8;
    private double talla9;
    private double talla10;
    private double talla11;
    private double talla12;
    private double talla13;
    private double talla14;
    private double talla15;
    private double talla16;
    private double talla17;
    private double talla18;
    private double talla19;
    private double talla20;
    private double talla21;
    private double talla22;
    private double talla23;
    private double talla24;
    private double talla25;
    private double talla26;
    private double talla27;
    private double talla28;
    private double talla29;
    private double talla30;
    
    public boolean equals(Cliente cliente){
        return (this.nombre.equals(cliente.nombre) && 
          this.apellido.equals(cliente.apellido));
    }

    public Cliente(String nombre, String apellido, String genero, 
            int celular, String direccion, String empresa, int ruc, 
            double talla1, double talla2, double talla3, double talla4, double talla5, 
            double talla6, double talla7, double talla8, double talla9, double talla10, 
            double talla11, double talla12, double talla13, double talla14, double talla15, 
            double talla16, double talla17, int talla18, double talla19, double talla20, 
            double talla21, double talla22, double talla23, double talla24, double talla25, 
            double talla26, double talla27, double talla28, double talla29, double talla30){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.celular = celular;
        this.direccion = direccion;
        this.empresa = empresa;
        this.ruc = ruc;
        this.talla1 = talla1;
        this.talla2 = talla2;
        this.talla3 = talla3;
        this.talla4 = talla4;
        this.talla5 = talla5;
        this.talla6 = talla6;
        this.talla7 = talla7;
        this.talla8 = talla8;
        this.talla9 = talla9;
        this.talla10 = talla10;
        this.talla11 = talla11;
        this.talla12 = talla12;
        this.talla13 = talla13;
        this.talla14 = talla14;
        this.talla15 = talla15;
        this.talla16 = talla16;
        this.talla17 = talla17;
        this.talla18 = talla18;
        this.talla19 = talla19;
        this.talla20 = talla20;
        this.talla21 = talla21;
        this.talla22 = talla22;
        this.talla23 = talla23;
        this.talla24 = talla24;
        this.talla25 = talla25;
        this.talla26 = talla26;
        this.talla27 = talla27;
        this.talla28 = talla28;
        this.talla29 = talla29;
        this.talla30 = talla30;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public double getTalla1() {
        return talla1;
    }

    public void setTalla1(double talla1) {
        this.talla1 = talla1;
    }

    public double getTalla2() {
        return talla2;
    }

    public void setTalla2(double talla2) {
        this.talla2 = talla2;
    }

    public double getTalla3() {
        return talla3;
    }

    public void setTalla3(double talla3) {
        this.talla3 = talla3;
    }

    public double getTalla4() {
        return talla4;
    }

    public void setTalla4(double talla4) {
        this.talla4 = talla4;
    }

    public double getTalla5() {
        return talla5;
    }

    public void setTalla5(double talla5) {
        this.talla5 = talla5;
    }

    public double getTalla6() {
        return talla6;
    }

    public void setTalla6(double talla6) {
        this.talla6 = talla6;
    }

    public double getTalla7() {
        return talla7;
    }

    public void setTalla7(double talla7) {
        this.talla7 = talla7;
    }

    public double getTalla8() {
        return talla8;
    }

    public void setTalla8(double talla8) {
        this.talla8 = talla8;
    }

    public double getTalla9() {
        return talla9;
    }

    public void setTalla9(double talla9) {
        this.talla9 = talla9;
    }

    public double getTalla10() {
        return talla10;
    }

    public void setTalla10(double talla10) {
        this.talla10 = talla10;
    }

    public double getTalla11() {
        return talla11;
    }

    public void setTalla11(double talla11) {
        this.talla11 = talla11;
    }

    public double getTalla12() {
        return talla12;
    }

    public void setTalla12(double talla12) {
        this.talla12 = talla12;
    }

    public double getTalla13() {
        return talla13;
    }

    public void setTalla13(double talla13) {
        this.talla13 = talla13;
    }

    public double getTalla14() {
        return talla14;
    }

    public void setTalla14(double talla14) {
        this.talla14 = talla14;
    }

    public double getTalla15() {
        return talla15;
    }

    public void setTalla15(double talla15) {
        this.talla15 = talla15;
    }

    public double getTalla16() {
        return talla16;
    }

    public void setTalla16(double talla16) {
        this.talla16 = talla16;
    }

    public double getTalla17() {
        return talla17;
    }

    public void setTalla17(double talla17) {
        this.talla17 = talla17;
    }

    public double getTalla18() {
        return talla18;
    }

    public void setTalla18(double talla18) {
        this.talla18 = talla18;
    }

    public double getTalla19() {
        return talla19;
    }

    public void setTalla19(double talla19) {
        this.talla19 = talla19;
    }

    public double getTalla20() {
        return talla20;
    }

    public void setTalla20(double talla20) {
        this.talla20 = talla20;
    }

    public double getTalla21() {
        return talla21;
    }

    public void setTalla21(double talla21) {
        this.talla21 = talla21;
    }

    public double getTalla22() {
        return talla22;
    }

    public void setTalla22(double talla22) {
        this.talla22 = talla22;
    }

    public double getTalla23() {
        return talla23;
    }

    public void setTalla23(double talla23) {
        this.talla23 = talla23;
    }

    public double getTalla24() {
        return talla24;
    }

    public void setTalla24(double talla24) {
        this.talla24 = talla24;
    }

    public double getTalla25() {
        return talla25;
    }

    public void setTalla25(double talla25) {
        this.talla25 = talla25;
    }

    public double getTalla26() {
        return talla26;
    }

    public void setTalla26(double talla26) {
        this.talla26 = talla26;
    }

    public double getTalla27() {
        return talla27;
    }

    public void setTalla27(double talla27) {
        this.talla27 = talla27;
    }

    public double getTalla28() {
        return talla28;
    }

    public void setTalla28(double talla28) {
        this.talla28 = talla28;
    }

    public double getTalla29() {
        return talla29;
    }

    public void setTalla29(double talla29) {
        this.talla29 = talla29;
    }

    public double getTalla30() {
        return talla30;
    }

    public void setTalla30(double talla30) {
        this.talla30 = talla30;
    }
    
    

}
