import java.util.Random;

public abstract class Personaje 
{
    private String nombre;
    private int nivel;
    private int puntosVida;
    private int armorClass;
    private 

    public Personaje(String nombre, int nivel, int puntosVida, int armorClass)
    {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armorClass = armorClass;
    }

    public abstract void atacar(Personaje enemigo);

    protected abstract void defender(Personaje enemigo);
    
    protected void recibirDaño(int daño)
    {
        puntosVida -= daño;
    }

    public void curar(int cantidad)
    {
        puntosVida += cantidad;
    }

    protected int getVida()
    {
        return puntosVida;
    }

    protected String getNombre()
    {
        return nombre;
    }

    protected boolean attackRoll(Personaje enemigo)
    {
        Random random = new Random();
        int roll = (random.nextInt(20) + 1);
        System.out.println(roll);
        return (roll >= enemigo.armorClass);
    }

    public boolean isAlive()
    {
        return puntosVida > 0;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " | Vida: " + puntosVida;
    }
}
