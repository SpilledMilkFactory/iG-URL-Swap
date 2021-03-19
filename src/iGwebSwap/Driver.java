/**
 * @author Christopher Sutton
 * Version #: 0.10 (Alpha)
 * Last Modified: 1/26/2020
 * This Program automates the changing of the Web URL field on a users Instagram
 * account.  Checks for scheduled time every 30 seconds and runs until manually 
 * closed.  
 */
package iGwebSwap;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static final String LOGIN_URL = "https://www.instagram.com/accounts/login/?source=auth_switcher";
    protected static final  int WAIT_TIMER = 5000;//in milliseconds, 5000 milliseconds = 5 sec.
    protected static String username = "", password = "";
    protected static ArrayList<String> swapList , timesList;
    protected static WebDriver driver = new ChromeDriver();
    
    public static void main() throws InterruptedException, FileNotFoundException, IOException{
        Runtime rt = Runtime.getRuntime();
        rt.exec("cmd.exe /c cd \""+"%userprofile%\\Desktop\\iG_URL_Swap"+"\" & /k \"java -jar iG_URL_Swap_v2.jar\"");
        System.out.println("iG URL Swap now running...");
        getCredentials();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        login();

        Timer timer = new Timer();
        TimerTask timeCheck = new TimerTask(){
            @Override
            public void run(){
                try {
                    String now = java.time.LocalTime.now().toString();
                    swapList = readFile();
                    timesList = new ArrayList<>();
                    buildLists();
                    swapURL(now);
                } catch (InterruptedException | IOException ex) {
                    Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        timer.schedule (timeCheck, 0l, (1000)*60);
    }
    /**
     *This is the block that contains the automated steps for the login
     *and dismissal of the "do you want notifications popup
     * 
     * @throws InterruptedException
     */
    public static void login() throws InterruptedException{
        driver.get(LOGIN_URL);
        Thread.sleep(WAIT_TIMER);
        WebElement usernameBox = driver.findElement(By.name("username"));
        usernameBox.click();
        usernameBox.sendKeys(username);
        Thread.sleep(WAIT_TIMER);
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.click();
        passwordBox.sendKeys(password);
        Thread.sleep(WAIT_TIMER);
        //usernameBox.submit();
        passwordBox.submit();
        Thread.sleep(WAIT_TIMER);
        WebElement notNow = driver.findElement(By.cssSelector(".HoLwm"));
        notNow.click();
        Thread.sleep(WAIT_TIMER);
        
    }
    /**
     *Reads the file "webURLs.txt" from the containing folder and pulls values from
     * the text file.
     * 
     * @return      An ArrayList of strings containing the contents of the webURLs.txt file
     */
    public static ArrayList<String> readFile() throws IOException{
        ArrayList<String> stringList = new ArrayList<>();
        try {
            try (BufferedReader fileInput = new BufferedReader (new FileReader("webURLs.txt"))) {
                String line = fileInput.readLine();
                while (line != null){
                    stringList.add(line);
                    line = fileInput.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stringList;
    }
    /**
     *Reads the file "userCredentials.txt" and stores the username and password
     *specified inside the text file.
     * 
     * @throws FileNotFoundException
     */
    public static void getCredentials() throws FileNotFoundException{
        ArrayList<String> stringList = new ArrayList<>();
        try (Scanner fileInput = new Scanner(new File("userCredentials.txt"))) {
            while (fileInput.hasNextLine()) {
                stringList.add(fileInput.nextLine());
            }
        }
        username = stringList.get(0);
        password = stringList.get(1);
    }
    /**
     *Block that references the current time and calls the changeSiteURL method
     * if the given time matches a scheduled time.
     * 
     * @param now       String representation of the current time.
     * @throws InterruptedException
     */
    public static void swapURL(String now) throws InterruptedException{
        for(int i=0; i<swapList.size(); i++){
            if(now.contains(timesList.get(i))){
                System.out.println("Time to change a URL.");
                changeCycle(swapList.get(i));
                System.out.println("URL Successfully changed @"+now+"\niG URL Swap running...");
            }
        }
        
    }
    /**
     *Separates and builds two separate Array Lists, one for scheduled times 
     * and one for their corresponding URLs to change to. Splits the original 
     * file input into two lists. 
     */
    public static void buildLists(){
        for(int i=0; i<swapList.size();i++){
            String fullLine = swapList.get(i);
            String time = fullLine.substring(0,fullLine.indexOf(';'));
            String url = fullLine.substring((fullLine.indexOf(';')+1));
            timesList.add(time);
            swapList.set(i, url);
        }
    }
    /**
     * Cycle for automating the actual change of web URL field and saving of 
     * changes.
     * 
     * @param webURL            String representation of the desired new URL
     * @throws InterruptedException 
     */
    public static void changeCycle(String webURL) throws InterruptedException{
        WebElement accountPage = driver.findElement(By.cssSelector(".XrOey:nth-child(3) .\\_8-yf5"));
        accountPage.click();
        Thread.sleep(WAIT_TIMER);
        WebElement editProfileButton = driver.findElement(By.cssSelector(".sqdOP"));
        editProfileButton.click();
        Thread.sleep(WAIT_TIMER);
        WebElement newWebSiteURL = driver.findElement(By.id("pepWebsite"));
        newWebSiteURL.click();
        newWebSiteURL.clear();
        newWebSiteURL.sendKeys(webURL);
        Thread.sleep(WAIT_TIMER);
        WebElement submitButton = driver.findElement(By.cssSelector(".L3NKy"));
        submitButton.click();
        Thread.sleep(WAIT_TIMER);
    }
}
