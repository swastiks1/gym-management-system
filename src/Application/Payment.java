package Application;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    private Connection conn;

    public Payment() {
        conn = DBConnect.connect();
        initComponents();
        displayPayment();
        getMember();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaymentTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PAmount = new javax.swing.JTextField();
        PayButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        PSearch = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        PMember = new javax.swing.JComboBox<>();
        PDate = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        ResetButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(34, 34, 47));
        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 0));
        jLabel21.setText("Payment List");
        jLabel21.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(34, 34, 47));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("MEMBER");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23jLabel1MouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("TRAINER");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24jLabel3MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("PAYMENT");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("MACHINE");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26jLabel5MouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("REPORT");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Lucida Bright", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("LOGOUT");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(34, 34, 47));
        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 255, 0));
        jTextField1.setText("MY FITNESS ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(34, 34, 47));
        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 255, 0));
        jTextField2.setText("CLUB");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(35, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58))))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(74, Short.MAX_VALUE))
        );

        PaymentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PaymentTable.setRowHeight(30);
        PaymentTable.setShowGrid(true);
        PaymentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PaymentTable);

        jPanel3.setBackground(new java.awt.Color(11, 10, 11));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Member");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amount");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        PAmount.setBackground(new java.awt.Color(102, 102, 102));
        PAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PAmount.setForeground(new java.awt.Color(244, 244, 244));
        PAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PAmount.setCaretColor(new java.awt.Color(244, 244, 244));
        jPanel3.add(PAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 30));

        PayButton.setBackground(new java.awt.Color(180, 216, 33));
        PayButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PayButton.setFocusPainted(false);
        PayButton.setLabel("Pay");
        PayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayButtonMouseClicked(evt);
            }
        });
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 70, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Search");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        PSearch.setBackground(new java.awt.Color(102, 102, 102));
        PSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PSearch.setForeground(new java.awt.Color(244, 244, 244));
        PSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PSearch.setCaretColor(new java.awt.Color(244, 244, 244));
        PSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSearchActionPerformed(evt);
            }
        });
        jPanel3.add(PSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 160, 30));

        SearchButton.setBackground(new java.awt.Color(180, 216, 33));
        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.setFocusPainted(false);
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        RefreshButton.setBackground(new java.awt.Color(180, 216, 33));
        RefreshButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.setFocusPainted(false);
        RefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshButtonMouseClicked(evt);
            }
        });
        jPanel3.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        PMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMemberActionPerformed(evt);
            }
        });
        jPanel3.add(PMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 167, -1));

        PDate.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(PDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 160, -1));

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 0));
        jLabel17.setText("Payment Management");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 220, -1));

        ResetButton1.setBackground(new java.awt.Color(180, 216, 33));
        ResetButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ResetButton1.setFocusPainted(false);
        ResetButton1.setLabel("Reset");
        ResetButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetButton1MouseClicked(evt);
            }
        });
        jPanel3.add(ResetButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel23jLabel1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel23jLabel1MouseClicked
        // TODO add your handling code here:
        new Member().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel23jLabel1MouseClicked

    private void jLabel24jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel24jLabel3MouseClicked
        // TODO add your handling code here:
        new Trainer().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel24jLabel3MouseClicked

    private void jLabel26jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel26jLabel5MouseClicked
        // TODO add your handling code here:
        new Machine().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel26jLabel5MouseClicked

    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;

    /* 7 */private void displayPayment() {
        // ---------------> 2 (Display database from PhpMyAdmin table into Netbean's
        // Table while run the code)
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from payment_table");
            PaymentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void filterByName() {
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from payment_table where PMember='" + PSearch.getText() + "'");
            PaymentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }

    private void getMember() {
        try {
            st = conn.createStatement();
            String query = "Select * from member_table";
            rs = st.executeQuery(query);
            while (rs.next()) {
                String memberName = rs.getString("MName");
                PMember.addItem(memberName);
            }
        } catch (Exception e) {
        }
    }

    int PNum = 0;

    /* 11 */ private void countPayment() {
        try {
            st1 = conn.createStatement();
            rs1 = st1.executeQuery("select MAX(PID) from payment_table");
            rs1.next();
            PNum = (rs1.getInt(1)) + 1;
        } catch (Exception e) {
        }
    }

    int flag;

    private void CheckIfPaid() {
        try {
            st1 = conn.createStatement();
            rs1 = st1.executeQuery("select COUNT(*) from payment_table where PDate='" + Period + "' and PMember='"
                    + PMember.getSelectedItem().toString() + "'");
            rs1.next();
            flag = rs1.getInt(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void Clear() {
        PAmount.setText(null);
        PMember.setSelectedIndex(0);
    }

    String Period = "";

    private void PayButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_PayButtonMouseClicked
        // TODO add your handling code here:
        Period = String.valueOf(PDate.getDate());
        // JOptionPane.showMessageDialog(this, Period);

        if (Period.equals(null) || PAmount.getText().isEmpty() || PAmount.getText().equals("0")
                || PMember.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing Information", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            CheckIfPaid();
            if (flag == 0) {
                try {
                    countPayment();
                    PreparedStatement add = conn.prepareStatement("insert into payment_table values(?,?,?,?)");
                    add.setInt(1, PNum);
                    add.setString(2, PMember.getSelectedItem().toString());
                    add.setInt(3, Integer.valueOf(PAmount.getText()));
                    add.setString(4, Period);
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Amount Paid");
                    conn.close();
                    displayPayment();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            } else if (flag == 1) {
                JOptionPane.showMessageDialog(this, "No Due for the Selected Date");
            }
        }
    }// GEN-LAST:event_PayButtonMouseClicked

    private void PSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PSearchActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PSearchActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_SearchButtonActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PayButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PayButtonActionPerformed

    private void PMemberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PMemberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PMemberActionPerformed

    private void RefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_RefreshButtonMouseClicked
        // TODO add your handling code here:
        displayPayment();
    }// GEN-LAST:event_RefreshButtonMouseClicked

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        filterByName();
        PSearch.setText(null);
    }// GEN-LAST:event_SearchButtonMouseClicked

    private void PPrintMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_PPrintMouseClicked
        // TODO add your handling code here:
        try {
            PaymentTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_PPrintMouseClicked

    private void PaymentTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_PaymentTableMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_PaymentTableMouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        new Report().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel28MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ResetButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ResetButton1MouseClicked
        // TODO add your handling code here:
        PAmount.setText("");

    }// GEN-LAST:event_ResetButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PAmount;
    private com.toedter.calendar.JDateChooser PDate;
    private javax.swing.JComboBox<String> PMember;
    private javax.swing.JButton PPrint;
    private javax.swing.JTextField PSearch;
    private javax.swing.JButton PayButton;
    private javax.swing.JTable PaymentTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton ResetButton1;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

    // End of variables declaration//GEN-END:variables

}
