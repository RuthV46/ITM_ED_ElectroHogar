package electrohogar;

import javax.swing.JOptionPane;

public class Lavadora extends Electrodomesticos {
    private double capacidadK;

    public Lavadora() {
    }

    public Lavadora( String nSerie, String modelo, String marca, double precioUnd, double capacidadK) {
        super(nSerie, modelo, marca, precioUnd);
        this.capacidadK = capacidadK;
    }

    public double getCapacidadK() {
        return capacidadK;
    }

    public void setCapacidadK(double capacidadK) {
        this.capacidadK = capacidadK;
    }
    
    public void ingresarLavadora(Lavadora lavadora, int contador){
        
        JOptionPane.showMessageDialog(null,"Ingrese la informacion de la lavadora #"+ contador);
        lavadora.setnSerie(JOptionPane.showInputDialog("N° de Serial: "));
        lavadora.setModelo(JOptionPane.showInputDialog("Modelo: "));
        lavadora.setMarca(JOptionPane.showInputDialog("Marca: "));
        lavadora.setPrecioUnd(Double.parseDouble(JOptionPane.showInputDialog("Precio Unitario: ")));
        lavadora.setCapacidadK(Double.parseDouble(JOptionPane.showInputDialog("Capacidad de carga en kilos:  ")));
        
    }
       
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null,
            "Lavadora - Marca: " + getMarca() + ", Modelo: " + getModelo() +
            ", Precio: " + getPrecioUnd() + ", Capacidad de carga: " + getCapacidadK() + " kg");}
       
   
    
}
