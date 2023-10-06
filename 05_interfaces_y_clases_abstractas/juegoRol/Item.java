public abstract class Item 
{
    private String nombre;

    public Item(String nombre)
    {
        this.nombre = nombre;
    }

    public abstract void usar(Personaje personaje);

    public String getNombre()
    {
        return nombre;
    }
}
