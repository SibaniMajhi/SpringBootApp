package com.transactions.tcsbankapi.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tranactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long txCustID;
	
	@Column(name = "transactionID")
	private long txID;
	
	@Column()
	private String txStatus;
	
	@Column()
	private BigDecimal txAmount;
	
	@CreationTimestamp
	private Date txDate;
	
	@Column()
	private String txTo; 
	
	@Column()
	private String txFrom;
	
	public long getTxCustID() {
		return txCustID;
	}
	public void setTxCustID(long txCustID) {
		this.txCustID = txCustID;
	}
	public long getTxID() {
		return txID;
	}
	public void setTxID(long txID) {
		this.txID = txID;
	}
	public String getTxStatus() {
		return txStatus;
	}
	public void setTxStatus(String txStatus) {
		this.txStatus = txStatus;
	}
	public BigDecimal getTxAmount() {
		return txAmount;
	}
	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}
	public Date getTxDate() {
		return txDate;
	}
	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}
	public String getTxTo() {
		return txTo;
	}
	public void setTxTo(String txTo) {
		this.txTo = txTo;
	}
	public String getTxFrom() {
		return txFrom;
	}
	public void setTxFrom(String txFrom) {
		this.txFrom = txFrom;
	}
	
	
}
