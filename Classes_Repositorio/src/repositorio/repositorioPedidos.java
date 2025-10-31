package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Pedido;

public class repositorioPedidos
{
    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionar(Pedido pedido)
    {
        pedidos.add(pedido);
    }

    public List<Pedido> listar()
    {
        return pedidos;
    }

    public Pedido buscarPorId(int id)
    {
        for (Pedido pedido : pedidos)
        {
            if (pedido.getId() == id)
            {
                return pedido;
            }
        }
        return null;
    }

    public boolean atualizar(int id, Pedido novosDados)
    {
        for (int i = 0; i < pedidos.size(); i++)
        {
            if (pedidos.get(i).getId() == id)
            {
                pedidos.set(i, novosDados);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id)
    {
        return pedidos.removeIf(p -> p.getId() == id);
    }
}
