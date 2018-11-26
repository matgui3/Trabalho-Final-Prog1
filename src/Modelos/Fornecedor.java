package Modelos;

/**
 *
 * @author Rodrigo e Guilherme
 */
public class Fornecedor extends Pessoa {

    private String cnpj;

    @Override
    public String toFileString() {
        return "F;" + super.toFileString() + ";" + this.cnpj;
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
