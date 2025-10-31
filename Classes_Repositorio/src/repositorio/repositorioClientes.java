package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class repositorioClientes
{
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionar(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public List<Cliente> listar()
    {
        return clientes;
    }

    public Cliente buscarPorId(int id)
    {
        for (Cliente cliente : clientes)
        {
            if (cliente.getId() == id)
            {
                return cliente;
            }
        }
        return null;
    }

    public boolean atualizar(int id, Cliente novosDados)
    {
        for (int i = 0; i < clientes.size(); i++)
        {
            if (clientes.get(i).getId() == id)
            {
                clientes.set(i, novosDados);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id)
    {
        return clientes.removeIf(c -> c.getId() == id);
    }
}
