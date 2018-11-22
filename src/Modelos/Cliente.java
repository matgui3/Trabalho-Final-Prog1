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
public class Cliente extends Pessoa{
    private String cpf;
    private String rg;
    private String nomeDaMae;
    private char sexo;
    private double salario;
    private String localTrabalho;
    private String nomeEmpresa;
    
    @Override
    public String toFileString() {
        return "C;"+super.toFileString()+";"+this.cpf+";"+this.rg+";"+this.nomeDaMae+";"+this.sexo+";"+this.salario+";"+this.localTrabalho+";"+this.nomeEmpresa;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
    /**
     * 
     * @param sexo  sexo do cliente.
     */
    public void setSexo(char sexo){
        this.sexo=sexo;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }
    
    public void setLocalTrabalho(String localTrabalho){
        this.localTrabalho=localTrabalho;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the nomeDaMae
     */
    public String getNomeDaMae() {
        return nomeDaMae;
    }

    /**
     * @param nomeDaMae the nomeDaMae to set
     */
    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
