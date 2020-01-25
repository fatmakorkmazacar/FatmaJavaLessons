package class14;

public class StringManipulationExample {

	public static void main(String[] args) {
		
	//=======isEmpty=========.isEmpty - check if the string is blank or not.
		
		String str="";
		String str0="123";
		System.out.println(str.isEmpty()); // True
		System.out.println(str0.isEmpty()); //False
		
	//=======trim=====Trim()will remove extra space before and after the
		
		String str1="        Welcome to SprintQA              ";
		String expectedTitle="Welcome to SprintQA";
		System.out.println(str1.trim().equals(expectedTitle));
		
	//=======replace=========
		
		String str2="I am an Automation Engineer.";
		String str3=str2.replace("Automation Engineer", "Programmer.");
		System.out.println(str2);
		System.out.println(str3);
		
	//========indexOf=======lastIndexOf=================
		
		String str4="Welcome to SprintQA! This is Chirag from SprintQA";
		String str5="Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automationQA";
		System.out.println(str4.indexOf("QA"));//17
		System.out.println(str4.lastIndexOf("QA"));//47
		System.out.println(str5.indexOf("QA",str5.indexOf("QA")+1));  //middle QA index???
		
	//==========substring===============
		
		String str6="Welcome to SprintQA!";
		String str7="Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automationQA";
		System.out.println(str6.substring(str6.indexOf("S")));
		System.out.println(str6.substring(str6.lastIndexOf(" ")));
		System.out.println(str7.substring(11, 20));//substring will return string at specified position.
		
	//==========String.format==========
		
		String companyName="Amazon";
		String trainerName="Chirag";
		String title="Welcome To %s!This is %s from %s We are going to learn automationQA";
		System.out.println(String.format(title,companyName,trainerName,companyName));
		
	//===========compareTo============
		
		String str8="Amazon";
		String str9="Ebay";
		String str10="Amazon";
		System.out.println(str8.compareTo(str9));// negative
		System.out.println(str9.compareTo(str8));// positive
		System.out.println(str8.compareTo(str10));// zero
		
	//=========split========================
		
		String str11="Welcome-to-SprintQA";
		String[]words=str11.split("-");
		System.out.println(words[0]);
		
		
		
		
		
		
		
	}

}
