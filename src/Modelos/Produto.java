package Modelos;

/**
 * Classe que cria os produtos do projeto.
 * @author Rodrigo e Guilherme
 */
public class Produto {
    private String descricao;
    private float precoCompra;
    private float precoVenda;
    private int qtd;
    private int codigo;

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }
    
    public void setPrecoVenda(float precoVenda){
        this.precoVenda = precoVenda;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the precoCompra
     */
    public float getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toFileString() {
        return this.descricao+";"+this.precoCompra+";"+this.qtd+";"+this.codigo+";"+this.precoVenda;
    }
    
}
