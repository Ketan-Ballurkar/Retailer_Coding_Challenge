package com.luv2code.springboot.retailercoding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers_and_transactions_list")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="transaction_m1")
	private int firstMonthTransaction;
	
	@Column(name="transaction_m2")
	private int secondMonthTransaction;
	
	@Column(name="transaction_m3")
	private int thirdMonthTransaction;
	
	@Column(name="reward")
	private int reward;
	
	public Customer() {
		
	}
	
	public Customer(int firstMonthTransaction, int secondMonthTransaction, int thirdMonthTransaction, int reward) {
		
		this.firstMonthTransaction = firstMonthTransaction;
		this.secondMonthTransaction = secondMonthTransaction;
		this.thirdMonthTransaction = thirdMonthTransaction;
		this.reward = reward;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFirstMonthTransaction() {
		return firstMonthTransaction;
	}

	public void setFirstMonthTransaction(int firstMonthTransaction) {
		this.firstMonthTransaction = firstMonthTransaction;
	}

	public int getSecondMonthTransaction() {
		return secondMonthTransaction;
	}

	public void setSecondMonthTransaction(int secondMonthTransaction) {
		this.secondMonthTransaction = secondMonthTransaction;
	}

	public int getThirdMonthTransaction() {
		return thirdMonthTransaction;
	}

	public void setThirdMonthTransaction(int thirdMonthTransaction) {
		this.thirdMonthTransaction = thirdMonthTransaction;
	}

	public int getReward() {
		return reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstMonthTransaction=" + firstMonthTransaction + ", secondMonthTransaction="
				+ secondMonthTransaction + ", thirdMonthTransaction=" + thirdMonthTransaction + ", reward=" + reward
				+ "]";
	}
	
}
