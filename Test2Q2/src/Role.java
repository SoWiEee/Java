
public abstract class Role {
	
	private String name;
	private int life;
	private int magic;
	private int level;
	private String Armor="";//����
	private String clock="";//�ܭ�
	//�q�{�c�y���
	public Role() {
		
	}
	
//��l��4���ܼ�
	public Role(String name,int life, int magic,int level) {
		this.name = name;
		this.life = life;
		this.magic = magic;
		this.level = level;
	}
	//Set
	public void setName(String name) {
		this.name = name;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	//Get
	public String getName() {
		return name;
	}
	public int getLife() {
		return life;
	}
	public int getMagic() {
		return magic;
	}
	public int getLevel() {
		return level;
	}
	//��H�禡
	public abstract void Drink(Drug D);
	public abstract void print_char();
}
