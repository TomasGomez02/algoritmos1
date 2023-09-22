package viajes;

public class ViajeAltaVelocidad extends Viaje 
{
    public ViajeAltaVelocidad(Trayecto trayecto, int cantidadVagones, int cantidadMaxPasajeros)
    {
        super(trayecto, cantidadVagones, cantidadMaxPasajeros);
    }   

    @Override
    public double tiempoDeDemora()
    {
        return trayecto.getDistancia() / 10.0;
    }
}
