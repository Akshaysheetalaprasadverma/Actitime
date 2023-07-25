package com.ActitimeObjectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class Homepage {
    @FindBy(xpath = "//div[.='Time-Track']")
     private WebElement timeTracktab;
    
    @FindBy(xpath = "//div[.='Tasks']")
     private WebElement tasktab;

    @FindBy(xpath = "//div[.='Reports']")
    private WebElement reportstab;
    
    @FindBy(xpath = "//div[.='Users']")
    private WebElement Usertab;           

    @FindBy(id = "logoutLink")
    private WebElement looutlink;
    		
   //Initialization 		
    
    public Homepage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    	
    // utilization
    
    public WebElement getTimetracktab() {
    	return timeTracktab;
    }   	
    	
   public WebElement getTasktab() {
     return tasktab;
   }
    		 
    public WebElement getReportstab() {
      return reportstab;
    }
    			 
   	public WebElement getUsertab() {
    	return Usertab;
   	}
    		
    		
    public WebElement getLgoutlnk() {
    	return getLgoutlnk();
    		}
   	}
