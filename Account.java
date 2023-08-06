package SatTask.Project;
import java.io.FileWriter;
import java.io.IOException;
public class Account {
	private String accHolder="Vigilante";
	private long accNumber=10978653421l;
	private int pin=1234;
	private double money=0;
	FileWriter fw=null;
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		if(pin==1234) {
			if(AtmImp.a==0) {
				try {
					fw=new FileWriter("V:\\Test1\\Transaction.txt", true);
					fw.write("Withdrawl Amount :"+money+" ");
					fw.flush();
					fw=new FileWriter("V:\\Test1\\Transaction.txt", true);
					fw.write("Balance Amount :"+(this.money-money)+" ");
					fw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				this.money -= money;
			}
			else if(AtmImp.a==1) {
				try {
					fw=new FileWriter("V:\\Test1\\Transaction.txt", true);
					fw.write("Deposit Amount :"+money+" ");
					fw.flush();
					fw=new FileWriter("V:\\Test1\\Transaction.txt", true);
					fw.write("Balance Amount :"+(this.money+money)+" ");
					fw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				this.money +=money;
			}
		}
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Account [accHolder=" + accHolder + ", accNumber=" + accNumber +"]";
	}
}
