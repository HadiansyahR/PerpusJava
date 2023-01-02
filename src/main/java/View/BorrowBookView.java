package View;
import Controller.BookController;
import Model.Book;
import Model.SideMenuPanel;
import Model.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class BorrowBookView extends javax.swing.JFrame {

    SideMenuPanel sp;
    User user;
    private DefaultTableModel model;
    
    BookController conBook = new BookController();
    
    public BorrowBookView() {

        initComponents();
        sp = new SideMenuPanel(this);
        sp.setMain(mainPanel);
        sp.setSide(sidebar);
        sp.setMinWidth(55);
        sp.setMaxWidth(150);
        sp.setMainAnimation(true);
        sp.setSpeed(4);
        sp.setResponsiveMinWidth(600);

    }
    
    public final void getData(){
        DefaultTableModel dtm = (DefaultTableModel) bookTable.getModel();
        
        dtm.setRowCount(0);
        
        List<Book> listBook = conBook.showBook();
        String[] data = new String[5];
        for(Book book : listBook){
            data[0] = book.getBook_id();
            data[1] = book.getBook_name();
            data[2] = book.getBook_genre();
            data[3] = Integer.toString(book.getQuantity());
            dtm.addRow(data);
        }
    }

    
    public final void searchData(String key){
         DefaultTableModel dtm = (DefaultTableModel) bookTable.getModel();
         
         dtm.setRowCount(0);
         
        List<Book> listBook = conBook.searchBook(key);
        String[] data = new String[5];
        for(Book book : listBook){
            data[0] = book.getBook_id();
            data[1] = book.getBook_name();
            data[2] = book.getBook_genre();
            data[3] = Integer.toString(book.getQuantity());
            dtm.addRow(data);
        }
     }
    
    //bikin constructor baru kaya gini
    public BorrowBookView(User user) {
        //tambah ini
        this.user = user;
        initComponents();
        sp = new SideMenuPanel(this);
        sp.setMain(mainPanel);
        sp.setSide(sidebar);
        sp.setMinWidth(55);
        sp.setMaxWidth(150);
        sp.setMainAnimation(true);
        sp.setSpeed(4);
        sp.setResponsiveMinWidth(601);

        model = new DefaultTableModel();
        bookTable.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("Book Name");
        model.addColumn("Book Genre");
        model.addColumn("Quantity");
        
        getData();
//        jLabel2.setText(user.getUsername());
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
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        SearchButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        txtBookGenre = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnBorrow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(71, 103, 237));
        sidebar.setPreferredSize(new java.awt.Dimension(60, 32));

        Borrowbook.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Borrowbook.setForeground(new java.awt.Color(195, 217, 233));
        Borrowbook.setIcon(new javax.swing.ImageIcon("D:\\Sekolah Agama\\Season 3\\ISB-205 Object Oriented Programming (Praktikum)\\PerpusJava\\src\\main\\java\\Assets\\3. bookdetail.png")); // NOI18N
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
        Booklist.setIcon(new javax.swing.ImageIcon("D:\\Sekolah Agama\\Season 3\\ISB-205 Object Oriented Programming (Praktikum)\\PerpusJava\\src\\main\\java\\Assets\\2. home1.png")); // NOI18N
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
        hamburger.setIcon(new javax.swing.ImageIcon("D:\\Sekolah Agama\\Season 3\\ISB-205 Object Oriented Programming (Praktikum)\\PerpusJava\\src\\main\\java\\Assets\\1. hamburger.png")); // NOI18N
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
        History.setIcon(new javax.swing.ImageIcon("D:\\Sekolah Agama\\Season 3\\ISB-205 Object Oriented Programming (Praktikum)\\PerpusJava\\src\\main\\java\\Assets\\4. history.png")); // NOI18N
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

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

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
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Book Detail");

        txtBookId.setBackground(new java.awt.Color(249, 249, 249));
        txtBookId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtBookId.setForeground(new java.awt.Color(196, 196, 196));
        txtBookId.setText("ID");
        txtBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Bookname:");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Genre:");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setText("Quantity:");

        txtBookName.setBackground(new java.awt.Color(249, 249, 249));
        txtBookName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtBookName.setForeground(new java.awt.Color(196, 196, 196));
        txtBookName.setText("Bookname");
        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });

        txtBookGenre.setBackground(new java.awt.Color(249, 249, 249));
        txtBookGenre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtBookGenre.setForeground(new java.awt.Color(196, 196, 196));
        txtBookGenre.setText("Genre");
        txtBookGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookGenreActionPerformed(evt);
            }
        });

        txtQuantity.setBackground(new java.awt.Color(249, 249, 249));
        txtQuantity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(196, 196, 196));
        txtQuantity.setText("0");
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnBorrow.setBackground(new java.awt.Color(71, 103, 237));
        btnBorrow.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnBorrow.setForeground(new java.awt.Color(249, 249, 249));
        btnBorrow.setText("Borrow a Book");
        btnBorrow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 103, 237)));
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBookGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBookGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Borrow Book");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2)
                    .addContainerGap(486, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel2)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        BorrowingHistoryView borrowingHistoryView = new BorrowingHistoryView(user);
        dispose();
        borrowingHistoryView.setVisible(true);
    }//GEN-LAST:event_HistoryActionPerformed

    private void BooklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooklistActionPerformed
        BookListView bookListView = new BookListView(user);
        dispose();
        bookListView.setVisible(true);
    }//GEN-LAST:event_BooklistActionPerformed

    private void BorrowbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowbookActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookIdActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void txtBookGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookGenreActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        List<Book> listBook = new ArrayList<>();
        listBook = conBook.showBook();
        
        int i = bookTable.getSelectedRow();
        if(i == -1){
            JOptionPane.showMessageDialog(btnBorrow, "Harap pilih salah satu data!",
                    "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        boolean borrow = conBook.borrowBook(user.getUser_id(), txtBookId.getText(), listBook);
        
        if(borrow){
            JOptionPane.showMessageDialog(btnBorrow, "Borrow Success");
            getData();
        }else{
            JOptionPane.showMessageDialog(btnBorrow, "Borrow Failed");
            getData();
        }
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(txtSearch.getText().equals("")){
            getData();
        } else {
            searchData(txtSearch.getText());
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int i = bookTable.getSelectedRow();
        
        TableModel model = bookTable.getModel();
        
        txtBookId.setText(model.getValueAt(i,0).toString());
        txtBookName.setText(model.getValueAt(i,1).toString());
        txtBookGenre.setText(model.getValueAt(i, 2).toString());
        txtQuantity.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_bookTableMouseClicked

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
            java.util.logging.Logger.getLogger(BorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BorrowBookView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booklist;
    private javax.swing.JButton Borrowbook;
    private javax.swing.JButton History;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton hamburger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField txtBookGenre;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
