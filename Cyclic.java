
import java.util.*;

public class Cyclic {

	public static int cyclicWords(String[] words){
	//each element of string is a word
	// goal to return number of cyclic words
	// In comparing a 3 element array of elements a, b, and c if I compare a with b, and b with c, and a with c, //I will get the total number of possible cycles
		int cyclic =0;
		String nextword = "";
		for(int i = 0;i<words.length;i++){
			String currword = words[i];
			if(i+1<words.length){

				nextword = words[i+1]; // in order to compare currword to nextword
			}
			else{
				nextword = words[0]; 
				//The idea is to connect the last string element with the first
			}
			if(rotation(currword,nextword)){
				cyclic++;
				//cyclic++ acts as the counter for unique sets	
				}
			
			

		}
		
		return words.length - cyclic; // need to subtract cyclic from words.length to get the # of UNIQUE words
	}
	public static boolean rotation(String word1, String word2){
		return (word1.length() == word2.length() && ((word1 + word1).indexOf(word2))!= -1); 
		// function will compare two strings and return true if the second string is a cyclic rotation of the first
	}

		public static void main(String[] args) {
			String[] str = new String[5]; //test case 1: output 2 
			str[0]= "picture";
			str[1] = "turepic";
			str[2] = "icturep";
			str[3] = "word";
			str[4] = "ordw";
			
			String[] str2 = new String[3]; //test case 2: output 3
			str2[0]= "lazy";
			str2[1]="brown";
			str2[2]="dog";
			
			String[] str3 = new String[4]; // test case 3(of my choosing): output 3
			str3[0] = "quick";
			str3[1] = "kquic";
			str3[2] = "dog";
			str3[3] = "monk";
			
			System.out.println(cyclicWords(str));
			System.out.println(cyclicWords(str2));
			System.out.println(cyclicWords(str3));
			
			
			
			
		 
			
		}
	}