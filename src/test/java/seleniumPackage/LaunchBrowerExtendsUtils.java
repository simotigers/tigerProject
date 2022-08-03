package seleniumPackage;

import utils.Utils;

public class LaunchBrowerExtendsUtils extends Utils {

	public static void main(String[] args) {
		
		 getBrowser("chrome","https://www.amazon.com/");

		 hardWait (6000);
		 tearDown();
		 
	}

}
