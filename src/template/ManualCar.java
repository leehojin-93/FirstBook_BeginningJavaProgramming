package template;

public class ManualCar extends Car {

	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}

	// addCodingMyself
	public void wiper() {
		System.out.println("와이퍼가 작동합니다.");
		System.out.println("사람이 빠르기를 조절합니다.");
	}

}
