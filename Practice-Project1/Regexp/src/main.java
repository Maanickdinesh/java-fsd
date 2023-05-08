import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence ="Hi How are you";
		Pattern p = Pattern.compile("How");
		Matcher m = p.matcher(sentence);
		
		while(m.find()) {
			System.out.println(m.group()+ " Start in "+ m.start() + " ends in "+ m.end());
		}
	}

}

/*output
  How Start in 3 ends in 6

 */
