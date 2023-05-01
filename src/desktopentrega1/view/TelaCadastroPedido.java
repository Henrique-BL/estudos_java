package desktopentrega1.view;

import desktopentrega1.controller.ControllerArquivoBinarioCliente;
import desktopentrega1.controller.ControllerArquivoBinarioPedido;
import desktopentrega1.controller.ControllerArquivoBinarioProduto;
import desktopentrega1.controller.ControllerArquivoTextoCliente;
import desktopentrega1.controller.ControllerArquivoTextoPedido;
import desktopentrega1.controller.ControllerArquivoTextoProduto;
import desktopentrega1.model.Pedido;

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique RA 2312808
 */
public class TelaCadastroPedido extends javax.swing.JFrame {

    Pedido pedido;
    ControllerArquivoTextoPedido controllerText;
    ControllerArquivoTextoCliente controllerClienteText;
    ControllerArquivoTextoProduto controllerProdutoText;  
  
    ControllerArquivoBinarioPedido controllerBin;
    ControllerArquivoBinarioCliente controllerClienteBin;
    ControllerArquivoBinarioProduto controllerProdutoBin;
    /**
     * Creates new form telaCadastroPedido
     */
    /*Thread comboListener = new Thread(new Runnable() {
        public void run() {
            while (!(controllerProduto == null && controllerCliente == null)) {
                carregarComboBoxs();
            }
        }
    });*/

    public TelaCadastroPedido() {
        initComponents();
        
        //Define um tempo de espera para que nao haja choque no processo de inicialização da tela
        new Timer(). schedule( 
        new TimerTask() {
            @Override
            public void run() {
                carregarComboBoxs();
            }
        }, 
        1000 
        );
        

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
        jPanel1 = new javax.swing.JPanel();
        jTextFieldTransportadora = new javax.swing.JTextField();
        jLabelTransportadora = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jLabelCliente = new javax.swing.JLabel();
        jLabelProduto = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricaoPedido = new javax.swing.JTextArea();
        jLabelDescricao = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTextFieldTransportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransportadoraActionPerformed(evt);
            }
        });

        jLabelTransportadora.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTransportadora.setText("Transportadora");

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro Pedido");

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });

        jLabelCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelCliente.setText("Cliente");

        jLabelProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelProduto.setText("Produto");

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jTextAreaDescricaoPedido.setColumns(20);
        jTextAreaDescricaoPedido.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricaoPedido);

        jLabelDescricao.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelDescricao.setText("Descrição");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCliente)
                            .addComponent(jLabelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCliente, 0, 194, Short.MAX_VALUE)
                            .addComponent(jComboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabelTransportadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jTextFieldTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProduto)
                        .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTransportadora)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransportadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransportadoraActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            pedido = new Pedido();
            if(controllerBin!=null && controllerClienteBin!=null && controllerProdutoBin!=null){

                pedido.setCodigo(controllerBin.getPedidos().size() + 1);
                pedido.setClienteCPF(controllerClienteBin.getClientes().get(jComboBoxCliente.getSelectedIndex()).getCpf());
                pedido.setCodigoProduto(controllerProdutoBin.getProdutos().get(jComboBoxProduto.getSelectedIndex()).getId());

            }else{
                pedido.setCodigo(controllerText.getPedidos().size() + 1);
                pedido.setClienteCPF(controllerClienteText.getClientes().get(jComboBoxCliente.getSelectedIndex()).getCpf());
                pedido.setCodigoProduto(controllerProdutoText.getProdutos().get(jComboBoxProduto.getSelectedIndex()).getId());
                
            }
            pedido.setDescricao(jTextAreaDescricaoPedido.getText());
            pedido.setTransportadora(jTextFieldTransportadora.getText());
            if(controllerBin!=null){

                controllerBin.setPedido(pedido);
                controllerBin.gravarPedidos();

            }else{
                
                controllerText.setPedido(pedido);
                controllerText.gravarPedido();

            }
            limparCampos();
            
            JOptionPane.showMessageDialog(null, "Pedido feito com sucesso! ",
                     "Pedido", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique os dados e tente novamente",
                         "Alerta", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProdutoActionPerformed
    public void limparCampos() {
        jComboBoxCliente.setSelectedIndex(0);
        jComboBoxProduto.setSelectedIndex(0);
        jTextAreaDescricaoPedido.setText("");
        jTextFieldTransportadora.setText("");

    }
    //Alimenta os ComboBoxs da tela com suas devidas informações
    public void carregarComboBoxs() {
        ArrayList<Object> cNomes = new ArrayList();
        ArrayList<Object> pNomes = new ArrayList();
        if(controllerClienteBin != null && controllerProdutoBin!=null){
            
            controllerClienteBin.getClientes().forEach((n) -> cNomes.add(n.getNome()));
            controllerProdutoBin.getProdutos().forEach((n) -> pNomes.add(n.getNome()));

        }else{
            
            controllerClienteText.getClientes().forEach((n) -> cNomes.add(n.getNome()));
            controllerProdutoText.getProdutos().forEach((n) -> pNomes.add(n.getNome()));

        }
        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(cNomes.toArray(new String[0])));
        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(pNomes.toArray(new String[0])));

    }

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
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPedido().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTransportadora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricaoPedido;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldTransportadora;
    // End of variables declaration//GEN-END:variables
}
