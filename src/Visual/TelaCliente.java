package Visual;


import Modelos.Cliente;
import Modelos.Loja;
import Modelos.Pessoa;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Tela de cadastro de clientes.
 * @author Rodrigo e Guilherme
 */
public class TelaCliente extends javax.swing.JInternalFrame {
    
    Loja loja;

    /**
     * Cria a tela de cadastro de clientes.
     */
    public TelaCliente(Loja loja) {
        initComponents();
        this.loja = loja;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoesSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        btSalvarCliente = new javax.swing.JButton();
        btSairCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfEmailCliente = new javax.swing.JTextField();
        tfEndCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfNomeMaeCliente = new javax.swing.JTextField();
        tfRgCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rbSexoM = new javax.swing.JCheckBox();
        rbSexoF = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        tfNaturalidadeCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfCpfCliente = new javax.swing.JFormattedTextField();
        tfNascimentoCliente = new javax.swing.JFormattedTextField();
        tfLocalTrabCliente = new javax.swing.JTextField();
        tfEmpresaCliente = new javax.swing.JTextField();
        tfCodigoCliente = new javax.swing.JFormattedTextField();
        tfTelefoneCliente = new javax.swing.JFormattedTextField();
        tfRendaCliente = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Cliente"));
        setClosable(true);
        setMaximizable(true);
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Cliente"));
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Nome:");

        tfNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeClienteActionPerformed(evt);
            }
        });

        btSalvarCliente.setText("Salvar");
        btSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarClienteActionPerformed(evt);
            }
        });

        btSairCliente.setText("Sair");
        btSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("E-mail:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Código:");

        tfEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailClienteActionPerformed(evt);
            }
        });

        tfEndCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEndClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        tfNomeMaeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeMaeClienteActionPerformed(evt);
            }
        });

        tfRgCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRgClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("RG:");

        jLabel8.setText("Nome da Mãe:");

        jLabel9.setText("Local de trabalho:");

        jLabel11.setText("Nome da empresa:");

        jLabel12.setText("Renda mensal:");

        jLabel13.setText("Sexo:");

        botoesSexo.add(rbSexoM);
        rbSexoM.setText("M");

        botoesSexo.add(rbSexoF);
        rbSexoF.setText("F");

        jLabel14.setText("Naturalidade:");

        jLabel15.setText("Data de Nascimento:");

        try {
            tfCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfClienteActionPerformed(evt);
            }
        });

        try {
            tfNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNascimentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNascimentoClienteActionPerformed(evt);
            }
        });

        tfLocalTrabCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLocalTrabClienteActionPerformed(evt);
            }
        });

        tfEmpresaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmpresaClienteActionPerformed(evt);
            }
        });

        tfCodigoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        tfCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoClienteActionPerformed(evt);
            }
        });

        try {
            tfTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfRendaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRendaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfRgCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(tfNomeMaeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(tfCpfCliente)
                                .addComponent(tfLocalTrabCliente)
                                .addComponent(tfTelefoneCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNascimentoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbSexoM)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbSexoF))
                                        .addComponent(tfNaturalidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmpresaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRendaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(309, 309, 309)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btSalvarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 571, Short.MAX_VALUE)
                        .addComponent(btSairCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(rbSexoM)
                    .addComponent(rbSexoF))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(tfNaturalidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15)
                    .addComponent(tfNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeMaeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfLocalTrabCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmpresaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfRendaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarCliente)
                    .addComponent(btSairCliente))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeClienteActionPerformed

    /**
     * Salva o cliente adicionando-o no arquivo de clientes.
     * @param evt 
     */
    private void btSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarClienteActionPerformed
        //Guardando os dados dos clientes nas variáveis.
        String nome = tfNomeCliente.getText();
        char sexo;
        if(rbSexoM.isSelected()){
            sexo = 'M';
        } else {
            sexo = 'F';
        }
        String email = tfEmailCliente.getText();
        String telefone = tfTelefoneCliente.getText();
        String endereco = tfEndCliente.getText();
        String dataNascimento = tfNascimentoCliente.getText();
        String cpf = tfCpfCliente.getText();
        String rg = tfRgCliente.getText();
        String nomeDaMae = tfNomeMaeCliente.getText();
        String localTrabalho = tfLocalTrabCliente.getText();
        String nomeEmpresa = tfEmpresaCliente.getText();
        int codigo = Integer.parseInt(tfCodigoCliente.getText());
        double salario = Double.parseDouble(tfRendaCliente.getText());
        
        //Criando o objeto pessoa e settando os valores.
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setNome(nome);
        cliente.setNomeDaMae(nomeDaMae);
        cliente.setLocalTrabalho(localTrabalho);
        cliente.setRg(rg);
        cliente.setSexo(sexo);
        cliente.setTelefone(nome);
        cliente.setSalario(salario);
        cliente.setNomeEmpresa(nomeEmpresa);
        
        loja.addPessoa(cliente);
        loja.gravarPessoasArquivo();
        limparCampos();
    }//GEN-LAST:event_btSalvarClienteActionPerformed

    private void btSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairClienteActionPerformed

    private void tfEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailClienteActionPerformed

    private void tfEndClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEndClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEndClienteActionPerformed

    private void tfNomeMaeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeMaeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeMaeClienteActionPerformed

    private void tfRgClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRgClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRgClienteActionPerformed

    private void tfCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfClienteActionPerformed

    private void tfNascimentoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNascimentoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNascimentoClienteActionPerformed

    private void tfLocalTrabClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLocalTrabClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLocalTrabClienteActionPerformed

    private void tfEmpresaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmpresaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmpresaClienteActionPerformed

    private void tfCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoClienteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void tfRendaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRendaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRendaClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botoesSexo;
    private javax.swing.JButton btSairCliente;
    private javax.swing.JButton btSalvarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox rbSexoF;
    private javax.swing.JCheckBox rbSexoM;
    private javax.swing.JFormattedTextField tfCodigoCliente;
    private javax.swing.JFormattedTextField tfCpfCliente;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfEmpresaCliente;
    private javax.swing.JTextField tfEndCliente;
    private javax.swing.JTextField tfLocalTrabCliente;
    private javax.swing.JFormattedTextField tfNascimentoCliente;
    private javax.swing.JTextField tfNaturalidadeCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfNomeMaeCliente;
    private javax.swing.JTextField tfRendaCliente;
    private javax.swing.JTextField tfRgCliente;
    private javax.swing.JFormattedTextField tfTelefoneCliente;
    // End of variables declaration//GEN-END:variables

    void setPosicao() {
        //seta a posição cetral ao abrir uma janela
       Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height)/ 2);
    }

    /**
     * Limpa os campos do projeto.
     */
    private void limparCampos() {
        tfCodigoCliente.setText(null);
        tfCpfCliente.setText(null);
        tfEmailCliente.setText(null);
        tfEmpresaCliente.setText(null);
        tfEndCliente.setText(null);
        tfLocalTrabCliente.setText(null);
        tfNascimentoCliente.setText(null);
        tfNaturalidadeCliente.setText(null);
        tfNomeCliente.setText(null);
        tfRendaCliente.setText(null);
        tfRgCliente.setText(null);
        tfTelefoneCliente.setText(null);
        rbSexoF.setSelected(false);
        rbSexoM.setSelected(false);
        tfNomeMaeCliente.setText(null);
    }
}
