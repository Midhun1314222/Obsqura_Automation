package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testScript3.Base;

public class AtomationProject extends Base {
	
	  public void login() {
	        driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");

	        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	        userName.sendKeys("admin");

	        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	        password.sendKeys("admin");

	        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        submitBtn.click();
	    }
	  
	  public void adminUserNavigate() {
		  WebElement adminUsersBtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
			adminUsersBtn.click();
	  }
	  
	  @Test
		public void addNewPage() {
			login();
			
			WebElement managePages=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']"));
			managePages.click();
			
			WebElement createNew=driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
			createNew.click();
			
			WebElement titleField=driver.findElement(By.xpath("//input[@id='title']"));
			titleField.sendKeys("Cars");
			
			//WebElement descfield=driver.findElement(By.xpath("//textarea[@role='textbox']"));
			//descfield.sendKeys("cars for test");
			
			WebElement page=driver.findElement(By.xpath("//input[@id='page']"));
			page.sendKeys("13");
			
			WebElement imageUpload=driver.findElement(By.xpath("//input[@id='main_img']"));
			imageUpload.sendKeys("D:\\cars.jpeg");
			
			WebElement submitBtn=driver.findElement(By.xpath("//button[@type='submit']"));
			submitBtn.click();
		}
	  
	@Test
    public void addSubCategory() {
        try {
            login();

            WebElement subCategory = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']"));
            subCategory.click();

            WebElement createNew = driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
            createNew.click();

            WebElement category = driver.findElement(By.xpath("//select[@id='cat_id']"));
            Select select = new Select(category);
            select.selectByValue("247");

            WebElement subCategory1 = driver.findElement(By.xpath("//input[@id='subcategory']"));
            subCategory1.sendKeys("Iphone 15 pro");

            WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
            fileUpload.sendKeys("D:\\iphone-15-pro-finish-select-202309-6-1inch-blacktitanium.jpeg");

            WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
            submit.click();

            System.out.println("Sub-category added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to add sub-category.");
        }
    }
	@Test
	public void deleteSubCategory() {
       login();

        WebElement subCategory = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']"));
        subCategory.click();
        
        WebElement deleteBtn=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[5]/a[2]"));
        deleteBtn.click();
		driver.switchTo().alert().accept();	

	}
	@Test
	public void manageContact() {
		login();
		
	    WebElement moreInfoBtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']"));
	    moreInfoBtn.click();

	    WebElement actionBtn = driver.findElement(By.xpath("//a[@role='button']"));
	    actionBtn.click();

	    WebElement editPhone = driver.findElement(By.xpath("//input[@id='phone']"));
	    editPhone.clear();  
	    editPhone.sendKeys("6876872173");

	    WebElement editEmail = driver.findElement(By.xpath("//input[@id='email']"));
	    editEmail.clear();  
	    editEmail.sendKeys("midhunnand13@gmail.com");

	    WebElement editLimit = driver.findElement(By.xpath("//input[@id='del_limit']"));
	    editLimit.clear(); 
	    editLimit.sendKeys("737373");

	    WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    submitButton.click();
	}
	@Test
	public void addNewAdminUser() {
		login();
		adminUserNavigate();
		
		WebElement addNewBtn = driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
		addNewBtn.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("midhun12");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("midhunn123");
		
	    WebElement userType = driver.findElement(By.xpath("//select[@id='user_type']"));
	    Select select = new Select(userType);
	    select.selectByValue("admin");
	    
	    WebElement saveBtn = driver.findElement(By.xpath("//button[@name='Create']"));
	    saveBtn.click();
	}
	@Test
	public void adminUserChangeStatus() {
		login();
		adminUserNavigate();

		WebElement actionbtn=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[5]/a[1]"));
		actionbtn.click();
	}
	@Test
	public void adminUserSearch() {
		login();
		adminUserNavigate();
		
		WebElement searchBtn = driver.findElement(By.xpath("//a[@onclick='click_button(2)']"));
		searchBtn.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='un']"));
		userName.sendKeys("MIDHUN");
		
		WebElement userType = driver.findElement(By.xpath("//select[@id='ut']"));
		Select select=new Select(userType);
		select.selectByValue("staff");
		
		WebElement findUserBtn = driver.findElement(By.xpath("//button[@value='sr']"));
		findUserBtn.click();

	}
	@Test
	public void addManageNews() {
		login();
		
		  WebElement manageNewsBtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		  manageNewsBtn.click();
		  
		  WebElement addnewNews = driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
		  addnewNews.click();
		  
		  WebElement news = driver.findElement(By.xpath("//textarea[@id='news']"));
		  news.sendKeys("Test News");
		  
		  WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		  submitBtn.click();
	}
	
	@Test
	public void editManageNews() {
		login();
		
		  WebElement manageNewsBtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		  manageNewsBtn.click();
		  
		  WebElement editBtn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[2]/a[1]"));
		  editBtn.click();
		  
		  WebElement editedNews = driver.findElement(By.xpath("//textarea[@id='news']"));
		  editedNews.clear();
		  editedNews.sendKeys("Edited News");
		  
		  WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		  submitBtn.click();
		  
	}
	@Test
	public void editCategory() {
		login();
		 WebElement categoryBtn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div[6]/div/a"));
		 categoryBtn.click();
		 
		 WebElement editBtn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[4]/a[1]"));
		 editBtn.click();
		 
		 WebElement editedCategory = driver.findElement(By.xpath("//input[@type='text']"));
		 editedCategory.clear();
		 editedCategory.sendKeys("Cars");
		 
		 WebElement deleteImage = driver.findElement(By.xpath("//a[@role='button']"));
		 deleteImage.click();
		 driver.switchTo().alert().accept();		 	 
		 
		 WebElement imageUpload=driver.findElement(By.xpath("//input[@type='file']"));
		 imageUpload.sendKeys("D:\\cars.jpeg");
		 
		 WebElement showOnTopRadioBtn=driver.findElement(By.xpath("//input[@name='top_menu'and@value='yes']"));
		 showOnTopRadioBtn.click();
		 
		 WebElement showOnLeftRadioBtn=driver.findElement(By.xpath("//input[@name='show_home'and@value='no']"));
		 showOnLeftRadioBtn.click();
		 
		 WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		 submitBtn.click();
	}
}