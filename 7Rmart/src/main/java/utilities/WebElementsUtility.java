package utilities;

import org.openqa.selenium.WebElement;

public class WebElementsUtility {
	  public boolean isElementDisplayed(WebElement element) {
	    	
	    	boolean isdisplayed=element.isDisplayed();
			return isdisplayed;
	     
	    }

	    public boolean isElementSelected(WebElement element) {
	    	boolean isselected=element.isSelected();
	    	return isselected;
	       
	    }

	    public boolean isElementEnabled(WebElement element) {
	    	boolean isenabled=element.isEnabled();
	      return isenabled;
	    }
	    
}
