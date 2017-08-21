package DI3;

import java.util.Scanner;

public class NewRecordView implements RecordView {
	//점수 출력을 위해서는 객체 필요
	private NewRecord record;
	
	public NewRecordView(){}
	
	//setter를 통한 객체 주입 > 인터페이스 적용
	public void setRecord(Record record) {
		this.record = (NewRecord)record;
	}

	@Override
	public void print(){
		System.out.println(record.total()+ " / "+record.avg());
		System.out.println(record.toString());
	}
	
	@Override
	public void input(){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("kor: ");
		record.setKor(scan.nextInt());
		
		System.out.println("eng: ");
		record.setEng(scan.nextInt());
		
		System.out.println("math: ");
		record.setMath(scan.nextInt());
	}
}
