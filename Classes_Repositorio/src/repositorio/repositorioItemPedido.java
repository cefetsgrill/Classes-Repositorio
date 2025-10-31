package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.ItemPedido;

public class repositorioItemPedido
{
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionar(ItemPedido item)
    {
        itens.add(item);
    }

    public List<ItemPedido> listar()
    {
        return itens;
    }

    public ItemPedido buscarPorId(int id)
    {
        for (ItemPedido item : itens)
        {
            if (item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }

    public boolean atualizar(int id, ItemPedido novosDados)
    {
        for (int i = 0; i < itens.size(); i++)
        {
            if (itens.get(i).getId() == id)
            {
                itens.set(i, novosDados);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id)
    {
        return itens.removeIf(i -> i.getId() == id);
    }
}
