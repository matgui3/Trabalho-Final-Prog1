/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Loja {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ArrayList<Produto> produtos;
    private ArrayList<Pessoa> pessoas;

    public Loja() {
        this.produtos = new ArrayList<Produto>();
        this.pessoas = new ArrayList<Pessoa>();
        lerPessoasArquivo();
        lerProdutosArquivo();
    }

    public void addProdutos(Produto prod) {
        this.produtos.add(prod);
    }

    public void cadastrarProdutos() throws IOException {
        gravarProdutoArquivo();
        gravarPessoasArquivo();
    }

    public void gravarProdutoArquivo() throws IOException {
        File arq = new File("C:/Users/guilh/Documents/GitKraken/Trabalho-Final-Prog1/produtos.txt");
        try {
            FileWriter gravadorArq = new FileWriter(arq);
            BufferedWriter gravadorTexto = new BufferedWriter(gravadorArq);

            for (Produto prod : produtos) {
                gravadorTexto.write(prod.toFileString());
                gravadorTexto.newLine();
            }
            gravadorTexto.close();
            gravadorArq.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Impossível encontrar o arquivo de produtos.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar no arquivo de produtos. Tente novamente.");
        }
    }

    public void lerProdutosArquivo() {
        File arq = new File("C:/Users/guilh/Documents/GitKraken/Trabalho-Final-Prog1/produtos.txt");
        try {
            FileReader leitorArq = new FileReader(arq);
            BufferedReader leitorTexto = new BufferedReader(leitorArq);

            String linha = leitorTexto.readLine();

            while (linha != null) {

                String[] valores = linha.split(";");
                //ler String como Char
                String descricao = valores[0];
                float precoCompra = Float.parseFloat(valores[1]);
                int qtd = Integer.parseInt(valores[2]);
                int codigo = Integer.parseInt(valores[3]);

                Produto prod = new Produto();

                prod.setDescricao(descricao);
                prod.setPrecoCompra(precoCompra);
                prod.setQtd(qtd);
                prod.setCodigo(codigo);
                this.produtos.add(prod);

                linha = leitorTexto.readLine();
            }
            leitorTexto.close();
            leitorArq.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo de produtos não encontrado. Tente novamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Impossível ler os produtos do arquivo. Tente novamente.");
        }

    }

    public void lerPessoasArquivo() {
        File arq = new File("C:/Users/guilh/Documents/GitKraken/Trabalho-Final-Prog1/ArquivoPessoasJava.txt");
        try {
            FileReader leitorArq = new FileReader(arq);
            BufferedReader leitorTexto = new BufferedReader(leitorArq);

            String linha = leitorTexto.readLine();

            while (linha != null) {

                String[] valores = linha.split(";");
                //ler String como Char
                char tipo = valores[0].charAt(0);
                String nome = valores[1];
                String endereco = valores[2];
                String telefone = valores[3];
                String email = valores[4];
                int codigo = Integer.parseInt(valores[5]);

                if (tipo == 'C') {
                    String cpf = valores[6];
                    String rg = valores[7];
                    String nomeDaMae = valores[8];
                    float salario = Float.parseFloat(valores[9]);

                    Cliente cliente = new Cliente();

                    cliente.setNome(nome);
                    cliente.setEndereco(endereco);
                    cliente.setTelefone(telefone);
                    cliente.setEmail(email);
                    cliente.setCodigo(codigo);
                    cliente.setCpf(cpf);
                    cliente.setRg(rg);
                    cliente.setNomeDaMae(nomeDaMae);
                    cliente.setSalario(salario);

                    this.pessoas.add(cliente);
                } else {
                    String cnpj = valores[6];

                    Fornecedor forn = new Fornecedor();

                    forn.setNome(nome);
                    forn.setEndereco(endereco);
                    forn.setTelefone(telefone);
                    forn.setEmail(email);
                    forn.setCodigo(codigo);
                    forn.setCnpj(cnpj);

                    this.pessoas.add(forn);
                }
                linha = leitorTexto.readLine();
            }
            leitorTexto.close();
            leitorArq.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado. Tente novamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível ler os dados do arquivo. Tente novamente.");
        }

    }

    public void gravarPessoasArquivo() {
        File arq = new File("C:/Users/guilh/Documents/GitKraken/Trabalho-Final-Prog1/ArquivoPessoasJava.txt");
        try {
            FileWriter gravadorArq = new FileWriter(arq);
            BufferedWriter gravadorTexto = new BufferedWriter(gravadorArq);

            for (Pessoa prod : pessoas) {
                gravadorTexto.write(prod.toFileString());
                gravadorTexto.newLine();
            }
            gravadorTexto.close();
            gravadorArq.close();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso.");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado. Tente novamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar no arquivo. Tente novamente.");
        }
    }

    public void gravarPessoasArquivo(Cliente cliente) {
        File arq = new File("C:/Users/guilh/Documents/GitKraken/Trabalho-Final-Prog1/ArquivoPessoasJava.txt");
        this.pessoas.add(cliente);
        try {
            FileWriter gravadorArq = new FileWriter(arq);
            BufferedWriter gravadorTexto = new BufferedWriter(gravadorArq);

            for (Pessoa pes : pessoas) {
                gravadorTexto.write(pes.toFileString());
                gravadorTexto.newLine();
            }
            gravadorTexto.close();
            gravadorArq.close();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso.");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado. Tente novamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar no arquivo. Tente novamente.");
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
