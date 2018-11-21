/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class Pedido {
    private ArrayList<ItemPedido> itensPedido;
    Produto produto;
    
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
