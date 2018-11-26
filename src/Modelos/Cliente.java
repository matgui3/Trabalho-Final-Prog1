package Modelos;

/**
 * Classe dos objetos de tipo Cliente.
 * @author Rodrigo e Guilherme
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
        return "C;"+super.toFileString()+";"+this.cpf+";"+this.rg+";"+this.nomeDaMae+";"
                +this.salario+";"+this.sexo+";"+this.localTrabalho+";"+this.nomeEmpresa;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf Guarda o valor na variável cpf.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * @param nomeEmpresa Guarda o valor na variável nomeEmpresa.
     */
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
     * @return retorna o valor do rg.
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
