package DI2;

public class program {

	public static void main(String[] args) {
		NewRecord record=new NewRecord(100, 80, 60);
		NewRecordView view=new NewRecordView();
		view.setRecord(record);
		view.print();

	}

}
