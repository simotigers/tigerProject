package seleniumPackage;

import utils.Utils;

public class LaunchBrowerExtendsUtils extends Utils {

	public static void main(String[] args) {
		
		 getBrowser("chrome","https://www.amazon.com/");

		 hardWait (5000);
		 tearDown();
		 
	}

}
