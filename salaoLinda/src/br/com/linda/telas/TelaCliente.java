/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.linda.telas;
import br.com.linda.dal.ModuloConexao;
import br.com.linda.classes.Cliente;
import br.com.linda.classes.GerenciadorSalao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author mimi
 */
public class TelaCliente extends javax.swing.JFrame {
    Connection conexao=null;
    Statement st=null;
    ResultSet rs=null;
    /**
     * Creates new form CrudCliente
     */
    private void exibirDados()
    {
        try
        { 
            DefaultTableModel tabelaModelo=(DefaultTableModel)tabelaClientes.getModel();
            tabelaModelo.setRowCount(0);
            String sql="select * from tabelaClientes";
            st=conexao.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                String id=String.valueOf(rs.getInt("id"));
                String nome=rs.getString("nome");
                String telefone=rs.getString("telefone");
                String endereco=rs.getString("endereco");
                String pontos=String.valueOf(rs.getInt("pontos"));
                String tabelaCliente[]={id,nome,telefone,endereco,pontos};
                tabelaModelo.addRow(tabelaCliente);                
                //System.out.println(tabelaModelo.getRowCount()); Verificar os numeros de linha, longa histótia quis me matar
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Houve um erro\n "+e);
        }
    }
    
    public TelaCliente() {
        initComponents();
        conexao=ModuloConexao.conectar();
        exibirDados();
        GerenciadorSalao gerenciador = new GerenciadorSalao();
        gerenciador.desSerializacaoArrays();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        telefoneField = new javax.swing.JTextField();
        enderecoField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAdicionarPontos = new javax.swing.JButton();
        btnRemoverPontos = new javax.swing.JButton();
        btnDESTRUIR = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salão Linda Cabeleireiros");
        setResizable(false);

        jlabel1.setText("Nome:");

        jLabel1.setText("Id:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Endereço:");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });

        enderecoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFieldActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Endereço", "Pontos de fidelidade"
            }
        ));
        jScrollPane1.setViewportView(tabelaClientes);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAdicionar.setText("Adicionar Cliente");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar dados");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover Cliente");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionarPontos.setText("Adicionar mais pontos de fidelidade");
        btnAdicionarPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPontosActionPerformed(evt);
            }
        });

        btnRemoverPontos.setText("Remover mais pontos de fidelidade");
        btnRemoverPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPontosActionPerformed(evt);
            }
        });

        btnDESTRUIR.setBackground(java.awt.Color.red);
        btnDESTRUIR.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDESTRUIR.setForeground(java.awt.Color.white);
        btnDESTRUIR.setText("DESTRUIR REGISTRO");
        btnDESTRUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDESTRUIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jlabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnAdicionarPontos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btnAdicionar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAtualizar))
                                        .addComponent(btnRemoverPontos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRemover)
                                .addGap(124, 124, 124))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDESTRUIR)
                        .addGap(100, 100, 100)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel1)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionar)
                            .addComponent(btnAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionarPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoverPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDESTRUIR)
                        .addGap(29, 29, 29))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void enderecoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFieldActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        //AQUI COMEÇA A CONEXAO COM O BD
        try
        {
            String sql="insert into tabelaClientes(id,nome,telefone,endereco) values('"+idField.getText()+"','"+nomeField.getText()+"','"+telefoneField.getText()+"','"+enderecoField.getText()+"')";
            st=conexao.createStatement();
            st.execute(sql);
            exibirDados();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Houve um erro\n "+e);
        }
        //AQUI TERMINA A CONEXAO COM O BD
        int id=java.lang.Integer.parseInt(idField.getText()); //O mlk nao aceitou import, tive que importar diretamente
        String nome=nomeField.getText();
        String telefone=telefoneField.getText();
        String endereco=enderecoField.getText();
        Cliente cliente=new Cliente(nome,endereco,telefone,id);
        //System.out.println(cliente);
        //AQUI É A PARTE QUE COMECEI A MEXER COM A ADIÇÃO DO VETOR QUE RECEBE OBJETOS
        //GerenciadorSalao.gerenciador=new GerenciadorSalao();
        //GerenciadorSalao.gerenciador.adicionarCliente(cliente);
        //for(Cliente c : GerenciadorSalao.gerenciador.getClientes())
        //    System.out.println(c);
        //System.out.println(GerenciadorSalao.gerenciador.getClientes());
        GerenciadorSalao gerenciador = new GerenciadorSalao();
        gerenciador.adicionarCliente(cliente);
        //ArrayList<Cliente> clientes = gerenciador.getClientes();
        //for (int i = 0; i < gerenciador.getClientes().size(); i++)
        //{
        //System.out.println(gerenciador.getClientes());
        //}
        gerenciador.serializacaoArrays();
        gerenciador.desSerializacaoArrays();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        //AQUI COMEÇA A CONEXAO COM O BD
        try
        {
            String sql="update tabelaClientes set nome='"+nomeField.getText()+"',telefone='"+telefoneField.getText()+"',endereco='"+enderecoField.getText()+"' where id='"+idField.getText()+"'";
            st=conexao.createStatement();
            st.execute(sql);
            exibirDados();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Houve um erro\n "+e);
        }
        //AQUI TERMINA A CONEXAO COM O BD
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnAdicionarPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPontosActionPerformed
        // TODO add your handling code here:
        try
        {
            String sql="update tabelaClientes set pontos=pontos+1 where id='"+idField.getText()+"'";
            st=conexao.createStatement();
            st.execute(sql);
            exibirDados();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Houve um erro\n "+e);
        }
    }//GEN-LAST:event_btnAdicionarPontosActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        //AQUI COMEÇA A CONEXAO COM O BD
        try
        {
            String sql="delete from tabelaClientes where id='"+idField.getText()+"'";
            st=conexao.createStatement();
            st.execute(sql);
            exibirDados();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Houve um erro\n "+e);
        }
        //AQUI TERMINA A CONEXAO COM O BD
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnRemoverPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPontosActionPerformed
        // TODO add your handling code here:
        try
        {
            String sql="update tabelaClientes set pontos=pontos-1 where id='"+idField.getText()+"'";
            st=conexao.createStatement();
            st.execute(sql);
            exibirDados();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Houve um erro\n "+e);
        }
    }//GEN-LAST:event_btnRemoverPontosActionPerformed

    private void btnDESTRUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDESTRUIRActionPerformed
        // TODO add your handling code here:
        GerenciadorSalao gerenciador = new GerenciadorSalao();
        gerenciador.destruirRegistro();
        gerenciador.serializacaoArrays();
        gerenciador.desSerializacaoArrays();
    }//GEN-LAST:event_btnDESTRUIRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionarPontos;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDESTRUIR;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnRemoverPontos;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
