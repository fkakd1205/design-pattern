package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Enumeration;

public class PageMaker {
    private PageMaker() {   
    }
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");	// Database의 static 메소드 호출
            String username = mailprop.getProperty(mailaddr);
            
            // HtmlWriter 클래스 이용
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));	// FileWriter는 파일의 문자 단위의 출력 (2 Byte씩)
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "의 페이지에 오신 걸 환영합니다.");
            writer.paragraph("메일을 기다리고 있습니다.");
            writer.mailto(mailaddr, username);
            writer.close();
            
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void makeLinkPage(String filename) {          
        try {
        	// HtmlWriter 클래스 이용
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            Properties mailprop = Database.getProperties("maildata");
            Enumeration en = mailprop.propertyNames();
            
            while (en.hasMoreElements()) {
                String mailaddr = (String)en.nextElement();
                String username = mailprop.getProperty(mailaddr, "(unknown)");
                writer.mailto(mailaddr, username);
            }
            
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
