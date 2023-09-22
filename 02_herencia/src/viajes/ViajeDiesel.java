package viajes;

public class ViajeDiesel extends Viaje
{
    public ViajeDiesel(Trayecto trayecto, int cantidadVagones, int cantidadMaxPasajeros)
    {
        super(trayecto, cantidadVagones, cantidadMaxPasajeros);
    }

    @Override
    public double tiempoDeDemora()
    {
        return ((trayecto.getDistancia() * trayecto.getCantidadEstaciones() / 2.0) + 
        (trayecto.getCantidadEstaciones() + cantidadMaxPasajeros) / 10.0);
    }
}
