package model;

public final class automovel implements Cloneable {
    private String marca;
    private String modelo;
    private String tipo;

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public automovel clone() throws CloneNotSupportedException{
        return (automovel) super.clone();
    }


}

