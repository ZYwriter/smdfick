package org.hraink.futures.ctp.thostftdcuserapistruct;import org.bridj.Pointer;import org.bridj.StructObject;import org.bridj.ann.Array;import org.bridj.ann.Field;import org.bridj.ann.Library;/** * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br> * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br> * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> . *//** * 保证金监管系统经纪公司资金账户密钥 * @author Hraink E-mail:Hraink@Gmail.com * @version 2013-1-31 下午11:24:11 */public class CThostFtdcCFMMCTradingAccountKeyField extends StructObject {	public CThostFtdcCFMMCTradingAccountKeyField() {		super();	}	/**	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801	 */	@Array({11}) 	@Field(0) 	private Pointer<Byte> BrokerID() {		return this.io.getPointerField(this, 0);	}	@Array({11})	@Field(0)	public void setBrokerID(String brokerID) {		this.io.getPointerField(this, 0).setCString(brokerID);	}	public String getBrokerID() {		return BrokerID().getCString();	}	/**	 * \u7ecf\u7eaa\u516c\u53f8\u7edf\u4e00\u7f16\u7801	 */	@Array({11}) 	@Field(1) 	private Pointer<Byte> ParticipantID() {		return this.io.getPointerField(this, 1);	}	@Array({11})	@Field(1)	public void setParticipantID(String participantID) {		this.io.getPointerField(this, 1).setCString(participantID);	}	public String getParticipantID() {		return ParticipantID().getCString();	}	/**	 * \u6295\u8d44\u8005\u5e10\u53f7	 */	@Array({13}) 	@Field(2) 	private Pointer<Byte> AccountID() {		return this.io.getPointerField(this, 2);	}	@Array({13})	@Field(2)	public void setAccountID(String accountID) {		this.io.getPointerField(this, 2).setCString(accountID);	}	public String getAccountID() {		return AccountID().getCString();	}	/**	 * \u5bc6\u94a5\u7f16\u53f7	 */	@Field(3) 	private int KeyID() {		return this.io.getIntField(this, 3);	}	public int getKeyID() {		return KeyID();	}	/**	 * \u5bc6\u94a5\u7f16\u53f7	 */	@Field(3) 	private CThostFtdcCFMMCTradingAccountKeyField KeyID(int KeyID) {		this.io.setIntField(this, 3, KeyID);		return this;	}	public void setKeyID(int keyID) {		KeyID(keyID);	}	/**	 * \u52a8\u6001\u5bc6\u94a5	 */	@Array({21}) 	@Field(4) 	private Pointer<Byte> CurrentKey() {		return this.io.getPointerField(this, 4);	}	@Array({21})	@Field(4)	public void setCurrentKey(String currentKey) {		this.io.getPointerField(this, 4).setCString(currentKey);	}	public String getCurrentKey() {		return CurrentKey().getCString();	}	public CThostFtdcCFMMCTradingAccountKeyField(Pointer pointer) {		super(pointer);	}}