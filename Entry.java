/* 
        Code for OOM Assignment 5a by LUV || IIT2016085
*/

package StudentDatabase;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Entry extends javax.swing.JFrame {
    private JPanel PPG;
    private JPanel PPGPHD;
    private JPanel PPHD;
    private JPanel PUG;
    private JPanel PUGPG;
    private JButton add;
    private JButton bpg;
    private JButton bpgphd;
    private JButton bphd;
    private JButton bug;
    private JButton bugpg;
    private JButton clear;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLayeredPane jLayeredPane1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextField pgcg;
    private JTextField pgdep;
    private JTextField pgphdcg;
    private JTextField pgphdmig;
    private JTextField pgphdthesis;
    private JTextField pgspec;
    private JTextField pgthes;
    private JTextField phdthes;
    private JButton show;
    private JTextField tcredits;
    private JTextField tname;
    private JTextField tperiod;
    private JTextField troll;
    private JTextField ugcg;
    private JTextField ugdep;
    private JTextField ugpgcg;
    private JTextField ugpgcon;
    private JTextField ugpgdep;
    private JTextField ugpgspec;
    private JTextField ugpgthes;
    Batch batch;
    public Entry(){
        batch = new Batch();
        initComponents();
    }                      
    private void initComponents() {

        jPanel1 = new JPanel();
        tname = new JTextField();
        troll = new JTextField();
        tperiod = new JTextField();
        tcredits = new JTextField();
        bug = new JButton();
        bpg = new JButton();
        bphd = new JButton();
        bugpg = new JButton();
        bpgphd = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLayeredPane1 = new JLayeredPane();
        PPHD = new JPanel();
        phdthes = new JTextField();
        PUG = new JPanel();
        ugcg = new JTextField();
        ugdep = new JTextField();
        PUGPG = new JPanel();
        ugpgdep = new JTextField();
        ugpgcg = new JTextField();
        ugpgspec = new JTextField();
        ugpgthes = new JTextField();
        ugpgcon = new JTextField();
        PPGPHD = new JPanel();
        pgphdcg = new JTextField();
        pgphdmig = new JTextField();
        pgphdthesis = new JTextField();
        PPG = new JPanel();
        pgdep = new JTextField();
        pgspec = new JTextField();
        pgthes = new JTextField();
        pgcg = new JTextField();
        jPanel2 = new JPanel();
        add = new JButton();
        show = new JButton();
        clear = new JButton();
        jPanel3 = new JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Database");

        tname.setText("Name");

        troll.setText("RollNum");

        tperiod.setText("Period of Registration");

        tcredits.setText("Credits");

        bug.setText("UG");
        bug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bugActionPerformed(evt);
            }
        });

        bpg.setText("PG");
        bpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpgActionPerformed(evt);
            }
        });

        bphd.setText("Phd");
        bphd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bphdActionPerformed(evt);
            }
        });

        bugpg.setText("UG+PG");
        bugpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bugpgActionPerformed(evt);
            }
        });

        bpgphd.setText("PG+Phd");
        bpgphd.setToolTipText("");
        bpgphd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpgphdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Roll NUmber");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Period of Reg");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Credits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(bug, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bpg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bphd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bugpg)
                .addGap(30, 30, 30)
                .addComponent(bpgphd)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tcredits, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(troll, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(troll)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tperiod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tcredits)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bug)
                    .addComponent(bpg)
                    .addComponent(bphd)
                    .addComponent(bugpg)
                    .addComponent(bpgphd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PPHD.setVisible(false);

        phdthes.setText("Thesis");

        javax.swing.GroupLayout PPHDLayout = new javax.swing.GroupLayout(PPHD);
        PPHD.setLayout(PPHDLayout);
        PPHDLayout.setHorizontalGroup(
            PPHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPHDLayout.createSequentialGroup()
                .addComponent(phdthes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );
        PPHDLayout.setVerticalGroup(
            PPHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phdthes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        PUG.setVisible(false);

        ugcg.setText("CGPA");
       

        ugdep.setText("Department");
        

        javax.swing.GroupLayout PUGLayout = new javax.swing.GroupLayout(PUG);
        PUG.setLayout(PUGLayout);
        PUGLayout.setHorizontalGroup(
            PUGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUGLayout.createSequentialGroup()
                .addGroup(PUGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ugcg, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ugdep, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 188, Short.MAX_VALUE))
        );
        PUGLayout.setVerticalGroup(
            PUGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ugdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ugcg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        PUGPG.setVisible(false);

        ugpgdep.setText("Department");

        ugpgcg.setText("CGPA");

        ugpgspec.setText("Specialization");

        ugpgthes.setText("Theisis");

        ugpgcon.setText("Conformation Year");

        javax.swing.GroupLayout PUGPGLayout = new javax.swing.GroupLayout(PUGPG);
        PUGPG.setLayout(PUGPGLayout);
        PUGPGLayout.setHorizontalGroup(
            PUGPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUGPGLayout.createSequentialGroup()
                .addGroup(PUGPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ugpgdep)
                    .addComponent(ugpgcg)
                    .addComponent(ugpgspec)
                    .addComponent(ugpgthes)
                    .addComponent(ugpgcon, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        PUGPGLayout.setVerticalGroup(
            PUGPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PUGPGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ugpgdep, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ugpgcg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ugpgspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ugpgthes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ugpgcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PPGPHD.setVisible(false);

        pgphdcg.setText("CGPA");

        pgphdmig.setText("Migration Year");

        pgphdthesis.setText("Thesis");

        javax.swing.GroupLayout PPGPHDLayout = new javax.swing.GroupLayout(PPGPHD);
        PPGPHD.setLayout(PPGPHDLayout);
        PPGPHDLayout.setHorizontalGroup(
            PPGPHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPGPHDLayout.createSequentialGroup()
                .addGroup(PPGPHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pgphdthesis)
                    .addComponent(pgphdmig, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(pgphdcg))
                .addGap(0, 177, Short.MAX_VALUE))
        );
        PPGPHDLayout.setVerticalGroup(
            PPGPHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPGPHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgphdcg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgphdthesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgphdmig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        PPG.setVisible(false);

        pgdep.setText("Department");

        pgspec.setText("Specialization");

        pgthes.setText("Thesis");

        pgcg.setText("CGPA");

        javax.swing.GroupLayout PPGLayout = new javax.swing.GroupLayout(PPG);
        PPG.setLayout(PPGLayout);
        PPGLayout.setHorizontalGroup(
            PPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPGLayout.createSequentialGroup()
                .addGroup(PPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pgdep)
                    .addComponent(pgcg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgspec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(pgthes))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        PPGLayout.setVerticalGroup(
            PPGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPGLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pgdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgcg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgthes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(PPHD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PUG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PUGPG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PPGPHD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PPG, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(PUGPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(PUG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(PPHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(PPGPHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PUGPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PUG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(PPHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PPGPHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(122, 112, 227));

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(122, 112, 227));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void bphdActionPerformed(java.awt.event.ActionEvent evt) {                                     
        PUG.setVisible(false);
        PPG.setVisible(false);
        PUGPG.setVisible(false);
        PPHD.setVisible(true);
        PPGPHD.setVisible(false);
    }                                    

    private void bugActionPerformed(java.awt.event.ActionEvent evt) {                                    
        PUG.setVisible(true);
        PPG.setVisible(false);
        PUGPG.setVisible(false);
        PPHD.setVisible(false);
        PPGPHD.setVisible(false);
    }                                   

    private void bpgActionPerformed(java.awt.event.ActionEvent evt) {                                    
        PUG.setVisible(false);
        PPG.setVisible(true);
        PUGPG.setVisible(false);
        PPHD.setVisible(false);
        PPGPHD.setVisible(false);
    }                                   

    private void bugpgActionPerformed(java.awt.event.ActionEvent evt) {                                      
        PUG.setVisible(false);
        PPG.setVisible(false);
        PUGPG.setVisible(true);
        PPHD.setVisible(false);
        PPGPHD.setVisible(false);
    }                                     

    private void bpgphdActionPerformed(java.awt.event.ActionEvent evt) {                                       
        PUG.setVisible(false);
        PPG.setVisible(false);
        PUGPG.setVisible(false);
        PPHD.setVisible(false);
        PPGPHD.setVisible(true); 
    }                                      

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String course, name, roll_num, department, specialization, thesis;
        int size, period_reg, credits, conformation_year, migration_year, cgpa;
        
        name = tname.getText();
        for(int i = 0; i < name.length(); ++i){
            if(!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || name.charAt(i) == ' ')){
               JOptionPane.showMessageDialog(this, "Invalid Name", "Inane error", JOptionPane.ERROR_MESSAGE);
               return;
            }
        }
        roll_num = troll.getText();
        if(roll_num.length()!= 10){
            JOptionPane.showMessageDialog(this, "Invalid Roll Number", "Inane error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(int i = 0; i < 3; ++i){
            if (roll_num.charAt(i) < 'A' || roll_num.charAt(i) > 'Z') {
                JOptionPane.showMessageDialog(this, "Inavlid roll number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        for(int i = 3; i < roll_num.length(); ++i){
            if (roll_num.charAt(i) < '0' || roll_num.charAt(i) > '9') {
                JOptionPane.showMessageDialog(this, "Invalid roll number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        if(!isnumber(tcredits.getText())){
                JOptionPane.showMessageDialog(this, "Credits of registration needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        credits = Integer.parseInt(tcredits.getText());
        if(!isnumber(tperiod.getText())){
                JOptionPane.showMessageDialog(this, "Period of registration needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        period_reg = Integer.parseInt(tperiod.getText());
        Student s;
        if(PUG.isVisible()){    
            course = "UG";
            department = ugdep.getText();
            if(!isnumber(ugcg.getText())){
                JOptionPane.showMessageDialog(this, "Cgpa needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cgpa = Integer.parseInt(ugcg.getText());
            if (cgpa > 10) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be less than 10", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            batch.AddStudent(new UG(course, roll_num, name, department, period_reg, cgpa, credits));
        }
        else if(PPG.isVisible()){
            course = "PG";
            department = pgdep.getText();
            if(!isnumber(pgcg.getText())){
                JOptionPane.showMessageDialog(this, "Cgpa needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cgpa = Integer.parseInt(pgcg.getText());
            if(cgpa > 10){
                JOptionPane.showMessageDialog(this, "Cgpa needs to be less than 10", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            specialization = pgspec.getText();
            thesis = pgthes.getText();
            batch.AddStudent(new PG(course, roll_num, name, department, specialization, period_reg, cgpa, credits, thesis));
        }
        else if(PPGPHD.isVisible()){
            course = "UG+PG";
            if (!isnumber(pgphdcg.getText())) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cgpa = Integer.parseInt(pgphdcg.getText());
            if (cgpa > 10) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be less than 10", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            thesis = ugpgthes.getText();
            if (!isnumber(pgphdmig.getText())) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            migration_year = Integer.parseInt(pgphdmig.getText());
            batch.AddStudent(new PGPhD(course, roll_num, name, period_reg, cgpa, credits, thesis, migration_year));
        }
        else if(PPHD.isVisible()){
            course = "Phd";
            thesis = phdthes.getText();
            batch.AddStudent(new PhD(course, roll_num, name, period_reg, credits, thesis));
        }
        else if(PUGPG.isVisible()){
            course = "PG+Phd";
            department = ugpgdep.getText();
            if (!isnumber(ugpgcg.getText())) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cgpa = Integer.parseInt(ugpgcg.getText());
            if (cgpa > 10) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be less than 10", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            specialization = ugpgspec.getText();
            thesis = ugpgthes.getText();
            if (!isnumber(ugpgcon.getText())) {
                JOptionPane.showMessageDialog(this, "Cgpa needs to be a number", "Inane error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            conformation_year = Integer.parseInt(ugpgcon.getText());
            batch.AddStudent(new UGPG(course, roll_num, name, department, specialization, period_reg, cgpa, credits, thesis, conformation_year));
        }
    }                                   

    private void showActionPerformed(java.awt.event.ActionEvent evt) {                                     
        EventQueue.invokeLater(new Runnable(){
           public void run()
           {
               ShowOutput f = new ShowOutput(batch);
               f.setVisible(true);
           }
        });
    }                                    

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        pgdep.setText("Department");
        pgspec.setText("Specialization");
        pgthes.setText("Thesis");
        pgcg.setText("CGPA");
        phdthes.setText("Thesis");
        ugcg.setText("CGPA");
        ugdep.setText("Department");
        ugpgdep.setText("Department");
        ugpgcg.setText("CGPA");
        ugpgspec.setText("Specialization");
        ugpgthes.setText("Theisis");
        ugpgcon.setText("Conformation Year");
        pgphdcg.setText("CGPA");
        pgphdmig.setText("Migration Year");
        pgphdthesis.setText("Thesis");
        tname.setText("Name");
        troll.setText("RollNum");
        tperiod.setText("Period of Registration");
        tcredits.setText("Credits");
    }                                     

    public boolean isnumber(String tmp){
        for (int i = 0; i < tmp.length(); ++i) {
            if (tmp.charAt(i) < '0' || tmp.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }                  
}