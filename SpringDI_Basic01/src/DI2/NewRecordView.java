package DI2;

public class NewRecordView {
	//점수 출력을 위해서는 객체 필요
	private NewRecord record;
	
	public NewRecordView(){}
	
	public void setRecord(NewRecord record) {
		this.record = record;
	}


	public void print(){
		System.out.println(record.total()+ " / "+record.avg());
	}
}
