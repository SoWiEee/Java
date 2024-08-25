package ����Q1;

public class Witch extends Role implements Jumpable{
	public Witch() {}
	public Witch(String name,int life,int magic,int level) {
		super(name,life,magic,level);
	}
private String clock = "clock";
public void SmallFire(Role R) {
	if(getMagic() >=25) {
		int damage;
		if(R instanceof Warrior) {
			damage = 40;
		}
		else {
			damage = 60;
		}
		System.out.printf("%s�����F%s\n",getName(),R.getName());
		setMagic(getMagic()-25);
		setLife(R.getLife()-damage);
	}
	else {
		System.out.printf("%s�]�O����\n", getName());
	}
	if(R.getLife()<=0) {
		System.out.printf("%s�Q%s�����F\n", R.getName(),getName());
	}
}
@Override
public void Drink(Drug D) {
	if(D instanceof RedDrug) {
		setLife(getLife()+((RedDrug)D).getAddLife());
	}
	else {
		setMagic(getMagic()+((BlueDrug)D).getAddMagic());
	}
}
@Override
public void print_char() {
	System.out.printf("�W��:%s,��q:%s,�]�O:%s,����:%s",getName(),getLife(),getMagic(),getLevel());
}
}
