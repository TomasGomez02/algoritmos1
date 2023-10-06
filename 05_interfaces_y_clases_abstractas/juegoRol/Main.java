import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
    {
        Wizard[] tomas = new Wizard[3];
        for (int i = 0; i < tomas.length; i++)
        {
            tomas[i] = new Wizard("Tomas " + i);
        }

        Paladin gonzalo = new Paladin("Gonzalo");

        Random random = new Random();
        boolean continuar = true;
        int ronda = 1;
        int tomasAtacado = random.nextInt(tomas.length);
        while (continuar)
        {
            System.out.println("\nRONDA " + ronda + "\n");
            for (Wizard tom: tomas)
            {
                tom.atacarDistancia(gonzalo);
                System.out.println(tom);
                System.out.println(gonzalo);
            }

            
            gonzalo.atacar(tomas[tomasAtacado]);
            System.out.println(tomas[tomasAtacado]);
            System.out.println(gonzalo);

            continuar = gonzalo.isAlive() && tomas[tomasAtacado].isAlive();
            ronda++;            
        }
        System.out.println(gonzalo.getClass().toString());
    }

    Jugador<Wizard> jugador
    jugador.
}
