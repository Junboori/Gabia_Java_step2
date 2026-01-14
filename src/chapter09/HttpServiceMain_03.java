package chapter09;

public class HttpServiceMain_03 {

	public static void main(String[] args) {

		HttpServlet logHttpServlet = new LoginService();
		HttpServlet filHttpServlet = new FileDownloadService();

		logHttpServlet.service();
		filHttpServlet.service();

	}

	public static void method(HttpServlet http) {
		http.service();
	}

}
//method
