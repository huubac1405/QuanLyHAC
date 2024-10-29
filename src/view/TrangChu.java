package view;

import Model.Ban;
import Model.CoSoVC;
import Model.HoatDong;
import Model.Quy;
import Model.ThanhVien;
import controller.Dao;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame implements View {
    private int indexThanhVien;
    private int indexQuy;
    private ArrayList<ThanhVien> listTV;
    private ArrayList<ThanhVien> listTVTimKiem;
    private ArrayList<CoSoVC> listCSVC;
    private List<CoSoVC> listTK;
    private List<CoSoVC> listCSVCSort;
    private ArrayList<HoatDong> listHD;
    private List<HoatDong> listTKHD;
    private List<HoatDong> listHDTT;
    private List<HoatDong> listTKHDTT;
    private ArrayList<Ban> listBan;

    private List<Quy> listQuy;
    private List<Quy> listTKCT;

    private final DefaultTableModel modelTV;
    private final DefaultTableModel modelCSVC;
    private final DefaultTableModel modelHDDT;
    private final DefaultTableModel modelHDTT;
    private final DefaultTableModel modelQuy;
    private final DefaultTableModel modelBan;

    DecimalFormat df = new DecimalFormat("#,###.000");

    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Trang chủ");
        listTV = new Dao().getUser();//// User
        listCSVC = new Dao().getInfras();//// CSVC
        listCSVCSort = new ArrayList<>();
        listTK = new ArrayList<>();
        listTKHD = new ArrayList<>();// traning
        listHD = new Dao().getTraining(); //// Daotao
        listHDTT = new Dao().getMedia();/// Truyen thong
        listQuy = new Dao().getSpend();// Quỹ
        listTKCT = new ArrayList<>();
        listTKHDTT = new ArrayList<>();
        listBan = new Dao().getBan();/// Ban
        modelTV = (DefaultTableModel) tblThanhVien.getModel();
        modelCSVC = (DefaultTableModel) tblCSVC.getModel();
        modelHDDT = (DefaultTableModel) tblHDDT.getModel();
        modelHDTT = (DefaultTableModel) tblTT.getModel();
        modelQuy = (DefaultTableModel) tableQuanLyChiTieu.getModel();
        modelBan = (DefaultTableModel) tblBan.getModel();

        showDataThanhVien();
        showDataQuy();
        showDataCSVC();
        showDataHDTT();
        showDataHDDT();
        showDataBan();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane7 = new javax.swing.JScrollPane();
        frameView = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThanhVien = new javax.swing.JTable();
        btnThemTV = new javax.swing.JButton();
        btnSuaThanhVien = new javax.swing.JButton();
        btnXoaThanhVien = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTongThanhVien = new javax.swing.JTextField();
        txtTimKiemThanhVien = new javax.swing.JTextField();
        btnTimKiemThanhVien = new javax.swing.JButton();
        rbtnNam = new javax.swing.JRadioButton();
        rbtnTruongBan = new javax.swing.JRadioButton();
        rbtnNu = new javax.swing.JRadioButton();
        btnLocTheoTieuChi = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CSVC = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCSVC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        themCSVC = new javax.swing.JButton();
        suaCSVC = new javax.swing.JButton();
        xoaCSVC = new javax.swing.JButton();
        bttimkiem = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        rbtsoluong = new javax.swing.JRadioButton();
        rbtdongia = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        MEdia = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTongThanhVienTT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTongChiPhiTT = new javax.swing.JTextField();
        themTT = new javax.swing.JButton();
        suaTT = new javax.swing.JButton();
        xoaTT = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtTimMedia = new javax.swing.JTextField();
        bttimkiemmedia = new javax.swing.JButton();
        bttimkiemmedia1 = new javax.swing.JButton();
        Traning = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHDDT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtThanhVienHDDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtChiPhiHDDT = new javax.swing.JTextField();
        themDT = new javax.swing.JButton();
        suaDT = new javax.swing.JButton();
        xoaDT = new javax.swing.JButton();
        txtFindInfra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Spend = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyChiTieu = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtchiphicon = new javax.swing.JTextField();
        themchitieu = new javax.swing.JButton();
        suachitieu = new javax.swing.JButton();
        xoachitieu = new javax.swing.JButton();
        bttimkiemchitieu = new javax.swing.JButton();
        txttimkiemchitieu = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Ban = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblBan = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        txtTongQuyBan = new javax.swing.JTextField();
        themBan = new javax.swing.JButton();
        suaBan = new javax.swing.JButton();
        xoaBan = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtslb = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        home = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        infra = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        media = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        train = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        spend = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ban = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameView.setBackground(new java.awt.Color(204, 204, 204));
        frameView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                frameViewAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        frameView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frameViewMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(153, 153, 255));

        jLabel20.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        jLabel20.setText("Welcome to HAC Club - Burn out your youth");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(910, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("SỰ KIỆN SẮP TỚI");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/main_3.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/main_1.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/main_4.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/main.jpg"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 153, 255));
        jLabel42.setText("BAN CHỦ NHIỆM");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_2.jpg"))); // NOI18N

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_3.jpg"))); // NOI18N

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_1.jpg"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 153, 255));
        jLabel46.setText("THÀNH VIÊN MỚI");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_5.jpg"))); // NOI18N

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_4.jpg"))); // NOI18N

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_6.jpg"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231)
                                .addComponent(jLabel50))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel12)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(jLabel50))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(606, Short.MAX_VALUE))
        );

        frameView.addTab("", Home);

        User.setBackground(new java.awt.Color(204, 204, 204));

        tblThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TV", "Tên TV", "Khoá", "Chuyên ngành", "Ban", "Ngày sinh", "Giới tính", "Email", "SĐT", "Chức vụ", "Mã ban"
            }
        ));
        tblThanhVien.setMaximumSize(new java.awt.Dimension(1026, 0));
        tblThanhVien.setMinimumSize(new java.awt.Dimension(1026, 0));
        jScrollPane2.setViewportView(tblThanhVien);

        btnThemTV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_circle_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btnThemTV.setText("Thêm");
        btnThemTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTVActionPerformed(evt);
            }
        });

        btnSuaThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btnSuaThanhVien.setText("Sửa ");
        btnSuaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThanhVienActionPerformed(evt);
            }
        });

        btnXoaThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btnXoaThanhVien.setText("Xoá ");
        btnXoaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThanhVienActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jLabel18.setText("Tổng số lượng thành viên :");

        txtTongThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongThanhVienActionPerformed(evt);
            }
        });

        btnTimKiemThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btnTimKiemThanhVien.setText("Tìm kiếm");
        btnTimKiemThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemThanhVienActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");
        rbtnNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnTruongBan);
        rbtnTruongBan.setText("Trưởng Ban");
        rbtnTruongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTruongBanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nữ");
        rbtnNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNuActionPerformed(evt);
            }
        });

        btnLocTheoTieuChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/filter_alt_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btnLocTheoTieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocTheoTieuChiActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/history_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel22.setText("QUẢN LÍ THÀNH VIÊN CLB HAC HaUI");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(865, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UserLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UserLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserLayout.createSequentialGroup()
                                .addComponent(btnThemTV, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnSuaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXoaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(243, 243, 243)
                        .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserLayout.createSequentialGroup()
                                .addComponent(btnLocTheoTieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UserLayout.createSequentialGroup()
                                .addComponent(rbtnNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnNu)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnTruongBan)))
                        .addGap(70, 70, 70))
                    .addGroup(UserLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 528, Short.MAX_VALUE))
        );
        UserLayout.setVerticalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8))
                    .addGroup(UserLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnNam)
                    .addComponent(rbtnNu)
                    .addComponent(rbtnTruongBan))
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnXoaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocTheoTieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(719, Short.MAX_VALUE))
        );

        frameView.addTab("", User);

        CSVC.setBackground(new java.awt.Color(204, 204, 204));

        tblCSVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thiết bị", "Tên thiết bị", "Trạng thái", "Số lượng", "Chi Phí CSVC", "Mã ban"
            }
        ));
        jScrollPane5.setViewportView(tblCSVC);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tổng số lượng thiết bị:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Tổng chi phí:");

        themCSVC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_circle_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        themCSVC.setText("Thêm");
        themCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themCSVCActionPerformed(evt);
            }
        });

        suaCSVC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        suaCSVC.setText("Sửa");
        suaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaCSVCActionPerformed(evt);
            }
        });

        xoaCSVC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        xoaCSVC.setText("Xoá");
        xoaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaCSVCActionPerformed(evt);
            }
        });

        bttimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        bttimkiem.setText("Tìm kiếm");
        bttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/history_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/swap_vert_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jButton4.setText("Sắp xếp");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        rbtsoluong.setText("Số lương");

        rbtdongia.setText("Đơn giá");
        rbtdongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtdongiaActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel34.setText("QUẢN LÝ CƠ SỞ VẬT CHẤT ");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout CSVCLayout = new javax.swing.GroupLayout(CSVC);
        CSVC.setLayout(CSVCLayout);
        CSVCLayout.setHorizontalGroup(
            CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CSVCLayout.createSequentialGroup()
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CSVCLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xoaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CSVCLayout.createSequentialGroup()
                                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(themCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(suaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96)
                        .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CSVCLayout.createSequentialGroup()
                                .addComponent(rbtsoluong)
                                .addGap(18, 18, 18)
                                .addComponent(rbtdongia))
                            .addGroup(CSVCLayout.createSequentialGroup()
                                .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bttimkiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addComponent(jButton4))))
                .addGap(0, 379, Short.MAX_VALUE))
        );
        CSVCLayout.setVerticalGroup(
            CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CSVCLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtsoluong)
                    .addComponent(rbtdongia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xoaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 672, Short.MAX_VALUE))
        );

        frameView.addTab("", CSVC);

        MEdia.setBackground(new java.awt.Color(204, 204, 204));
        MEdia.setPreferredSize(new java.awt.Dimension(1230, 716));

        tblTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sự Kiện", "Tên sự kiện", "Đánh giá", "Mô tả", "Số lượng thành viên", "Địa điểm", "Thời gian ", "Chi Phí", "Mã ban"
            }
        ));
        jScrollPane3.setViewportView(tblTT);

        jLabel1.setText("Tổng thành viên :");

        jLabel2.setText("Tổng chi phí :");

        themTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_circle_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        themTT.setText("Thêm sự kiện");
        themTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themTTActionPerformed(evt);
            }
        });

        suaTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        suaTT.setText("Sửa sự kiện");
        suaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaTTActionPerformed(evt);
            }
        });

        xoaTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        xoaTT.setText("Xoá sự kiện");
        xoaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTTActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel36.setText("QUẢN LÝ HOẠT ĐỘNG TRUYỀN THÔNG VÀ SỰ KIỆN CLB");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addContainerGap(697, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtTimMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimMediaActionPerformed(evt);
            }
        });

        bttimkiemmedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        bttimkiemmedia.setText("Tìm kiếm");
        bttimkiemmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemmediaActionPerformed(evt);
            }
        });

        bttimkiemmedia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/history_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        bttimkiemmedia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemmedia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MEdiaLayout = new javax.swing.GroupLayout(MEdia);
        MEdia.setLayout(MEdiaLayout);
        MEdiaLayout.setHorizontalGroup(
            MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MEdiaLayout.createSequentialGroup()
                        .addComponent(themTT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suaTT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtTongChiPhiTT))
                        .addGap(578, 578, 578))
                    .addGroup(MEdiaLayout.createSequentialGroup()
                        .addComponent(xoaTT)
                        .addGap(494, 494, 494)
                        .addComponent(txtTimMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttimkiemmedia)
                        .addGap(18, 18, 18)
                        .addComponent(bttimkiemmedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        MEdiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {suaTT, themTT, xoaTT});

        MEdiaLayout.setVerticalGroup(
            MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MEdiaLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(themTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttimkiemmedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttimkiemmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xoaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(735, Short.MAX_VALUE))
        );

        frameView.addTab("", MEdia);

        Traning.setBackground(new java.awt.Color(204, 204, 204));

        tblHDDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hoạt Động", "Tên hoạt động", "Thời gian", "Địa điểm", "Mô tả ", "Số lượng thành viên", "Kinh Phí", "Mã ban"
            }
        ));
        tblHDDT.setToolTipText("");
        jScrollPane4.setViewportView(tblHDDT);

        jLabel3.setText("Tổng số lượng thành viên :");

        txtThanhVienHDDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhVienHDDTActionPerformed(evt);
            }
        });

        jLabel4.setText("Tổng chi phí:");

        themDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_circle_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        themDT.setText("Thêm");
        themDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themDTActionPerformed(evt);
            }
        });

        suaDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        suaDT.setText("Sửa");
        suaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaDTActionPerformed(evt);
            }
        });

        xoaDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        xoaDT.setText("Xoá");
        xoaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaDTActionPerformed(evt);
            }
        });

        txtFindInfra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindInfraActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/history_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jButton3.setText("Refesh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel38.setText("QUẢN LÝ HOẠT ĐỘNG ĐÀO TẠO");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout TraningLayout = new javax.swing.GroupLayout(Traning);
        Traning.setLayout(TraningLayout);
        TraningLayout.setHorizontalGroup(
            TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraningLayout.createSequentialGroup()
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1239, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TraningLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(TraningLayout.createSequentialGroup()
                            .addComponent(themDT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(xoaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFindInfra, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TraningLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(439, 439, 439)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(168, 168, 168))
        );
        TraningLayout.setVerticalGroup(
            TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraningLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TraningLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFindInfra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TraningLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(suaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(705, Short.MAX_VALUE))
        );

        frameView.addTab("", Traning);

        Spend.setBackground(new java.awt.Color(204, 204, 204));

        tableQuanLyChiTieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chi tiêu", "Tên chi tiêu", "Thời gian", "Thu/Chi", "Tổng quỹ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableQuanLyChiTieu);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Tổng Chi Phí:");

        themchitieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_circle_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        themchitieu.setText("Thêm");
        themchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themchitieuActionPerformed(evt);
            }
        });

        suachitieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        suachitieu.setText("Sửa");
        suachitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suachitieuActionPerformed(evt);
            }
        });

        xoachitieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        xoachitieu.setText("Xóa");
        xoachitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoachitieuActionPerformed(evt);
            }
        });

        bttimkiemchitieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        bttimkiemchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemchitieuActionPerformed(evt);
            }
        });

        txttimkiemchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemchitieuActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/history_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));

        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel40.setText("Quản lý chi tiêu");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout SpendLayout = new javax.swing.GroupLayout(Spend);
        Spend.setLayout(SpendLayout);
        SpendLayout.setHorizontalGroup(
            SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpendLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addComponent(themchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xoachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addGap(706, 706, 706)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addComponent(bttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtchiphicon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
            .addGroup(SpendLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SpendLayout.setVerticalGroup(
            SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpendLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtchiphicon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttimkiemchitieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(themchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(xoachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(659, Short.MAX_VALUE))
        );

        frameView.addTab("", Spend);

        Ban.setBackground(new java.awt.Color(204, 204, 204));
        Ban.setForeground(new java.awt.Color(204, 204, 204));
        Ban.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(343, 61));

        jLabel51.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel51.setText("QUẢN LÍ BAN CLB HAC HaUI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 979, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane6.setPreferredSize(new java.awt.Dimension(452, 402));

        tblBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ban", "Tên ban", "Số lượng thành viên", "Tổng quỹ", "Mã quỹ"
            }
        ));
        jScrollPane6.setViewportView(tblBan);

        jLabel52.setText("Tổng quỹ ban:");

        themBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_circle_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        themBan.setText("Thêm");
        themBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBanActionPerformed(evt);
            }
        });

        suaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        suaBan.setText("Sửa");
        suaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBanActionPerformed(evt);
            }
        });

        xoaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        xoaBan.setText("Xóa");
        xoaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBanActionPerformed(evt);
            }
        });

        jLabel19.setText("Tổng số lượng ban:");

        javax.swing.GroupLayout BanLayout = new javax.swing.GroupLayout(Ban);
        Ban.setLayout(BanLayout);
        BanLayout.setHorizontalGroup(
            BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanLayout.createSequentialGroup()
                .addGroup(BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BanLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel52)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongQuyBan, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtslb, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BanLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(themBan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BanLayout.createSequentialGroup()
                                .addComponent(suaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(xoaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(768, Short.MAX_VALUE))
            .addGroup(BanLayout.createSequentialGroup()
                .addGroup(BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BanLayout.setVerticalGroup(
            BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtTongQuyBan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtslb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(themBan, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xoaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 693, Short.MAX_VALUE))
        );

        jScrollPane6.getAccessibleContext().setAccessibleName("");

        frameView.addTab("", Ban);

        jScrollPane7.setViewportView(frameView);

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));

        jLabel15.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel15.setText("HAC CLUB");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2324150_club_dance_disco_fun_music_icon.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Home");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        user.setBackground(new java.awt.Color(204, 204, 204));
        user.setPreferredSize(new java.awt.Dimension(238, 48));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Users");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        infra.setBackground(new java.awt.Color(204, 204, 204));
        infra.setPreferredSize(new java.awt.Dimension(238, 48));
        infra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infraMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Infrastructure");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/csvc.png"))); // NOI18N

        javax.swing.GroupLayout infraLayout = new javax.swing.GroupLayout(infra);
        infra.setLayout(infraLayout);
        infraLayout.setHorizontalGroup(
            infraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infraLayout.setVerticalGroup(
            infraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        media.setBackground(new java.awt.Color(204, 204, 204));
        media.setPreferredSize(new java.awt.Dimension(238, 48));
        media.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediaMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Media");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8687858_ic_fluent_star_emphasis_regular_icon.png"))); // NOI18N

        javax.swing.GroupLayout mediaLayout = new javax.swing.GroupLayout(media);
        media.setLayout(mediaLayout);
        mediaLayout.setHorizontalGroup(
            mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mediaLayout.setVerticalGroup(
            mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        train.setBackground(new java.awt.Color(204, 204, 204));
        train.setPreferredSize(new java.awt.Dimension(238, 48));
        train.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainMouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Training");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/daotao.png"))); // NOI18N

        javax.swing.GroupLayout trainLayout = new javax.swing.GroupLayout(train);
        train.setLayout(trainLayout);
        trainLayout.setHorizontalGroup(
            trainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trainLayout.setVerticalGroup(
            trainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        spend.setBackground(new java.awt.Color(204, 204, 204));
        spend.setPreferredSize(new java.awt.Dimension(238, 48));
        spend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spendMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Spend");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8687401_ic_fluent_money_regular_icon.png"))); // NOI18N

        javax.swing.GroupLayout spendLayout = new javax.swing.GroupLayout(spend);
        spend.setLayout(spendLayout);
        spendLayout.setHorizontalGroup(
            spendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spendLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        spendLayout.setVerticalGroup(
            spendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        ban.setBackground(new java.awt.Color(204, 204, 204));
        ban.setMinimumSize(new java.awt.Dimension(0, 0));
        ban.setPreferredSize(new java.awt.Dimension(238, 48));
        ban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanClick(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel53.setText("Ban");

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/construction_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N

        javax.swing.GroupLayout banLayout = new javax.swing.GroupLayout(ban);
        ban.setLayout(banLayout);
        banLayout.setHorizontalGroup(
            banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(banLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        banLayout.setVerticalGroup(
            banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infra, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(media, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(train, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(spend, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(ban, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(infra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(train, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(0);
        setColor(home);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);

        resetColor(media);

        resetColor(ban);

    }// GEN-LAST:event_homeMouseClicked

    private void infraMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_infraMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(2);
        setColor(infra);
        resetColor(user);

        resetColor(home);

        resetColor(train);

        resetColor(spend);

        resetColor(media);

        resetColor(ban);

    }// GEN-LAST:event_infraMouseClicked

    private void mediaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_mediaMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(3);
        setColor(media);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);

        resetColor(home);
        resetColor(ban);
    }// GEN-LAST:event_mediaMouseClicked

    private void trainMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_trainMouseClicked
        frameView.setSelectedIndex(4);
        setColor(train);
        resetColor(user);

        resetColor(infra);

        resetColor(home);

        resetColor(spend);

        resetColor(media);
        resetColor(ban);
    }// GEN-LAST:event_trainMouseClicked

    private void spendMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_spendMouseClicked
        frameView.setSelectedIndex(5);
        setColor(spend);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(home);

        resetColor(media);
        resetColor(ban);
    }// GEN-LAST:event_spendMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_userMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(1);
        setColor(user);
        resetColor(home);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);

        resetColor(media);
        resetColor(ban);
    }// GEN-LAST:event_userMouseClicked

    private void frameViewMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_frameViewMouseClicked

    }// GEN-LAST:event_frameViewMouseClicked

    private void frameViewAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_frameViewAncestorAdded
        // TODO add your handling code here:
    }// GEN-LAST:event_frameViewAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showDataQuy();
        txttimkiemchitieu.setText("");
    }// GEN-LAST:event_jButton2ActionPerformed

    private void txttimkiemchitieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txttimkiemchitieuActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txttimkiemchitieuActionPerformed

    private void bttimkiemchitieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bttimkiemchitieuActionPerformed
        // TODO add your handling code here:

        listTKCT.removeAll(listTKCT);
        int flag = 0;
        if (txttimkiemchitieu.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập mã quỹ cần tìm!");
        } else {
            for (Quy item : listQuy) {
                if (item.getTenHD().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase())
                        || (item.getMaQuy().toLowerCase()
                                .contains(txttimkiemchitieu.getText().toLowerCase()))
                        || (item.getThoiGian().toLowerCase()
                                .contains(txttimkiemchitieu.getText().toLowerCase()))) {
                    flag = 1;
                    listTKCT.add(item);
                }
            }
            if (flag == 1) {
                showDataQuySearch();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không tồn tại mã quỹ như đã nhập!");
            }
        }

    }// GEN-LAST:event_bttimkiemchitieuActionPerformed

    private void xoachitieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoachitieuActionPerformed
        // TODO add your handling code here:

        int rmQuy = tableQuanLyChiTieu.getSelectedRow();
        if (rmQuy == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn thông tin cần xóa");
        } else if (listQuy.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        } else if (rmQuy != -1) {
            int d = 0;
            for (var z : new Dao().getBan()) {
                if (z.getMaQuy().equalsIgnoreCase(listQuy.get(rmQuy).getMaQuy())) {
                    d = -1;
                    JOptionPane.showMessageDialog(rootPane,
                            "Vẫn còn ban sử dụng quỹ, yêu cầu chuyển quỹ khác!");
                    break;
                }
            }
            if (d != -1) {
                if (new Dao().removeSpend(tableQuanLyChiTieu.getValueAt(rmQuy, 0).toString())) {
                    listQuy.remove(rmQuy);
                }
                showData(listQuy, modelQuy);
            }
        }
        showDataQuy();
    }// GEN-LAST:event_xoachitieuActionPerformed

    private void suachitieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_suachitieuActionPerformed
        // TODO add your handling code here:
        indexQuy = tableQuanLyChiTieu.getSelectedRow();
        if (listQuy.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Danh sach quy dang rỗng");
        } else if (indexQuy == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chọn phần thông tin bạn muốn chỉnh sửa rồi chỉnh sửa !");
        } else {
            new EditQuy(this, rootPaneCheckingEnabled, indexQuy).setVisible(true);
        }
        showDataQuy();
    }// GEN-LAST:event_suachitieuActionPerformed

    private void themchitieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_themchitieuActionPerformed
        // new AddQuy(this, rootPaneCheckingEnabled).setVisible(true);
    }// GEN-LAST:event_themchitieuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        showDataHDDT();
        txtFindInfra.setText("");
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        if (txtFindInfra.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Vui Lòng nhập tên hoạt động cần tìm kiếm!");
        } else {
            flag = true;
        }
        if (flag) {
            listTKHD.removeAll(listTKHD);
            for (HoatDong item : listHD) {
                if (item.getTenHD().toLowerCase().contains(txtFindInfra.getText().toLowerCase())
                        || (item.getThoiGian().toLowerCase()
                                .contains(txtFindInfra.getText().toLowerCase()))
                        || (item.getDiaDiem().toLowerCase()
                                .contains(txtFindInfra.getText().toLowerCase()))) {
                    listTKHD.add(item);

                }
            }
            showDataDTSearch();
        }

    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtFindInfraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFindInfraActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFindInfraActionPerformed

    private void xoaDTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listHD.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        } else {
            // int isCheckYesNo = JOptionPane.showConfirmDialog(null,
            // "Bạn có thật sự muốn xóa?", "Select an Option...",
            // JOptionPane.YES_NO_CANCEL_OPTION);
            // if (isCheckYesNo == 0) {
            if (new Dao().removeTraining(tblHDDT.getValueAt(vitri, 0).toString())) {
                System.out.println(tblHDDT.getValueAt(vitri, 0).toString());
                listHD.remove(vitri);
            }
            showData(listHD, modelHDDT);
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
            // }
        }
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }// GEN-LAST:event_xoaDTActionPerformed

    private void suaDTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_suaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        if (listHD.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm hoạt động");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        } else {
            // new EditDaoTao(this, rootPaneCheckingEnabled, vitri).setVisible(true);
            EditDaoTao daoTao = new EditDaoTao(this, rootPaneCheckingEnabled, vitri);
            daoTao.setEditData(listHD.get(vitri));
            daoTao.setVisible(true);
        }
        showDataHDDT();
    }// GEN-LAST:event_suaDTActionPerformed

    private void themDTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_themDTActionPerformed
        new AddDaoTao(this, rootPaneCheckingEnabled).setVisible(true);
    }// GEN-LAST:event_themDTActionPerformed

    private void xoaTTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else {
            if (new Dao().removeMedia(tblTT.getValueAt(vitri, 0).toString())) {
                listHDTT.remove(vitri);
            }
            showData(listHDTT, modelHDTT);
        }
        showDataHDTT();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }// GEN-LAST:event_xoaTTActionPerformed

    private void suaTTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_suaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm sự kiện");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 hàng rồi chỉnh sửa !");
        } else {
            // new EditTruyenThong(this, rootPaneCheckingEnabled, vitri).setVisible(true);
            EditTruyenThong editTT = new EditTruyenThong(this, rootPaneCheckingEnabled, vitri);
            editTT.setEditData(listHDTT.get(vitri));
            editTT.setVisible(true);
        }
        showDataHDTT();
    }// GEN-LAST:event_suaTTActionPerformed

    private void themTTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_themTTActionPerformed
        // TODO add your handling code here:
        new AddTruyenThong(this, rootPaneCheckingEnabled).setVisible(true);
    }// GEN-LAST:event_themTTActionPerformed

    private void rbtdongiaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbtdongiaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rbtdongiaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        listCSVCSort.removeAll(listCSVCSort);
        listCSVCSort = new Dao().getInfras();
        if (rbtsoluong.isSelected() == true) {
            Collections.sort(listCSVCSort, new sortByCountInCSVC());
        } else if (rbtdongia.isSelected() == true) {
            Collections.sort(listCSVCSort, new sortByGiainCSVC());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn tiêu chí sắp xếp");
        }
        showDataCSVCSort();
    }// GEN-LAST:event_jButton4ActionPerformed

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txttimActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txttimActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        showDataCSVC();
        txttim.setText("");
        rbtsoluong.setSelected(false);
        rbtdongia.setSelected(false);
    }// GEN-LAST:event_jButton5ActionPerformed

    private void bttimkiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bttimkiemActionPerformed
        // TODO add your handling code here:
        listTK.removeAll(listTK);
        int flag = 0;
        if (txttim.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Vui lòng nhập vào mã thiết bị hoặc tên thiết bị để tìm kiếm!");
        } else {
            for (CoSoVC item : listCSVC) {
                if (item.getTenCSVC().toLowerCase().contains(txttim.getText().toLowerCase())
                        || (item.getMaCSVC().toLowerCase()
                                .contains(txttim.getText().toLowerCase()))
                        || (item.getTrangThai().toLowerCase()
                                .contains(txttim.getText().toLowerCase()))) {
                    flag = 1;
                    listTK.add(item);
                }
            }
            if (flag == 0) {
                JOptionPane.showMessageDialog(rootPane,
                        "Không tìm thấy thiết bị cần tìm! Vui lòng nhập lại!");
            } else {
                showDataCSVCSearch();
            }
        }
    }// GEN-LAST:event_bttimkiemActionPerformed

    private void xoaCSVCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listCSVC.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        } else {
            if (new Dao().removeInfras(tblCSVC.getValueAt(vitri, 0).toString())) {
                listCSVC.remove(vitri);
            }
            showData(listCSVC, modelCSVC);
        }
        showDataCSVC();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }// GEN-LAST:event_xoaCSVCActionPerformed

    private void suaCSVCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_suaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        if (listCSVC.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm thiết bị");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        } else {
            EditCSVC cEditCSVC = new EditCSVC(this, rootPaneCheckingEnabled, vitri);
            cEditCSVC.setEditData(listCSVC.get(vitri));
            cEditCSVC.setVisible(true);
        }
        showDataCSVC();
    }// GEN-LAST:event_suaCSVCActionPerformed

    private void themCSVCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_themCSVCActionPerformed
        new AddCSVC(this, rootPaneCheckingEnabled).setVisible(true);
    }// GEN-LAST:event_themCSVCActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField5ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        showDataThanhVien();
        txtTimKiemThanhVien.setText("");
    }// GEN-LAST:event_btnRefreshActionPerformed

    private void btnLocTheoTieuChiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLocTheoTieuChiActionPerformed
        // TODO add your handling code here:

        if (!rbtnNam.isSelected() && !rbtnNu.isSelected() && !rbtnTruongBan.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tiêu chí!");
            return;
        }

        List<ThanhVien> filteredList = new ArrayList<>();
        for (ThanhVien x : listTV) {
            if (rbtnNam.isSelected() && x.getGioiTinh().equals("Nam")) {
                filteredList.add(x);
            } else if (rbtnNu.isSelected() && x.getGioiTinh().equals("Nữ")) {
                filteredList.add(x);
            } else if (rbtnTruongBan.isSelected() && x.getChucDanh().equals("Trưởng Ban")) {
                filteredList.add(x);
            }
        }
        showData(filteredList, modelTV);
        tongThanhVien(filteredList);
    }// GEN-LAST:event_btnLocTheoTieuChiActionPerformed

    private void rbtnNamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbtnNamActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rbtnNamActionPerformed

    private void btnTimKiemThanhVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimKiemThanhVienActionPerformed
        // TODO add your handling code here:
        String tim = txtTimKiemThanhVien.getText().toUpperCase();
        int ktra = 0;
        for (ThanhVien x : listTV) {
            if (x.getTenTV().toUpperCase().contains(tim) || x.getMaTV().toUpperCase().equals(tim)) {
                ktra = 1;
                break;
            }
        }
        if (tim.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập tên hoặc mã thành viên cần tìm!");
        } else if (ktra == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Không tồn tại tên hoặc mã thành viên này trong danh sách!");
        } else {
            TimKiemTv1 editTV = new TimKiemTv1(this, rootPaneCheckingEnabled);
            List<ThanhVien> listTVTimKiem1 = new ArrayList<>();
            for (ThanhVien x : listTV) {
                if (x.getTenTV().toUpperCase().contains(tim) || x.getMaTV().toUpperCase().equals(tim)) {
                    listTVTimKiem1.add(x);
                }
            }
            editTV.updateTable(listTVTimKiem1);
            editTV.setVisible(true);
        }
        this.showData(listTV, modelTV);
    }// GEN-LAST:event_btnTimKiemThanhVienActionPerformed

    private void txtTongThanhVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTongThanhVienActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtTongThanhVienActionPerformed

    private void btnXoaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaThanhVienActionPerformed
        // TODO add your handling code here:
        int removeThanhVien = tblThanhVien.getSelectedRow();
        System.out.println(removeThanhVien);
        if (removeThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else {
            if (new Dao().removeUser(tblThanhVien.getValueAt(removeThanhVien, 0).toString())) {
                System.out.println(removeThanhVien);
                listTV.remove(removeThanhVien);
            }
        }
        showDataThanhVien();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);

    }// GEN-LAST:event_btnXoaThanhVienActionPerformed

    private void btnSuaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSuaThanhVienActionPerformed
        // TODO add your handling code here:
        indexThanhVien = tblThanhVien.getSelectedRow();
        if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy nhập thêm thành viên");
        } else if (indexThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn thành viên rồi chỉnh sửa !");
        } else {
            EditThanhVien editTV = new EditThanhVien(this, rootPaneCheckingEnabled);
            editTV.setEditData(listTV.get(indexThanhVien));
            editTV.setVisible(true);
        }
        showDataThanhVien();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
    }// GEN-LAST:event_btnSuaThanhVienActionPerformed

    private void btnThemTVActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemTVActionPerformed
        new AddThanhVien(this, rootPaneCheckingEnabled).setVisible(true);
    }// GEN-LAST:event_btnThemTVActionPerformed

    private void rbtnTruongBanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbtnTruongBanActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rbtnTruongBanActionPerformed

    private void rbtnNuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbtnNuActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rbtnNuActionPerformed

    private void txtTimMediaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTimMediaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtTimMediaActionPerformed

    private void bttimkiemmediaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bttimkiemmediaActionPerformed
        listTKHDTT.removeAll(listTKHDTT);
        int flag = 0;
        if (txtTimMedia.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập vào mã sự kiện hoặc để tìm kiếm!");
        } else {
            for (HoatDong item : listHDTT) {
                if (item.getTenHD().toLowerCase().contains(txtTimMedia.getText().toLowerCase())
                        || (item.getMaHD().toLowerCase()
                                .contains(txtTimMedia.getText().toLowerCase()))

                ) {
                    flag = 1;
                    listTKHDTT.add(item);
                }
            }
            if (flag == 0) {
                JOptionPane.showMessageDialog(rootPane,
                        "Không tìm thấy thiết bị cần tìm! Vui lòng nhập lại!");
            } else {
                showDataHDTTSearch();
            }
        }
    }// GEN-LAST:event_bttimkiemmediaActionPerformed

    private void bttimkiemmedia1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bttimkiemmedia1ActionPerformed
        showDataHDTT();
    }// GEN-LAST:event_bttimkiemmedia1ActionPerformed

    private void themBanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_themBanActionPerformed
        // TODO add your handling code here:
        new AddBan(this, rootPaneCheckingEnabled).setVisible(true);
    }// GEN-LAST:event_themBanActionPerformed

    private void xoaBanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoaBanActionPerformed
        // TODO add your handling code here:
        int vitri = tblBan.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listBan.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        } else if (listBan.get(vitri).getSoLuongTv() > 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Vẫn còn thành viên trong ban, yêu cầu chuyển ban khác!");
        } else {
            if (new Dao().removeBan(tblBan.getValueAt(vitri, 0).toString())) {
                listBan.remove(vitri);
            }
            showData(listBan, modelBan);
        }
        showDataBan();

    }// GEN-LAST:event_xoaBanActionPerformed

    private void txtThanhVienHDDTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtThanhVienHDDTActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtThanhVienHDDTActionPerformed

    private void suaBanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_suaBanActionPerformed
        // TODO add your handling code here:
        int vitri = tblBan.getSelectedRow();
        if (listBan.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm ban");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        } else {
            new EditBan(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataBan();
    }// GEN-LAST:event_suaBanActionPerformed

    private void BanClick(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_BanClick
        frameView.setSelectedIndex(6);
        setColor(ban);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);

        resetColor(home);
        resetColor(media);
    }// GEN-LAST:event_BanClick

    void setColor(JPanel panel) {
        panel.setBackground(new Color(242, 242, 242));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(204, 204, 204));

    }

    public void tongThanhVien(List<ThanhVien> list) {
        int tong = 0;
        for (ThanhVien x : list) {
            tong += 1;
        }
        txtTongThanhVien.setText(String.valueOf(tong));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ban;
    private javax.swing.JPanel CSVC;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel MEdia;
    private javax.swing.JPanel Spend;
    private javax.swing.JPanel Traning;
    private javax.swing.JPanel User;
    private javax.swing.JPanel ban;
    private javax.swing.JButton btnLocTheoTieuChi;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSuaThanhVien;
    private javax.swing.JButton btnThemTV;
    private javax.swing.JButton btnTimKiemThanhVien;
    private javax.swing.JButton btnXoaThanhVien;
    private javax.swing.JButton bttimkiem;
    private javax.swing.JButton bttimkiemchitieu;
    private javax.swing.JButton bttimkiemmedia;
    private javax.swing.JButton bttimkiemmedia1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane frameView;
    private javax.swing.JPanel home;
    private javax.swing.JPanel infra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel media;
    private javax.swing.JRadioButton rbtdongia;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JRadioButton rbtnTruongBan;
    private javax.swing.JRadioButton rbtsoluong;
    private javax.swing.JPanel spend;
    private javax.swing.JButton suaBan;
    private javax.swing.JButton suaCSVC;
    private javax.swing.JButton suaDT;
    private javax.swing.JButton suaTT;
    private javax.swing.JButton suachitieu;
    private javax.swing.JTable tableQuanLyChiTieu;
    private javax.swing.JTable tblBan;
    private javax.swing.JTable tblCSVC;
    private javax.swing.JTable tblHDDT;
    private javax.swing.JTable tblTT;
    private javax.swing.JTable tblThanhVien;
    private javax.swing.JButton themBan;
    private javax.swing.JButton themCSVC;
    private javax.swing.JButton themDT;
    private javax.swing.JButton themTT;
    private javax.swing.JButton themchitieu;
    private javax.swing.JPanel train;
    private javax.swing.JTextField txtChiPhiHDDT;
    private javax.swing.JTextField txtFindInfra;
    private javax.swing.JTextField txtThanhVienHDDT;
    private javax.swing.JTextField txtTimKiemThanhVien;
    private javax.swing.JTextField txtTimMedia;
    private javax.swing.JTextField txtTongChiPhiTT;
    private javax.swing.JTextField txtTongQuyBan;
    private javax.swing.JTextField txtTongThanhVien;
    private javax.swing.JTextField txtTongThanhVienTT;
    private javax.swing.JTextField txtchiphicon;
    private javax.swing.JTextField txtslb;
    private javax.swing.JTextField txttim;
    private javax.swing.JTextField txttimkiemchitieu;
    private javax.swing.JPanel user;
    private javax.swing.JButton xoaBan;
    private javax.swing.JButton xoaCSVC;
    private javax.swing.JButton xoaDT;
    private javax.swing.JButton xoaTT;
    private javax.swing.JButton xoachitieu;
    // End of variables declaration//GEN-END:variables

    private void showDataThanhVien() {
        this.showData(listTV, modelTV);
        int tong = 0;
        for (ThanhVien x : listTV) {
            tong += 1;
        }
        txtTongThanhVien.setText(String.valueOf(tong));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    private void showDataBan() {
        modelBan.setNumRows(0);
        this.showData(listBan, modelBan);

        int slb = 0;
        double TongChiPhi = 0;
        for (var x : listBan) {
            slb++;
            TongChiPhi += x.getTongQuy();
        }
        txtslb.setText("" + slb);
        txtTongQuyBan.setText("" + df.format(TongChiPhi));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void addBan(Ban t) {
        if (new Dao().addBan(t)) {
            listBan.add(t);
        }
        this.showData(listBan, modelBan);
        showDataBan();
    }

    public void addThanhVien(ThanhVien t) {
        if (new Dao().addUser(t)) {
            listTV.add(t);
        }
        this.showData(listTV, modelTV);
        showDataThanhVien();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);

    }

    private void showDataQuy() {
        this.showData(listQuy, modelQuy);
        double chiphicl = 0;
        for (Quy x : listQuy) {
            chiphicl += x.getChiPhi();
        }
        txtchiphicon.setText("" + chiphicl);
    }

    private void showDataQuySearch() {
        this.showData(listTKCT, modelQuy);
        double chiphicl = 0;
        for (Quy x : listTKCT) {
            chiphicl += x.getChiPhi();
        }
        txtchiphicon.setText("" + chiphicl);
    }

    public void addQuy(Quy q) {
        if (new Dao().addSpend(q)) {
            listQuy.add(q);
        }
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    private void showDataCSVC() {
        modelCSVC.setNumRows(0);
        this.showData(listCSVC, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }

    private void showDataCSVCSearch() {
        modelCSVC.setNumRows(0);
        this.showData(listTK, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listTK) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }

    private void showDataHDTTSearch() {
        this.showData(listTKHDTT, modelHDTT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listTKHDTT) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtTongThanhVienTT.setText(String.valueOf(SoThanhVien));
        txtTongChiPhiTT.setText(String.valueOf(TongChiPhi));
    }

    private void showDataCSVCSort() {
        modelCSVC.setNumRows(0);
        this.showData(listCSVCSort, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }

    public void addCSVC(CoSoVC cs) {
        if (new Dao().addInfras(cs)) {
            listCSVC.add(cs);
        }
        this.showData(listCSVC, modelCSVC);
        showDataCSVC();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();

    }

    private void showDataHDTT() {
        modelHDTT.setNumRows(0);
        this.showData(listHDTT, modelHDTT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHDTT) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtTongThanhVienTT.setText(String.valueOf(SoThanhVien));
        txtTongChiPhiTT.setText(String.valueOf(TongChiPhi));
    }

    private void showDataHDDT() {
        modelHDDT.setNumRows(0);
        this.showData(listHD, modelHDDT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + df.format(TongChiPhi));
    }

    private void showDataDTSearch() {
        this.showData(listTKHD, modelHDDT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listTKHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + df.format(TongChiPhi));
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addHD(HoatDong a) {
        if (new Dao().addTraining(a)) {
            listHD.add(a);

        }
        this.showData(listHD, modelHDDT);
        showDataHDDT();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    public void addTT(HoatDong tt) {
        if (new Dao().addMedia(tt)) {
            listHDTT.add(tt);
        }
        this.showData(listHDTT, modelHDTT);
        showDataHDTT();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    void updateThanhVien(ThanhVien tv) {
        ThanhVien thanhVienDaChon = listTV.get(indexThanhVien);
        thanhVienDaChon.setMaTV(tv.getMaTV());
        thanhVienDaChon.setTenTV(tv.getTenTV());
        thanhVienDaChon.setKhoa(tv.getKhoa());
        thanhVienDaChon.setChuyenNghanh(tv.getChuyenNghanh());
        thanhVienDaChon.setBan(tv.getBan());
        thanhVienDaChon.setNgaySinh(tv.getNgaySinh());
        thanhVienDaChon.setGioiTinh(tv.getGioiTinh());
        thanhVienDaChon.setEmail(tv.getEmail());
        thanhVienDaChon.setSdt(tv.getSdt());
        thanhVienDaChon.setMaBan(tv.getMaBan());
        thanhVienDaChon.setChucDanh(tv.getChucDanh());
        if (new Dao().updateUser(tblThanhVien.getValueAt(indexThanhVien, 0).toString(), thanhVienDaChon)) {
            listTV.set(indexThanhVien, thanhVienDaChon);
        }
        showDataThanhVien();
    }

    public void updataQuy(Quy q, int indexQuy) {
        if (new Dao().updateSpend(q.getMaQuy(), q)) {
            listQuy.set(indexQuy, q);
        }
        showData(listQuy, modelQuy);
        showDataQuy();

    }

    public void editCSVC(CoSoVC cs, int vt) {
        if (new Dao().updateInfras(cs.getMaCSVC(), cs)) {
            listCSVC.set(vt, cs);
        }
        showData(listCSVC, modelCSVC);
        showDataCSVC();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    public void editBan(Ban b, int vt) {
        if (new Dao().updateBan(b.getMaBan(), b)) {
            listBan.set(vt, b);
        }
        showData(listBan, modelBan);
        showDataBan();
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    public void editHD(HoatDong a, int vt) {
        if (new Dao().updateTraining(a.getMaHD(), a)) {
            listHD.set(vt, a);
        }
        showData(listHD, modelHDDT);
        showDataHDDT();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    public void editHDTT(HoatDong tt, int vt) {
        if (new Dao().updateMedia(tt.getMaHD(), tt)) {
            listHDTT.set(vt, tt);
        }
        showData(listHDTT, modelHDTT);
        showDataHDTT();
        listBan = new Dao().getBan();
        this.showData(listBan, modelBan);
        listQuy = new Dao().getSpend();
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }

    public <T> void showData(List<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof ThanhVien) {
                ThanhVien tv = (ThanhVien) t;
                model.addRow(new Object[] {
                        tv.getMaTV(), tv.getTenTV(), tv.getKhoa(), tv.getChuyenNghanh(),
                        tv.getBan(),
                        tv.getNgaySinh(), tv.getGioiTinh(), tv.getEmail(), tv.getSdt(),
                        tv.getChucDanh(), tv.getMaBan()
                });
            }
            if (t instanceof Quy) {
                Quy q = (Quy) t;
                model.addRow(new Object[] {
                        q.getMaQuy(), q.getTenHD(), q.getThoiGian(), q.getChiPhi(),
                        q.getTongQuy()
                });
            }
            if (t instanceof HoatDong) {
                HoatDong z = (HoatDong) t;
                if (z.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                    model.addRow(new Object[] {
                            z.getMaHD(), z.getTenHD(), z.getThoiGian(), z.getDiaDiem(),
                            z.getMoTa(), z.getSoThanhVien(),
                            z.getKinhPhi(), z.getMaBan()
                    });
                }
            }
            if (t instanceof HoatDong) {
                HoatDong a = (HoatDong) t;
                if (a.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                    model.addRow(new Object[] {
                            a.getMaHD(), a.getTenHD(), a.getDanhGia(), a.getMoTa(),
                            a.getSoThanhVien(), a.getDiaDiem(),
                            a.getThoiGian(), a.getKinhPhi(), a.getMaBan()
                    });
                }
            }
            if (t instanceof CoSoVC) {
                CoSoVC csvc = (CoSoVC) t;
                model.addRow(new Object[] {
                        csvc.getMaCSVC(), csvc.getTenCSVC(), csvc.getTrangThai(),
                        csvc.getSoLuong(), csvc.getChiPhi(),
                        csvc.getMaBan()
                });
            }
            if (t instanceof Ban) {
                Ban ban = (Ban) t;
                model.addRow(new Object[] {
                        ban.getMaBan(), ban.getTenBan(), ban.getSoLuongTv(), ban.getTongQuy(),
                        ban.getMaQuy()
                });
            }
        }
    }

}
