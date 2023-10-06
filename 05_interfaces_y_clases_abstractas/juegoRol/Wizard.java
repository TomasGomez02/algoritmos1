public class Wizard extends Personaje implements PersonajeADistancia
{
    private final int DAÑO = 3;
    private final int DEFENSA = 3;

    public Wizard(String nombre)
    {
        super(nombre, 1, 20, 13);
    }

    @Override
    public void atacarDistancia(Personaje enemigo)
    {
        if (attackRoll(enemigo))
        {
            enemigo.recibirDaño(DAÑO);
            System.out.println(getNombre() + " ataca a " + enemigo.getNombre() + " a distancia por " + DAÑO + " de daño!");
            return;
        }
        
        System.out.println(getNombre() + " falló!");
    }

    @Override
    public final void atacar(Personaje enemigo)
    {
        if (attackRoll(enemigo))
        {
            enemigo.recibirDaño(DAÑO);
            System.out.println(getNombre() + " ataca a " + enemigo.getNombre() + " por " + DAÑO + " de daño!");

            enemigo.defender(this);
            return;
        }
        
        System.out.println(getNombre() + " falló!");
    }

    @Override
    protected final void defender(Personaje enemigo)
    {
        this.curar(DEFENSA);

        System.out.println(getNombre() + " se defiende de " + enemigo.getNombre() + " y anula " + DEFENSA + " de daño!");
    }
}
