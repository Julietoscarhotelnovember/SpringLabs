package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	/* 1단계 xml을 통한 생성과 주입
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}*/
	
	//2단계 멤버필드를 통한 자동 주입
	/*@Autowired
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}*/
	
	//3단계 세터를 통한 자동 주입(가장 많이 쓰임)
	/*private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}

	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("세터를 통한 자동주입 성공");
		System.out.println("id와는 상관 없음!");
		System.out.println("타입으로만 자동 주입");
	}*/
	
	//4단계 일반 함수를 통한 자동 주입
	private Recorder recorder;

	@Autowired
	public void RecorderMethod(Recorder recorder) {
		this.recorder=recorder;
		System.out.println("일반 함수를 이용한 주입");
	}
	public void RecorderPrint(){
		System.out.println("일반 함수를 통한 주입: "+this.recorder);
	}
	
	

}
