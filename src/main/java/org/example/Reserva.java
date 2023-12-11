package org.example;
import java.util.*;

public class Reserva {
       private String name;
       private int idNumber;
       private int contactNumber;
       private Date datetime;

    public Reserva(String name, int idNumber, int contactNumber, Date datetime) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
        this.datetime = datetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Reserva [nombrePersona=" + name + ", documento=" + idNumber +
                ", numeroContacto=" + contactNumber + ", fechaHoraReserva=" + datetime + "]";
    }

}