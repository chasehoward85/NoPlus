import java.io.*;
import java.util.*;

public class NoPlus {

	public static void main(String[] args) throws IOException{
		
		Scanner sf = new Scanner(new File ("E:\\NoPlus\\MyData.in"));

		String answer = "";
		int sum;
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while(sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		
		for(int j = 0; j <= maxIndx; j++){
			Scanner sc = new Scanner(text[j]);
			sum = 0;
			answer = "";
			while(sc.hasNext()){
				int i = sc.nextInt();
				if(sum != 0){
				answer = answer + " + " + i;
				sum = sum + i;
				}
				else{
					answer = "" + answer + i;
					sum = sum + i;
				}
			}
			answer = answer + " = " + sum;
			System.out.println(answer);
		}

	}

}
