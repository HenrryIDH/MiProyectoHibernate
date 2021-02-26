package edu.educacionit.model;

public class VistaTotalPromedioSaldos {
    public final long total;
    public final double promedioSaldos;


    public VistaTotalPromedioSaldos(long total, double promedioSaldos) {
        this.total = total;
        this.promedioSaldos = promedioSaldos;
    }

    @Override
    public String toString() {
        return "VistaTotalPromedioSaldos{" +
                "total=" + total +
                ", promedioSaldos=" + promedioSaldos +
                '}';
    }
}
