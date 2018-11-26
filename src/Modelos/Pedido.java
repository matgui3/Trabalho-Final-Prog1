package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo e Guilherme
 */
public class Pedido {
    private ArrayList<ItemPedido> itensPedido;
    private Produto produto;
    
    public Pedido(){
        itensPedido = new ArrayList<ItemPedido>();
    }
    
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
