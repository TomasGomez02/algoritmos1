package viajes;

public class Trayecto 
{
    private String origen;
    private String destino;
    private double distancia;
    private int cantidadEstaciones;

    public Trayecto(String origen, String destino, double distancia, int cantidadEstaciones)
    {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.cantidadEstaciones = cantidadEstaciones;
    }
    
    public double getDistancia()
    {
        return distancia;
    }

    public int getCantidadEstaciones()
    {
        return cantidadEstaciones;
    }

}