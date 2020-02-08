
package com.service.table;

import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataTable {
    
    public JTable getTable(JTable jTable1) throws IOException, SQLException {
      
      DefaultTableModel tableModel = new DefaultTableModel();
      JTable table = new JTable(tableModel);
      tableModel.addColumn("seqNo");
      tableModel.addColumn("mkt");
      tableModel.addColumn("trdNo");
      tableModel.addColumn("trdTm");
      tableModel.addColumn("tkn");
      tableModel.addColumn("trdQty");
      tableModel.addColumn("trdPrc");
      tableModel.addColumn("bsFlg");
      tableModel.addColumn("ordNo");
      tableModel.addColumn("brnCd");
      tableModel.addColumn("usrId");
      tableModel.addColumn("proCli");
      tableModel.addColumn("cliActNo");
      tableModel.addColumn("cpCd");
      tableModel.addColumn("remarks");
      tableModel.addColumn("actTyp");
      tableModel.addColumn("TCd");
      tableModel.addColumn("ordTm");
      tableModel.addColumn("mktTyp");
      tableModel.addColumn("aucNo");
      tableModel.addColumn("stpTyp");
      tableModel.addColumn("oppBrokerCd");
      tableModel.addColumn("trdTrigPrc");
      tableModel.addColumn("ctclId");
      tableModel.addColumn("ordInst");
      tableModel.addColumn("secIdentifier");
      // prevent from resizing
      table.getTableHeader().setResizingAllowed(false);
      TradeStructure ts = new TradeStructure();
      
      tableModel.addRow(new Object[]{ts.getSeqNo(),ts.getMkt(),ts.getTrdNo(),ts.getTrdTm(),ts.getTkn(),ts.getTrdQty(),ts.getTrdPrc(),
      ts.getBsFlg(),ts.getOrdNo(),ts.getBrnCd(),ts.getUsrId(),ts.getProCli(),ts.getCliActNo(),
      ts.getCpCd(),ts.getRemarks(),ts.getActTyp(),ts.getTCd(),ts.getOrdTm(),ts.getMktTyp(), 
      ts.getAucNo(),ts.getStpTyp(),ts.getOppBrokerCd(),ts.getTrdTrigPrc(),ts.getCtclId(),ts.getOrdInst(),ts.getSecIdentifier()});
        
      System.out.println("Table rows = "+table.getRowCount());
      System.out.println("Table columns = "+table.getColumnCount());
      Font font = new Font("Verdana", Font.PLAIN, 12);
      table.setFont(font);
      JFrame frame = new JFrame();
      frame.setSize(600, 400);
      frame.add(new JScrollPane(table));
      frame.setVisible(true);
      
      
        return jTable1;
    }
}
