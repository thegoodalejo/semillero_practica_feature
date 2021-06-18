package com.mercadolibre.patterns.actions;

/**
 * Hello world!
 *
 */
public class ActionsUtil 
{
    public static void clic(WebDriver driver, By target )
    {
        sleepSeconds("1");
        waitForElement(driver, target,5);
        element(driver, target).click();
    }
    
    public static void setTextField(WebDriver driver, By target, String text )
    {
        if(!text.isEmpty()) {
        	sleepSeconds("1");
        	waitForElement(driver, target,5);
        	element(driver, target).clear();
        	element(driver, target).sendKeys(text);
        }
        
    }
}
