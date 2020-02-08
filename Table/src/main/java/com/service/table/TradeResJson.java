package com.service.table;

import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import samptable.Notis2;

public class TradeResJson {

   // JTable jTable1;
    public JTable getTradeRes(JTable jTable1) throws IOException, SQLException {

//        ObjectMapper mapper = new ObjectMapper();
//        ObjectNode data2 = mapper.createObjectNode();
//        data2.put("code", "01010000");
//
//        ObjectNode data3 = mapper.createObjectNode();
//        data3.put("msgId", "00240201310140000001");
//        data3.put("tradesInquiry", "6,20180420,,,805151,2^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,^805151,N,2017070425019234,77575838826496,29135,735,40130,1,1.100000000137094E15,45,29670,1,SK129,06637,,2,6001,1183713360,1,0,N,,0,7.00006732002113E14,4096,N,,,,,,,,,");
//
//        ObjectNode jsonData = mapper.createObjectNode();
//        jsonData.put("status", "success,abc,def,ghi");
//        jsonData.put("messages", data2);
//        jsonData.put("data", data3);
//
//        System.out.println("json response data sample");//*********
////        System.out.println(jsonData.toString());
//        String json = jsonData.toString();
//        System.out.println(json);
        String json = "{\n"
                + "\"status\": \"success\",\n"
                + "\"messages\": {\n"
                + "\"code\": \"01010000\"\n"
                + "},\n"
                + "\"data\": {\n"
                + "\"msgId\": \"00240201310140000001\",\n"
                + "\"tradesInquiry\": \"6,20180420,,,805151,2^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,^805151,N,2017070425019234,77575838826496,29135,735,40130,1,1.100000000137094E15,45,29670,1,SK129,06637,,2,6001,1183713360,1,0,N,,0,7.00006732002113E14,4096,N,,,,,,,,,^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,\"\n"
                + "}\n"
                + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        System.out.println(jsonNode.toString());

//        JsonNode tradesInquiry = jsonData.get("tradesInquiry");
//        System.out.println(tradesInquiry);
        JsonNode status = jsonNode.path("status");
        System.out.println(status.getTextValue());
        String status1 = status.asText();
        System.out.println(status1);
//////////

//        List<String> items = Arrays.asList(status1.split("\\s*,\\s*"));
//        System.out.println("items  : " + items.toString());
////////////////////
        System.out.println("-----------------");

        JsonNode drNode = jsonNode.path("data");
//        Iterator<JsonNode> itr = drNode.getElements();
//        System.out.println("\n data :");
        JsonNode get = drNode.get("tradesInquiry");
        String tradesInquiry = get.asText();
        System.out.println("tradesInquiry: " + tradesInquiry);
        String ctrlRec = tradesInquiry.split("\\^")[0];
        System.out.println("Control Rec : " + ctrlRec);
        String dataRec = tradesInquiry.substring(tradesInquiry.indexOf("^") + 1);
        dataRec.trim();
        System.out.println("Data Records : " + dataRec);

        String[] arrData = dataRec.split("\\^");

        //////////////////////////////////////////////////////////////////////////////////
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        TradeStructure ts=new TradeStructure();
//        Object rowData[]=new Object[26];
//        for(int i=0;i<26;i++){
//            rowData[0]=ts.getMkt().mkt;
//        }
        
        
        
        
        
        
        
        //////////////////////////////////////////////////////////////////////////////////
      DefaultTableModel tableModel = new DefaultTableModel();
     // DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
      
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
      table.getTableHeader().setResizingAllowed(true);
      
      TradeStructure ts = new TradeStructure();
      
        for (String a : arrData) {
            System.out.println("Array Trade : " + a);

            List<String> items = Arrays.asList(a.split("\\s*,\\s*"));
            System.out.println("arrayitems  : " + items.toString());

            String qw = items.get(0);
            System.out.println(qw + "**");

//      tableModel.addRow(new Object[]{items.get(0),items.get(1),items.get(2),items.get(3),items.get(4),items.get(5),items.get(6),
//      items.get(7),items.get(8),items.get(9),items.get(10),items.get(11),items.get(12),
//      items.get(13),items.get(14),items.get(15),items.get(16),items.get(17),items.get(18),items.get(19),
//      items.get(20),items.get(21),items.get(22),items.get(23),items.get(24),items.get(25)});
            
            ts.setSeqNo(Long.parseLong(items.get(0)));
            ts.setMkt(items.get(1));
            ts.setTrdNo(Long.parseLong(items.get(2)));
            ts.setTrdTm(Long.parseLong(items.get(3)));
            ts.setTkn(Integer.parseInt(items.get(4)));
            ts.setTrdQty(Integer.parseInt(items.get(5)));
            ts.setTrdPrc(Integer.parseInt(items.get(6)));
            ts.setBsFlg(items.get(7));
            ts.setOrdNo(Double.parseDouble(items.get(8)));
            ts.setBrnCd(Integer.parseInt(items.get(9)));
            ts.setUsrId(Integer.parseInt(items.get(10)));
            ts.setProCli(Short.valueOf(items.get(11)));
            ts.setCliActNo(items.get(12));
            ts.setCpCd(items.get(13));
            ts.setRemarks(items.get(14));
            ts.setActTyp(Short.valueOf(items.get(15)));
            ts.setTCd(Short.valueOf(items.get(16)));
            ts.setOrdTm(Long.parseLong(items.get(17)));
            ts.setMktTyp(Short.valueOf(items.get(18)));
            ts.setAucNo(Short.valueOf(items.get(19)));
            ts.setStpTyp(items.get(20));
            ts.setOppBrokerCd(items.get(21));
            ts.setTrdTrigPrc(items.get(22));
            ts.setCtclId(Double.parseDouble(items.get(23)));
            ts.setOrdInst(Short.valueOf(items.get(24)));
            ts.setSecIdentifier(items.get(25));

            Database db = new Database();
            db.create(ts);
//            return null;
            
      tableModel.addRow(new Object[]{ts.getSeqNo(),ts.getMkt(),ts.getTrdNo(),ts.getTrdTm(),ts.getTkn(),ts.getTrdQty(),ts.getTrdPrc(),
      ts.getBsFlg(),ts.getOrdNo(),ts.getBrnCd(),ts.getUsrId(),ts.getProCli(),ts.getCliActNo(),
      ts.getCpCd(),ts.getRemarks(),ts.getActTyp(),ts.getTCd(),ts.getOrdTm(),ts.getMktTyp(), 
      ts.getAucNo(),ts.getStpTyp(),ts.getOppBrokerCd(),ts.getTrdTrigPrc(),ts.getCtclId(),ts.getOrdInst(),ts.getSecIdentifier()});
        }
        
//      tableModel.addRow(new Object[]{ts.getSeqNo(),ts.getMkt(),ts.getTrdNo(),ts.getTrdTm(),ts.getTkn(),ts.getTrdQty(),ts.getTrdPrc(),
//      ts.getBsFlg(),ts.getOrdNo(),ts.getBrnCd(),ts.getUsrId(),ts.getProCli(),ts.getCliActNo(),
//      ts.getCpCd(),ts.getRemarks(),ts.getActTyp(),ts.getTCd(),ts.getOrdTm(),ts.getMktTyp(), 
//      ts.getAucNo(),ts.getStpTyp(),ts.getOppBrokerCd(),ts.getTrdTrigPrc(),ts.getCtclId(),ts.getOrdInst(),ts.getSecIdentifier()});
        
 //////////
      System.out.println("Table rows = "+table.getRowCount());
      System.out.println("Table columns = "+table.getColumnCount());
      Font font = new Font("Verdana", Font.PLAIN, 12);
      table.setFont(font);
      JFrame frame = new JFrame();
      frame.setSize(600, 400);
      frame.add(new JScrollPane(table));
      frame.setVisible(true);
      
//      DataTable dt=new DataTable();
//        JTable JTable;
//      dt.getTable( jTable1);
      
        return jTable1;
    }

    public static void main(String[] args) throws IOException, SQLException {
        //TradeResJson t = new TradeResJson();
//       t.getTradeRes();
//        Database db = new  Database();
//         db.create(null);
        
        Notis2 n = new Notis2();
        n.start();

    }
}
