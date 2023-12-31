package Application;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Trainer extends javax.swing.JFrame {

    /**
     * Creates new form Trainer
     */
    private Connection conn;
    public Trainer() {
        conn = DBConnect.connect();
        initComponents();
        /*8*/displayTrainer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TrainerTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TGen = new javax.swing.JComboBox<>();
        EditButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAddress = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Fitness Club");
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(34, 34, 47));
        jPanel2.setForeground(new java.awt.Color(34, 34, 47));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEMBER");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TRAINER");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PAYMENT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MACHINE");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REPORT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LOGOUT");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(34, 34, 47));
        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(205, 255, 0));
        jTextField1.setText("MY FITNESS");
        jTextField1.setBorder(null);

        jTextField2.setBackground(new java.awt.Color(34, 34, 47));
        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(205, 255, 0));
        jTextField2.setText("CLUB");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator3)
                                                        .addComponent(jSeparator4)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(40, 40, 40))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TrainerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        TrainerTable.setRowHeight(30);
        TrainerTable.setShowGrid(true);
        TrainerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TrainerTable);

        jPanel3.setBackground(new java.awt.Color(34, 34, 47));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Trainer Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        TName.setBackground(new java.awt.Color(102, 102, 102));
        TName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TName.setForeground(new java.awt.Color(244, 244, 244));
        TName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TName.setCaretColor(new java.awt.Color(244, 244, 244));
        TName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNameActionPerformed(evt);
            }
        });
        jPanel3.add(TName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone Number");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        TPhoneNumber.setBackground(new java.awt.Color(102, 102, 102));
        TPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TPhoneNumber.setForeground(new java.awt.Color(244, 244, 244));
        TPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TPhoneNumber.setCaretColor(new java.awt.Color(244, 244, 244));
        TPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPhoneNumberActionPerformed(evt);
            }
        });
        jPanel3.add(TPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Age");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        TAge.setBackground(new java.awt.Color(102, 102, 102));
        TAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TAge.setForeground(new java.awt.Color(244, 244, 244));
        TAge.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TAge.setCaretColor(new java.awt.Color(244, 244, 244));
        jPanel3.add(TAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 80, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        TGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Famale" }));
        TGen.setFocusable(false);
        TGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TGenActionPerformed(evt);
            }
        });
        jPanel3.add(TGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 102, 80, 30));

        EditButton.setBackground(new java.awt.Color(180, 216, 33));
        EditButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditButton.setText("Edit");
        EditButton.setFocusPainted(false);
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        jPanel3.add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 70, -1));

        AddButton.setBackground(new java.awt.Color(180, 216, 33));
        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddButton.setText("Add");
        AddButton.setFocusPainted(false);
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        jPanel3.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 70, -1));

        DeleteButton.setBackground(new java.awt.Color(180, 216, 33));
        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setFocusPainted(false);
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        jPanel3.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 70, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(205, 255, 0));
        jLabel17.setText("Trainer Management");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 220, -1));

        TAddress.setBackground(new java.awt.Color(102, 102, 102));
        TAddress.setColumns(20);
        TAddress.setForeground(new java.awt.Color(244, 244, 244));
        TAddress.setRows(5);
        TAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TAddress.setCaretColor(new java.awt.Color(244, 244, 244));
        jScrollPane2.setViewportView(TAddress);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel16.setBackground(new java.awt.Color(34, 34, 47));
        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(205, 255, 0));
        jLabel16.setText("Trainer List");
        jLabel16.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNameActionPerformed

    private void TPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPhoneNumberActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new Member().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Payment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Machine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new Report().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked
//Step by Step to connect with MySQL
    //Start here
    /*3*/ResultSet rs = null, rs1 = null;
    /*4*/Statement st = null, st1 = null    ;
    
    /*7*/private void displayTrainer(){
        //---------------> 2 (Display database from PhpMyAdmin table into Netbean's Table while run the code)
        try {

           st = conn.createStatement();
           rs = st.executeQuery("select * from trainer_table");
           TrainerTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
    int TNum = 0;
    /*10*/ private void countTrainer(){
        try{
        st1 = conn.createStatement();
        rs1 = st1.executeQuery("select MAX(TID) from trainer_table");
        rs1.next();
        TNum = (rs1.getInt(1))+1;
        }
        catch (Exception e){
        }
    }
    
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        //----------> 1 (add database to PhpMyAdmin For AddButton)
        /*5*/if(TName.getText().isEmpty() || TAge.getText().isEmpty() || TPhoneNumber.getText().isEmpty() || TAddress.getText().isEmpty() || TGen.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Missing Information", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        /*6*/ else{
            try{
                /*11*/ countTrainer();

                PreparedStatement add = conn.prepareStatement("insert into trainer_table values(?,?,?,?,?,?)");
                add.setInt(1,TNum);//add.setInt(1--->coloum index , TNum --> number of stores)
                add.setString(2,TName.getText());
                add.setInt(3,Integer.valueOf(TAge.getText()));
                add.setString(4, TGen.getSelectedItem().toString());
                add.setString(5,TAddress.getText());
                add.setString(6, TPhoneNumber.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Trainer Saved", "Save", JOptionPane.PLAIN_MESSAGE);
                conn.close();
                /*9*/displayTrainer();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void TGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TGenActionPerformed
int Key = 0;
    private void TrainerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainerTableMouseClicked
        // TODO add your handling code here: --------------> 3 (When click on the row in the table, all the textfields will filled the vaules of each coloum in the table)
        /*12*/
       DefaultTableModel model = (DefaultTableModel)TrainerTable.getModel();
       int MyIndex = TrainerTable.getSelectedRow();
       Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       TName.setText(model.getValueAt(MyIndex, 1).toString());
       TAge.setText(model.getValueAt(MyIndex, 2).toString());
       TGen.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
       TAddress.setText(model.getValueAt(MyIndex, 4).toString());
       TPhoneNumber.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_TrainerTableMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:----------------> 4 (Delete row form tables(PhpMyAdmin ,Table in Project) For DeleteButton)
        /*13*/if(Key == 0)
        {
           JOptionPane.showMessageDialog(this, "Select The Trainer To Delete","Delete",JOptionPane.INFORMATION_MESSAGE);
        }else{
            try {
             String query = "Delete from trainer_table where TID="+Key;
             Statement del = conn.createStatement();
             del.executeUpdate(query);
             JOptionPane.showMessageDialog(this, "Trainer Deleted","Delete",JOptionPane.PLAIN_MESSAGE);
             displayTrainer();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        // TODO add your handling code here: -----------------------> 5 (edit the values of selected row in table for EditButton)
         /*14*/if(Key == 0){
             JOptionPane.showMessageDialog(this,"Please Select To Edit","Update",JOptionPane.INFORMATION_MESSAGE);
       }
        else{
           try {
            String query = "Update trainer_table set TName=?,TAge=?,TGender=?,TAddress=?,TPhoneNumber=? where TID=?";
            PreparedStatement edit = conn.prepareStatement(query);
            edit.setString(1, TName.getText());
            edit.setInt(2, Integer.valueOf(TAge.getText()));
            edit.setString(3, TGen.getSelectedItem().toString());
            edit.setString(4, TAddress.getText());
            edit.setString(5, TPhoneNumber.getText());
            edit.setInt(6, Key);
            int row = edit.executeUpdate();
            JOptionPane.showMessageDialog(this, "Trainer Updated","Update",JOptionPane.PLAIN_MESSAGE);
            conn.close();
            displayTrainer();
           } catch (Exception e) {
           }
       }
    }//GEN-LAST:event_EditButtonMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextArea TAddress;
    private javax.swing.JTextField TAge;
    private javax.swing.JComboBox<String> TGen;
    private javax.swing.JTextField TName;
    private javax.swing.JTextField TPhoneNumber;
    private javax.swing.JTable TrainerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}