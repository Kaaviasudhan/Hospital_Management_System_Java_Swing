
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
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
public class InRecipientPay extends javax.swing.JFrame {

    /**
     * Creates new form InRecipientPay
     */
    public InRecipientPay() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCardOtp = new javax.swing.JTextField();
        txtCardnum = new javax.swing.JTextField();
        PsdCardNum = new javax.swing.JPasswordField();
        txtCardName = new javax.swing.JTextField();
        LabOtpDis = new javax.swing.JLabel();
        CombCardExp = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labAmt = new javax.swing.JLabel();
        btnGenOtp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel5.setText("CARD NUMBER");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel4.setText("OTP");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel6.setText("Expiry MM/YY");

        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel7.setText("CARD CVV NUMBER ");

        jLabel8.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel8.setText("CARD HOLDER NAME");

        txtCardOtp.setText("ENTER_CAPCAHE");

        txtCardnum.setText("XXXXXXXXXXXXXXXX (12_Digit)");

        PsdCardNum.setText("***");

        txtCardName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCardName.setText("ENTER_CARD_HOLDER_NAME");

        LabOtpDis.setFont(new java.awt.Font("Snap ITC", 2, 12)); // NOI18N
        LabOtpDis.setText("OTP_GENERATE_CAPCAHE");

        CombCardExp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CombCardExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08/23", "09/24", "10/25", "11/26", "12/27", "01/28", "02/29", "03/30" }));
        CombCardExp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setText("Clear");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel10.setText("Total Amount:");

        labAmt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labAmt.setText("350");

        btnGenOtp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGenOtp.setText("GENERATE OTP");
        btnGenOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenOtpActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("₹");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CombCardExp, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PsdCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCardOtp, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabOtpDis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGenOtp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCardnum, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CombCardExp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PsdCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCardOtp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabOtpDis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenOtp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 920, 560));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("T K HOSPITAL SERVICE AND CENTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1490, 90));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAYMENT GATEWAY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 1500, 55));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\VARATHAMOHAN\\Pictures\\JAVA _ TK_LOGO\\Bg_Color.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 91));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\VARATHAMOHAN\\Pictures\\JAVA _ TK_LOGO\\Ads\\credit-card.png")); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 580, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGenOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenOtpActionPerformed
        // TODO add your handling code here:
        // create a string of all characters
        String otp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

          // generate random index number
          int index = random.nextInt(otp.length());

          // get character specified by index
          // from the string
          char randomChar = otp.charAt(index);

          // append the character to string builder
          sb.append(randomChar);
        }

        String randomString = sb.toString();
        //System.out.println("Random String is: " + randomString);
        LabOtpDis.setText(randomString);
    }//GEN-LAST:event_btnGenOtpActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtCardnum.setText("");
        PsdCardNum.setText("");
        txtCardName.setText("");
        txtCardOtp.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        String a = null;
        String id = null;
        
        try{
            int flag=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tk_hms","root","");
            
            String cardnum = txtCardnum.getText();
            String cardpsd = PsdCardNum.getText();
            String cardname = txtCardName.getText();
            String cardotp = txtCardOtp.getText();
            String cardotpv = LabOtpDis.getText();
            
            if(cardotp.equals(cardotpv)){
                JOptionPane.showMessageDialog(this, "OTP VERIFIED, \n PRESS OK to Continue");
            }
            else{
                JOptionPane.showMessageDialog(this, "OTP NOT VERIFIED \n Please Try Again.");
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                InRecipientPay pay1 = new InRecipientPay();
                pay1.setVisible(true);
            }
            
            String cardexp = CombCardExp.getSelectedItem().toString();
            
            Statement stmt= con.createStatement();
            
            String s1 = "select num, cvv, exp, amt from payment";
            ResultSet rs= stmt.executeQuery(s1);
            
            while(rs.next()){
                
                String n1 = rs.getString(1);
                String n2 = rs.getString(2);
                String n3 = rs.getString(3);
                String n4 = rs.getString(4);
                
                if(n1.equals(cardnum) && n2.equals(cardpsd) && n3.equals(cardexp)){
                    System.out.println(n4);
                    System.out.println(n1);
                    id = n1;
                    a = n4;
                    flag = 1;
                    JOptionPane.showMessageDialog(this, "Successfully Transaction");
                    
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    InRecipent1 ir1 = new InRecipent1();
                    ir1.setVisible(true); 
                }                 
            }
            
            if(flag == 0){
                JOptionPane.showMessageDialog(this,"Transaction Failed, Sorry Try Again Later");
                txtCardnum.setText("");
                PsdCardNum.setText("");
                txtCardName.setText("");
                txtCardOtp.setText("");
                LabOtpDis.setText("");
            }           
            
            String amt = labAmt.getText();
            
            int tamt;
            int b=Integer.parseInt(a);  
            int c=Integer.parseInt(amt);
            
            System.out.println(b);
            System.out.println(c);
            tamt = b - c;
            
            //String sql="INSERT INTO PatientBook (name,gender,dob,fathername,bloodgroup,bookdate,doctorname,type) values('"+name+"','"+gen+"','"+dob+"','"+fatname+"','"+blood+"','"+ondate+"',,'"+cause+"','"+rel+"')";
            String s2="UPDATE payment SET amt = ('"+tamt+"') WHERE num ="+id;
            int reg=stmt.executeUpdate(s2);

            if(reg!=0){
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                InRecipent1 la1 = new InRecipent1();
                la1.setVisible(true);
            }
            //JOptionPane.showMessageDialog(this, "Request Sended Successfully, Continue to Pay");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       /* try{
            int flag=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tk_hms","root","");
            String username1=txtUserName.getText();
            String psd=txtPsd.getText();
            String s1="select username ,psd from admin";
            Statement stmt= con.createStatement();
            ResultSet rs= stmt.executeQuery(s1);
            while(rs.next()){
                
                String n1=rs.getString(1);
                String n2=rs.getString(2);
                
                if(n1.equals(username1) && n2.equals(psd)){
                   flag=1;
                   JOptionPane.showMessageDialog(this, "Successfully Logged in\n WELCOME " +username1+ " ADMIN");
                   this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                   InAdmin1 ad1 = new InAdmin1();
                   ad1.setVisible(true); 
               }
            }
            if(flag==0){
                JOptionPane.showMessageDialog(this,"Login Unsuccessful, Try Again");
                txtUserName.setText("");
                txtPsd.setText("");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        
        
        
        /*String cardotp = txtCardOtp.getText();
        
        System.out.println(cardotp);
        String cardotpv = LabOtpDis.getText();
        System.out.println(cardotpv);    
            
        if(cardotp.equals(cardotpv)){
                JOptionPane.showMessageDialog(this, "OTP VERIFIED, \n PRESS OK to Continue");
            }
        else{
                JOptionPane.showMessageDialog(this, "OTP NOT VERIFIED \n Please Try Again.");
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                InRecipientPay pay1 = new InRecipientPay();
                pay1.setVisible(true);
            }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        try {
			for (int i = 0; i < 60; i++) {
			
				// it will sleep the main thread for 1 sec
				// ,each time the for loop runs
				Thread.sleep(1000);
			
				// printing the value of the variable
				System.out.println(i);
                                
                                if(i == 59){
                                    JOptionPane.showMessageDialog(this, "Sorry Its Time Out!, Pls Try Again");
                                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                                    InRecipient2 ir1 = new InRecipient2();
                                    ir1.setVisible(true);
                                }else{
                                    continue;
                                }
                                
			}
		}
		catch (Exception e) {
		
			// catching the exception
			System.out.println(e);
		}
        
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(InRecipientPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InRecipientPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InRecipientPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InRecipientPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InRecipientPay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombCardExp;
    private javax.swing.JLabel LabOtpDis;
    private javax.swing.JPasswordField PsdCardNum;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenOtp;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labAmt;
    private javax.swing.JTextField txtCardName;
    private javax.swing.JTextField txtCardOtp;
    private javax.swing.JTextField txtCardnum;
    // End of variables declaration//GEN-END:variables
}
