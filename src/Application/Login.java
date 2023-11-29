/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Zai
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ChangePasswordButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titan Fitness");

        jPanel1.setBackground(new java.awt.Color(34, 34, 47));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 100, 30));

        Username.setBackground(new java.awt.Color(102, 102, 102));
        Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(244, 244, 244));
        Username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Username.setCaretColor(new java.awt.Color(244, 244, 244));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 185, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, 30));

        Password.setBackground(new java.awt.Color(102, 102, 102));
        Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(244, 244, 244));
        Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Password.setCaretColor(new java.awt.Color(244, 244, 244));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 185, -1));

        LoginButton.setBackground(new java.awt.Color(180, 216, 33));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setFocusable(false);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginButtonKeyPressed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 80, 30));

        ChangePasswordButton.setBackground(new java.awt.Color(180, 216, 33));
        ChangePasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ChangePasswordButton.setText("Change Admin Password");
        ChangePasswordButton.setFocusable(false);
        ChangePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordButtonMouseClicked(evt);
            }
        });
        ChangePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 180, 30));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MY FITNESS CLUB");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 490, 70));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMIN LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 280, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ChangePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:

    }                                                    

    private void ChangePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        // TODO add your handling code here:
        if(isPasswordVaild(Username.getText(),Password.getText())){
            new ChangeAdminPassword().setVisible(true);
            this.dispose();
        }

    }                                                 

    private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String usr = Username.getText();
        String pass = new String(Password.getPassword());

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
            st = con.createStatement();
            String query = "Select * from login";
            rs = st.executeQuery(query);
            while(rs.next())
            {
                String user = rs.getString("username");
                String pwd = rs.getString("password");

                if(Username.getText().equals(user)&& Password.getText().equals(pwd)){
                    new Member().setVisible(true);
                    this.dispose();
                }
                else if(usr.isEmpty()|| pass.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Enter UserName and Password");

                }
                else{
                    JOptionPane.showMessageDialog(this, "Wrong UserName Or Password");
                    Username.setText(null);
                    Password.setText(null);}}

        } catch (Exception e) {
        }
    }                                        

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null, rs1 = null;
        Statement st = null, st1 = null;    
    public boolean isPasswordVaild(String usr, String pass){
  
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
              st = con.createStatement();
              String query = "Select * from login";
              rs = st.executeQuery(query);
              while(rs.next())
              {
                    String user = rs.getString("username");
                    String pwd = rs.getString("password");
                    
                    if(Username.getText().equals(user)&& Password.getText().equals(pwd)){
                    return true;              
                    }
                    else{
                    JOptionPane.showMessageDialog(this, "Wrong username and password");
                    Username.setText(null);
                    Password.setText(null);}}
        
              
           }
        catch (Exception e) {
        }
        return false;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ChangePasswordButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FrameIcon.png")));
    }
}
