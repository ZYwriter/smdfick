package org.hraink.futures.ctp.thostftdcuserapistruct;import org.bridj.Pointer;import org.bridj.StructObject;import org.bridj.ann.Array;import org.bridj.ann.Field;import org.bridj.ann.Library;/** * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br> * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br> * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> . *//** * 查询经纪公司资金 * @author Hraink E-mail:Hraink@Gmail.com * @version 2013-1-31 下午11:24:11 */public class CThostFtdcQueryBrokerDepositField extends StructObject {	public CThostFtdcQueryBrokerDepositField() {		super();	}	/**	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801	 */	@Array({11}) 	@Field(0) 	private Pointer<Byte> BrokerID() {		return this.io.getPointerField(this, 0);	}	@Array({11})	@Field(0)	public void setBrokerID(String brokerID) {		this.io.getPointerField(this, 0).setCString(brokerID);	}	public String getBrokerID() {		return BrokerID().getCString();	}	/**	 * \u4ea4\u6613\u6240\u4ee3\u7801	 */	@Array({9}) 	@Field(1) 	private Pointer<Byte> ExchangeID() {		return this.io.getPointerField(this, 1);	}	@Array({9})	@Field(1)	public void setExchangeID(String exchangeID) {		this.io.getPointerField(this, 1).setCString(exchangeID);	}	public String getExchangeID() {		return ExchangeID().getCString();	}	public CThostFtdcQueryBrokerDepositField(Pointer pointer) {		super(pointer);	}}