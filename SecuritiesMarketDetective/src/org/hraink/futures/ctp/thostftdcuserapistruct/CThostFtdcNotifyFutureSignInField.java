package org.hraink.futures.ctp.thostftdcuserapistruct;import org.bridj.Pointer;import org.bridj.StructObject;import org.bridj.ann.Array;import org.bridj.ann.Field;import org.bridj.ann.Library;/** * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br> * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br> * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> . *//** * 期商签到通知 * @author Hraink E-mail:Hraink@Gmail.com * @version 2013-1-31 下午11:24:11 */public class CThostFtdcNotifyFutureSignInField extends StructObject {	public CThostFtdcNotifyFutureSignInField() {		super();	}	/**	 * \u4e1a\u52a1\u529f\u80fd\u7801	 */	@Array({7}) 	@Field(0) 	private Pointer<Byte> TradeCode() {		return this.io.getPointerField(this, 0);	}	@Array({7})	@Field(0)	public void setTradeCode(String tradeCode) {		this.io.getPointerField(this, 0).setCString(tradeCode);	}	public String getTradeCode() {		return TradeCode().getCString();	}	/**	 * \u94f6\u884c\u4ee3\u7801	 */	@Array({4}) 	@Field(1) 	private Pointer<Byte> BankID() {		return this.io.getPointerField(this, 1);	}	@Array({4})	@Field(1)	public void setBankID(String bankID) {		this.io.getPointerField(this, 1).setCString(bankID);	}	public String getBankID() {		return BankID().getCString();	}	/**	 * \u94f6\u884c\u5206\u652f\u673a\u6784\u4ee3\u7801	 */	@Array({5}) 	@Field(2) 	private Pointer<Byte> BankBranchID() {		return this.io.getPointerField(this, 2);	}	@Array({5})	@Field(2)	public void setBankBranchID(String bankBranchID) {		this.io.getPointerField(this, 2).setCString(bankBranchID);	}	public String getBankBranchID() {		return BankBranchID().getCString();	}	/**	 * \u671f\u5546\u4ee3\u7801	 */	@Array({11}) 	@Field(3) 	private Pointer<Byte> BrokerID() {		return this.io.getPointerField(this, 3);	}	@Array({11})	@Field(3)	public void setBrokerID(String brokerID) {		this.io.getPointerField(this, 3).setCString(brokerID);	}	public String getBrokerID() {		return BrokerID().getCString();	}	/**	 * \u671f\u5546\u5206\u652f\u673a\u6784\u4ee3\u7801	 */	@Array({31}) 	@Field(4) 	private Pointer<Byte> BrokerBranchID() {		return this.io.getPointerField(this, 4);	}	@Array({31})	@Field(4)	public void setBrokerBranchID(String brokerBranchID) {		this.io.getPointerField(this, 4).setCString(brokerBranchID);	}	public String getBrokerBranchID() {		return BrokerBranchID().getCString();	}	/**	 * \u4ea4\u6613\u65e5\u671f	 */	@Array({9}) 	@Field(5) 	private Pointer<Byte> TradeDate() {		return this.io.getPointerField(this, 5);	}	@Array({9})	@Field(5)	public void setTradeDate(String tradeDate) {		this.io.getPointerField(this, 5).setCString(tradeDate);	}	public String getTradeDate() {		return TradeDate().getCString();	}	/**	 * \u4ea4\u6613\u65f6\u95f4	 */	@Array({9}) 	@Field(6) 	private Pointer<Byte> TradeTime() {		return this.io.getPointerField(this, 6);	}	@Array({9})	@Field(6)	public void setTradeTime(String tradeTime) {		this.io.getPointerField(this, 6).setCString(tradeTime);	}	public String getTradeTime() {		return TradeTime().getCString();	}	/**	 * \u94f6\u884c\u6d41\u6c34\u53f7	 */	@Array({13}) 	@Field(7) 	private Pointer<Byte> BankSerial() {		return this.io.getPointerField(this, 7);	}	@Array({13})	@Field(7)	public void setBankSerial(String bankSerial) {		this.io.getPointerField(this, 7).setCString(bankSerial);	}	public String getBankSerial() {		return BankSerial().getCString();	}	/**	 * \u4ea4\u6613\u7cfb\u7edf\u65e5\u671f	 */	@Array({9}) 	@Field(8) 	private Pointer<Byte> TradingDay() {		return this.io.getPointerField(this, 8);	}	@Array({9})	@Field(8)	public void setTradingDay(String tradingDay) {		this.io.getPointerField(this, 8).setCString(tradingDay);	}	public String getTradingDay() {		return TradingDay().getCString();	}	/**	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7	 */	@Field(9) 	private int PlateSerial() {		return this.io.getIntField(this, 9);	}	public int getPlateSerial() {		return PlateSerial();	}	/**	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7	 */	@Field(9) 	private CThostFtdcNotifyFutureSignInField PlateSerial(int PlateSerial) {		this.io.setIntField(this, 9, PlateSerial);		return this;	}	public void setPlateSerial(int plateSerial) {		PlateSerial(plateSerial);	}	/**	 * \u6700\u540e\u5206\u7247\u6807\u5fd7	 */	@Field(10) 	private byte LastFragment() {		return this.io.getByteField(this, 10);	}	public char getLastFragment() {		return (char)LastFragment();	}	/**	 * \u6700\u540e\u5206\u7247\u6807\u5fd7	 */	@Field(10) 	private CThostFtdcNotifyFutureSignInField LastFragment(byte LastFragment) {		this.io.setByteField(this, 10, LastFragment);		return this;	}	public void setLastFragment(char lastFragment) {		LastFragment((byte)lastFragment);	}	/**	 * \u4f1a\u8bdd\u53f7	 */	@Field(11) 	private int SessionID() {		return this.io.getIntField(this, 11);	}	public int getSessionID() {		return SessionID();	}	/**	 * \u4f1a\u8bdd\u53f7	 */	@Field(11) 	private CThostFtdcNotifyFutureSignInField SessionID(int SessionID) {		this.io.setIntField(this, 11, SessionID);		return this;	}	public void setSessionID(int sessionID) {		SessionID(sessionID);	}	/**	 * \u5b89\u88c5\u7f16\u53f7	 */	@Field(12) 	private int InstallID() {		return this.io.getIntField(this, 12);	}	public int getInstallID() {		return InstallID();	}	/**	 * \u5b89\u88c5\u7f16\u53f7	 */	@Field(12) 	private CThostFtdcNotifyFutureSignInField InstallID(int InstallID) {		this.io.setIntField(this, 12, InstallID);		return this;	}	public void setInstallID(int installID) {		InstallID(installID);	}	/**	 * \u7528\u6237\u6807\u8bc6	 */	@Array({16}) 	@Field(13) 	private Pointer<Byte> UserID() {		return this.io.getPointerField(this, 13);	}	@Array({16})	@Field(13)	public void setUserID(String userID) {		this.io.getPointerField(this, 13).setCString(userID);	}	public String getUserID() {		return UserID().getCString();	}	/**	 * \u6458\u8981	 */	@Array({36}) 	@Field(14) 	private Pointer<Byte> Digest() {		return this.io.getPointerField(this, 14);	}	@Array({36})	@Field(14)	public void setDigest(String digest) {		this.io.getPointerField(this, 14).setCString(digest);	}	public String getDigest() {		return Digest().getCString();	}	/**	 * \u5e01\u79cd\u4ee3\u7801	 */	@Array({4}) 	@Field(15) 	private Pointer<Byte> CurrencyID() {		return this.io.getPointerField(this, 15);	}	@Array({4})	@Field(15)	public void setCurrencyID(String currencyID) {		this.io.getPointerField(this, 15).setCString(currencyID);	}	public String getCurrencyID() {		return CurrencyID().getCString();	}	/**	 * \u6e20\u9053\u6807\u5fd7	 */	@Array({3}) 	@Field(16) 	private Pointer<Byte> DeviceID() {		return this.io.getPointerField(this, 16);	}	@Array({3})	@Field(16)	public void setDeviceID(String deviceID) {		this.io.getPointerField(this, 16).setCString(deviceID);	}	public String getDeviceID() {		return DeviceID().getCString();	}	/**	 * \u671f\u8d27\u516c\u53f8\u94f6\u884c\u7f16\u7801	 */	@Array({33}) 	@Field(17) 	private Pointer<Byte> BrokerIDByBank() {		return this.io.getPointerField(this, 17);	}	@Array({33})	@Field(17)	public void setBrokerIDByBank(String brokerIDByBank) {		this.io.getPointerField(this, 17).setCString(brokerIDByBank);	}	public String getBrokerIDByBank() {		return BrokerIDByBank().getCString();	}	/**	 * \u4ea4\u6613\u67dc\u5458	 */	@Array({17}) 	@Field(18) 	private Pointer<Byte> OperNo() {		return this.io.getPointerField(this, 18);	}	@Array({17})	@Field(18)	public void setOperNo(String operNo) {		this.io.getPointerField(this, 18).setCString(operNo);	}	public String getOperNo() {		return OperNo().getCString();	}	/**	 * \u8bf7\u6c42\u7f16\u53f7	 */	@Field(19) 	private int RequestID() {		return this.io.getIntField(this, 19);	}	public int getRequestID() {		return RequestID();	}	/**	 * \u8bf7\u6c42\u7f16\u53f7	 */	@Field(19) 	private CThostFtdcNotifyFutureSignInField RequestID(int RequestID) {		this.io.setIntField(this, 19, RequestID);		return this;	}	public void setRequestID(int requestID) {		RequestID(requestID);	}	/**	 * \u4ea4\u6613ID	 */	@Field(20) 	private int TID() {		return this.io.getIntField(this, 20);	}	public int getTID() {		return TID();	}	/**	 * \u4ea4\u6613ID	 */	@Field(20) 	private CThostFtdcNotifyFutureSignInField TID(int TID) {		this.io.setIntField(this, 20, TID);		return this;	}	public void setTID(int tID) {		TID(tID);	}	/**	 * \u9519\u8bef\u4ee3\u7801	 */	@Field(21) 	private int ErrorID() {		return this.io.getIntField(this, 21);	}	public int getErrorID() {		return ErrorID();	}	/**	 * \u9519\u8bef\u4ee3\u7801	 */	@Field(21) 	private CThostFtdcNotifyFutureSignInField ErrorID(int ErrorID) {		this.io.setIntField(this, 21, ErrorID);		return this;	}	public void setErrorID(int errorID) {		ErrorID(errorID);	}	/**	 * \u9519\u8bef\u4fe1\u606f	 */	@Array({81}) 	@Field(22) 	private Pointer<Byte> ErrorMsg() {		return this.io.getPointerField(this, 22);	}	@Array({81})	@Field(22)	public void setErrorMsg(String errorMsg) {		this.io.getPointerField(this, 22).setCString(errorMsg);	}	public String getErrorMsg() {		return ErrorMsg().getCString();	}	/// PIN\u5bc6\u94a5	@Array({129}) 	@Field(23) 	private Pointer<Byte> PinKey() {		return this.io.getPointerField(this, 23);	}	@Array({129})	@Field(23)	public void setPinKey(String pinKey) {		this.io.getPointerField(this, 23).setCString(pinKey);	}	public String getPinKey() {		return PinKey().getCString();	}	/// MAC\u5bc6\u94a5	@Array({129}) 	@Field(24) 	private Pointer<Byte> MacKey() {		return this.io.getPointerField(this, 24);	}	@Array({129})	@Field(24)	public void setMacKey(String macKey) {		this.io.getPointerField(this, 24).setCString(macKey);	}	public String getMacKey() {		return MacKey().getCString();	}	public CThostFtdcNotifyFutureSignInField(Pointer pointer) {		super(pointer);	}}