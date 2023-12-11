package org.example;

import java.util.Date;

public class ReservaMedica extends Reserva implements TipodeReserva{
    private String especialidad;

    public ReservaMedica(String name, int idNumber, int contactNumber, Date datetime, String especialidad) {
        super(name, idNumber, contactNumber, datetime);
        this.especialidad = especialidad;
    }
    @Override
    public void getTipo(){
        System.out.println("cita médica");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString(){
        return super.toString() + ", especialidad = " + especialidad;
    }
}
