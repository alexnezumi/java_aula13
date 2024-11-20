/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("aprender?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadastro_BTN = new javax.swing.JButton();
        sair_BTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cod2_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nome2_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email2_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tel2_txt = new javax.swing.JTextField();
        consultar_BTN = new javax.swing.JButton();
        alterar_BTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cod3_txt = new javax.swing.JTextField();
        excluir_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setText("NOME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(19, 54, 50, 14);

        tel_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_txtActionPerformed(evt);
            }
        });
        jPanel1.add(tel_txt);
        tel_txt.setBounds(80, 110, 306, 20);

        jLabel2.setText("TELEFONE:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 60, 14);
        jPanel1.add(nome_txt);
        nome_txt.setBounds(79, 51, 306, 20);

        jLabel3.setText("EMAIL:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 82, 50, 14);

        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        jPanel1.add(email_txt);
        email_txt.setBounds(80, 80, 306, 20);

        jLabel4.setText("AGENDA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 20, 50, 14);

        cadastro_BTN.setText("CADASTRAR");
        cadastro_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(cadastro_BTN);
        cadastro_BTN.setBounds(60, 230, 110, 23);

        sair_BTN.setText("SAIR");
        sair_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(sair_BTN);
        sair_BTN.setBounds(240, 230, 80, 23);

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telefone ");
        columnBinding.setColumnClass(Long.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Código:");

        jLabel6.setText("Nome:");

        nome2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome2_txtActionPerformed(evt);
            }
        });

        jLabel7.setText("Email:");

        jLabel8.setText("Telefone:");

        consultar_BTN.setText("Consultar");
        consultar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_BTNActionPerformed(evt);
            }
        });

        alterar_BTN.setText("alterar");
        alterar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cod2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email2_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(nome2_txt)
                    .addComponent(tel2_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultar_BTN)
                    .addComponent(alterar_BTN))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(email2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultra/Alterar", jPanel2);

        jPanel3.setLayout(null);

        jLabel9.setText("codigo");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(174, 55, 46, 14);
        jPanel3.add(cod3_txt);
        cod3_txt.setBounds(159, 75, 70, 20);

        excluir_BTN.setText("excluir");
        excluir_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_BTNActionPerformed(evt);
            }
        });
        jPanel3.add(excluir_BTN);
        excluir_BTN.setBounds(156, 106, 83, 23);

        jTabbedPane1.addTab("Excluir", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tel_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_txtActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void sair_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_BTNActionPerformed
    System.exit(0);
    }//GEN-LAST:event_sair_BTNActionPerformed

    private void cadastro_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_BTNActionPerformed
     Controller.Funcoes_DAO.cadastrar();
    }//GEN-LAST:event_cadastro_BTNActionPerformed

    private void nome2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome2_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome2_txtActionPerformed

    private void consultar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_BTNActionPerformed
    Controller.Funcoes_DAO.consultar();
    }//GEN-LAST:event_consultar_BTNActionPerformed

    private void alterar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_BTNActionPerformed
   Controller.Funcoes_DAO.alterar();
    }//GEN-LAST:event_alterar_BTNActionPerformed

    private void excluir_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_BTNActionPerformed
    
   String x = JOptionPane.showInputDialog(null, "Deseja apagar registro\n1 sim \n2 não");
   int op = Integer.parseInt(x);
   if(op==1){
       Controller.Funcoes_DAO.excluir();
   }else{
   JOptionPane.showMessageDialog(null, "exclusão cancelada!!");
   }
    }//GEN-LAST:event_excluir_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar_BTN;
    private javax.swing.JButton cadastro_BTN;
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    public static javax.swing.JTextField cod2_txt;
    public static javax.swing.JTextField cod3_txt;
    private javax.swing.JButton consultar_BTN;
    public static javax.swing.JTextField email2_txt;
    public static javax.swing.JTextField email_txt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton excluir_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField nome2_txt;
    public static javax.swing.JTextField nome_txt;
    private javax.swing.JButton sair_BTN;
    public static javax.swing.JTextField tel2_txt;
    public static javax.swing.JTextField tel_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
