package DI_Annotation_04_Resource;

import javax.annotation.Resource;

public class MonitorViewer {
	
	private Recorder recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	
	@Resource(name="xx") //by name(id)
	public void setRecorder(Recorder xxxx) {
		this.recorder = xxxx;
	}
	
}
