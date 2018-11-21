/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Rodrigo
 */
public class Fornecedor extends Pessoa {
    
    private String cnpj;
    
        @Override
    public String fileToString() {
        return "F;"+super.fileToString()+";"+this.cnpj;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
