package org.hraink.futures.ctp.thostftdcuserapistruct;import org.bridj.Pointer;import org.bridj.StructObject;import org.bridj.ann.Array;import org.bridj.ann.Field;import org.bridj.ann.Library;/** * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br> * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br> * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> . *//** * 资金账户口令变更域 * @author Hraink E-mail:Hraink@Gmail.com * @version 2013-1-31 下午11:24:11 */public class CThostFtdcTradingAccountPasswordUpdateField extends StructObject {	public CThostFtdcTradingAccountPasswordUpdateField() {		super();	}	/**	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801	 */	@Array({11}) 	@Field(0) 	private Pointer<Byte> BrokerID() {		return this.io.getPointerField(this, 0);	}	@Array({11})	@Field(0)	public void setBrokerID(String brokerID) {		this.io.getPointerField(this, 0).setCString(brokerID);	}	public String getBrokerID() {		return BrokerID().getCString();	}	/**	 * \u6295\u8d44\u8005\u5e10\u53f7	 */	@Array({13}) 	@Field(1) 	private Pointer<Byte> AccountID() {		return this.io.getPointerField(this, 1);	}	@Array({13})	@Field(1)	public void setAccountID(String accountID) {		this.io.getPointerField(this, 1).setCString(accountID);	}	public String getAccountID() {		return AccountID().getCString();	}	/**	 * \u539f\u6765\u7684\u53e3\u4ee4	 */	@Array({41}) 	@Field(2) 	private Pointer<Byte> OldPassword() {		return this.io.getPointerField(this, 2);	}	@Array({41})	@Field(2)	public void setOldPassword(String oldPassword) {		this.io.getPointerField(this, 2).setCString(oldPassword);	}	public String getOldPassword() {		return OldPassword().getCString();	}	/**	 * \u65b0\u7684\u53e3\u4ee4	 */	@Array({41}) 	@Field(3) 	private Pointer<Byte> NewPassword() {		return this.io.getPointerField(this, 3);	}	@Array({41})	@Field(3)	public void setNewPassword(String newPassword) {		this.io.getPointerField(this, 3).setCString(newPassword);	}	public String getNewPassword() {		return NewPassword().getCString();	}	public CThostFtdcTradingAccountPasswordUpdateField(Pointer pointer) {		super(pointer);	}}