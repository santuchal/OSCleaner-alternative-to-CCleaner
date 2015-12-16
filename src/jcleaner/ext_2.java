/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcleaner;

import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;
import javax.swing.SwingWorker;

/**
 *
 * @author Test
 */
public class ext_2 extends javax.swing.JPanel implements ActionListener, 
                                        PropertyChangeListener {

    /**
     * Creates new form ext_2
     */
     private Task2 task2;
      private Task3 task3;
      long difference,difference1;
    int val=0;
    
     private String[] browser = new String[11];
     
    private final GridBagConstraints gridBagConstraints;
    
    public ext_2() {
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        
        initComponents();
        
        
        
        jProgressBar_a.setValue(0);
            jProgressBar_a.setStringPainted(true);
            jProgressBar_n.setValue(0);
            jProgressBar_n.setStringPainted(true);
       // jCheckBox9.setVisible(false);
      //  jCheckBox10.setVisible(false);
      //  jCheckBox19.setVisible(false);
      //  jCheckBox20.setVisible(false);
      //  jCheckBox18.setVisible(false);
       // jCheckBox16.setVisible(false);
      //  jCheckBox8.setVisible(false);
      //  jCheckBox6.setVisible(false);
    }

   
 class Task2 extends SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */
        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress1 = 0;
            //Initialize progress property.
            setProgress(0);
             startWaitCursor();
            while (progress1 < 100) {
                //Sleep for up to one second.
                try {
                    Thread.sleep(difference);
                } catch (InterruptedException ignore) {}
                //Make random progress.
                 long lStartTime = new Date().getTime();
                 
                 
        //some tasks
                 
                 
                  for(int i=1; i < 6; i++){
                      
                         if(!browser[i].equals("")){
                     
                            if(browser[i].equals("ie_2")){
            cmd.adv_IE();
          
    
         }
                            
                       
                       if(browser[i].equals("chrome_2")){
            cmd.chrome();
           
              
            }     if(browser[i].equals("mozila_2")){
            cmd.firefox();
           
               
            }   
            
              if(browser[i].equals("safari_2")){
            cmd.safari();
           
               
            }  
                if(browser[i].equals("opera_2")){
            cmd.opera();
           
               
            }   
                         }          
                            
                  }
                   long lEndTime = new Date().getTime();
                   difference = lEndTime - lStartTime;
                progress1 += difference;
                 setProgress(Math.min(progress1, 100));
            }
            stopWaitCursor();
            return null;
        }
 
        /*
         * Executed in event dispatching thread
         */
        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            jButton_n.setEnabled(true);
            setCursor(null); //turn off the wait cursor
            jTextArea1.append("Done!\n");
        }
    }
    
 class Task3 extends SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */
        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress1 = 0;
            //Initialize progress property.
            setProgress(0);
             startWaitCursor();
            while (progress1 < 100) {
                //Sleep for up to one second.
                try {
                    Thread.sleep(difference);
                } catch (InterruptedException ignore) {}
                //Make random progress.
                 long lStartTime = new Date().getTime();
                 
                 
        //some tasks
                 
                 
                  for(int i=6; i < 11; i++){
                     
                      
                      if(!browser[i].equals("")){
                          
                          
                            if(browser[i].equals("ie_1")){
            cmd.adv_IE();
          
    
                          }            
                       
                       if(browser[i].equals("chrome_1")){
            cmd.adv_chrome();
           
              
            }     if(browser[i].equals("mozila_1")){
            cmd.adv_firefox();
           
               
            }      
            
             if(browser[i].equals("safari_1")){
            cmd.adv_safari();
           
               
            }  
              if(browser[i].equals("opera_1")){
            cmd.adv_opera();
           
               
            }      
                            
                      }              
                  }
                   long lEndTime = new Date().getTime();
                   difference = lEndTime - lStartTime;
                progress1 += difference;
                 setProgress(Math.min(progress1, 100));
                 
            }
            stopWaitCursor();
            return null;
        }
 
        /*
         * Executed in event dispatching thread
         */
        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            jButton_a.setEnabled(true);
            setCursor(null); //turn off the wait cursor
            jTextArea2.append("Done!\n");
        }
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        ch_n = new javax.swing.JCheckBox();
        ie_n = new javax.swing.JCheckBox();
        moz_n = new javax.swing.JCheckBox();
        sf_n = new javax.swing.JCheckBox();
        op_n = new javax.swing.JCheckBox();
        jButton_n = new javax.swing.JButton();
        jProgressBar_n = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ch_a = new javax.swing.JCheckBox();
        ie_a = new javax.swing.JCheckBox();
        moz_a = new javax.swing.JCheckBox();
        sf_a = new javax.swing.JCheckBox();
        op_a = new javax.swing.JCheckBox();
        jButton_a = new javax.swing.JButton();
        jProgressBar_a = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(627, 469));

        jPanel1.setMinimumSize(new java.awt.Dimension(627, 469));
        jPanel1.setPreferredSize(new java.awt.Dimension(627, 469));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Browsers"));

        ch_n.setText("Google Chrome");
        ch_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_nActionPerformed(evt);
            }
        });

        ie_n.setText("Internet Explorer");
        ie_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ie_nActionPerformed(evt);
            }
        });

        moz_n.setText("Mozila Firefox");
        moz_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moz_nActionPerformed(evt);
            }
        });

        sf_n.setText("Safari");
        sf_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sf_nActionPerformed(evt);
            }
        });

        op_n.setText("Opera");
        op_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_nActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moz_n)
                            .addComponent(ie_n))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ch_n)
                            .addComponent(sf_n)))
                    .addComponent(op_n))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(moz_n)
                        .addGap(19, 19, 19)
                        .addComponent(ie_n))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ch_n)
                        .addGap(19, 19, 19)
                        .addComponent(sf_n)))
                .addGap(18, 18, 18)
                .addComponent(op_n)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel6, gridBagConstraints);

        jButton_n.setText("Run Cleaner");
        jButton_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 48;
        jPanel1.add(jButton_n, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 307;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(jProgressBar_n, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 347;
        gridBagConstraints.ipady = 107;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel1.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel4, gridBagConstraints);

        jTabbedPane1.addTab("Normal", jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Browsers"));

        ch_a.setText("Google Chrome");
        ch_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_aActionPerformed(evt);
            }
        });

        ie_a.setText("Internet Explorer");
        ie_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ie_aActionPerformed(evt);
            }
        });

        moz_a.setText("Mozila Firefox");
        moz_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moz_aActionPerformed(evt);
            }
        });

        sf_a.setText("Safari");
        sf_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sf_aActionPerformed(evt);
            }
        });

        op_a.setText("Opera");
        op_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_aActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(moz_a)
                        .addGap(18, 18, 18)
                        .addComponent(ch_a))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ie_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sf_a))
                    .addComponent(op_a))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moz_a)
                    .addComponent(ch_a))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ie_a)
                    .addComponent(sf_a))
                .addGap(18, 18, 18)
                .addComponent(op_a)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jPanel4, gridBagConstraints);

        jButton_a.setText("Run Cleaner");
        jButton_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 48;
        jPanel2.add(jButton_a, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 395;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(73, 0, 0, 0);
        jPanel2.add(jProgressBar_a, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 370;
        gridBagConstraints.ipady = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel2.add(jPanel5, gridBagConstraints);

        jLabel5.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel6, gridBagConstraints);

        jTabbedPane1.addTab("Advanced", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sf_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sf_aActionPerformed
       
        browser[9]="safari_1";
        
    }//GEN-LAST:event_sf_aActionPerformed

    private void jButton_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aActionPerformed
       
         int p=JOptionPane.showConfirmDialog(null,"Do you really want to proceed?","Warning",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
              //jProgressBar_n.setIndeterminate(true);
       
               jProgressBar_n.setValue(0);
            jProgressBar_n.setStringPainted(true);
                           val=1; 
                           jButton_a.setEnabled(false);
                        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        //Instances of javax.swing.SwingWorker are not reusuable, so
                        //we create new instances as needed.
                        task3 = new Task3();
                        task3.addPropertyChangeListener(this);
                        task3.execute(); 
        }
        else{
            
        }
        
    }//GEN-LAST:event_jButton_aActionPerformed

    private void sf_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sf_nActionPerformed
        browser[4]="safari_2";
    }//GEN-LAST:event_sf_nActionPerformed

    private void jButton_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nActionPerformed
       
         int p=JOptionPane.showConfirmDialog(null,"Do you really want to proceed?","Warning",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
        
            
            // jProgressBar_a.setIndeterminate(true);
                         jProgressBar_a.setValue(0);
                         jProgressBar_a.setStringPainted(true);
                      //  System.out.println(browser[i]);
           
                        
//                            if(browser[i].equals("chrome_2")){
//                                startWaitCursor();
//                                cmd.adv_chrome();
//                                 stopWaitCursor();
//                            }
//                            if(browser[i].equals("mozila_2")){
//                                startWaitCursor();
//                                cmd.adv_firefox();
//                                 stopWaitCursor();
//                            }
                          
                                
                                                  val=0; 
                           jButton_n.setEnabled(false);
                        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        //Instances of javax.swing.SwingWorker are not reusuable, so
                        //we create new instances as needed.
                        task2 = new Task2();
                        task2.addPropertyChangeListener(this);
                        task2.execute(); 
                                //  startWaitCursor();
                              
                                //stopWaitCursor();
                            
                        }
        
                        
                
    }//GEN-LAST:event_jButton_nActionPerformed

    private void moz_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moz_nActionPerformed
        
          browser[1]="mozila_2";
    }//GEN-LAST:event_moz_nActionPerformed

    private void ie_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ie_nActionPerformed
       
          browser[2]="ie_2";
    }//GEN-LAST:event_ie_nActionPerformed

    private void ch_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_nActionPerformed
        browser[3]="chrome_2";
    }//GEN-LAST:event_ch_nActionPerformed

    private void moz_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moz_aActionPerformed
         browser[6]="mozila_1";
    }//GEN-LAST:event_moz_aActionPerformed

    private void ie_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ie_aActionPerformed
         browser[7]="ie_1";
    }//GEN-LAST:event_ie_aActionPerformed

    private void ch_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_aActionPerformed
         browser[8]="chrome_1";
    }//GEN-LAST:event_ch_aActionPerformed

    private void op_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_nActionPerformed
        
        
         browser[5]="opera_2";
        
    }//GEN-LAST:event_op_nActionPerformed

    private void op_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_aActionPerformed
      
        
         browser[10]="opera_1";
    }//GEN-LAST:event_op_aActionPerformed
 public void startWaitCursor() {
    RootPaneContainer root = (RootPaneContainer) this.getRootPane().getTopLevelAncestor();
    root.getGlassPane().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    root.getGlassPane().setVisible(true);
  
}
 
public void stopWaitCursor() {
    RootPaneContainer root = (RootPaneContainer) this.getRootPane().getTopLevelAncestor();
    root.getGlassPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    root.getGlassPane().setVisible(false);
} 

 @Override
    public void actionPerformed(ActionEvent e) {
        
    
    
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
      
    if(val==0){
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            jProgressBar_n.setValue(progress);
             if(cmd.line8!=null){
            jTextArea1.append(cmd.line8+"\n");
              jTextArea1.append(cmd.line9+"\n");
                jTextArea1.append(cmd.line5+"\n");
                  jTextArea1.append(cmd.line10+"\n");
                    jTextArea1.append(cmd.line11+"\n");
             }
        } 
      }
    
     if(val==1){
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            jProgressBar_a.setValue(progress);
             if(cmd.line3!=null){
            jTextArea2.append(cmd.line3+"\n");
             jTextArea2.append(cmd.line4+"\n");
              jTextArea2.append(cmd.line5+"\n");
               jTextArea2.append(cmd.line6+"\n");
                jTextArea2.append(cmd.line7+"\n");
             }
        } 
      }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ch_a;
    private javax.swing.JCheckBox ch_n;
    private javax.swing.JCheckBox ie_a;
    private javax.swing.JCheckBox ie_n;
    private javax.swing.JButton jButton_a;
    private javax.swing.JButton jButton_n;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar_a;
    private javax.swing.JProgressBar jProgressBar_n;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JCheckBox moz_a;
    private javax.swing.JCheckBox moz_n;
    private javax.swing.JCheckBox op_a;
    private javax.swing.JCheckBox op_n;
    private javax.swing.JCheckBox sf_a;
    private javax.swing.JCheckBox sf_n;
    // End of variables declaration//GEN-END:variables
}
