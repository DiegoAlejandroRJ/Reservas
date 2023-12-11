package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ReservaHotel reservaHotel = new ReservaHotel("Juan Perez", 123456789, 987654321, new Date(121989), "Hotel XYZ");
        System.out.println(reservaHotel);

        ReservaMedica reservaCitaMedica = new ReservaMedica("Maria Rodriguez", 987654321, 123456789, new Date(), "Cardiología");
        System.out.println(reservaCitaMedica);

        ReservaRestaurante reservaRestaurante = new ReservaRestaurante("Ana Lopez", 456789012, 789012345, new Date(), "Restaurante ABC");
        System.out.println(reservaRestaurante);
    }
}