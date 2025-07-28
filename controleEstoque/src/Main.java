import javax.swing.*;


public class Main {

    private static ControleEstoque ce;
    private static final String MENU = "CONTROLE DE PRODUTOS \n"
            + "1.CADASTRAR PRODUTOS\n"
            + "2.ALTERAR PRODUTOS\n"
            + "3.EXCLUIR PRODUTOS\n"
            + "4.PESQUISAR PRODUTOS POR ID\n"
            + "5.LISTAR PRODUTOS\n"
            + "6.SAIR\n";

    public static void main(String[] args) {
        ce = new ControleEstoque(5);
        String op = "";
        while (! op.equals("6")) {
            op = JOptionPane.showInputDialog(MENU);

            switch (op){
                case"1":
                    ce.adicionarProduto(getProdutoUser(1));
                    break;
                case"2":
                    ce.alterarProduto(getProdutoUser(2));
                    break;
                case"3":
                    ce.excluirProduto(getProdutoUser(3));
                    break;
                case"4":
                    buscarId();
                    break;
                case"5":
                    listarProdutos();
                    break;
                case"6":
                    JOptionPane.showMessageDialog(null, "Programa encerrado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
            }


        }

    }
    public static Produto getProdutoUser(int estado){
        Produto p = new Produto();
        if(estado != 1)
            p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto:")));
        if(estado != 3) {
            p.setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
            p.setFabricante(JOptionPane.showInputDialog("Digite o fabricante"));
            p.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço")));
        }
        return p;
    }
    public static void listarProdutos(){
        String resposta = "Produtos Cadastrados:\n";
        for (Produto p : ce.getListaProdutos()) {
            if (p != null) {
                resposta +=  p + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
    public static  void buscarId(){
        Produto prod = ce.getById(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID desejado:")));
        JOptionPane.showMessageDialog(null,prod);
    }
}