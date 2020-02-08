
package samptable;

import com.service.table.TradeResJson;
import com.service.table.TradeStructure;
import java.io.IOException;
import static java.rmi.Naming.list;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Notis2 extends javax.swing.JFrame {

    /**
     * Creates new form Notis2
     */
    public Notis2() throws IOException, SQLException {
        initComponents();
        addRowToJTable();
        
    }
    public  class User{

       
        public String seqNo;
        public String mkt1;
        public String trdNo;
        public String trdTm;
        public String tkn;
        public String trdQty;
        public String trdPrc;
        public String bsFlg;
        public String ordNo;
        public String brnCd;
        public String usrId;
        public String proCli;
        public String cliActNo;
        public String cpCd;
        public String remarks;
        public String actTyp;
        public String TCd;
        public String ordTm;
        public String mktTyp;
        public String aucNo;
        public String stpTyp;
        public String oppBrokerCd;
        public String trdTrigPrc;
        public String ctclId;
        public String ordInst;
        public String secIdentifier;
         public User(String seqNo, String mkt1, String trdNo, String trdTm, String tkn, String trdQty, String trdPrc, String bsFlg, String ordNo, String brnCd, String usrId, String proCli, String cliActNo, String cpCd, String remarks, String actTyp, String TCd, String ordTm, String mktTyp, String aucNo, String stpTyp, String oppBrokerCd, String trdTrigPrc, String ctclId, String ordInst, String secIdentifier) {
            this.seqNo = seqNo;
            this.mkt1 = mkt1;
            this.trdNo = trdNo;
            this.trdTm = trdTm;
            this.tkn = tkn;
            this.trdQty = trdQty;
            this.trdPrc = trdPrc;
            this.bsFlg = bsFlg;
            this.ordNo = ordNo;
            this.brnCd = brnCd;
            this.usrId = usrId;
            this.proCli = proCli;
            this.cliActNo = cliActNo;
            this.cpCd = cpCd;
            this.remarks = remarks;
            this.actTyp = actTyp;
            this.TCd = TCd;
            this.ordTm = ordTm;
            this.mktTyp = mktTyp;
            this.aucNo = aucNo;
            this.stpTyp = stpTyp;
            this.oppBrokerCd = oppBrokerCd;
            this.trdTrigPrc = trdTrigPrc;
            this.ctclId = ctclId;
            this.ordInst = ordInst;
            this.secIdentifier = secIdentifier;
        }
    }
//    public void ArrayList ListUsers(){
//   public ArrayList<User> list=new ArrayList<User>();
//   TradeStructure ts=new TradeStructure();
//  
//    
//           }
           
           
    public void addRowToJTable() throws IOException, SQLException{
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       // Arraylist<
        TradeStructure ts=new TradeStructure();
        Object rowData[]=new Object[26];
//        for(int i=0;i<ts.size();i++){
//            rowData[0]=ts.get(i).seqNo;
//            rowData[1]=ts.get(i).mkt;
//            rowData[2]=ts.get(i);
//            rowData[3]=ts.get(i);
//            rowData[4]=ts.get(i);
//            rowData[5]=ts.get(i);
//            rowData[6]=ts.get(i);
//            rowData[7]=ts.get(i);
//            rowData[8]=ts.get(i);
//            rowData[9]=ts.get(i);
//            rowData[10]=ts.get(i);
//            rowData[11]=ts.get(i);
//            rowData[12]=ts.get(i);
//            rowData[13]=ts.get(i);
//            rowData[14]=ts.get(i);
//            rowData[15]=ts.get(i);
//            rowData[16]=ts.get(i);
//            rowData[17]=ts.get(i);
//            rowData[18]=ts.get(i);
//            rowData[19]=ts.get(i);
//            rowData[20]=ts.get(i);
//            rowData[21]=ts.get(i);
//            rowData[22]=ts.get(i);
//            rowData[23]=ts.get(i);
//            rowData[24]=ts.get(i);
//            rowData[25]=ts.get(i);
//        }
//            rowData[0]=ts.getSeqNo().seqNo;
//            rowData[1]=ts.getMkt().mkt1;
//            rowData[2]=ts.getTrdNo().trdNo;
//            rowData[3]=ts.getTrdTm().trdTm;
//            rowData[4]=ts.getTkn().tkn;
//            rowData[5]=ts.getTrdQty().trdqty;
//            rowData[6]=ts.getTrdPrc();
//            rowData[7]=ts.getBsFlg();
//            rowData[8]=ts.getOrdNo();
//            rowData[9]=ts.getBrnCd();
//            rowData[10]=ts.getUsrId();
//            rowData[11]=ts.getProCli();
//            rowData[12]=ts.getCliActNo();
//            rowData[13]=ts.getCpCd();
//            rowData[14]=ts.getRemarks();
//            rowData[15]=ts.getActTyp();
//            rowData[16]=ts.getTCd();
//            rowData[17]=ts.getOrdTm();
//            rowData[18]=ts.getMktTyp();
//            rowData[19]=ts.getAucNo();
//            rowData[20]=ts.getStpTyp();
//            rowData[21]=ts.getOppBrokerCd();
//            rowData[22]=ts.getTrdTrigPrc();
//            rowData[23]=ts.getCtclId();
//            rowData[24]=ts.getOrdInst();
//            rowData[25]=ts.getSecIdentifier();
        
        
//        TradeResJson tr=new TradeResJson();
//        tr.getTradeRes(jTable1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        totalBuyValue = new javax.swing.JTextField();
        totalTradeValue = new javax.swing.JTextField();
        totalTrades = new javax.swing.JTextField();
        totalSellValue = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notis - CM");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        totalBuyValue.setEditable(false);
        totalBuyValue.setBackground(new java.awt.Color(255, 255, 255));
        totalBuyValue.setText("Total Buy Value");
        totalBuyValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBuyValueActionPerformed(evt);
            }
        });

        totalTradeValue.setEditable(false);
        totalTradeValue.setText("Total Trade Value");
        totalTradeValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTradeValueActionPerformed(evt);
            }
        });

        totalTrades.setEditable(false);
        totalTrades.setText("Total Trades");
        totalTrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTradesActionPerformed(evt);
            }
        });

        totalSellValue.setEditable(false);
        totalSellValue.setText("Total Sell Value");
        totalSellValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSellValueActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel2.setText("Total Buy Value");

        jLabel3.setText("Total Sell Value ");

        jLabel4.setText("Total Trade Value");

        jLabel5.setText("Total Trades");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "seqNo", "mkt", "trdNo", "trdTm", "tkn", "trdQty", "trdPrc", "bsFlg", "ordNo", "brnCd", "usrId", "proCli", "cliActNo", "cpCd", "remarks", "actTyp", "TCd", "ordTm", "mktTyp", "aucNo", "stpTyp", "oppBrokerCd", "trdTrigPrc", "ctclId", "ordInst", "secIdentifier"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalBuyValue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalSellValue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTradeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTrades, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(Refresh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Refresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalBuyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTradeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalSellValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalBuyValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBuyValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBuyValueActionPerformed

    private void totalTradeValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTradeValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTradeValueActionPerformed

    private void totalTradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTradesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTradesActionPerformed

    private void totalSellValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSellValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSellValueActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
         TradeResJson t = new TradeResJson();
         JTable jTable1 = null;
        try {
            t.getTradeRes(jTable1);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Notis2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        // TODO add your handling code here:
//
        
    }//GEN-LAST:event_RefreshMouseClicked

   // public static void main(String args[])
    public void start(){
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
            java.util.logging.Logger.getLogger(Notis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                try {
                    new Notis2().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Notis2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Notis2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totalBuyValue;
    private javax.swing.JTextField totalSellValue;
    private javax.swing.JTextField totalTradeValue;
    private javax.swing.JTextField totalTrades;
    // End of variables declaration//GEN-END:variables

}
