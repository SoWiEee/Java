
public class Clock {
	/* Hour, minute, and second data of clock.**/
	private int hour;//���Ѥ@�Ӻc�y��ƨӪ�l�ƤT�ӹ���ܶq�ð��w���Ѫ��ȬO���T���C
	private int minute;
	private int second;
	/* Constructor to initialize hour, minute, and second.**/
	Clock(){
		hour = 0;
		minute = 0;
		second = 0;
	}
	/* Set hour**///���C�ӹ���ܶq���Ѥ@�� SET��k�C
	public void SetHour(int hour) {
		if(hour < 0 || hour > 23) { /* out of range 0~23**/
			this.hour = 0;//�p�G HOUR ���Ȥj�� 23�A�h SET ��k���N�Ҧ��T���ܶq���ȳ]�m�� 0�C
		}
		else { 
			this.hour = hour;
		}
	}
	/* Set minute**///���C�ӹ���ܶq���Ѥ@�� SET��k�C
	public void SetMinute(int minute) {
		if(minute < 0 || minute > 59) { /* out of range 0~59**/
			this.minute = 0;//�p�GMinute���Ȥj�� 59�A�h SET ��k���N�Ҧ��T���ܶq���ȳ]�m�� 0�C
		}
		else {
			this.minute = minute;
		}
	}
	/* Set second**///���C�ӹ���ܶq���Ѥ@�� SET��k�C
	public void SetSecond(int second) {
		if(second < 0 || second > 59) { /* out of range 0~59**/
			this.second = 0;//�p�GSecond���Ȥj�� 59�A�h SET ��k���N�Ҧ��T���ܶq���ȳ]�m�� 0�C
		}
		else {
			this.second = second;
		}
	}
	/* Display set time.**///���ѥH��hh:mm:ss���榡��ܮɶ�����k DISPLAYTIME�C
	public void DisplayTime() {//���C�ӹ���ܶq���Ѥ@�� GET ��k�C
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
