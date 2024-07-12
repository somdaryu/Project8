package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		BasicTV basic = new BasicTV();
		basic.turn = "on";
		basic.channel = 7;
		basic.volum = 20;

		System.out.println("전원상태:" + basic.turn + ", 채널: " + basic.channel + ", 볼륨: " + basic.volum);

		SmartTV smart = new SmartTV();
		smart.turn = "on";
		smart.channel = 11;
		smart.volum = 30;
		smart.ip = "192.168.0.111";
		System.out.println("전원상태:" + smart.turn + ", 채널: " + smart.channel + ", 볼륨: " + smart.volum + ", 아이피:" + smart.ip);
	}

}

class BasicTV {
	String turn;
	int channel;
	int volum;
}

class SmartTV extends BasicTV {
	String ip;
}