import java.awt.color.ProfileDataException;

public class ControleEstoque {
    private Produto[] listaProdutos;
    private int indice;

    public ControleEstoque(int tamanhoVetor) {
        listaProdutos = new Produto[tamanhoVetor];
    }

    public ControleEstoque() {
        listaProdutos = new Produto[50];
    }

    public void adicionarProduto(Produto produto) {
        produto.setId(indice);
        listaProdutos[indice] = produto;
        indice++;
    }

    public void alterarProduto(Produto produto) {
        listaProdutos[produto.getId()] = produto;
    }

    public void excluirProduto(Produto produto) {
        excluirProduto(produto.getId());
    }

    public void excluirProduto(int id) {
        for (int i = id; i < indice; i++) {
            listaProdutos[id] = listaProdutos[id + 1];
            listaProdutos[indice] = null;
            indice--;
        }
    }

    public Produto getById(int id){
        return listaProdutos[id];
    }

    public Produto[] getListaProdutos(){
        return listaProdutos;
    }
}
