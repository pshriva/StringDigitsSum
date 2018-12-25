import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SumDigit{
	String filePath;
	String str;
	boolean isHexaDecimal;
	Map<Character, Integer> hexaDecimal;
	public SumDigit(String filePath, String str, boolean isHexaDecimal) {
		this.filePath = filePath;
		this.str = str;
		this.isHexaDecimal = isHexaDecimal;
		if(isHexaDecimal){
			hexaDecimal = new HashMap<>();
			getDecimalValues();
		}
	}

	private void getDecimalValues(){
		hexaDecimal.put('a', 10);
		hexaDecimal.put('b', 11);
		hexaDecimal.put('c', 12);
		hexaDecimal.put('d', 13);
		hexaDecimal.put('e', 14);
		hexaDecimal.put('f', 15);
	}

	public Long sumDigits(){
		if(filePath == null){
			return getDeigitsSum(str);
		}else{
			long sum = 0l;
			Scanner sc = null;
			try {
				sc = new Scanner(new File(filePath));
				while(sc.hasNextLine()){
					sum += getDeigitsSum(sc.nextLine());
				}
				sc.close();
				return sum;
			}catch(FileNotFoundException e){
				System.out.println("File not found, please provide the right path");
				return -1l;
			}
		}
	}

	private Long getDeigitsSum(String line){
		long sum = 0;
		for(int i = 0; i < line.length(); i++){
			char ch = line.charAt(i);
			if(ch > '0' && ch <= '9'){
				sum += (ch - '0');
			}else if(isHexaDecimal){
				sum += hexaDecimal.getOrDefault(Character.toLowerCase(ch), 0);
			}
		}
		return sum;
	}

}