import java.util.List;
import java.util.ArrayList;

public class Inventario 
{
    List<Item> items;

    public Inventario()
    {
        items = new ArrayList<>();
    }

    public void añadirItem(Item item)
    {
        items.add(item);
    }

    public Item tomarItem(String nombreItem)
    {
        for (int i = 0; i < items.size(); i++)
        {
            if (nombreItem.equals(items.get(i).getNombre()))
            {
                Item item = items.get(i);
                items.remove(i);
                return item;
            }
        }
        return null;
    }
}
