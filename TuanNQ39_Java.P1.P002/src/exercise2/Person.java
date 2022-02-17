package exercise2;

public class Person {
	public class Wallet {
		protected int totalMoney;

		public int getTotalMoney() {
			return totalMoney;
		}

		public void setTotalMoney(int totalMoney) {
			this.totalMoney = totalMoney;
		}
	}

	public int calcTotal(int[] bills) {
		int total = 0;
		for (int i = 0; i < bills.length; i++) {
			total = total = bills[i];
		}
		return total;
	}

	public boolean payMoney(int total) {
		boolean status = true;
		return status;
	}
}
