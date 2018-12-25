public class Solution{
	public static void main(String[] args){
		if(args.length <= 0 || args.length > 3){
			warning();
			return;
		}
		String filePath = null;
		String str = null;;
		boolean isFile = false;
		boolean isHexaDecimal = false;
		for(String arg : args){
			if(arg.equals("-f")){
				isFile = true;
			}else if(arg.equals("-x")){
				isHexaDecimal = true;
			}else{
				if(isFile){filePath = arg;}
				else{str = arg;}
			}
		}
		if((!isFile  || !isHexaDecimal) && args.length >= 3){
			warning();
			return;
		}
		SumDigit sd = new SumDigit(filePath, str, isHexaDecimal);
		long sum = sd.sumDigits();
		if(sum >= 0l){System.out.println(sum);}

	}

	private static void warning(){
		System.out.println("Please provide a valid argument in the run command");
		System.out.println("1. For decimal digit sum with string, run >  java Solution <name_of_string>");
		System.out.println("2. For hexaDecimal digit sum with string, run >  java Solution -x <name_of_string>");
		System.out.println("3. For hexaDecimal digit sum of string in a file, run >  java Solution -x -f <complete_path_to_file/file_name.txt>");
		System.out.println("										    	or run >  java Solution -f -x <complete_path_to_file/file_name.txt>");
		System.out.println("4. For decimal digit sum of string in a file, run >  java Solution -f <complete_path_to_file/file_name.txt>");
	}
}