package class13;
public class StringManipulation {
	public static void main(String[] args) {
		String str1="Hello";// Non primitive data type.
							// concatination is used for STRING
							//int num1=10; Primitive data type
		String str2=new String("Hello");
		String str3="Hello";
		String str4=new String("Hello");
		
		String actualWebTitle="Welcome to ebay";
		String expectedTitle= "Welcome to Ebay";
		
		String actualWebTitle1="Welcome to ebay";
		String expectedTitle1= "ebay";
		
		String strWithUpperCase="WELCOME TO EBAY";
		String strWithLowerCase="ebay";
		
		System.out.println(str1==str3); // True because have the same location in the memory!!!
		System.out.println(str2==str4); // False because have different location in the memory!!!
		
		System.out.println(expectedTitle.equals(actualWebTitle));//after str2 if we put fullstop. 
														// it shows all methods in the STRING!!!
		System.out.println(expectedTitle.equalsIgnoreCase(actualWebTitle));
		System.out.println(expectedTitle.length());//15-spaces also seen as characters!!!
		
		System.out.println(expectedTitle1.contains(actualWebTitle1));//false
		System.out.println(actualWebTitle1.contains(expectedTitle1));//true
		
		System.out.println(actualWebTitle.toUpperCase());//WELCOME TO EBAY
		System.out.println(actualWebTitle.toLowerCase());//welcome to ebay
		
		System.out.println(strWithUpperCase.contains(strWithLowerCase));//false
		System.out.println(strWithUpperCase.toLowerCase().contains(strWithLowerCase.toLowerCase()));
		
		System.out.println(str1.charAt(0)); //H - 
		System.out.println(strWithUpperCase.charAt(strWithUpperCase.length()-1));//Y
		
		
	}

}
