package serial;

public class DataProc {
	String recvData;

	public DataProc() {
	}

	public void print() {
		System.out.println("DataProc:" + recvData);
	}

	public void setRecvData(String recvData) {
		this.recvData = recvData;
	}

	public String getRecvData() {
		return recvData;
	}
}