package br.com.cruzeiro.ads.brcantina.views;

import br.com.cruzeiro.ads.brcantina.controllers.ContaReceberController;
import br.com.cruzeiro.ads.brcantina.controllers.FormasPagamentoController;
import br.com.cruzeiro.ads.brcantina.controllers.interfaces.IContaReceberController;
import br.com.cruzeiro.ads.brcantina.controllers.interfaces.IFormasPagamentoController;
import br.com.cruzeiro.ads.brcantina.models.ContaReceber;
import br.com.cruzeiro.ads.brcantina.models.FormasPagamento;
import java.util.*;

/**
 *
 * @author jose.antonio
 */
public class NovaContaReceberJFrame extends javax.swing.JDialog {

    
    private IFormasPagamentoController mFormasPagamentoController;
    private IContaReceberController mContaReceberController;
    
    /**
     * Creates new form NovaContaReceberJFrame
     */
    public NovaContaReceberJFrame() {
        this.setModal(true);
        //this.setModal(true);
        initComponents();
        
       // Calendar c = Calendar.getInstance();
       // SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        
        datePickerDataCredito.setFormats("dd-MM-yyyy");
        datePickerDataPagamento.setFormats("dd-MM-yyyy");

        initControllers();
    }

    private void initControllers() {
        this.mFormasPagamentoController = new FormasPagamentoController();
        this.mContaReceberController = new ContaReceberController();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneInformacoes = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        lblFormaPagamento = new javax.swing.JLabel();
        lblDataPagemento = new javax.swing.JLabel();
        lblTaxa = new javax.swing.JLabel();
        lblDataCredito = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblObservacao = new javax.swing.JLabel();
        scrollObservacao = new javax.swing.JScrollPane();
        txtArObservacao = new javax.swing.JTextArea();
        txtTaxa = new javax.swing.JTextField();
        datePickerDataCredito = new org.jdesktop.swingx.JXDatePicker();
        comboFormaPagamento = new javax.swing.JComboBox<>();
        datePickerDataPagamento = new org.jdesktop.swingx.JXDatePicker();
        comboTipo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conta a Receber");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        paneInformacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTipo.setText("Tipo:");

        lblFormaPagamento.setText("Forma Pagamento:");

        lblDataPagemento.setText("Data do Pagamento:");

        lblTaxa.setText("% Taxa:");

        lblDataCredito.setText("Data do Crédito:");

        lblValor.setText("Valor:");

        lblObservacao.setText("Observações:");

        txtArObservacao.setColumns(20);
        txtArObservacao.setRows(5);
        scrollObservacao.setViewportView(txtArObservacao);

        txtTaxa.setText("0,0");

        comboFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        datePickerDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerDataPagamentoActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Outras Receitas" }));
        comboTipo.setEnabled(false);

        javax.swing.GroupLayout paneInformacoesLayout = new javax.swing.GroupLayout(paneInformacoes);
        paneInformacoes.setLayout(paneInformacoesLayout);
        paneInformacoesLayout.setHorizontalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneInformacoesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollObservacao))
                    .addGroup(paneInformacoesLayout.createSequentialGroup()
                        .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataPagemento)
                            .addComponent(lblFormaPagamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTaxa, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTaxa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboFormaPagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePickerDataPagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInformacoesLayout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInformacoesLayout.createSequentialGroup()
                                .addComponent(lblDataCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datePickerDataCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        paneInformacoesLayout.setVerticalGroup(
            paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInformacoesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormaPagamento)
                    .addComponent(comboFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataPagemento)
                    .addComponent(datePickerDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaxa)
                    .addComponent(lblDataCredito)
                    .addComponent(datePickerDataCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(paneInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addComponent(paneInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void datePickerDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerDataPagamentoActionPerformed

    }//GEN-LAST:event_datePickerDataPagamentoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened



        updateListFormasPagamento();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ContaReceber c = new ContaReceber();
        c.setDataCredito(datePickerDataCredito.getDate());
        c.setFormaPagamento(new FormasPagamento(Objects.requireNonNull(comboFormaPagamento.getSelectedItem()).toString()));
        c.setObservacao(txtArObservacao.getText());
        c.setTipoConta(Objects.requireNonNull(comboTipo.getSelectedItem()).toString());
        c.setValor(Double.parseDouble(txtValor.getText()));

        this.mContaReceberController.insertAndUpdate(c);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void updateListFormasPagamento() {
        new Thread() {
            @Override
            public void run() {
                comboFormaPagamento.removeAllItems();

                List<FormasPagamento> all = mFormasPagamentoController.all();

                String[] toStringDescription = new String[all.size()];

                for (int i =0; i < all.size(); i++) {
                    toStringDescription[i] = all.get(i).getDescricao();
                }
                comboFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(toStringDescription));
            }
        }.start();
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
            java.util.logging.Logger.getLogger(NovaContaReceberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaContaReceberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaContaReceberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaContaReceberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaContaReceberJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboFormaPagamento;
    private javax.swing.JComboBox<String> comboTipo;
    private org.jdesktop.swingx.JXDatePicker datePickerDataCredito;
    private org.jdesktop.swingx.JXDatePicker datePickerDataPagamento;
    private javax.swing.JLabel lblDataCredito;
    private javax.swing.JLabel lblDataPagemento;
    private javax.swing.JLabel lblFormaPagamento;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblTaxa;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel paneInformacoes;
    private javax.swing.JScrollPane scrollObservacao;
    private javax.swing.JTextArea txtArObservacao;
    private javax.swing.JTextField txtTaxa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
