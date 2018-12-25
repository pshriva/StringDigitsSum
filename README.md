#
This repository contains 2 Java files.
	a. Solution.java - Driver class which should be used to run from command line
	b. SumDigit.java - This is called by the Solution.java file when a correct run command is given

Execution Steps:

1. Please download the folder by clicking the 'clone or download' button on the right side.
2. Unzip the repository and open the path of the file Solution.java in the command line interface
3. Run the following command to compile the code from the command line interface

	$ javac Solution.java SumDigit.java
4. Once compiled, 2 .class files will be created, 1 for each .java file
5. Run on of the following commands to execute the program:

	a. For decimal digit sum with string, run >
	   $ java Solution <some_string>
	   
	   eg:  java Solution "abc123"

	b. For hexaDecimal digit sum with string, run >
	   $ java Solution -x <some_string>"
	   
	   eg:  java Solution -x "abc123"

	c. For hexaDecimal digit sum of string in a file, run >
	   $ java Solution -x -f <complete_path_to_file/file_name.txt>
	   						or 
	   $ java Solution -f -x <complete_path_to_file/file_name.txt>

	   eg: java Solution -x -f "/Users/123/Desktop/file1.txt"
	   						or 
	   eg: java Solution -f -x "/Users/123/Desktop/file1.txt"

	d. For decimal digit sum of string in a file, run >
	   $ java Solution -f <complete_path_to_file/file_name.txt>
	   
	   eg: java Solution -f "/Users/123/Desktop/file1.txt"



Assumptions:
1. File is a .txt file
2. A valid input argument (as per above rules) is provided everytime
3. Files are compiled (using the command as in step 3. after making any changes to the original Solution.java and SumDigit.java files)
