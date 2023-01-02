package View;
import Controller.TransactionController;
import Model.SideMenuPanel;
import Model.Transaction;
import Model.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class BorrowingHistoryView extends javax.swing.JFrame {

    SideMenuPanel sp;
    private DefaultTableModel model;
    TransactionController conTrans = new TransactionController();
//    BookController conBook = new BookController();
//    Date date;
    User user;

    public BorrowingHistoryView() {

        initComponents();
        sp = new SideMenuPanel(this);
        sp.setMain(mainPanel);
        sp.setSide(sidebar);
        sp.setMinWidth(55);
        sp.setMaxWidth(150);
        sp.setMainAnimation(true);
        sp.setSpeed(4);
        sp.setResponsiveMinWidth(600);
        
         
        model = new DefaultTableModel();
        tableHistory.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("User ID");
        model.addColumn("Book ID");
        model.addColumn("Borrow Date");
        model.addColumn("Return Date");
        model.addColumn("Return Status");
        
        getData();
    }
    
    public BorrowingHistoryView(User user) {

        initComponents();
        sp = new SideMenuPanel(this);
        sp.setMain(mainPanel);
        sp.setSide(sidebar);
        sp.setMinWidth(55);
        sp.setMaxWidth(150);
        sp.setMainAnimation(true);
        sp.setSpeed(4);
        sp.setResponsiveMinWidth(600);
        
         
        model = new DefaultTableModel();
        tableHistory.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("User ID");
        model.addColumn("Book ID");
        model.addColumn("Borrow Date");
        model.addColumn("Return Date");
        model.addColumn("Return Status");
        
        getData();
    }
    
     public final void searchData(String key){
        DefaultTableModel dtm = (DefaultTableModel) tableHistory.getModel();
         
        dtm.setRowCount(0);
         
        List<Transaction> listTrans = conTrans.searchTrans(key);
        String[] data = new String[6];
        for(Transaction trans : listTrans){
            data[0] = Integer.toString(trans.getTransaction_id());
            data[1] = trans.getUser_id();
            data[2] = trans.getBook_id();
            data[3] = trans.getBorrow_date();
            data[4] = trans.getReturn_date();
            data[5] = Integer.toString(trans.getReturn_status());
            
            dtm.addRow(data);
        }
     }
    
    public final void getData(){
        DefaultTableModel dtm = (DefaultTableModel) tableHistory.getModel();
        
        dtm.setRowCount(0);
        
        List<Transaction> listTrans = conTrans.showTransactionAdmin();
        String[] data = new String[6];
        for(Transaction trans : listTrans){
            data[0] = Integer.toString(trans.getTransaction_id());
            data[1] = trans.getUser_id();
            data[2] = trans.getBook_id();
            data[3] = trans.getBorrow_date();
            data[4] = trans.getReturn_date();
            data[5] = Integer.toString(trans.getReturn_status());
            
            dtm.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        Borrowbook = new javax.swing.JButton();
        Booklist = new javax.swing.JButton();
        hamburger = new javax.swing.JButton();
        History = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();
        SearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(71, 103, 237));
        sidebar.setPreferredSize(new java.awt.Dimension(60, 32));

        Borrowbook.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Borrowbook.setForeground(new java.awt.Color(195, 217, 233));
        Borrowbook.setText("Borrow Book");
        Borrowbook.setBorderPainted(false);
        Borrowbook.setContentAreaFilled(false);
        Borrowbook.setFocusPainted(false);
        Borrowbook.setHideActionText(true);
        Borrowbook.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Borrowbook.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Borrowbook.setIconTextGap(20);
        Borrowbook.setMargin(new java.awt.Insets(2, 0, 2, 14));
        Borrowbook.setMinimumSize(new java.awt.Dimension(0, 35));
        Borrowbook.setPreferredSize(new java.awt.Dimension(50, 574));
        Borrowbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowbookActionPerformed(evt);
            }
        });

        Booklist.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Booklist.setForeground(new java.awt.Color(195, 217, 233));
        Booklist.setText("Book List");
        Booklist.setBorderPainted(false);
        Booklist.setContentAreaFilled(false);
        Booklist.setHideActionText(true);
        Booklist.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Booklist.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Booklist.setIconTextGap(20);
        Booklist.setMargin(new java.awt.Insets(2, 0, 2, 14));
        Booklist.setMinimumSize(new java.awt.Dimension(0, 0));
        Booklist.setPreferredSize(new java.awt.Dimension(50, 574));
        Booklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooklistActionPerformed(evt);
            }
        });

        hamburger.setBackground(new java.awt.Color(34, 40, 47));
        hamburger.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        hamburger.setBorderPainted(false);
        hamburger.setContentAreaFilled(false);
        hamburger.setFocusPainted(false);
        hamburger.setHideActionText(true);
        hamburger.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        hamburger.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        hamburger.setIconTextGap(20);
        hamburger.setMargin(new java.awt.Insets(2, 3, 2, 14));
        hamburger.setMinimumSize(new java.awt.Dimension(0, 35));
        hamburger.setPreferredSize(new java.awt.Dimension(50, 574));
        hamburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburgerActionPerformed(evt);
            }
        });

        History.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        History.setForeground(new java.awt.Color(195, 217, 233));
        History.setText("Borrowing History");
        History.setBorderPainted(false);
        History.setContentAreaFilled(false);
        History.setFocusPainted(false);
        History.setHideActionText(true);
        History.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        History.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        History.setIconTextGap(20);
        History.setMargin(new java.awt.Insets(2, 0, 2, 14));
        History.setMinimumSize(new java.awt.Dimension(0, 35));
        History.setPreferredSize(new java.awt.Dimension(50, 574));
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 170, 214));
        jLabel13.setText("<html>Lbro</html>");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Borrowbook, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Booklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(hamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Booklist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Borrowbook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        mainPanel.setBackground(new java.awt.Color(249, 249, 249));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Borrowing History");

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSearch.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(194, 200, 204));
        txtSearch.setText("Genre, author, or book name");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableHistory);

        SearchButton.setBackground(new java.awt.Color(249, 249, 249));
        SearchButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(71, 103, 237));
        SearchButton.setText("Search");
        SearchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 103, 237)));
        SearchButton.setMaximumSize(new java.awt.Dimension(72, 25));
        SearchButton.setMinimumSize(new java.awt.Dimension(72, 25));
        SearchButton.setName(""); // NOI18N
        SearchButton.setPreferredSize(new java.awt.Dimension(72, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hamburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburgerActionPerformed
        // TODO add your handling code here:
        sp.onSideMenu();
    }//GEN-LAST:event_hamburgerActionPerformed

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
//        BorrowingHistoryView borrowingHistoryView = new BorrowingHistoryView(user);
//        dispose();
//        borrowingHistoryView.setVisible(true);
    }//GEN-LAST:event_HistoryActionPerformed

    private void BooklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooklistActionPerformed
        BookListView bookListView = new BookListView(user);
        bookListView.setVisible(true);
    }//GEN-LAST:event_BooklistActionPerformed

    private void BorrowbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowbookActionPerformed
        BorrowBookView borrowBookView = new BorrowBookView(user);
        dispose();
        borrowBookView.setVisible(true);
    }//GEN-LAST:event_BorrowbookActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(txtSearch.getText().equals("")){
            getData();
        } else {
            searchData(txtSearch.getText());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

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
                if ("Windows 7".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrowingHistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowingHistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowingHistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowingHistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowingHistoryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booklist;
    private javax.swing.JButton Borrowbook;
    private javax.swing.JButton History;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton hamburger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTable tableHistory;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
