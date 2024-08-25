
public class Warrior extends Role implements Jumpable {
	//�q�{�c�y���
	public Warrior() {
		
	}
	//�c�y��ƪ�l��
public Warrior(String name,int life, int magic,int level) {
	super(name,life,magic,level);
}

private String Armor = "Armor";

public void NewMoon(Role R) {//�����覡
	if(getMagic()>=10) {//�p�G�������]�O10�H�W�~����
		int damage;
		
		if(R instanceof Warrior) {
			damage=25;//���Ԥh25
		}
		else {
			damage=40;//���Ův40
		}
		
		System.out.printf("%s �����F %s\n",getName(),R.getName());
		setMagic(getMagic()-10);//�����̴��]
		R.setLife(R.getLife()-damage);//�Q�����̴��
	}
	else {
		System.out.printf("%s �]�O����\n",getName());
	}
	
	if(R.getLife()<=0) {
		System.out.printf("%s �Q %s �����F\n",R.getName(),getName());
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
