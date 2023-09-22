package viajes;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String args[])
    {
        Trayecto bariloche = new Trayecto("CABA", "Bariloche", 1500, 5);
        Viaje barilocheDiesel = new ViajeDiesel(bariloche, 10, 500);
        Viaje barilocheElectrico = new ViajeElectrico(bariloche, 10, 500);
        Viaje barilocheAltaVelocidad = new ViajeAltaVelocidad(bariloche, 10, 500);

        List<Viaje> viajes = new ArrayList<Viaje>();
        viajes.add(barilocheDiesel);
        viajes.add(barilocheElectrico);
        viajes.add(barilocheAltaVelocidad);
        
        for (Viaje viaje: viajes)
        {
            System.out.println(viaje.tiempoDeDemora());
        }
    }    
}
