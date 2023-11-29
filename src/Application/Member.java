/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Application;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zai
 */
public class Member extends javax.swing.JFrame {

    /**
     * Creates new form Loding
     */
    public Member() {
        initComponents();
        setIcon();
        /*9*/getTrainer();
        displayMember();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        MName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        MPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        MAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        MGen = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        MTiming = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        MTrainer = new javax.swing.JComboBox<>();
        EditButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titan Fitness");
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(34, 34, 47));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trainer");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Machine");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Report");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(34, 34, 47));
        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 255, 0));
        jTextField1.setText("MY FITNESS ");
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator4)
                                .addComponent(jSeparator5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MemberTable.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        MemberTable.setModel(new javax.swing.table.DefaultTableModel(
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
        MemberTable.setRowHeight(30);
        MemberTable.setShowGrid(true);
        MemberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MemberTable);

        jPanel3.setBackground(new java.awt.Color(34, 34, 47));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Member Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        MName.setBackground(new java.awt.Color(102, 102, 102));
        MName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MName.setForeground(new java.awt.Color(244, 244, 244));
        MName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MName.setCaretColor(new java.awt.Color(244, 244, 244));
        MName.setOpaque(true);
        MName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameActionPerformed(evt);
            }
        });
        jPanel3.add(MName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone Number");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        MPhoneNumber.setBackground(new java.awt.Color(102, 102, 102));
        MPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MPhoneNumber.setForeground(new java.awt.Color(244, 244, 244));
        MPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MPhoneNumber.setCaretColor(new java.awt.Color(244, 244, 244));
        MPhoneNumber.setOpaque(true);
        MPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPhoneNumberActionPerformed(evt);
            }
        });
        jPanel3.add(MPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 159, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Age");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        MAge.setBackground(new java.awt.Color(102, 102, 102));
        MAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MAge.setForeground(new java.awt.Color(244, 244, 244));
        MAge.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MAge.setCaretColor(new java.awt.Color(244, 244, 244));
        MAge.setOpaque(true);
        jPanel3.add(MAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 70, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        MGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Famale" }));
        MGen.setBorder(null);
        MGen.setFocusable(false);
        jPanel3.add(MGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 80, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Timing");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        MTiming.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 am - 8 am", "8 am - 10 am", "10 am - 12 am", "1 pm - 3pm", "3pm - 5pm", "6pm - 8pm", "8pm - 10pm", "11pm - 1am", "2am - 4am", "4am - 6am", " " }));
        MTiming.setBorder(null);
        MTiming.setFocusable(false);
        jPanel3.add(MTiming, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Trainer");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        MTrainer.setBorder(null);
        MTrainer.setFocusable(false);
        jPanel3.add(MTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 170, -1));

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
        AddButton.setText(" Add");
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

        jLabel17.setBackground(new java.awt.Color(34, 34, 47));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(205, 255, 0));
        jLabel17.setText("Member Management");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 197, -1));

        jLabel15.setBackground(new java.awt.Color(34, 34, 47));
        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(205, 255, 0));
        jLabel15.setText("Member List");
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
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
    }// </editor-fold>                        

    //Step by Step to connect with MySQL
    //Start here 
    /*1*/Connection con = null;
    /*2*/PreparedStatement pst = null;
    /*3*/ResultSet rs = null, rs1 = null;
    /*4*/Statement st = null, st1 = null;
        /*7*/private void displayMember(){
        //---------------> 2 (Display database from PhpMyAdmin table into Netbean's Table while run the code)
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
           st = con.createStatement();
           rs = st.executeQuery("select * from member_table");
           MemberTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
        
        /*8*/private void getTrainer(){
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
              st = con.createStatement();
              String query = "Select * from trainer_table";
              rs = st.executeQuery(query);
              while(rs.next())
              {
                  String trainerName = rs.getString("TName");
                  MTrainer.addItem(trainerName);
              }
        } catch (Exception e) {
        }
    }
    int MNum = 0;
    /*11*/ private void countMember(){
        try{
        st1 = con.createStatement();
        rs1 = st1.executeQuery("select MAX(MID) from member_table");
        rs1.next();
        MNum = (rs1.getInt(1))+1;
        }
        catch (Exception e){
        }
    }
    int Key = 0;
    private void MemberTableMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel)MemberTable.getModel();
       int MyIndex = MemberTable.getSelectedRow();
       Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       MName.setText(model.getValueAt(MyIndex, 1).toString());
       MAge.setText(model.getValueAt(MyIndex, 2).toString());
       MGen.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
       MTiming.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
       MPhoneNumber.setText(model.getValueAt(MyIndex, 5).toString());
//       MAmount.setText(model.getValueAt(MyIndex, 6).toString());
       MTrainer.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
    }                                        

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        // TODO add your handling code here:----------------> 4 (Delete row form tables(PhpMyAdmin ,Table in Project) For DeleteButton)
        /*13*/if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select The Member To Delete","Delete",JOptionPane.INFORMATION_MESSAGE);
        }else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
                String query = "Delete from member_table where MID="+Key;
                Statement del = con.createStatement();
                del.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Member Deleted","Delete",JOptionPane.PLAIN_MESSAGE);
                displayMember();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }                                         

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        //----------> 1 (add database to PhpMyAdmin For AddButton)
        /*5*/if(MName.getText().isEmpty() || MAge.getText().isEmpty() || MPhoneNumber.getText().isEmpty() || MGen.getSelectedIndex() == -1 || MTiming.getSelectedIndex() == -1 || MTrainer.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Missing Information", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        /*6*/ else{
            try {
                /*11*/ countMember();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
                PreparedStatement add = con.prepareStatement("insert into member_table values(?,?,?,?,?,?,?)");
                add.setInt(1,MNum);//add.setInt(1--->coloum index , TNum --> number of stores)
                add.setString(2,MName.getText());
                add.setInt(3,Integer.valueOf(MAge.getText()));
                add.setString(4, MGen.getSelectedItem().toString());
                add.setString(5,MTiming.getSelectedItem().toString());
                add.setString(6, MPhoneNumber.getText());
                add.setString(7,MTrainer.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Member Saved", "Save", JOptionPane.PLAIN_MESSAGE);
                con.close();
                /*9*/displayMember();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }                                      

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        if(Key == 0){
            JOptionPane.showMessageDialog(this,"Please Select To Edit","Update",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","root","");
                String query = "Update member_table set MName=?,MAge=?,MGender=?,MTiming=?,MPhoneNumber=?,MTrainer=? where MID=?";
                PreparedStatement edit = con.prepareStatement(query);
                edit.setString(1,MName.getText());
                edit.setInt(2,Integer.valueOf(MAge.getText()));
                edit.setString(3, MGen.getSelectedItem().toString());
                edit.setString(4, MTiming.getSelectedItem().toString());
                edit.setString(5, MPhoneNumber.getText());
                //            edit.setInt(6, Integer.valueOf(MAmount.getText()));
                edit.setString(6, MGen.getSelectedItem().toString());
                edit.setInt(7, Key);
                int row = edit.executeUpdate();
                JOptionPane.showMessageDialog(this, "Trainer Updated","Update",JOptionPane.PLAIN_MESSAGE);
                con.close();
                displayMember();
            } catch (Exception e) {
            }
        }
    }                                       

    private void MPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void MNameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }                                    

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        new Report().setVisible(true);
        this.dispose();
    }                                    

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:\
        new Machine().setVisible(true);
        this.dispose();
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        new Payment().setVisible(true);
        this.dispose();
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        new Trainer().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField MAge;
    private javax.swing.JComboBox<String> MGen;
    private javax.swing.JTextField MName;
    private javax.swing.JTextField MPhoneNumber;
    private javax.swing.JComboBox<String> MTiming;
    private javax.swing.JComboBox<String> MTrainer;
    private javax.swing.JTable MemberTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   

    private void setIcon() {
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FrameIcon.png")));

    }
}
