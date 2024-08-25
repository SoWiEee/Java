public class Game {

	public static void main(String[] args) {
		
		Role R []=new Role[6];
		
		int level;//6�ӤH
		level=(int)(Math.random()*10);
		R[0]=new Warrior("�Ԥh1��",400,1000,level);
		level=(int)(Math.random()*10);
		R[1]=new Warrior("�Ԥh2��",400,1000,level);
		level=(int)(Math.random()*10);
		R[2]=new Warrior("�Ԥh3��",400,1000,level);
		level=(int)(Math.random()*10);
		R[3]=new Witch("�k�v1��",280,2000,level);
		level=(int)(Math.random()*10);
		R[4]=new Witch("�k�v2��",280,2000,level);
		level=(int)(Math.random()*10);
		R[5]=new Witch("�k�v3��",280,2000,level);
		
		double chance;//���ľ��v
		
		while(true) {
			//�C��2�ӤH
			Role R1= R[(int)(Math.random()*6)];
			Role R2= R[(int)(Math.random()*6)];
			
			while(R1==R2) {//�T�O���P�H�����B�Q����
				R2=R[(int)(Math.random()*6)];
			}
			
			if(R1 instanceof Warrior) {//�����覡
				((Warrior)R1).NewMoon(R2);
			}
			else {
				((Witch)R1).SmallFire(R2);
			}
			
			if(R2.getLife()<=0) {//���`
				R2.print_char();
				System.exit(0);//�����{��!
			}
			
			if(R1.getMagic()<70) {//���]�A�����̤~���]
				chance = Math.random();
				System.out.printf("%s",R1.getName());
				if(chance<=0.2)
				{
					R1.Drink(new BlueDrug("large"));
					System.out.println("Drink LARGE BlueDrug\n");
				}
				else if(chance>0.2 && chance <= 0.6)
				{
					R1.Drink(new BlueDrug("medium"));
					System.out.println("Drink MEDIUM BlueDrug\n");
				}
				else if(chance>0.6 && chance <=0.9)
				{	
					R1.Drink(new BlueDrug("small"));
					System.out.println("Drink Small BlueDrug\n");
				}
				else
					System.out.println("No BlueDrug!!\n");
			}
			if(R2.getLife()<100)//�ɦ�A�Q�����̤~�ɦ�
			{
				chance=Math.random();
				System.out.printf("%s",R2.getName());
				if(chance <= 0.2)
				{
					R2.Drink(new RedDrug("large"));
					System.out.printf("Drink LARGE RedDrug\n");
				}
				else if(chance > 0.2 && chance <= 0.6)
				{
					R2.Drink(new RedDrug("medium"));
					System.out.printf("Drink MEDIUM RedDrug\n");
				}
				else if(chance > 0.6 && chance <= 0.9)
				{
					R2.Drink(new RedDrug("small"));
					System.out.printf("Drink SMALL RedDrug\n");
				}
				else
					System.out.println("No RedDrug!!\n");
			}
		}
	}
}
