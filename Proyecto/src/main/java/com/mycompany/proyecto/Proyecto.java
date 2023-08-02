

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
        
         System.out.println("1) Ciudad Deportiva Rafael Ángel Pérez");
         System.out.println("2) Super Lian, Hatillo");
         System.out.println("3) Plásticos Tosso");
         System.out.println("4) Parqueo De Yamuni, San Francisco");
         System.out.println("5) Colegio María Auxiliadora");
         System.out.println("6) Escuela Juan Rafael Mora");
         System.out.println("7) Hotel Caribbean, Amón");
         System.out.println("8) Parque San Francisco");
         System.out.println("9) Liceo Nocturno José Joaquín Jiménez Nuñez");
         System.out.println("10) Acueductos Y Alcantarillados Guadalupe");
         System.out.println("11) Rotonda De Betania");
         System.out.println("12) Colegio Salesiano Don Bosco");
         System.out.println("13) Escuela República Dominicana");
         System.out.println("14) Abastecedor Los Sauces");
         System.out.println("15) Parque De Monte Azul");
         System.out.println("16) Cevichería Costa Azul");
         System.out.println("17) Taller Gernon");
         System.out.println("18) Plaza América");
         System.out.println("19) Rest. La Fortuna, Hatillo 4");
         System.out.println("20) Terminal Hatillo");
         
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