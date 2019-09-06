
public class JavaAPI
	{

		public static void main(String[] args)
			{
				String string1 = "derive joy from code";
				String string2 = "eat more cake";
				
				//Challenge 1
				System.out.println(string1.substring(0,3));
				
				//Challenge 2
				System.out.println(string2.substring(4,8));
				
				//Challenge 3
				System.out.println(string2);
				
				//Challenge 4
				System.out.println(string2.indexOf(0));
				
				//Challenge 5
				System.out.println(string2.indexOf(12 ));
				
				//Challenge 6
				System.out.println(string1 + string2);
				
				//Challenge7
				System.out.println(string2.replace("e", "x"));
				
				//Challenge 8
				System.out.println(string1.toUpperCase());
				
				//Challenge 9
				String newstring1 = string1.replace(" ", "");
				System.out.println(newstring1);
				
				//Challenge 10
				System.out.println(string1.compareTo(string2));

			}

	}
