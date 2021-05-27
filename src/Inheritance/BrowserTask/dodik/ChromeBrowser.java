package Inheritance.BrowserTask.dodik;

public class ChromeBrowser extends WebDriver{

    public void get(String url){
        System.out.println("Chrome driver is opening "+ url);
    }
    public  void close(){
        System.out.println("Chrome close");
    }
}
