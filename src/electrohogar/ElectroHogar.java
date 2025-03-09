package electrohogar;

import javax.swing.JOptionPane;

public class ElectroHogar{

    public static void main(String[] args) {
       Lavadora lavadora1 = new Lavadora();
       Lavadora lavadora2 = new Lavadora();
       Lavadora lavadora3 = new Lavadora();

       Refrigerador refrigerador1 = new Refrigerador();
       Refrigerador refrigerador2 = new Refrigerador();
       Refrigerador refrigerador3 = new Refrigerador();
       int opcionPrincipal;
       int contadorLavadora=0;
       int contadorRefri=0;
       
       
       do{
            System.out.println("******************************************************");
            System.out.println("\nMenú Principal:");
            System.out.println("1. Ingresar lavadora");
            System.out.println("2. Ingresar refrigerador");
            System.out.println("3. Salir");
            opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: "));
            
                                    
            switch(opcionPrincipal){
            
                case 1:
                    contadorLavadora++;
                    lavadora1.ingresarLavadora(lavadora1, contadorLavadora);
                    lavadora1.mostrarInformacion();
                    contadorLavadora++;
                    lavadora2.ingresarLavadora(lavadora2, contadorLavadora);
                    lavadora2.mostrarInformacion();
                    contadorLavadora++;
                    lavadora3.ingresarLavadora(lavadora3, contadorLavadora);
                    lavadora3.mostrarInformacion();
                                        
                    System.out.println("El precio promedio de las lavadoras es: $ " + (lavadora1.getPrecioUnd()+
                            lavadora2.getPrecioUnd()+lavadora3.getPrecioUnd())/3);
                    break;
                case 2:
                    int contadorGas=0;
                    int contadorElectrico=0;
                    
                    contadorRefri++;
                    refrigerador1.ingresarRefrigerador(refrigerador1, contadorRefri);
                    contadorRefri++;
                    refrigerador2.ingresarRefrigerador(refrigerador2, contadorRefri);
                    contadorRefri++;
                    refrigerador3.ingresarRefrigerador(refrigerador3, contadorRefri);
                                        
                    System.out.println("El precio promedio de los refrigeradores es: $ " + (refrigerador1.getPrecioUnd()+
                            refrigerador2.getPrecioUnd()+refrigerador3.getPrecioUnd())/3);
                                        
                    if ("GAS".equals(refrigerador1.gettEnergia().toUpperCase())){
                        contadorGas++;
                        refrigerador1.mostrarInformacion();
                    } else if("ELECTRICO".equals(refrigerador1.gettEnergia().toUpperCase())){
                       contadorElectrico++;
                        refrigerador1.mostrarInformacion();
                    }
                    if ("GAS".equals(refrigerador2.gettEnergia().toUpperCase())){
                        contadorGas++;
                        refrigerador2.mostrarInformacion();
                    } else if("ELECTRICO".equals(refrigerador2.gettEnergia().toUpperCase())){
                       contadorElectrico++;
                        refrigerador2.mostrarInformacion();
                    }               
                    if ("GAS".equals(refrigerador3.gettEnergia().toUpperCase())){
                        contadorGas++;
                        refrigerador3.mostrarInformacion();
                    } else if("ELECTRICO".equals(refrigerador3.gettEnergia().toUpperCase())){
                       contadorElectrico++;
                        refrigerador3.mostrarInformacion();
                    }            
 
                System.out.print("*********************************************************");
                System.out.print("La cantidad de refrigeradores de GAS son: "+ contadorGas +
                        " y la cantidad de refrigeradores ELECTRICOS son: " + contadorElectrico);                            
                    break;
                case 3:
                    System.out.println("Salida Exitosa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("****¡Opción inválida!****");
                    
            }
       } while(opcionPrincipal!=3);
 
      
    }
    
}
