package com.pedrocm.caballerialusitana;

import java.util.Objects;

/**
 * Created by PedroCM on 25/05/2018.
 */

public class Lusitano {
    private Usuario usuario;
    private String name = "lusitano";
    private String firstSurname = "apellido1";
    private String secondSurname = "apellido2";
    private String email = "lusitano@email.com";
    private String telefono = "00000000";
    private Cargo cargo = Cargo.TROPA;
    private boolean excedencia = false;

    public Lusitano(Usuario usuario, String name, String firstSurname, String secondSurname, String email, String telefono, Cargo cargo, boolean excedencia) {
        this.usuario = usuario;
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.email = email;
        this.telefono = telefono;
        this.cargo = cargo;
        this.excedencia = excedencia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public boolean isExcedencia() {
        return excedencia;
    }

    public void setExcedencia(boolean excedencia) {
        this.excedencia = excedencia;
    }

    @Override
    public String toString() {
        return "Lusitano{" +
                "usuario=" + usuario +
                ", name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cargo=" + cargo +
                ", excedencia=" + excedencia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lusitano lusitano = (Lusitano) o;
        return excedencia == lusitano.excedencia &&
                Objects.equals(usuario, lusitano.usuario) &&
                Objects.equals(name, lusitano.name) &&
                Objects.equals(firstSurname, lusitano.firstSurname) &&
                Objects.equals(secondSurname, lusitano.secondSurname) &&
                Objects.equals(email, lusitano.email) &&
                Objects.equals(telefono, lusitano.telefono) &&
                cargo == lusitano.cargo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, name, firstSurname, secondSurname, email, telefono, cargo, excedencia);
    }
}
