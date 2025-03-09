package electrohogar;

public abstract class Electrodomesticos {
    private String nSerie;
    private String modelo;
    private String marca;
    private double precioUnd;

    public Electrodomesticos() {
    }

    public Electrodomesticos(String nSerie, String modelo, String marca, double precioUnd) {
        this.nSerie = nSerie;
        this.modelo = modelo;
        this.marca = marca;
        this.precioUnd = precioUnd;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnd() {
        return precioUnd;
    }

    public void setPrecioUnd(double precioUnd) {
        this.precioUnd = precioUnd;
    }
       
}
