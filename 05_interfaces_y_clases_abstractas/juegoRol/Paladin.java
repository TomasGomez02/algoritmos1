public class Paladin extends Personaje 
{
    private final int DAÑO = 5;
    private final int DEFENSA = 2;

    public Paladin(String nombre)
    {
        super(nombre, 1, 30, 18);
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
