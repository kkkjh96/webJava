package sec04.ex02;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class LoginImpl2 implements HttpSessionListener {
	String user_id;
	String user_pw;
	static int total_user = 0;
    
    public LoginImpl2() {   
    }
    
    public LoginImpl2(String user_id, String user_pw) {
    	this.user_id = user_id;
    	this.user_pw = user_pw;
    }
    
    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
    	System.out.println("技记 积己");
    	++total_user;
    }
    
    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	System.out.println("技记 家戈");
    	--total_user;
    }
}
