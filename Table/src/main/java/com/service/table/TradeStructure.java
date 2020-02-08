/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.table;

/**
 *
 * @author trainee4
 */
public class TradeStructure {

    public TradeStructure(){
        
    }
    private long seqNo;
    private String mkt;
    private long trdNo;

    public TradeStructure(long seqNo, String mkt, long trdNo, long trdTm, int tkn, int trdQty, int trdPrc, String bsFlg, double ordNo, int brnCd, int usrId, short proCli, String cliActNo, String cpCd, String remarks, short actTyp, short TCd, long ordTm, short mktTyp, short aucNo, String stpTyp, String oppBrokerCd, String trdTrigPrc, double ctclId, short ordInst, String secIdentifier) {
        this.seqNo = seqNo;
        this.mkt = mkt;
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
    private long trdTm;
    private int tkn;
    private int trdQty;
    private int trdPrc;
    private String bsFlg;
    private double ordNo;
    private int brnCd;
    private int usrId;
    private short proCli;
    private String cliActNo;
    private String cpCd;
    private String remarks;
    private short actTyp;
    private short TCd;
    private long ordTm;
    private short mktTyp;
    private short aucNo;
    private String stpTyp;
    private String oppBrokerCd;
    private String trdTrigPrc;
    private double ctclId;
    private short ordInst;
    private String secIdentifier;
    private String fill1;
    private String fill2;
    private String fill3;
    private String fill4;
    private String fill5;
    private String fill6;
    private String fill7;
    private String fill8;
    
    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public String getMkt() {
        return mkt;
    }

    public void setMkt(String mkt) {
        this.mkt = mkt;
    }

    public long getTrdNo() {
        return trdNo;
    }

    public void setTrdNo(long trdNo) {
        this.trdNo = trdNo;
    }

    public long getTrdTm() {
        return trdTm;
    }

    public void setTrdTm(long trdTm) {
        this.trdTm = trdTm;
    }

    public int getTkn() {
        return tkn;
    }

    public void setTkn(int tkn) {
        this.tkn = tkn;
    }

    public int getTrdQty() {
        return trdQty;
    }

    public void setTrdQty(int trdQty) {
        this.trdQty = trdQty;
    }

    public int getTrdPrc() {
        return trdPrc;
    }

    public void setTrdPrc(int trdPrc) {
        this.trdPrc = trdPrc;
    }

    public String getBsFlg() {
        String buySellFlag=null;
        if (bsFlg=="1"){
            buySellFlag="BUY";
        }else{buySellFlag="SELL";}
        return buySellFlag;
    }

    public void setBsFlg(String bsFlg) {
        this.bsFlg = bsFlg;
    }

    public double getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(double ordNo) {
        this.ordNo = ordNo;
    }

    public int getBrnCd() {
        return brnCd;
    }

    public void setBrnCd(int brnCd) {
        this.brnCd = brnCd;
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public short getProCli() {
        return proCli;
    }

    public void setProCli(short proCli) {
        this.proCli = proCli;
    }

    public String getCliActNo() {
        return cliActNo;
    }

    public void setCliActNo(String cliActNo) {
        this.cliActNo = cliActNo;
    }

    public String getCpCd() {
        return cpCd;
    }

    public void setCpCd(String cpCd) {
        this.cpCd = cpCd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getActTyp() {
        String ActivityType = null;
        switch (actTyp) {
            case 2:
                ActivityType = "Original Trade";
                break;
            case 7:
                ActivityType = "Trade Cancellation";
                break;
            case 101:
                ActivityType = "Buy Participant modification";
                break;
            case 102:
                ActivityType = "Sell Participant modification";
                break;
            case 103:
                ActivityType = "Buy & Sell Participant modification";
                break;
            case 104:
                ActivityType = "Quantity modification";
                break;
            case 105:
                ActivityType = "Buy Account No. modification";
                break;
            case 106:
                ActivityType = "Sell Account No. modification";
                break;
            case 107:
                ActivityType = "Buy & Sell Account No. modification";
                break;
            case 109:
                ActivityType = "Buy Trade Cancellation due to modification";
                break;
            case 110:
                ActivityType = "Sell Participant Cancellation due to modification";
                break;
            case 111:
                ActivityType = "Buy & Sell Trade Cancellation due to modification";
                break;
            default:
                System.out.println("Activity Type ?");
        }
        return ActivityType;
    }

    public void setActTyp(short actTyp) {
        this.actTyp = actTyp;
    }

    //
    public String getTCd() {
        String TransCode = null;
        switch (TCd) {
            case 6001:
                TransCode = "Original Trade";
                break;
            case 5525:
                TransCode = "Trade Modification Approval";
                break;
            case 5565:
                TransCode = "Control Trade Modification";
                break;
            case 5520:
                TransCode = "Trade Cancellation Approval";
                break;
            case 5560:
                TransCode = "Control Trade Cancellation";
                break;
            case 5530:
                TransCode = "Trade Cancellation Rejection";
                break;
            case 5445:
                TransCode = "Trade modification";
                break;
            case 5440:
                TransCode = "Trade Cancellation";
                break;
            default:
                System.out.println("Transaction Code?");
        }
        return TransCode;
    }

    public void setTCd(short TCd) {
        this.TCd = TCd;
    }

    public long getOrdTm() {
        return ordTm;
    }

    public void setOrdTm(long ordTm) {
        this.ordTm = ordTm;
    }

    //
    public String getMktTyp() {
        String mktTyp1 = null;
        switch (mktTyp) {
            case 1:
                mktTyp1 = "Normal";
                break;
            case 2:
                mktTyp1 = "Odd Lot";
                break;
            case 3:
                mktTyp1 = "Spot";
                break;
            case 4:
                mktTyp1 = "Auction";
                break;
            case 5:
                mktTyp1 = "Call Auction 1";
                break;
            case 6:
                mktTyp1 = "Call Auction 2";
                break;
            default:
                System.out.println("Market Type ?");
        }
        return mktTyp1;
    }

    public void setMktTyp(short mktTyp) {
        this.mktTyp = mktTyp;
    }

    public short getAucNo() {
        return aucNo;
    }

    public void setAucNo(short aucNo) {
        this.aucNo = aucNo;
    }

    public String getStpTyp() {
        return stpTyp;
    }

    public void setStpTyp(String stpTyp) {
        this.stpTyp = stpTyp;
    }

    public String getOppBrokerCd() {
        return oppBrokerCd;
    }

    public void setOppBrokerCd(String oppBrokerCd) {
        this.oppBrokerCd = oppBrokerCd;
    }

    public String getTrdTrigPrc() {
        return trdTrigPrc;
    }

    public void setTrdTrigPrc(String trdTrigPrc) {
        this.trdTrigPrc = trdTrigPrc;
    }

    public double getCtclId() {
        return ctclId;
    }

    public void setCtclId(double ctclId) {
        this.ctclId = ctclId;
    }

    public short getOrdInst() {
        return ordInst;
    }

    public void setOrdInst(short ordInst) {
        this.ordInst = ordInst;
    }

    public String getSecIdentifier() {
        return secIdentifier;
    }

    public void setSecIdentifier(String secIdentifier) {
        this.secIdentifier = secIdentifier;
    }

    public String getFill1() {
        return fill1;
    }

    public void setFill1(String fill1) {
        this.fill1 = fill1;
    }

    public String getFill2() {
        return fill2;
    }

    public void setFill2(String fill2) {
        this.fill2 = fill2;
    }

    public String getFill3() {
        return fill3;
    }

    public void setFill3(String fill3) {
        this.fill3 = fill3;
    }

    public String getFill4() {
        return fill4;
    }

    public void setFill4(String fill4) {
        this.fill4 = fill4;
    }

    public String getFill5() {
        return fill5;
    }

    public void setFill5(String fill5) {
        this.fill5 = fill5;
    }

    public String getFill6() {
        return fill6;
    }

    public void setFill6(String fill6) {
        this.fill6 = fill6;
    }

    public String getFill7() {
        return fill7;
    }

    public void setFill7(String fill7) {
        this.fill7 = fill7;
    }

    public String getFill8() {
        return fill8;
    }

    public void setFill8(String fill8) {
        this.fill8 = fill8;
    }

}
