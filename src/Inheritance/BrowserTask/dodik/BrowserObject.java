package Inheritance.BrowserTask.dodik;



public class BrowserObject {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();

        FireFox fox = new FireFox();
        fox.get("https://www.mozilla.org/en-US/firefox/new/");
        fox.close();
    }



}
