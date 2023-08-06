package SatTask.Project;
import java.io.FileReader;
import java.io.IOException;
public class AtmImp implements Atm{
	static Account account=new Account();
	static int a;
	FileReader fr=null;
	@Override
	public void deposit(double money) {
		a=1;
		account.setMoney(money);
		System.out.println("Amount credited to account successfully");
	}

	@Override
	public void withdrawl(double money) {
		if(account.getMoney()==0)
			System.out.println("Invalid balance");
		else {
			a=0;
			account.setMoney(money);
		}
		System.out.println("Amount debited from account successfully");
	}

	@Override
	public void checkBalance() {
		System.out.println("Current account balance :"+account.getMoney());
	}

	@Override
	public void TranDetails() {
		try {
			fr=new FileReader("V:\\Test1\\Transaction.txt");
			int tran=fr.read();
			while(tran!=-1) {
				System.out.print((char)tran);
				tran=fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void accDetails() {
		System.out.println(account);
	}

}
