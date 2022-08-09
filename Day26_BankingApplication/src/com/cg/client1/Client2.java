package com.cg.client1;
import com.cg.application1.MMBankFactory;
import com.cg.application1.MMCurrentAcc;
import com.cg.application1.MMSavingAcc;
import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;


public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(111,"omkar K",11111,true);
		CurrentAcc c = new MMCurrentAcc(111,"tappu P",52160,20000);
		s.withdraw(10000);
		c.withdraw(20000);
		System.out.println(s);
		System.out.println(c);
	}
}

	


