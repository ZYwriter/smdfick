package org.hraink.futures.ctp.thostftdcuserapistruct;import org.bridj.Pointer;import org.bridj.StructObject;import org.bridj.ann.Array;import org.bridj.ann.Field;import org.bridj.ann.Library;/** * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br> * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br> * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> . *//** * 查询账户信息通知 * @author Hraink E-mail:Hraink@Gmail.com * @version 2013-1-31 下午11:24:11 */public class CThostFtdcNotifyQueryAccountField extends StructObject {	public CThostFtdcNotifyQueryAccountField() {		super();	}	/**	 * \u4e1a\u52a1\u529f\u80fd\u7801	 */	@Array({7}) 	@Field(0) 	private Pointer<Byte> TradeCode() {		return this.io.getPointerField(this, 0);	}	@Array({7})	@Field(0)	public void setTradeCode(String tradeCode) {		this.io.getPointerField(this, 0).setCString(tradeCode);	}	public String getTradeCode() {		return TradeCode().getCString();	}	/**	 * \u94f6\u884c\u4ee3\u7801	 */	@Array({4}) 	@Field(1) 	private Pointer<Byte> BankID() {		return this.io.getPointerField(this, 1);	}	@Array({4})	@Field(1)	public void setBankID(String bankID) {		this.io.getPointerField(this, 1).setCString(bankID);	}	public String getBankID() {		return BankID().getCString();	}	/**	 * \u94f6\u884c\u5206\u652f\u673a\u6784\u4ee3\u7801	 */	@Array({5}) 	@Field(2) 	private Pointer<Byte> BankBranchID() {		return this.io.getPointerField(this, 2);	}	@Array({5})	@Field(2)	public void setBankBranchID(String bankBranchID) {		this.io.getPointerField(this, 2).setCString(bankBranchID);	}	public String getBankBranchID() {		return BankBranchID().getCString();	}	/**	 * \u671f\u5546\u4ee3\u7801	 */	@Array({11}) 	@Field(3) 	private Pointer<Byte> BrokerID() {		return this.io.getPointerField(this, 3);	}	@Array({11})	@Field(3)	public void setBrokerID(String brokerID) {		this.io.getPointerField(this, 3).setCString(brokerID);	}	public String getBrokerID() {		return BrokerID().getCString();	}	/**	 * \u671f\u5546\u5206\u652f\u673a\u6784\u4ee3\u7801	 */	@Array({31}) 	@Field(4) 	private Pointer<Byte> BrokerBranchID() {		return this.io.getPointerField(this, 4);	}	@Array({31})	@Field(4)	public void setBrokerBranchID(String brokerBranchID) {		this.io.getPointerField(this, 4).setCString(brokerBranchID);	}	public String getBrokerBranchID() {		return BrokerBranchID().getCString();	}	/**	 * \u4ea4\u6613\u65e5\u671f	 */	@Array({9}) 	@Field(5) 	private Pointer<Byte> TradeDate() {		return this.io.getPointerField(this, 5);	}	@Array({9})	@Field(5)	public void setTradeDate(String tradeDate) {		this.io.getPointerField(this, 5).setCString(tradeDate);	}	public String getTradeDate() {		return TradeDate().getCString();	}	/**	 * \u4ea4\u6613\u65f6\u95f4	 */	@Array({9}) 	@Field(6) 	private Pointer<Byte> TradeTime() {		return this.io.getPointerField(this, 6);	}	@Array({9})	@Field(6)	public void setTradeTime(String tradeTime) {		this.io.getPointerField(this, 6).setCString(tradeTime);	}	public String getTradeTime() {		return TradeTime().getCString();	}	/**	 * \u94f6\u884c\u6d41\u6c34\u53f7	 */	@Array({13}) 	@Field(7) 	private Pointer<Byte> BankSerial() {		return this.io.getPointerField(this, 7);	}	@Array({13})	@Field(7)	public void setBankSerial(String bankSerial) {		this.io.getPointerField(this, 7).setCString(bankSerial);	}	public String getBankSerial() {		return BankSerial().getCString();	}	/**	 * \u4ea4\u6613\u7cfb\u7edf\u65e5\u671f	 */	@Array({9}) 	@Field(8) 	private Pointer<Byte> TradingDay() {		return this.io.getPointerField(this, 8);	}	@Array({9})	@Field(8)	public void setTradingDay(String tradingDay) {		this.io.getPointerField(this, 8).setCString(tradingDay);	}	public String getTradingDay() {		return TradingDay().getCString();	}	/**	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7	 */	@Field(9) 	private int PlateSerial() {		return this.io.getIntField(this, 9);	}	public int getPlateSerial() {		return PlateSerial();	}	/**	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7	 */	@Field(9) 	private CThostFtdcNotifyQueryAccountField PlateSerial(int PlateSerial) {		this.io.setIntField(this, 9, PlateSerial);		return this;	}	public void setPlateSerial(int plateSerial) {		PlateSerial(plateSerial);	}	/**	 * \u6700\u540e\u5206\u7247\u6807\u5fd7	 */	@Field(10) 	private byte LastFragment() {		return this.io.getByteField(this, 10);	}	public char getLastFragment() {		return (char)LastFragment();	}	/**	 * \u6700\u540e\u5206\u7247\u6807\u5fd7	 */	@Field(10) 	private CThostFtdcNotifyQueryAccountField LastFragment(byte LastFragment) {		this.io.setByteField(this, 10, LastFragment);		return this;	}	public void setLastFragment(char lastFragment) {		LastFragment((byte)lastFragment);	}	/**	 * \u4f1a\u8bdd\u53f7	 */	@Field(11) 	private int SessionID() {		return this.io.getIntField(this, 11);	}	public int getSessionID() {		return SessionID();	}	/**	 * \u4f1a\u8bdd\u53f7	 */	@Field(11) 	private CThostFtdcNotifyQueryAccountField SessionID(int SessionID) {		this.io.setIntField(this, 11, SessionID);		return this;	}	public void setSessionID(int sessionID) {		SessionID(sessionID);	}	/**	 * \u5ba2\u6237\u59d3\u540d	 */	@Array({51}) 	@Field(12) 	private Pointer<Byte> CustomerName() {		return this.io.getPointerField(this, 12);	}	@Array({51})	@Field(12)	public void setCustomerName(String customerName) {		this.io.getPointerField(this, 12).setCString(customerName);	}	public String getCustomerName() {		return CustomerName().getCString();	}	/**	 * \u8bc1\u4ef6\u7c7b\u578b	 */	@Field(13) 	private byte IdCardType() {		return this.io.getByteField(this, 13);	}	public char getIdCardType() {		return (char)IdCardType();	}	/**	 * \u8bc1\u4ef6\u7c7b\u578b	 */	@Field(13) 	private CThostFtdcNotifyQueryAccountField IdCardType(byte IdCardType) {		this.io.setByteField(this, 13, IdCardType);		return this;	}	public void setIdCardType(char idCardType) {		IdCardType((byte)idCardType);	}	/**	 * \u8bc1\u4ef6\u53f7\u7801	 */	@Array({51}) 	@Field(14) 	private Pointer<Byte> IdentifiedCardNo() {		return this.io.getPointerField(this, 14);	}	@Array({51})	@Field(14)	public void setIdentifiedCardNo(String identifiedCardNo) {		this.io.getPointerField(this, 14).setCString(identifiedCardNo);	}	public String getIdentifiedCardNo() {		return IdentifiedCardNo().getCString();	}	/**	 * \u5ba2\u6237\u7c7b\u578b	 */	@Field(15) 	private byte CustType() {		return this.io.getByteField(this, 15);	}	public char getCustType() {		return (char)CustType();	}	/**	 * \u5ba2\u6237\u7c7b\u578b	 */	@Field(15) 	private CThostFtdcNotifyQueryAccountField CustType(byte CustType) {		this.io.setByteField(this, 15, CustType);		return this;	}	public void setCustType(char custType) {		CustType((byte)custType);	}	/**	 * \u94f6\u884c\u5e10\u53f7	 */	@Array({41}) 	@Field(16) 	private Pointer<Byte> BankAccount() {		return this.io.getPointerField(this, 16);	}	@Array({41})	@Field(16)	public void setBankAccount(String bankAccount) {		this.io.getPointerField(this, 16).setCString(bankAccount);	}	public String getBankAccount() {		return BankAccount().getCString();	}	/**	 * \u94f6\u884c\u5bc6\u7801	 */	@Array({41}) 	@Field(17) 	private Pointer<Byte> BankPassWord() {		return this.io.getPointerField(this, 17);	}	@Array({41})	@Field(17)	public void setBankPassWord(String bankPassWord) {		this.io.getPointerField(this, 17).setCString(bankPassWord);	}	public String getBankPassWord() {		return BankPassWord().getCString();	}	/**	 * \u6295\u8d44\u8005\u5e10\u53f7	 */	@Array({13}) 	@Field(18) 	private Pointer<Byte> AccountID() {		return this.io.getPointerField(this, 18);	}	@Array({13})	@Field(18)	public void setAccountID(String accountID) {		this.io.getPointerField(this, 18).setCString(accountID);	}	public String getAccountID() {		return AccountID().getCString();	}	/**	 * \u671f\u8d27\u5bc6\u7801	 */	@Array({41}) 	@Field(19) 	private Pointer<Byte> Password() {		return this.io.getPointerField(this, 19);	}	@Array({41})	@Field(19)	public void setPassword(String password) {		this.io.getPointerField(this, 19).setCString(password);	}	public String getPassword() {		return Password().getCString();	}	/**	 * \u671f\u8d27\u516c\u53f8\u6d41\u6c34\u53f7	 */	@Field(20) 	private int FutureSerial() {		return this.io.getIntField(this, 20);	}	public int getFutureSerial() {		return FutureSerial();	}	/**	 * \u671f\u8d27\u516c\u53f8\u6d41\u6c34\u53f7	 */	@Field(20) 	private CThostFtdcNotifyQueryAccountField FutureSerial(int FutureSerial) {		this.io.setIntField(this, 20, FutureSerial);		return this;	}	public void setFutureSerial(int futureSerial) {		FutureSerial(futureSerial);	}	/**	 * \u5b89\u88c5\u7f16\u53f7	 */	@Field(21) 	private int InstallID() {		return this.io.getIntField(this, 21);	}	public int getInstallID() {		return InstallID();	}	/**	 * \u5b89\u88c5\u7f16\u53f7	 */	@Field(21) 	private CThostFtdcNotifyQueryAccountField InstallID(int InstallID) {		this.io.setIntField(this, 21, InstallID);		return this;	}	public void setInstallID(int installID) {		InstallID(installID);	}	/**	 * \u7528\u6237\u6807\u8bc6	 */	@Array({16}) 	@Field(22) 	private Pointer<Byte> UserID() {		return this.io.getPointerField(this, 22);	}	@Array({16})	@Field(22)	public void setUserID(String userID) {		this.io.getPointerField(this, 22).setCString(userID);	}	public String getUserID() {		return UserID().getCString();	}	/**	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7	 */	@Field(23) 	private byte VerifyCertNoFlag() {		return this.io.getByteField(this, 23);	}	public char getVerifyCertNoFlag() {		return (char)VerifyCertNoFlag();	}	/**	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7	 */	@Field(23) 	private CThostFtdcNotifyQueryAccountField VerifyCertNoFlag(byte VerifyCertNoFlag) {		this.io.setByteField(this, 23, VerifyCertNoFlag);		return this;	}	public void setVerifyCertNoFlag(char verifyCertNoFlag) {		VerifyCertNoFlag((byte)verifyCertNoFlag);	}	/**	 * \u5e01\u79cd\u4ee3\u7801	 */	@Array({4}) 	@Field(24) 	private Pointer<Byte> CurrencyID() {		return this.io.getPointerField(this, 24);	}	@Array({4})	@Field(24)	public void setCurrencyID(String currencyID) {		this.io.getPointerField(this, 24).setCString(currencyID);	}	public String getCurrencyID() {		return CurrencyID().getCString();	}	/**	 * \u6458\u8981	 */	@Array({36}) 	@Field(25) 	private Pointer<Byte> Digest() {		return this.io.getPointerField(this, 25);	}	@Array({36})	@Field(25)	public void setDigest(String digest) {		this.io.getPointerField(this, 25).setCString(digest);	}	public String getDigest() {		return Digest().getCString();	}	/**	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b	 */	@Field(26) 	private byte BankAccType() {		return this.io.getByteField(this, 26);	}	public char getBankAccType() {		return (char)BankAccType();	}	/**	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b	 */	@Field(26) 	private CThostFtdcNotifyQueryAccountField BankAccType(byte BankAccType) {		this.io.setByteField(this, 26, BankAccType);		return this;	}	public void setBankAccType(char bankAccType) {		BankAccType((byte)bankAccType);	}	/**	 * \u6e20\u9053\u6807\u5fd7	 */	@Array({3}) 	@Field(27) 	private Pointer<Byte> DeviceID() {		return this.io.getPointerField(this, 27);	}	@Array({3})	@Field(27)	public void setDeviceID(String deviceID) {		this.io.getPointerField(this, 27).setCString(deviceID);	}	public String getDeviceID() {		return DeviceID().getCString();	}	/**	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7\u7c7b\u578b	 */	@Field(28) 	private byte BankSecuAccType() {		return this.io.getByteField(this, 28);	}	public char getBankSecuAccType() {		return (char)BankSecuAccType();	}	/**	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7\u7c7b\u578b	 */	@Field(28) 	private CThostFtdcNotifyQueryAccountField BankSecuAccType(byte BankSecuAccType) {		this.io.setByteField(this, 28, BankSecuAccType);		return this;	}	public void setBankSecuAccType(char bankSecuAccType) {		BankSecuAccType((byte)bankSecuAccType);	}	/**	 * \u671f\u8d27\u516c\u53f8\u94f6\u884c\u7f16\u7801	 */	@Array({33}) 	@Field(29) 	private Pointer<Byte> BrokerIDByBank() {		return this.io.getPointerField(this, 29);	}	@Array({33})	@Field(29)	public void setBrokerIDByBank(String brokerIDByBank) {		this.io.getPointerField(this, 29).setCString(brokerIDByBank);	}	public String getBrokerIDByBank() {		return BrokerIDByBank().getCString();	}	/**	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7	 */	@Array({41}) 	@Field(30) 	private Pointer<Byte> BankSecuAcc() {		return this.io.getPointerField(this, 30);	}	@Array({41})	@Field(30)	public void setBankSecuAcc(String bankSecuAcc) {		this.io.getPointerField(this, 30).setCString(bankSecuAcc);	}	public String getBankSecuAcc() {		return BankSecuAcc().getCString();	}	/**	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7	 */	@Field(31) 	private byte BankPwdFlag() {		return this.io.getByteField(this, 31);	}	public char getBankPwdFlag() {		return (char)BankPwdFlag();	}	/**	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7	 */	@Field(31) 	private CThostFtdcNotifyQueryAccountField BankPwdFlag(byte BankPwdFlag) {		this.io.setByteField(this, 31, BankPwdFlag);		return this;	}	public void setBankPwdFlag(char bankPwdFlag) {		BankPwdFlag((byte)bankPwdFlag);	}	/**	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7	 */	@Field(32) 	private byte SecuPwdFlag() {		return this.io.getByteField(this, 32);	}	public char getSecuPwdFlag() {		return (char)SecuPwdFlag();	}	/**	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7	 */	@Field(32) 	private CThostFtdcNotifyQueryAccountField SecuPwdFlag(byte SecuPwdFlag) {		this.io.setByteField(this, 32, SecuPwdFlag);		return this;	}	public void setSecuPwdFlag(char secuPwdFlag) {		SecuPwdFlag((byte)secuPwdFlag);	}	/**	 * \u4ea4\u6613\u67dc\u5458	 */	@Array({17}) 	@Field(33) 	private Pointer<Byte> OperNo() {		return this.io.getPointerField(this, 33);	}	@Array({17})	@Field(33)	public void setOperNo(String operNo) {		this.io.getPointerField(this, 33).setCString(operNo);	}	public String getOperNo() {		return OperNo().getCString();	}	/**	 * \u8bf7\u6c42\u7f16\u53f7	 */	@Field(34) 	private int RequestID() {		return this.io.getIntField(this, 34);	}	public int getRequestID() {		return RequestID();	}	/**	 * \u8bf7\u6c42\u7f16\u53f7	 */	@Field(34) 	private CThostFtdcNotifyQueryAccountField RequestID(int RequestID) {		this.io.setIntField(this, 34, RequestID);		return this;	}	public void setRequestID(int requestID) {		RequestID(requestID);	}	/**	 * \u4ea4\u6613ID	 */	@Field(35) 	private int TID() {		return this.io.getIntField(this, 35);	}	public int getTID() {		return TID();	}	/**	 * \u4ea4\u6613ID	 */	@Field(35) 	private CThostFtdcNotifyQueryAccountField TID(int TID) {		this.io.setIntField(this, 35, TID);		return this;	}	public void setTID(int tID) {		TID(tID);	}	/**	 * \u94f6\u884c\u53ef\u7528\u91d1\u989d	 */	@Field(36) 	private double BankUseAmount() {		return this.io.getDoubleField(this, 36);	}	public double getBankUseAmount() {		return BankUseAmount();	}	/**	 * \u94f6\u884c\u53ef\u7528\u91d1\u989d	 */	@Field(36) 	private CThostFtdcNotifyQueryAccountField BankUseAmount(double BankUseAmount) {		this.io.setDoubleField(this, 36, BankUseAmount);		return this;	}	public void setBankUseAmount(double bankUseAmount) {		BankUseAmount(bankUseAmount);	}	/**	 * \u94f6\u884c\u53ef\u53d6\u91d1\u989d	 */	@Field(37) 	private double BankFetchAmount() {		return this.io.getDoubleField(this, 37);	}	public double getBankFetchAmount() {		return BankFetchAmount();	}	/**	 * \u94f6\u884c\u53ef\u53d6\u91d1\u989d	 */	@Field(37) 	private CThostFtdcNotifyQueryAccountField BankFetchAmount(double BankFetchAmount) {		this.io.setDoubleField(this, 37, BankFetchAmount);		return this;	}	public void setBankFetchAmount(double bankFetchAmount) {		BankFetchAmount(bankFetchAmount);	}	/**	 * \u9519\u8bef\u4ee3\u7801	 */	@Field(38) 	private int ErrorID() {		return this.io.getIntField(this, 38);	}	public int getErrorID() {		return ErrorID();	}	/**	 * \u9519\u8bef\u4ee3\u7801	 */	@Field(38) 	private CThostFtdcNotifyQueryAccountField ErrorID(int ErrorID) {		this.io.setIntField(this, 38, ErrorID);		return this;	}	public void setErrorID(int errorID) {		ErrorID(errorID);	}	/**	 * \u9519\u8bef\u4fe1\u606f	 */	@Array({81}) 	@Field(39) 	private Pointer<Byte> ErrorMsg() {		return this.io.getPointerField(this, 39);	}	@Array({81})	@Field(39)	public void setErrorMsg(String errorMsg) {		this.io.getPointerField(this, 39).setCString(errorMsg);	}	public String getErrorMsg() {		return ErrorMsg().getCString();	}	public CThostFtdcNotifyQueryAccountField(Pointer pointer) {		super(pointer);	}}