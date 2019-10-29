package ui;

import java.awt.Frame;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;


public class ItemVistoriaJDialog extends javax.swing.JDialog {

    public ItemVistoriaJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePilotos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtEquipeID1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEquipeNome1 = new javax.swing.JTextField();
        btnBuscaEquipe1 = new javax.swing.JButton();
        txtEquipeID2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEquipeNome2 = new javax.swing.JTextField();
        btnBuscaEquipe2 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ITEM VISTORIA");
        setBounds(new java.awt.Rectangle(0, 15, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTablePilotos.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        JTablePilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Vistoria", "Item", "Obs."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablePilotos);
        if (JTablePilotos.getColumnModel().getColumnCount() > 0) {
            JTablePilotos.getColumnModel().getColumn(0).setResizable(false);
            JTablePilotos.getColumnModel().getColumn(1).setResizable(false);
            JTablePilotos.getColumnModel().getColumn(2).setResizable(false);
            JTablePilotos.getColumnModel().getColumn(3).setResizable(false);
            JTablePilotos.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 215));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), "REGISTRO ITEM VISTORIA"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setToolTipText("");
        txtID.setEnabled(false);
        txtID.setName("txtID"); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        jLabel1.setText("Observação:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 20));

        jLabel4.setText("ID:");
        jLabel4.setAlignmentX(1.0F);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 70, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 750, -1));

        txtEquipeID1.setEnabled(false);
        txtEquipeID1.setName("nome"); // NOI18N
        jPanel1.add(txtEquipeID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        jLabel5.setText("Vistoria:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 20));

        txtEquipeNome1.setEnabled(false);
        txtEquipeNome1.setName("nome"); // NOI18N
        jPanel1.add(txtEquipeNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 330, -1));

        btnBuscaEquipe1.setText("...");
        btnBuscaEquipe1.setEnabled(false);
        btnBuscaEquipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaEquipe1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscaEquipe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 50, -1));

        txtEquipeID2.setEnabled(false);
        txtEquipeID2.setName("nome"); // NOI18N
        jPanel1.add(txtEquipeID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        jLabel6.setText("Item:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        txtEquipeNome2.setEnabled(false);
        txtEquipeNome2.setName("nome"); // NOI18N
        jPanel1.add(txtEquipeNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 330, -1));

        btnBuscaEquipe2.setText("...");
        btnBuscaEquipe2.setEnabled(false);
        btnBuscaEquipe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaEquipe2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscaEquipe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 780, 300));
        jPanel1.getAccessibleContext().setAccessibleName(" REGISTRO DE FUNCIONÁRIO");

        btnFechar.setText("Fechar");
        btnFechar.setActionCommand("btnFechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 100, 30));

        btnNovo.setText("Novo");
        btnNovo.setActionCommand("btnNovo");
        btnNovo.setPreferredSize(new java.awt.Dimension(90, 29));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 100, 30));

        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("btnAlterar");
        btnSalvar.setEnabled(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 100, 30));

        btnRemover.setText("Remover");
        btnRemover.setActionCommand("btnRemover");
        btnRemover.setEnabled(false);
        btnRemover.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 100, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("btnImprimir");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
     
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
   
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
      
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscaEquipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaEquipe1ActionPerformed
    
    }//GEN-LAST:event_btnBuscaEquipe1ActionPerformed

    private void btnBuscaEquipe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaEquipe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaEquipe2ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablePilotos;
    private javax.swing.JButton btnBuscaEquipe1;
    private javax.swing.JButton btnBuscaEquipe2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtEquipeID1;
    private javax.swing.JTextField txtEquipeID2;
    private javax.swing.JTextField txtEquipeNome1;
    private javax.swing.JTextField txtEquipeNome2;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
    
}