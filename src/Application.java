
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application{
	public static int factorial(int n){
		int answer = 1;
		for (int i=2;i<=n ;i++ ) 
			answer *=i;
		return answer;
		
	}
	 public static void main(String[] args) throws IOException{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             try{
                int input = Integer.parseInt(br.readLine());
                System.out.println(input+"!="+factorial(input));
            }catch(NumberFormatException nfe){
                System.err.println("Invalid Format!");
            }
	     
	 }

}


