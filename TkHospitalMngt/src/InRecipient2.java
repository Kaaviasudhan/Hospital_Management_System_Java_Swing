
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAAVIASUDHAN
 */
public class InRecipient2 extends javax.swing.JFrame {

    /**
     * Creates new form InRecipient2
     */
    public InRecipient2() {
        initComponents();
        
        showDatetime();
        //showTime();
        
        Thread time = new Thread();
        time.start();   //Start thread
    }

    void showDatetime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        //System.out.println("Before formatting: " + myDateObj);
        
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss");

        String Date = myDateObj.format(date);
        String Time = myDateObj.format(time);
        //System.out.println("After formatting: " + formattedDate);
        datLab.setText(Date);
        
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BoxIll = new javax.swing.JComboBox<>();
        timelab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPatname = new javax.swing.JTextField();
        txtFatname = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        RadiobtnMale = new javax.swing.JRadioButton();
        RadiobtnFemale = new javax.swing.JRadioButton();
        BoxCombRel = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JBoxBloodgrp = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        datLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("T K HOSPITAL SERVICE AND CENTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1490, 90));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PATIENT FORM ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 1500, 55));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\VARATHAMOHAN\\Pictures\\JAVA _ TK_LOGO\\Bg_Color.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 91));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Form Details"));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel4.setText("Patient Name");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel5.setText("Father name:");

        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel7.setText("Patient Illness:");

        BoxIll.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        BoxIll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Headache", "FLU", "Bloodpressure", "Cancer" }));

        timelab.setText("time");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel6.setText("Enter Friend or Family Member Details:");

        jLabel8.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel8.setText("Patient Mail Id");

        jLabel9.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel9.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel10.setText("Relation");

        txtPatname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtFatname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtMail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        RadiobtnMale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RadiobtnMale.setText("Male");

        RadiobtnFemale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RadiobtnFemale.setText("Female");

        BoxCombRel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BoxCombRel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Friend Relationship", "Family Relationship", "Blood Relationship", "Work or professional relationships", " " }));

        btnClear.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnExit.setText("X Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel11.setText("Blood group");

        JBoxBloodgrp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JBoxBloodgrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +ve", "O -ve", "A +ve", "A -ve", "B +ve", "B -ve", "AB +ve", "AB -ve" }));

        jLabel12.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel12.setText("DOB:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatname)
                            .addComponent(txtFatname)
                            .addComponent(txtMail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadiobtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addComponent(RadiobtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BoxCombRel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BoxIll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBoxBloodgrp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 608, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1666, Short.MAX_VALUE)
                    .addComponent(timelab)
                    .addGap(171, 171, 171)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPatname, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFatname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxIll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBoxBloodgrp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMail, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RadiobtnFemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadiobtnMale, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BoxCombRel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(timelab)
                    .addContainerGap(823, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1870, 870));

        datLab.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        datLab.setText("DATE: ");
        getContentPane().add(datLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, 220, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtPatname.setText("");
        txtFatname.setText("");
        txtMail.setText("");
        RadiobtnMale.setSelected(false);
        RadiobtnFemale.setSelected(false);
        BoxCombRel.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        String gen;
        try{
            int flag=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tk_hms","root","");
            
            String name = txtPatname.getText();
            String fatname = txtFatname.getText();
            String mail = txtMail.getText();
            String dob = txtDob.getText();
            
            //txtill.setText();
            String cause = BoxIll.getSelectedItem().toString();
            
            String blood = JBoxBloodgrp.getSelectedItem().toString();
            
            String ondate = datLab.getText();
            
            if(RadiobtnMale.isSelected())
            {
                gen= "M";
            }
            else 
            {
                gen="F";
            }
            
            String rel = (String) BoxCombRel.getSelectedItem();
            
            Statement stmt= con.createStatement();
            String sql="INSERT INTO PatientBook (name,gender,dob,fathername,bloodgroup,bookdate,doctorname,type) values('"+name+"','"+gen+"','"+dob+"','"+fatname+"','"+blood+"','"+ondate+"',,'"+cause+"','"+rel+"')";
            //String sql="insert into admin (name,username,psd,phone,address,role,mail,bloodgroup,dob) values('"+fname+"','"+name+"','"+password+"','"+phone+"','"+address+"','"+role+"','"+mail+"','"+blood+"','"+dob+"')";
            int reg=stmt.executeUpdate(sql);

            if(reg!=0){
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                InRecipent1 la1 = new InRecipent1();
                la1.setVisible(true);
            }
            JOptionPane.showMessageDialog(this, "Request Sended Successfully, Continue to Pay");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(InRecipient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InRecipient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InRecipient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InRecipient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InRecipient2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCombRel;
    private javax.swing.JComboBox<String> BoxIll;
    private javax.swing.JComboBox<String> JBoxBloodgrp;
    private javax.swing.JRadioButton RadiobtnFemale;
    private javax.swing.JRadioButton RadiobtnMale;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel datLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timelab;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtFatname;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtPatname;
    // End of variables declaration//GEN-END:variables
}
