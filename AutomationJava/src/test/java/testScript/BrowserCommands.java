package testScript;

public class BrowserCommands extends Base {
	public void browserCommands() {
		//String title = driver.getTitle();
		//String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();//driver loading from base class
		browsercommands.browserCommands();
		browsercommands.driverQuitAndClose();//quit and close loading from base class
		

	}

}
