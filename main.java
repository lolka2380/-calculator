import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class main {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String pr1 = ""; 
		String pr2 = "";
		int pri1;
		int pri2;
		int index=0;
		Pattern pattern=Pattern.compile("\\d+\\+\\d+");
		Matcher matcher=pattern.matcher(input);
		if(matcher.matches()){
		for (int i=0; i<input.length();i++){
			if (input.charAt (i)=='+'){
				index=i;
			}
		}
		
		for (int i=0;i<index;i++){
			pr1 +=input.charAt(i);
		}
		for (int i=index; i < input.length();i++){
			pr2 +=input.charAt(i);
			 pri1= Integer.parseInt(pr1);
		 pri2= Integer.parseInt(pr2);
			System.out.print(pri1+pri2);
		}
		}		else {
			System.out.print("Дудос");
			
		}
		
		
	}
}
