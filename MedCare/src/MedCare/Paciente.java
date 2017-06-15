/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedCare;

import java.io.Serializable;

/**
 *
 * @author xyto_
 */
public class Paciente implements Serializable{
    String Nombre;
    String Apellido;
    int Edad;
    String ID;
    String Correo;
    double Peso;
    double Altura;
    String Medicamento;
    double Rango;
    String FechaFinal;
    String DrAsignado;
    String RutaImagen;

    public Paciente() {
    }

    public Paciente(String Nombre, String Apellido, int Edad, String ID, String Correo, double Peso, double Altura, String Medicamento, double Rango, String FechaFinal, String DrAsignado, String RutaImagen) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.ID = ID;
        this.Correo = Correo;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Medicamento = Medicamento;
        this.Rango = Rango;
        this.FechaFinal = FechaFinal;
        this.DrAsignado = DrAsignado;
        this.RutaImagen = RutaImagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getMedicamento() {
        return Medicamento;
    }

    public void setMedicamento(String Medicamento) {
        this.Medicamento = Medicamento;
    }

    public double getRango() {
        return Rango;
    }

    public void setRango(double Rango) {
        this.Rango = Rango;
    }

    public String getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getDrAsignado() {
        return DrAsignado;
    }

    public void setDrAsignado(String DrAsignado) {
        this.DrAsignado = DrAsignado;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    @Override
    public String toString() {
        return Nombre + " " + Apellido;
    }
    
    
}
