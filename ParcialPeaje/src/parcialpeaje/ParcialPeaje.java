/*
 * autor MarianaGomez
 * fecha 13/03/2019 
 */
package parcialpeaje;

import java.util.ArrayList;


public class ParcialPeaje {
    
    public static void main(String[] args) {
                
        //Creación Arrays para ingresar los valores
        ArrayList<Automovil> automovil = new ArrayList<Automovil>();
        ArrayList<Moto> moto = new ArrayList<Moto>();
        ArrayList<Camion> camion = new ArrayList<Camion>();
        ArrayList<Camion2Ejes> camion2 = new ArrayList<Camion2Ejes>();
              
        //Ingresar los valores
        
        Automovil auto = new Automovil("JCQ082", "Nissan");
        automovil.add(auto);
        
        Moto motoc = new Moto("CPP53", "Yamaha");
        moto.add(motoc);
        
        Camion camion1 = new Camion("PQL999", "Mercedes");
        camion.add(camion1);
        
        Camion2Ejes camionEje = new Camion2Ejes("WLO523", "Foton");
        camion2.add(camionEje);
        
        System.out.println(automovil.toString());
       
    }       
    
}
