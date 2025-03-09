package electrohogar;

import javax.swing.JOptionPane;

public class Refrigerador extends Electrodomesticos{
    private String tEnergia;

    public Refrigerador() {
    }

    public Refrigerador(String nSerie, String modelo, String marca, double precioUnd, String tEnergia) {
        super(nSerie, modelo, marca, precioUnd);
        this.tEnergia = tEnergia;
    }

    public String gettEnergia() {
        return tEnergia;
    }

    public void settEnergia(String tEnergia) {
        this.tEnergia = tEnergia;
    }
    
    public void ingresarRefrigerador(Refrigerador refrigerador, int contador){
        JOptionPane.showMessageDialog(null,"Ingrese la informacion del refrigerador #"+ contador);
        refrigerador.setnSerie(JOptionPane.showInputDialog("N° de Serial: "));
        refrigerador.setModelo(JOptionPane.showInputDialog("Modelo: "));
        refrigerador.setMarca(JOptionPane.showInputDialog("Marca: "));
        refrigerador.setPrecioUnd(Double.parseDouble(JOptionPane.showInputDialog("Precio Unitario: ")));
        refrigerador.settEnergia(JOptionPane.showInputDialog("Tipo de energia GAS o ELECTRICO: "));        
        
    }
       
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null,
            "Refrigerador - Marca: " + getMarca() + ", Modelo: " + getModelo() +
            ", Precio: " + getPrecioUnd() + ", Tipo de energia: " + gettEnergia());}
    
}
