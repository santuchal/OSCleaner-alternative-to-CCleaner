/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcleaner;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.Toolkit;
import java.lang.management.ManagementFactory;
import javax.swing.UIManager;
=======
import javax.swing.UIManager;
import java.lang.management.ManagementFactory;
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
/**
 *
 * @author pc1
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
<<<<<<< HEAD
        setIcon();
=======
        
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8

/**
 *
 * @author pc 5
 */
<<<<<<< HEAD
  
=======
   
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
  String nameOS; 
  String usernameOS = "user.name";
  String versionOS = "os.version";  
  String architectureOS = "os.arch";
  String cpu_list="sun.cpu.isalist";
  String compiler="sun.management.compiler";

  System.out.println("\nName of the OS: " + System.getProperty("os.name"));
  System.out.println("Name of the User: " + System.getProperty(usernameOS));
  System.out.println("Version of the OS: " +  System.getProperty(versionOS));
  System.out.println("Cpu list"+System.getProperty(cpu_list));
  System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
  System.out.println("Architecture of The OS: " + System.getProperty(architectureOS));
  System.out.println("Processor Architecture 32 or 64"+System.getenv("NUMBER_OF_PROCESSORS"));
  long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
  System.out.println("RAM Size="+memorySize+" Bytes");
  System.out.println("Compiler"+System.getenv("cpu_list"));
  
  String mem = String.valueOf(memorySize);
  
<<<<<<< HEAD
  jLabel3.setText("Operating System: "+System.getProperty("os.name"));
  jLabel4.setText("System Type: "+System.getProperty(architectureOS));
  jLabel5.setText("System User Name: "+ System.getProperty(usernameOS));
  jLabel6.setText("RAM Size: "+memorySize+" Bytes");
=======
  jLabel3.setText(System.getProperty("os.name"));
  jLabel4.setText(System.getProperty(architectureOS));
  jLabel5.setText(System.getProperty(cpu_list));
  jLabel6.setText(mem+" bytes");
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
  
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
<<<<<<< HEAD
        setTitle("OS Cleaner");
=======
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon256-2x.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("OS CLEANER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("v1.0.1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(23, 29, 23, 29);
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bcleaner.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(23, 0, 23, 0);
        jPanel1.add(jButton2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        ext_1 agc=new ext_1();
       
        jPanel3.removeAll();
            
        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(agc);
        agc.setVisible(true);
       
        jPanel3.revalidate();
        jPanel3.setVisible(true);
        jButton1.setSelected(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
        ext_2 agc1=new ext_2();
       

        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(agc1);
        agc1.setVisible(true);
       
        jPanel3.revalidate();
        jPanel3.setVisible(true);
        jButton2.setSelected(true);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
             UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
<<<<<<< HEAD

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
=======
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
}
