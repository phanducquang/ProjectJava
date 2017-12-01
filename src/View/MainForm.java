/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ThaiNguyen
 */
public class MainForm extends javax.swing.JFrame {
    
    int xx,yy;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(0,0,0,80));
        jBtn6.setBackground(new Color(236,236,236,50));
        jBtn5.setBackground(new Color(236,236,236,50));  
        jBtn4.setBackground(new Color(236,236,236,50));  
        jBtn1.setBackground(new Color(236,236,236,50));  
        jBtn2.setBackground(new Color(236,236,236,50));  
        jBtn3.setBackground(new Color(236,236,236,50));  
        jBtn7.setBackground(new Color(236,236,236,50));
    }
    
    public void setColor(JPanel pn){
        pn.setSize(pn.getWidth()+1, pn.getHeight()+1);
        pn.setBackground(new Color(60,209,127,50));
    }
    public void resetColor(JPanel pn){   
        pn.setSize(pn.getWidth()-1, pn.getHeight()-1);
        pn.setBackground(new Color(236,236,236,50));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnClose = new javax.swing.JLabel();
        jBtn6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jBtn5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jBtn4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jBtn1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBtn2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jBtn3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jBtn7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnClose.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("X");
        jBtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jBtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 30));

        jBtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn6MouseReleased(evt);
            }
        });
        jBtn6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Settings_64px.png"))); // NOI18N
        jBtn6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 20, -1, 60));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Thiết lập");
        jBtn6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        getContentPane().add(jBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 180, 120));

        jBtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn5MouseReleased(evt);
            }
        });
        jBtn5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_64px.png"))); // NOI18N
        jBtn5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 70, 56));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Người dùng");
        jBtn5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        getContentPane().add(jBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 180, 120));

        jBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn4MouseReleased(evt);
            }
        });
        jBtn4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Statistics_64px.png"))); // NOI18N
        jBtn4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 60, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Thống kê");
        jBtn4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        getContentPane().add(jBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 180, 120));

        jBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn1MouseReleased(evt);
            }
        });
        jBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Shopping_Cart_64px_3.png"))); // NOI18N
        jBtn1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 60, 60));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Bán hàng");
        jBtn1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        getContentPane().add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 180, 120));

        jBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn2MouseReleased(evt);
            }
        });
        jBtn2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Warehouse_64px.png"))); // NOI18N
        jBtn2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 21, 70, 60));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Kho hàng");
        jBtn2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        getContentPane().add(jBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 180, 120));

        jBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn3MouseReleased(evt);
            }
        });
        jBtn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Coins_64px.png"))); // NOI18N
        jBtn3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 60));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Kế toán");
        jBtn3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        getContentPane().add(jBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 180, 120));

        jBtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBtn7MouseReleased(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_40px.png"))); // NOI18N

        javax.swing.GroupLayout jBtn7Layout = new javax.swing.GroupLayout(jBtn7);
        jBtn7.setLayout(jBtn7Layout);
        jBtn7Layout.setHorizontalGroup(
            jBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jBtn7Layout.setVerticalGroup(
            jBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/navigation.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 80, 80));

        jLabel14.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Get Managed");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Design, Create By Closer Group");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Support Management");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pexels-photo.jpg"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn1MouseEntered
        // TODO add your handling code here:
        setColor(jBtn1);
    }//GEN-LAST:event_jBtn1MouseEntered

    private void jBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn1MouseExited
        // TODO add your handling code here:
        resetColor(jBtn1);
    }//GEN-LAST:event_jBtn1MouseExited

    private void jBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn2MouseEntered
        // TODO add your handling code here:
        setColor(jBtn2);
    }//GEN-LAST:event_jBtn2MouseEntered

    private void jBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn2MouseExited
        // TODO add your handling code here:
        resetColor(jBtn2);
        
    }//GEN-LAST:event_jBtn2MouseExited

    private void jBtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn3MouseEntered
        // TODO add your handling code here:
        setColor(jBtn3);
    }//GEN-LAST:event_jBtn3MouseEntered

    private void jBtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn3MouseExited
        // TODO add your handling code here:
        resetColor(jBtn3);
    }//GEN-LAST:event_jBtn3MouseExited

    private void jBtn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn4MouseEntered
        // TODO add your handling code here:
        setColor(jBtn4);
    }//GEN-LAST:event_jBtn4MouseEntered

    private void jBtn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn4MouseExited
        // TODO add your handling code here:
        resetColor(jBtn4);
    }//GEN-LAST:event_jBtn4MouseExited

    private void jBtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn5MouseEntered
        // TODO add your handling code here:
        setColor(jBtn5);
    }//GEN-LAST:event_jBtn5MouseEntered

    private void jBtn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn5MouseExited
        // TODO add your handling code here:
        resetColor(jBtn5);
    }//GEN-LAST:event_jBtn5MouseExited

    private void jBtn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn6MouseEntered
        // TODO add your handling code here:
        setColor(jBtn6);
    }//GEN-LAST:event_jBtn6MouseEntered

    private void jBtn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn6MouseExited
        // TODO add your handling code here:
        resetColor(jBtn6);
    }//GEN-LAST:event_jBtn6MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jBtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnCloseMouseClicked

    private void jBtn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn7MouseEntered
        // TODO add your handling code here:
        setColor(jBtn7);
    }//GEN-LAST:event_jBtn7MouseEntered

    private void jBtn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn7MouseExited
        // TODO add your handling code here:
        resetColor(jBtn7);
    }//GEN-LAST:event_jBtn7MouseExited

    private void jBtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn1MousePressed
        // TODO add your handling code here:
        resetColor(jBtn1);
    }//GEN-LAST:event_jBtn1MousePressed

    private void jBtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn1MouseReleased
        // TODO add your handling code here:
        if(jBtn1.getBackground().equals(new Color(236,236,236,50))){
        setColor(jBtn1);
        }
    }//GEN-LAST:event_jBtn1MouseReleased

    private void jBtn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn2MousePressed
        // TODO add your handling code here:
        resetColor(jBtn2);
    }//GEN-LAST:event_jBtn2MousePressed

    private void jBtn2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn2MouseReleased
        // TODO add your handling code here:
        setColor(jBtn2);
    }//GEN-LAST:event_jBtn2MouseReleased

    private void jBtn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn3MousePressed
        // TODO add your handling code here:
        resetColor(jBtn3);
    }//GEN-LAST:event_jBtn3MousePressed

    private void jBtn3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn3MouseReleased
        // TODO add your handling code here:
        setColor(jBtn3);
    }//GEN-LAST:event_jBtn3MouseReleased

    private void jBtn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn4MousePressed
        // TODO add your handling code here:
        resetColor(jBtn4);
    }//GEN-LAST:event_jBtn4MousePressed

    private void jBtn4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn4MouseReleased
        // TODO add your handling code here:
        setColor(jBtn4);
    }//GEN-LAST:event_jBtn4MouseReleased

    private void jBtn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn5MousePressed
        // TODO add your handling code here:
        resetColor(jBtn5);
    }//GEN-LAST:event_jBtn5MousePressed

    private void jBtn5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn5MouseReleased
        // TODO add your handling code here:
        setColor(jBtn5);
    }//GEN-LAST:event_jBtn5MouseReleased

    private void jBtn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn6MousePressed
        // TODO add your handling code here:
        resetColor(jBtn6);
    }//GEN-LAST:event_jBtn6MousePressed

    private void jBtn6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn6MouseReleased
        // TODO add your handling code here:
        setColor(jBtn6);
    }//GEN-LAST:event_jBtn6MouseReleased

    private void jBtn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn7MousePressed
        // TODO add your handling code here:
        resetColor(jBtn7);
    }//GEN-LAST:event_jBtn7MousePressed

    private void jBtn7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn7MouseReleased
        // TODO add your handling code here:
        setColor(jBtn7);
    }//GEN-LAST:event_jBtn7MouseReleased

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn1MouseClicked
        // TODO add your handling code here:
        FormQuanLiBanHang frmQLBH= new FormQuanLiBanHang();
        frmQLBH.setVisible(true);
    }//GEN-LAST:event_jBtn1MouseClicked

    private void jBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn2MouseClicked
        // TODO add your handling code here:
        FormQuanLiKho frmQLK = new FormQuanLiKho();
        frmQLK.setVisible(true);
    }//GEN-LAST:event_jBtn2MouseClicked

    private void jBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn3MouseClicked
        // TODO add your handling code here:
        FormQuanLiKeToan frmQLKT = new FormQuanLiKeToan();
        frmQLKT.setVisible(true);
    }//GEN-LAST:event_jBtn3MouseClicked

    private void jBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn4MouseClicked
        // TODO add your handling code here:
        FormQuanLiThongKe frmQLTK  = new FormQuanLiThongKe();
        frmQLTK.setVisible(true);
    }//GEN-LAST:event_jBtn4MouseClicked

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtn1;
    private javax.swing.JPanel jBtn2;
    private javax.swing.JPanel jBtn3;
    private javax.swing.JPanel jBtn4;
    private javax.swing.JPanel jBtn5;
    private javax.swing.JPanel jBtn6;
    private javax.swing.JPanel jBtn7;
    private javax.swing.JLabel jBtnClose;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
