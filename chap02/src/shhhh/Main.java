package shhhh;
import java.util.Scanner;


	public class Main{
	    public static void main(String[] args){
	        
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("이름을 입력하세요.");
	    	String name = sc.nextLine();
	    	System.out.println("입력한 이름: " + name);
	    	
	    	System.out.print("단어 하나만 입력하세요.");
	    	String word = sc.next();
	    	System.out.println("입력한 단어: " + word);

	    	
	    	System.out.print("나이를 입력하세요.");
	    	int age = sc.nextInt();
	    	System.out.println("입력한 나이: " + age);
	    	
	    	System.out.print("키를 입력하세요.");
	    	String height = sc.nextLine();
	    	System.out.println("입력한 : " + height);
	    	
	    	

	    }
	}

