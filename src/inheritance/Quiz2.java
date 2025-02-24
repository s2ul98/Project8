package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		BasicTV tv1 = new BasicTV();
		tv1.isPowerOn = true;
		tv1.channel = 7;
		tv1.volume = 20;
		tv1.showInfo();

		System.out.println();
        
		SmartTV tv2 = new SmartTV();
		tv2.isPowerOn = true;
		tv2.channel = 30;
		tv2.volume = 12;
		tv2.ip = "192.168.0.111";
		tv2.showInfo();
		

	}

}

class BasicTV {
	boolean isPowerOn; //전원상태
	int channel; //채널
	int volume; //볼륨

	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	}
}
// 스마트티비 클래스
class SmartTV extends BasicTV {
	String ip; //아이피

	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("IP 주소 : " + ip);
	}
}