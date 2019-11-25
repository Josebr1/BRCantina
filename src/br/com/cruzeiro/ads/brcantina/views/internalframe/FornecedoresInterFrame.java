/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.views.internalframe;

import br.com.cruzeiro.ads.brcantina.controllers.FornecedorController;
import br.com.cruzeiro.ads.brcantina.controllers.interfaces.IFornecedorController;
import br.com.cruzeiro.ads.brcantina.core.JFrameActivity;
import br.com.cruzeiro.ads.brcantina.models.Fornecedor;
import br.com.cruzeiro.ads.brcantina.models.Usuario;
import br.com.cruzeiro.ads.brcantina.models.enums.TipoUsuario;
import br.com.cruzeiro.ads.brcantina.views.NovoFornecedorJFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import org.h2.util.StringUtils;

/**
 *
 * @author jose.antonio
 */
public class FornecedoresInterFrame extends JInternalFrame {

    private IFornecedorController mFornecedorController;
    
    /**
     * Creates new form FornecedoresInterFrame
     */
    public FornecedoresInterFrame() {
        initComponents();
        this.initControllers();
    }

   
    private void initControllers() {
        this.mFornecedorController = new FornecedorController();
    }
    
    
    private void populatorTable() {
        List<Fornecedor> all = this.mFornecedorController.all();

        DefaultTableModel model = new DefaultTableModel(new String [] {
                "Id", "Nome", "Celular", "Documento", "IE ou RG"
        }, 0);


        for (Fornecedor u : all) {
            model.addRow(new Object[]{u.getId(), u.getNome(), u.getCelular(), u.getDocumento(), u.getRg()});
        }

        tableFornecedores.setModel(model);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneHeader = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        scrollPaneFornecedores = new javax.swing.JScrollPane();
        tableFornecedores = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Fornecedores");
        setToolTipText("Fornecedores");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        paneHeader.setBackground(new java.awt.Color(153, 153, 153));

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneHeaderLayout = new javax.swing.GroupLayout(paneHeader);
        paneHeader.setLayout(paneHeaderLayout);
        paneHeaderLayout.setHorizontalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneHeaderLayout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addContainerGap())
        );
        paneHeaderLayout.setVerticalGroup(
            paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFornecedoresMouseClicked(evt);
            }
        });
        scrollPaneFornecedores.setViewportView(tableFornecedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovoFornecedorJFrame fornecedorJFrame = new NovoFornecedorJFrame();
        fornecedorJFrame.setVisible(true);
        fornecedorJFrame.setLocationRelativeTo(this);
        fornecedorJFrame.addWindowListener(new CallbackUpdateTable());
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        populatorTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int column = 0;
        int row = tableFornecedores.getSelectedRow();
        String value = tableFornecedores.getModel().getValueAt(row, column).toString();
        
        if (!StringUtils.isNullOrEmpty(value)) {
            NovoFornecedorJFrame frame = new NovoFornecedorJFrame(Integer.parseInt(value));
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.addWindowListener(new CallbackUpdateTable());
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tableFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFornecedoresMouseClicked
        
        btnEditar.setEnabled(true);
        
    }//GEN-LAST:event_tableFornecedoresMouseClicked


    private class CallbackUpdateTable implements WindowListener {

        @Override
        public void windowOpened(WindowEvent windowEvent) {

        }

        @Override
        public void windowClosing(WindowEvent windowEvent) {

        }

        @Override
        public void windowClosed(WindowEvent windowEvent) {
            populatorTable();
            btnEditar.setEnabled(false);
        }

        @Override
        public void windowIconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeiconified(WindowEvent windowEvent) {

        }

        @Override
        public void windowActivated(WindowEvent windowEvent) {

        }

        @Override
        public void windowDeactivated(WindowEvent windowEvent) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPanel paneHeader;
    private javax.swing.JScrollPane scrollPaneFornecedores;
    private javax.swing.JTable tableFornecedores;
    // End of variables declaration//GEN-END:variables
}
