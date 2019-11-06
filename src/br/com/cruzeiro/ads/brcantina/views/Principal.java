/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.views;

import br.com.cruzeiro.ads.brcantina.controllers.UserController;
import br.com.cruzeiro.ads.brcantina.dao.UsuarioDAO;
import br.com.cruzeiro.ads.brcantina.dao.interfaces.IUsuarioDAO;
import br.com.cruzeiro.ads.brcantina.utils.InternalFrameUtils;
import br.com.cruzeiro.ads.brcantina.views.internalframe.CaixaInterFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.CategoriaProdutoInterFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.ClientesIternFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.ColaboradoresIternFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.ContasPagarInterFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.ContasReceberInterFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.FornecedoresInterFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.HistoricoPedidosInterFrame;
import br.com.cruzeiro.ads.brcantina.views.internalframe.ProdutosInterFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Principal extends javax.swing.JFrame {

    static Logger log = Logger.getLogger(
                      Principal.class.getName());
    
    private ColaboradoresIternFrame mColaboradoresIternFrame;
    private ClientesIternFrame mClientesIternFrame;
    private ProdutosInterFrame mProdutosInterFrame;
    private HistoricoPedidosInterFrame mHistoricoPedidosInterFrame;
    private CaixaInterFrame mCaixaInterFrame;
    private CategoriaProdutoInterFrame mCategoriaProdutoInterFrame;
    private FornecedoresInterFrame mFornecedoresInterFrame;
    private ContasPagarInterFrame mContasPagarInterFrame;
    private ContasReceberInterFrame mContasReceberInterFrame;
    
    
    /*CONTROLLERS*/
    private UserController mUserController;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        log.info("Init View Principal");
        initComponents();
        initObjetos();
        initControllers();
    }
    
    private void initObjetos() {
        mColaboradoresIternFrame = new ColaboradoresIternFrame();
        mClientesIternFrame = new ClientesIternFrame();
        mProdutosInterFrame = new ProdutosInterFrame();
        mHistoricoPedidosInterFrame = new HistoricoPedidosInterFrame();
        mCaixaInterFrame = new CaixaInterFrame();
        mCategoriaProdutoInterFrame = new CategoriaProdutoInterFrame();
        mFornecedoresInterFrame = new FornecedoresInterFrame();
        mContasPagarInterFrame = new ContasPagarInterFrame();
        mContasReceberInterFrame = new ContasReceberInterFrame();
    }
    
    private void initControllers() {
        this.mUserController = new UserController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        dkpContainer = new javax.swing.JDesktopPane();
        menuOptions = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        menuItemAbrirFecharCaixa = new javax.swing.JMenuItem();
        menuItemPedidoCaixa = new javax.swing.JMenuItem();
        menuItemClientes = new javax.swing.JMenuItem();
        menuItemHistoricoPedidos = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuItemProdutos = new javax.swing.JMenuItem();
        menuItemCategorias = new javax.swing.JMenuItem();
        menuItemHistoricoEntradaSaida = new javax.swing.JMenuItem();
        menuItemHistoricoItensVendidos = new javax.swing.JMenuItem();
        menuFornecedores = new javax.swing.JMenu();
        menuItemFornecedores = new javax.swing.JMenuItem();
        menuItemContaPagar = new javax.swing.JMenuItem();
        menuItemContaReceber = new javax.swing.JMenuItem();
        menuItemFormaPagamento = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        menuItemConfigSistema = new javax.swing.JMenuItem();
        menuItemColaoradores = new javax.swing.JMenuItem();
        menuItemAltararSenha = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout dkpContainerLayout = new javax.swing.GroupLayout(dkpContainer);
        dkpContainer.setLayout(dkpContainerLayout);
        dkpContainerLayout.setHorizontalGroup(
            dkpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        dkpContainerLayout.setVerticalGroup(
            dkpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        menuPrincipal.setText("Principal");

        menuItemAbrirFecharCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAbrirFecharCaixa.setText("Abrir/Fechar Meu Caixa");
        menuItemAbrirFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirFecharCaixaActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuItemAbrirFecharCaixa);

        menuItemPedidoCaixa.setText("Pedido no Caixa");
        menuItemPedidoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPedidoCaixaActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuItemPedidoCaixa);

        menuItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuItemClientes);

        menuItemHistoricoPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemHistoricoPedidos.setText("Histórico de Pedidos");
        menuItemHistoricoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistoricoPedidosActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuItemHistoricoPedidos);

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuItemSair);

        menuOptions.add(menuPrincipal);

        menuProdutos.setText("Produtos");

        menuItemProdutos.setText("Produtos");
        menuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuItemProdutos);

        menuItemCategorias.setText("Categorias");
        menuItemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCategoriasActionPerformed(evt);
            }
        });
        menuProdutos.add(menuItemCategorias);

        menuItemHistoricoEntradaSaida.setText("Histórico de Entrada e Saídas");
        menuProdutos.add(menuItemHistoricoEntradaSaida);

        menuItemHistoricoItensVendidos.setText("Histórico de Itens Vendidos");
        menuProdutos.add(menuItemHistoricoItensVendidos);

        menuOptions.add(menuProdutos);

        menuFornecedores.setText("Financeiro");

        menuItemFornecedores.setText("Fornecedores");
        menuItemFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFornecedoresActionPerformed(evt);
            }
        });
        menuFornecedores.add(menuItemFornecedores);

        menuItemContaPagar.setText("Contas a Pagar");
        menuItemContaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContaPagarActionPerformed(evt);
            }
        });
        menuFornecedores.add(menuItemContaPagar);

        menuItemContaReceber.setText("Contas a Receber");
        menuItemContaReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContaReceberActionPerformed(evt);
            }
        });
        menuFornecedores.add(menuItemContaReceber);

        menuItemFormaPagamento.setText("Forma de Pagamento");
        menuFornecedores.add(menuItemFormaPagamento);

        menuOptions.add(menuFornecedores);

        menuConfiguracoes.setText("Configurações");

        menuItemConfigSistema.setText("Configurações do Sistema");
        menuItemConfigSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConfigSistemaActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuItemConfigSistema);

        menuItemColaoradores.setText("Colaboradores");
        menuItemColaoradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemColaoradoresActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuItemColaoradores);

        menuItemAltararSenha.setText("Alterar Minha Senha");
        menuItemAltararSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAltararSenhaActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuItemAltararSenha);

        menuOptions.add(menuConfiguracoes);

        menuSobre.setText("Sobre");
        menuOptions.add(menuSobre);

        setJMenuBar(menuOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpContainer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpContainer)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAbrirFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirFecharCaixaActionPerformed
        InternalFrameUtils.init(mCaixaInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemAbrirFecharCaixaActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemColaoradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemColaoradoresActionPerformed
        InternalFrameUtils.init(mColaboradoresIternFrame, dkpContainer);
    }//GEN-LAST:event_menuItemColaoradoresActionPerformed

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        InternalFrameUtils.init(mClientesIternFrame, dkpContainer);
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutosActionPerformed
        InternalFrameUtils.init(mProdutosInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemProdutosActionPerformed

    private void menuItemHistoricoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHistoricoPedidosActionPerformed
        InternalFrameUtils.init(mHistoricoPedidosInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemHistoricoPedidosActionPerformed

    private void menuItemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCategoriasActionPerformed
        InternalFrameUtils.init(mCategoriaProdutoInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemCategoriasActionPerformed

    private void menuItemFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFornecedoresActionPerformed
        InternalFrameUtils.init(mFornecedoresInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemFornecedoresActionPerformed

    private void menuItemContaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContaPagarActionPerformed
        InternalFrameUtils.init(mContasPagarInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemContaPagarActionPerformed

    private void menuItemContaReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContaReceberActionPerformed
        InternalFrameUtils.init(mContasReceberInterFrame, dkpContainer);
    }//GEN-LAST:event_menuItemContaReceberActionPerformed

    private void menuItemAltararSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAltararSenhaActionPerformed
        AlterarSenhaJFrame alterarSenhaJFrame = new AlterarSenhaJFrame();
        alterarSenhaJFrame.setVisible(true);
        alterarSenhaJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuItemAltararSenhaActionPerformed

    private void menuItemPedidoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPedidoCaixaActionPerformed
        PedidoCaixaJFrame pedidoCaixaJFrame = new PedidoCaixaJFrame();
        pedidoCaixaJFrame.setVisible(true);
        pedidoCaixaJFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuItemPedidoCaixaActionPerformed

    private void menuItemConfigSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConfigSistemaActionPerformed
        try {
            IUsuarioDAO usuario = new UsuarioDAO();
            System.err.println(usuario.isFirstUserCreate());
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemConfigSistemaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(this.mUserController.primeiroAdm()){
            JOptionPane.showMessageDialog(rootPane, "Você precisa cadastrar um usuário administrador para conseguir acessar o sistema");
            NovoColaboradorJFrame colaboradorJFrame = new NovoColaboradorJFrame();
            colaboradorJFrame.setVisible(true);
            colaboradorJFrame.setLocationRelativeTo(this);
            colaboradorJFrame.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {}
                @Override
                public void windowClosing(WindowEvent e) {}
                
                @Override
                public void windowClosed(WindowEvent e) {
                    log.info("Primeiro usuário administrador não cadastrado");
                    System.exit(0);
                }

                @Override
                public void windowIconified(WindowEvent e) {}
                @Override
                public void windowDeiconified(WindowEvent e) {}
                @Override
                public void windowActivated(WindowEvent e) {}
                @Override
                public void windowDeactivated(WindowEvent e) {}
            });
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpContainer;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenu menuFornecedores;
    private javax.swing.JMenuItem menuItemAbrirFecharCaixa;
    private javax.swing.JMenuItem menuItemAltararSenha;
    private javax.swing.JMenuItem menuItemCategorias;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemColaoradores;
    private javax.swing.JMenuItem menuItemConfigSistema;
    private javax.swing.JMenuItem menuItemContaPagar;
    private javax.swing.JMenuItem menuItemContaReceber;
    private javax.swing.JMenuItem menuItemFormaPagamento;
    private javax.swing.JMenuItem menuItemFornecedores;
    private javax.swing.JMenuItem menuItemHistoricoEntradaSaida;
    private javax.swing.JMenuItem menuItemHistoricoItensVendidos;
    private javax.swing.JMenuItem menuItemHistoricoPedidos;
    private javax.swing.JMenuItem menuItemPedidoCaixa;
    private javax.swing.JMenuItem menuItemProdutos;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuBar menuOptions;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
