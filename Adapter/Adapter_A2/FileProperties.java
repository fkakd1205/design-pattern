import java.io.*;
import java.util.*;
// java.util.Properties

//교환장치 (Adapter 역할) - 상속, Properties 클래스 - 제공되고 있는 것(Adaptee 역할)
public class FileProperties extends Properties implements FileIO {
	//FileIO 인터페이스의 추상메소드를 구현 -> readFromFile(), writeToFile(), setValue(), getValue()
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
        setProperty(key, value);
    }
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
