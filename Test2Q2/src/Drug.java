
public class Drug {
	
	private String size;
	
	//默認構造函數
	public Drug() {
		
	}
   //初始化變數
	public Drug(String size) {
		this.size = size;
	}
	//Set
	public void setSize(String size) {
		this.size=size;
	}
	//Get
	public String getSize() {
		return size;
	}
}
