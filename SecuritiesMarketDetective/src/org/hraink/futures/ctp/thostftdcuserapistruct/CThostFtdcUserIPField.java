package org.hraink.futures.ctp.thostftdcuserapistruct;import org.bridj.Pointer;import org.bridj.StructObject;import org.bridj.ann.Array;import org.bridj.ann.Field;import org.bridj.ann.Library;/** * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br> * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br> * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> . *//** * 用户IP * @author Hraink E-mail:Hraink@Gmail.com * @version 2013-1-31 下午11:24:11 */public class CThostFtdcUserIPField extends StructObject {	public CThostFtdcUserIPField() {		super();	}	/**	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801	 */	@Array({11}) 	@Field(0) 	private Pointer<Byte> BrokerID() {		return this.io.getPointerField(this, 0);	}	@Array({11})	@Field(0)	public void setBrokerID(String brokerID) {		this.io.getPointerField(this, 0).setCString(brokerID);	}	public String getBrokerID() {		return BrokerID().getCString();	}	/**	 * \u7528\u6237\u4ee3\u7801	 */	@Array({16}) 	@Field(1) 	private Pointer<Byte> UserID() {		return this.io.getPointerField(this, 1);	}	@Array({16})	@Field(1)	public void setUserID(String userID) {		this.io.getPointerField(this, 1).setCString(userID);	}	public String getUserID() {		return UserID().getCString();	}	/// IP\u5730\u5740	@Array({16}) 	@Field(2) 	private Pointer<Byte> IPAddress() {		return this.io.getPointerField(this, 2);	}	@Array({16})	@Field(2)	public void setIPAddress(String iPAddress) {		this.io.getPointerField(this, 2).setCString(iPAddress);	}	public String getIPAddress() {		return IPAddress().getCString();	}	/// IP\u5730\u5740\u63a9\u7801	@Array({16}) 	@Field(3) 	private Pointer<Byte> IPMask() {		return this.io.getPointerField(this, 3);	}	@Array({16})	@Field(3)	public void setIPMask(String iPMask) {		this.io.getPointerField(this, 3).setCString(iPMask);	}	public String getIPMask() {		return IPMask().getCString();	}	/// Mac\u5730\u5740	@Array({21}) 	@Field(4) 	private Pointer<Byte> MacAddress() {		return this.io.getPointerField(this, 4);	}	@Array({21})	@Field(4)	public void setMacAddress(String macAddress) {		this.io.getPointerField(this, 4).setCString(macAddress);	}	public String getMacAddress() {		return MacAddress().getCString();	}	public CThostFtdcUserIPField(Pointer pointer) {		super(pointer);	}}