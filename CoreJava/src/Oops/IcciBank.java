package Oops;

public class IcciBank extends Bank {
	int accountnumber;

	IcciBank(int accnumber, int bankid) {
		this.accountnumber = accnumber;
		this.bankid = bankid;
	}

	public void bankDisplay() {
		System.out.println("Bank id is :" + bankid);
		System.out.println("Account number is :" + accountnumber);
	}

}
