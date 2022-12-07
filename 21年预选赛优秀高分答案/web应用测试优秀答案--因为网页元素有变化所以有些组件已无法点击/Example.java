import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import org.openqa.selenium.By;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) throws InterruptedException {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	driver.get("https://www.douyin.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(8000);
    	//手动完成验证
    	
    	//关闭登录提示
    	driver.findElement(By.xpath("//*[@id='login-guide']/i")).click();
    	Thread.sleep(3000);
    	//点击主屏幕取消提示
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]")).click();
    	Thread.sleep(3000);
    	//暂停
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]")).click();
    	Thread.sleep(3000);
    	//自动播放
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[7]/div/div/button")).click();
    	Thread.sleep(3000);
    	//关闭声音
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[3]/div")).click();
    	Thread.sleep(3000);
    	//点赞
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/xg-bar[3]/div[2]/div/div[2]")).click();
    	Thread.sleep(15000);
    	
    	//手动登录+验证
    	
    	//评论
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/xg-bar[3]/div[2]/div/div[3]")).click();
    	Thread.sleep(3000);
    	//表情
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/div/span[2]")).click();
    	Thread.sleep(3000);
    	//呲牙
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[3]/div[1]/div/span[4]")).click();
    	Thread.sleep(3000);
    	//精彩
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div/div/div")).sendKeys("精彩");
    	Thread.sleep(3000);
    	//发送
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/div/span[3]")).click();
    	Thread.sleep(3000);
    	//下一个
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div/xg-bar[3]/div[1]/div/div/div[2]")).click();
    	Thread.sleep(3000);
    	
    	//对娱乐、知识、二次元、游戏、美食进行点击测试
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[7]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[9]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[10]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[11]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[12]/a")).click();
    	Thread.sleep(3000);
    	
    	//首页
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[1]/a")).click();
    	Thread.sleep(3000);
    	//第一个视频
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/div/a[1]")).click();
    	Thread.sleep(3000);
    	
    	//跳到新的标签页
    	String page1=driver.getWindowHandle();
    	String page2=null;
    	Set<String> handles=driver.getWindowHandles();
    	for(String handle:handles) {
    		if(handle.equals(page1)) {
    			continue;
    		}
    		page2=handle;
    		break;
    	}
    	driver.switchTo().window(page2);
    	Set<String> usedHandles=driver.getWindowHandles();
    	
    	//暂停
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div")).click();
    	Thread.sleep(3000);
    	//自动播放
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[7]/div/div/button")).click();
    	Thread.sleep(3000);
    	
    	//头像
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]")).click();
    	Thread.sleep(3000);
    	
    	String page3=null;
    	handles=driver.getWindowHandles();
    	for(String handle:handles) {
    		if(usedHandles.contains(handle)) {
    			continue;
    		}
    		page3=handle;
    		break;
    	}
    	driver.switchTo().window(page3);
    	usedHandles=driver.getWindowHandles();
    	
    	//关注
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div[1]/div[3]/button")).click();
    	Thread.sleep(3000);
    	//抖音
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]/a")).click();
    	Thread.sleep(3000);
    	//央视
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div/div[1]/div/div[2]/div/form/input[1]")).sendKeys("央视");
    	Thread.sleep(3000);
    	//搜索
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[2]/div/div[1]/div/div[2]/div/button")).click();
    	Thread.sleep(3000);
    	
    	String page4=null;
    	handles=driver.getWindowHandles();
    	for(String handle:handles) {
    		if(usedHandles.contains(handle)) {
    			continue;
    		}
    		page4=handle;
    		break;
    	}
    	driver.switchTo().window(page4);
    	usedHandles=driver.getWindowHandles();
    	
    	//最新发布
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div/div[2]/span[2]")).click();
    	Thread.sleep(3000);
    	//一周内
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div/div[3]/span[3]")).click();
    	Thread.sleep(3000);
    	//第三个视频文本
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/ul/li[3]/div/a[2]")).click();
    	Thread.sleep(3000);
    	
    	String page5=null;
    	handles=driver.getWindowHandles();
    	for(String handle:handles) {
    		if(usedHandles.contains(handle)) {
    			continue;
    		}
    		page5=handle;
    		break;
    	}
    	driver.switchTo().window(page5);
    	usedHandles=driver.getWindowHandles();
    	
    	//右侧第二个
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[3]/ul/li[2]/div")).click();
    	Thread.sleep(3000);
    	
    	//抖音
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/header/div[1]/a")).click();
    	Thread.sleep(3000);
    	//关注
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div/div[3]/a")).click();
    	Thread.sleep(3000);
    	//头像 
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[2]/div/xg-bar[3]/div[2]/div/div[1]/a/div/img")).click();
    	Thread.sleep(3000);
    	//详情
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div/div[2]/div/xg-controls/xg-inner-controls/xg-right-grid/xg-icon[1]/a/div[1]")).click();
    	Thread.sleep(3000);
    	String page6=null;
    	handles=driver.getWindowHandles();
    	for(String handle:handles) {
    		if(usedHandles.contains(handle)) {
    			continue;
    		}
    		page6=handle;
    		break;
    	}
    	driver.switchTo().window(page6);
    	usedHandles=driver.getWindowHandles();
    	//取消关注
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
    	Thread.sleep(3000);
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
