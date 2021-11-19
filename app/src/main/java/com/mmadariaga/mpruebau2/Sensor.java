package com.mmadariaga.mpruebau2;
public class Sensor {

    private String nameSensor;
    private String valuesensor;
    private String fecha_hora;

    public Sensor(String nameSensor, String valuesensor) {
        this.nameSensor = nameSensor;
        this.valuesensor = valuesensor;
        this.fecha_hora = fecha_hora;
    }

    public Sensor(){
    }

    public String getNameSensor() {
        return nameSensor;
    }

    public void setNameSensor(String nameSensor) {
        this.nameSensor = nameSensor;
    }

    public String getValuesensor() {
        return valuesensor;
    }

    public void setValuesensor(String valuesensor) {
        this.valuesensor = valuesensor;
    }

    public String getFecha_hora() { return fecha_hora; }

    public void setFecha_hora(String fecha_hora) { this.fecha_hora = fecha_hora; }
}
