/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jesusviloria.imc.rmi.lib;

import java.io.Serializable;

/**
 *
 * @author jesusviloria
 */


public class DatosImc implements Serializable {
// Variables de entrada (lo que envía el cliente)
    private float peso;
    private float altura;
    
    // Variables de salida (lo que calcula y devuelve el servidor)
    private float resultado;
    private String interpretacion;

    // 1. Constructor vacío (Obligatorio en objetos serializables/JavaBeans)
    public DatosImc() {
    }

    // 2. Constructor con los datos de entrada[cite: 8]
    public DatosImc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // 3. Getters y Setters[cite: 8, 9]
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
