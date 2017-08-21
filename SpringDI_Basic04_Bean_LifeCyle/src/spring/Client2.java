package spring;

public class Client2 {

	public Client2() {
		System.out.println("클라이언트2 기본");
	}
	
	private String defaulthost;
	public Client2(String defaulthost){
		this.defaulthost=defaulthost;
		System.out.println("클라이언트2 오버로딩 "+this.defaulthost);
	}
	
	private String host;
	
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
		System.out.println("클라이언트2 세터 호출 "+this.host);
	}
	
	public void send(){
		System.out.println("데이터 보내기...");
	}

	public void Client2_init(){
		System.out.println("사용자 정의 초기화 함수");
	}
	
	public void Client2_close(){
		System.out.println("사용자 정의 소멸 함수");
	}
	
}
