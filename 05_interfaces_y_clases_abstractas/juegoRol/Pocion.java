public class Pocion extends Item
{
    private int curacion = 5;
    public Pocion()
    {
        super("Pocion");
    }

    @Override
    public void usar(Personaje personaje)
    {
        personaje.curar(curacion);
    }
}
