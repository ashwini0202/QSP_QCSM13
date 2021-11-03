
package PracticScripts;



public Class Test{

	public static void main(String[] args){

		Test.gMaps(source, destination);

	}



	public static void gMaps(String source, String destination){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/dir///@16.1725459,75.6557093,15z");
        driver. //write proper syntax





			//To enter Source

			driver.findElement(By.xpath("(//input[contains(@class,'tactile-searchbox-input')])[4]")).sendKeys(“Bengaluru”);





		//To Enter Destination

		driver.findElement(By.xpath("(//input[contains(@class,'tactile-searchbox-input’)])[5]”)).sendKeys(“Mumbai”);

				driver.findElement(By.xpath("(//input[contains(@class,'tactile-searchbox-input’)])[5]”)).sendKeys(Keys.TAB);



						driver.findElement(By.xpath("(//button[contains(@aria-label,'Search')])[3])).click();

								Thread.sleep(5000); // Time unit is in milli seconds



								List<WebElement> allDistances = driver.findElements(By.xpath(“//div[contains(@class,'xB1mrd-T3iPGc-trip-ij8cu')]"));



										System.out.println(allDistances.size());



								for (WebElement webElement : allDistances) {

									String name = webElement.getText();

									System.out.println(name);   //Prints the name of all the distances







								}





	}



}
