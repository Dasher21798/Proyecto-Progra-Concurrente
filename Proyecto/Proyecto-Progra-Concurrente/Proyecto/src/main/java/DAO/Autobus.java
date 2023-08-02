
package DAO;

import java.util.List;


public class Autobus {

    private String numero;
    private int Capacidad,Pasajeros;
    private int UltimaParada;
    private String NombreParada;

    public Autobus(String numero, int Capacidad, int Pasajeros, int UltimaParada, String NombreParada) {
        this.numero = numero;
        this.Capacidad = Capacidad;
        this.Pasajeros = Pasajeros;
        this.UltimaParada = UltimaParada;
        this.NombreParada = NombreParada;
    }

    public Autobus() {
    }

    
    public String getNumero() {
        return numero;
    }

   
    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    public int getCapacidad() {
        return Capacidad;
    }

    
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

   
    public int getUltimaParada() {
        return UltimaParada;
    }

   
    public void setUltimaParada(int UltimaParada) {
        this.UltimaParada = UltimaParada;
    }

    public void AsignarParada() {
        if(Estaciones.estaciones.get(this.UltimaParada).isFlag()){
        this.NombreParada = Estaciones.estaciones.get(this.UltimaParada).getNombre();}else{
        this.UltimaParada+=2;
        this.NombreParada = Estaciones.estaciones.get(this.UltimaParada).getNombre();
        int dif=this.Capacidad-(this.Pasajeros+Estaciones.estaciones.get(this.UltimaParada).getPasajeros());
        if(dif>=0){
        this.Pasajeros+=Estaciones.estaciones.get(this.UltimaParada).getPasajeros();
        }else{
        this.Pasajeros+=(this.Capacidad-this.Pasajeros);
        }
        
        Estaciones.estaciones.get(this.UltimaParada).setFlag(false);
        }
    }

    @Override
    public String toString() {
        return "Autobus{" + "numero=" + numero + ", Capacidad=" + Capacidad + ", UltimaParada=" + (UltimaParada+1) + ", NombreParada=" + NombreParada + '}';
    }

    public void Continuar() {
        //si ya llego a la ultima estacion, entonces sele asigna la primera
        Estaciones.estaciones.get(this.UltimaParada).setFlag(true);
        if (this.UltimaParada < Estaciones.estaciones.size()-1) {
            this.UltimaParada += 1;
        } else {
            this.UltimaParada = 0;
        }
        AsignarParada();
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {

        }
    }


    public int getPasajeros() {
        return Pasajeros;
    }

   
    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }
}
