package viajes;

public abstract class Viaje
{
    protected Trayecto trayecto;
    protected int cantidadVagones;
    protected int cantidadMaxPasajeros;

    public Viaje(Trayecto trayecto, int cantidadVagones, int cantidadMaxPasajeros)
    {
        this.trayecto = trayecto;
        this.cantidadVagones = cantidadVagones;
        this.cantidadMaxPasajeros = cantidadMaxPasajeros;
    }

    public abstract double tiempoDeDemora();
}