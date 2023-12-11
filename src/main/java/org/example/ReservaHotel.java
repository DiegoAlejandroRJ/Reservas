package org.example;

import java.util.Date;

public class ReservaHotel extends Reserva implements TipodeReserva{
    private String hotelname;

    public ReservaHotel(String name, int idNumber, int contactNumber, Date datetime, String hotelname) {
        super(name, idNumber, contactNumber, datetime);
        this.hotelname = hotelname;
    }

    @Override
    public void getTipo() {
        System.out.println("Hotel");
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    @Override
    public String toString() {
        return super.toString() + ", nombre del hotel = " + hotelname;
    }
}
