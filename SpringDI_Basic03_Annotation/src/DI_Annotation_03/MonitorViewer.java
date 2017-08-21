package DI_Annotation_03;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	//컨테이너 안에 맞는 타입이 있으면 주입, 없으면 안함
	@Autowired(required=false) //기본값은 true
	public void setRecorder(Recorder xxxx) {
		this.recorder = xxxx;
	}
	
}
