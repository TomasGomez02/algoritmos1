package viajes;

public class Main 
{
    public static void main(String args[])
    {
        Trayecto bariloche = new Trayecto("CABA", "Bariloche", 1500, 5);
        Viaje barilocheDiesel = new ViajeDiesel(bariloche, 10, 500);
        System.out.println(barilocheDiesel.tiempoDeDemora());

        Viaje barilocheElectrico = new ViajeElectrico(bariloche, 10, 500);
        System.out.println(barilocheElectrico.tiempoDeDemora());

        Viaje barilocheAltaVelocidad = new ViajeAltaVelocidad(bariloche, 10, 500);
        System.out.println(barilocheAltaVelocidad.tiempoDeDemora());
    }    
}
