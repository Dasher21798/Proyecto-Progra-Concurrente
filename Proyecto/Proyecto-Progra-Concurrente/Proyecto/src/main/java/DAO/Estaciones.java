
package DAO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sales
 */
public class Estaciones {
    public static List<Parada> estaciones;
    public boolean flag;//Verificar si la estacion esta ocupada por un autobus
    public static void AgregarEstaciones(){
    estaciones=new ArrayList();
    estaciones.add(new Parada(1,true,"Ciudad Deportiva Rafael Ángel Pérez"));
    estaciones.add(new Parada(2,true,"Super Lian, Hatillo"));
    estaciones.add(new Parada(3,true,"Plásticos Tosso"));
    estaciones.add(new Parada(4,true,"Parqueo De Yamuni, San Francisco"));
    estaciones.add(new Parada(5,true,"Colegio María Auxiliadora"));
    estaciones.add(new Parada(6,true,"Escuela Juan Rafael Mora,"));
    estaciones.add(new Parada(7,true,"Hotel Caribbean, Amón"));
    estaciones.add(new Parada(8,true,"Parque San Francisco"));
    estaciones.add(new Parada(9,true,"Liceo Nocturno José Joaquín Jiménez Nuñez"));
    estaciones.add(new Parada(10,true," Acueductos Y Alcantarillados Guadalupe"));
    estaciones.add(new Parada(11,true," Rotonda De Betania"));
    estaciones.add(new Parada(12,true," Colegio Salesiano Don Bosco"));
    estaciones.add(new Parada(13,true," Escuela República Dominicana"));
    estaciones.add(new Parada(14,true," Abastecedor Los Sauces"));
    estaciones.add(new Parada(15,true," Parque De Monte Azul"));
    estaciones.add(new Parada(16,true," Cevichería Costa Azul"));
    estaciones.add(new Parada(17,true," Taller Gernon"));
    estaciones.add(new Parada(18,true," Plaza América"));
    estaciones.add(new Parada(19,true," Rest. La Fortuna, Hatillo 4"));
    estaciones.add(new Parada(20,true," Terminal Hatillo"));



    }

 
    public List<Parada> getEstaciones() {
        return estaciones;
    }

  
    public void setEstaciones(List<Parada> estaciones) {
        this.estaciones = estaciones;
    }
}
