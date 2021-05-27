package Inheritance.BrowserTask.dodik;



public class FireFox extends WebDriver {

    @Override
    public void get(String url) {
        System.out.println("opening the "+url+ "in firefox");
    }

    @Override
    public void close() {
        System.out.println("close firefox");
    }
}
