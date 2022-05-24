import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import java.net.MalformedURLException;
import java.net.URL;
 
public class base {
 
    static AndroidDriver driver;
 
    static String apkSource = "https://github.com/appium/appium/raw/master/sample-code/apps/ApiDemos-debug.apk";
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cp.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 XL API 32");
        cp.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cp.setCapability(MobileCapabilityType.APPLICATION_NAME, "Uiautomator2");
        cp.setCapability(MobileCapabilityType.APP,apkSource);
 
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cp);
        Thread.sleep(3000);
 
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        System.out.println("Done");
 
    }
}