package testScript;

public class NavigationCommands extends Base {
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");//navigate from one page to another
		driver.navigate().back();//navigate back to our page
		driver.navigate().forward();//again back to amazon page
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigationCommands();
		//navigationcommands.driverQuitAndClose();

	}

}
