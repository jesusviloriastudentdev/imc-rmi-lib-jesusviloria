/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jesusviloria.calpin.rmi.lib;

import java.io.Serializable;

/**
 *
 * @author jesusviloria
 */
public class DatosCalPin implements Serializable {

    // Variables de entrada (lo que envía el cliente)
    private float largo;
    private float ancho;
    private float altura;
    private float rendimiento;
    
    // Variables de salida (lo que calcula y devuelve el servidor)
    private float areaTotal;
    private float litrosRequeridos;

    // 1. Constructor vacío (Obligatorio en objetos serializables/JavaBeans)
    public DatosCalPin() {
    }

    // 2. Constructor con los datos de entrada (Similar al que hizo el profesor con peso y altura)
    public DatosCalPin(float largo, float ancho, float altura, float rendimiento) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        this.rendimiento = rendimiento;
    }

    // 3. Getters y Setters
    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float getLitrosRequeridos() {
        return litrosRequeridos;
    }

    public void setLitrosRequeridos(float litrosRequeridos) {
        this.litrosRequeridos = litrosRequeridos;
    }

}
