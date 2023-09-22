package viajes;

public class ViajeElectrico extends Viaje
{
    public ViajeElectrico(Trayecto trayecto, int cantidadVagones, int cantidadMaxPasajeros)
    {
        super(trayecto, cantidadVagones, cantidadMaxPasajeros);
    }

    @Override
    public double tiempoDeDemora()
    {
        return trayecto.getDistancia() * trayecto.getCantidadEstaciones() / 2.0;
    }
}
