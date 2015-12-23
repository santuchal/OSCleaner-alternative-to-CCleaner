/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcleaner;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;
=======
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.RootPaneContainer;
import javax.swing.SwingWorker;
<<<<<<< HEAD
import static jcleaner.cmd.line;
import static jcleaner.cmd.line1;
=======
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8


/**
 *
 * @author Test
 */
public class ext_1 extends javax.swing.JPanel implements ActionListener, 
                                        PropertyChangeListener {

    /**
     * Creates new form ext_1
     */
  
    private Task task;
    private Task1 task1;
    long difference,difference1;
    int val=0;
<<<<<<< HEAD
  //  public static String line1,line2;
=======
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
    public ext_1() {
        
        
        initComponents();
        
       //  jProgressBar1 = new JProgressBar(0, 100);
          jProgressBar1.setValue(0);
            jProgressBar1.setStringPainted(true);
            
            jProgressBar2.setValue(0);
            jProgressBar2.setStringPainted(true);
    }
 class Task extends SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */
        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            //Initialize progress property.
            setProgress(0);
            while (progress < 100) {
                //Sleep for up to one second.
                try {
<<<<<<< HEAD
                    Thread.sleep(difference+1000);
=======
                    Thread.sleep(difference);
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
                } catch (InterruptedException ignore) {}
                //Make random progress.
                 long lStartTime = new Date().getTime();
                    //some tasks
<<<<<<< HEAD
                  try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "erase \"%TEMP%\\*.*\" /f /s /q");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
           // String line;

            while (true) {
                line = r.readLine();
                
                if (line == null) {
                    break;
                }
               // System.out.println(line);
                  if(cmd.line!=null){
                   jTextArea1.append(cmd.line+"\n");
                  }
               // jTextArea.append(line);
            }
        } catch (Exception e) {

        }
=======
                    cmd.temp_del();
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
            long lEndTime = new Date().getTime();

         difference = lEndTime - lStartTime;
                progress += difference;
                setProgress(Math.min(progress, 100));
            }
            return null;
        }
 
        /*
         * Executed in event dispatching thread
         */
        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            jButton1.setEnabled(true);
            setCursor(null); //turn off the wait cursor
<<<<<<< HEAD
            
            jTextArea1.append("Done!\n");
=======
           // taskOutput.append("Done!\n");
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
        }
    }
 
 class Task1 extends SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */
        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            //Initialize progress property.
            setProgress(0);
            while (progress < 100) {
                //Sleep for up to one second.
                try {
<<<<<<< HEAD
                    Thread.sleep(difference1+500);
=======
                    Thread.sleep(difference1);
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
                } catch (InterruptedException ignore) {}
                //Make random progress.
                 long lStartTime = new Date().getTime();
                    //some tasks
<<<<<<< HEAD
                 try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "for /D %i in (\"%TEMP%\\*\") do RD /S /Q \"%i\""); // Delete All temporary file from from appdata
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
                 try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "rd /Q /S %systemdrive%\\$Recycle.bin"); // Delete all file from recyclebin
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
                 
               try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "del /F /Q %APPDATA%\\Microsoft\\Windows\\Recent\\*"); // Delete all shortcut file from recent
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
               
               try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "del /F /Q %APPDATA%\\Microsoft\\Windows\\Recent\\AutomaticDestinations\\*"); // Delete all shortcut file from automatic destination
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
               
                try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "del /F /Q %APPDATA%\\Microsoft\\Windows\\Recent\\CustomDestinations\\*"); // Delete all shortcut file from custom destination
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
                
                
                 try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "del /F /Q %APPDATA%\\Microsoft\\Windows\\Recent\\CustomDestinations\\*"); // Task to kill Explorer
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
                 
                 
                  try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "del /F /Q %APPDATA%\\Microsoft\\Windows\\Recent\\CustomDestinations\\*"); // Task to start explorer
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while (true) {
                line1 = r1.readLine();
                if (line1 == null) {
                    break;
                }
                System.out.println(line1);
                    if(cmd.line1!=null){
                  jTextArea3.append(cmd.line1+"\n");
            }}
        } catch (Exception e) {

        }
                 
=======
                    cmd.adv_temp_del_all_user();
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
            long lEndTime = new Date().getTime();

         difference1 = lEndTime - lStartTime;
                progress += difference1;
                setProgress(Math.min(progress, 100));
            }
            return null;
        }
 
        /*
         * Executed in event dispatching thread
         */
        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            jButton2.setEnabled(true);
            setCursor(null); //turn off the wait cursor
<<<<<<< HEAD
            jTextArea3.append("Done!\n");
=======
           // taskOutput.append("Done!\n");
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
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
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("PC Cleaner"));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Run Cleaner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 48;
        jPanel1.add(jButton1, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Details:"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.ipady = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jPanel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jProgressBar1, gridBagConstraints);

        jTabbedPane1.addTab("Normal", jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jProgressBar2, gridBagConstraints);

        jButton2.setText("Run Cleaner");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jButton2, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Details:"));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.ipady = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel5, gridBagConstraints);

        jTabbedPane1.addTab("Advanced", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         int p=JOptionPane.showConfirmDialog(null,"Do you really want to proceed?","Warning",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            
          val=0; 
           jButton1.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //Instances of javax.swing.SwingWorker are not reusuable, so
        //we create new instances as needed.
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute(); 
            
          //  startWaitCursor();
//             long lStartTime = new Date().getTime();
//        //some tasks
//            cmd.temp_del();
//        long lEndTime = new Date().getTime();
//
//        long difference = lEndTime - lStartTime;
          
          
           
          // stopWaitCursor();
        }
        else{
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         int p=JOptionPane.showConfirmDialog(null,"Do you really want to proceed?","Warning",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            val=1;
         jButton2.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //Instances of javax.swing.SwingWorker are not reusuable, so
        //we create new instances as needed.
        task1 = new Task1();
        task1.addPropertyChangeListener(this);
        task1.execute(); 
        }
        else{
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed
  public void propertyChange(PropertyChangeEvent evt) {
     
      if(val==0){
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            jProgressBar1.setValue(progress);
<<<<<<< HEAD
          //   if(cmd.line!=null){
         
          //   }
=======
             if(cmd.line!=null){
            jTextArea1.append(cmd.line+"\n");
             }
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
        } 
      }
      if(val==1){
         if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            jProgressBar2.setValue(progress);
<<<<<<< HEAD
          
=======
           if(cmd.line1!=null){
            jTextArea3.append(cmd.line1+"\n");
           }
>>>>>>> 9af5a98b535e2c70e9b3ed7ffddc77c8c60891e8
        }
      }
    }
 
  
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
