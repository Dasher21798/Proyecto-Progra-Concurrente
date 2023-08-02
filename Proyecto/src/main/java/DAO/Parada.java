package DAO;

import java.util.Random;

/**
 *
 * @author sales
 */
public class Parada {
 private int Numero;
 private boolean flag;
 private String Nombre;
 private int Pasajeros;

    public Parada(int Numero, boolean flag, String Nombre) {
        this.Numero = Numero;
        this.flag = flag;
        this.Nombre = Nombre;
        Random rnd=new Random();
        this.setPasajeros(rnd.nextInt(0, 20));
    }
public void RefrescarPasajeros(){
        Random rnd=new Random();
        this.setPasajeros(rnd.nextInt(0, 20));
}
    public Parada() {
    }

   
    public int getNumero() {
        return Numero;
    }

 
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public boolean isFlag() {
        return flag;
    }

    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    
    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  
    public int getPasajeros() {
        return Pasajeros;
    }

    
    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }
}
