package DI3;

public class program {

	public static void main(String[] args) {
		NewRecord record=new NewRecord(100, 80, 60);
		NewRecordView view=new NewRecordView();
		view.setRecord(record);
		view.input();
		view.print();

	}

}
