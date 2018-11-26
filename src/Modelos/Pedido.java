package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe que cria os pedidos.
 * @author Rodrigo e Guilherme
 */
public class Pedido {
    private ArrayList<ItemPedido> itensPedido;
    private Produto produto;
    
    /**
     * Cria o objeto pedido, e inicia a lista de itens do pedido.
     */
    public Pedido(){
        itensPedido = new ArrayList<ItemPedido>();
    }
    
    /**
     * Cadastra o item do pedido na lista de itens do pedido.
     * @param codigo código do produto adicionado.
     * @param qtd quantidade do produto adicionado.
     * @return  retorna se o produto foi ou não adicionado.
     */
    public boolean cadastrarItemPedido(int codigo, int qtd){
        produto = new Produto();
        produto.setCodigo(codigo);
        if(qtd>produto.getQtd()){
           JOptionPane.showMessageDialog(null, "Quantidade desejada maior do que a disponível em estoque. Tente novamente.");
           return false;
        } else {
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
            return true;
        }
    }
}
