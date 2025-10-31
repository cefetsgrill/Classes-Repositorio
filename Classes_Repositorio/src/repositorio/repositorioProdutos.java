package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class repositorioProdutos
{
    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto)
    {
        produtos.add(produto);
    }

    public List<Produto> listar()
    {
        return produtos;
    }

    public Produto buscarPorId(int id)
    {
        for (Produto produto : produtos)
        {
            if (produto.getId() == id)
            {
                return produto;
            }
        }
        return null;
    }

    public boolean atualizar(int id, Produto novosDados)
    {
        for (int i = 0; i < produtos.size(); i++)
        {
            if (produtos.get(i).getId() == id)
            {
                produtos.set(i, novosDados);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id)
    {
        return produtos.removeIf(p -> p.getId() == id);
    }
}
