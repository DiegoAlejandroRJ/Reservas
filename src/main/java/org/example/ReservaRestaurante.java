package org.example;

import java.util.Date;

public class ReservaRestaurante extends Reserva implements TipodeReserva{
    private String restauranteNombre;

    public ReservaRestaurante(String name, int idNumber, int contactNumber, Date datetime, String restauranteNombre) {
        super(name, idNumber, contactNumber, datetime);
        this.restauranteNombre = restauranteNombre;
    }

    @Override
    public void getTipo(){
        System.out.println("Restaurante");
    }

    public String getrestauranteNombre() {
        return restauranteNombre;
    }

    public void setRestauranteNombre(String RestauranteNombre) {
        this.restauranteNombre = restauranteNombre;
    }

    @Override
    public String toString(){
        return super.toString() + ", restaurante = " + restauranteNombre;
    }
}
