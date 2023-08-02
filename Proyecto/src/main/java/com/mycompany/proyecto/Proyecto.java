

package com.mycompany.proyecto;

import DAO.Autobus;
import DAO.Estaciones;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sales
 */
public class Proyecto {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);
        
//        Estaciones.AgregarEstaciones();
//        Autobus bus=new Autobus();
//        bus.setCapacidad(40);
//        bus.setNumero("1");
//        Random rnd=new Random();
//        bus.setUltimaParada(rnd.nextInt(1, 20));
//        while(true){
//        bus.Continuar();
//            System.out.println(bus.toString());
        
                            

Autobus autobus = crearAutobus();

        System.out.println("Datos del autobús creado:");
        System.out.println(autobus);

        // Ejemplo de cómo continuar con el autobús.
        System.out.println("Continuar con el autobús:");
        autobus.Continuar();
    }

    public static Autobus crearAutobus() {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la última parada del autobús:");
        String nombreParada = SC.nextLine();

        // Generar el resto de los datos automáticamente, menos pasajeros que inicia desde 0
        String numero = generarNumeroAleatorio();
        int capacidad = generarCapacidadAleatoria();
        int pasajeros = 0; 
        int ultimaParada = generarUltimaParadaAleatoria();
        
        Autobus autobus = new Autobus(numero, capacidad, pasajeros, ultimaParada, nombreParada);

        SC.close();
        return autobus;
    }

    public static String generarNumeroAleatorio() {
        // Generar un número aleatorio de autobús, números entre el 1 y el 10
        return " Bus " + (int) (Math.random() * 10);
    }

    public static int generarCapacidadAleatoria() {
        // Generar una capacidad aleatoria pero como máximo 54 
        return (int) (Math.random() * 54);
    }

    public static int generarUltimaParadaAleatoria() {
        // Generar una última parada aleatoria entre 0 y 20 
        return (int) (Math.random() * 20);
    }
    }
// }
 
//DAO(Estudiante(Atributos,Metodos)) DAL(Insert Update y Delete) y BLL(Sirve de comunicacion)