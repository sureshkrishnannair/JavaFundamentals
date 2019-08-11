package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Stream {

	
	
	@Test
	public void streamLamdaTest() {
		
		
		List<String> companyList=Arrays.asList("RSA","TCS","Mahendra","Mcdee","Google","","");
		
		//Find empty string 
		long emptylist=companyList.stream().filter(c->c.isEmpty()).count();
		System.out.println("emptylist"+emptylist);
		
		//count lenth >4
		long length4Count=companyList.stream().filter(c->c.length() > 4).count();
		System.out.println("length4Count"+length4Count);
		
		//Print list whose length >4
		List<String> length4=companyList.stream().filter(c->c.length() > 4).collect(Collectors.toList());
		System.out.println("length4"+length4);
		
		//Print strings starts with a letter
		List<String> startswith=companyList.stream().filter(c->c.startsWith("Mc")).collect(Collectors.toList());
		System.out.println("startswith"+startswith);
		
		//count the total number of strings that starts with a sepecific letter
		long startswithcount=companyList.stream().filter(c->c.startsWith("M")).count();
		System.out.println("startswithcount"+startswithcount);
		
		//return non empty list 
		List<String> notEmptyList=companyList.stream().filter(c->!c.isEmpty()).collect(Collectors.toList());
		
		long notemptycount=companyList.stream().filter(c->!c.isEmpty()).count();
		
		System.out.println("notEmptyList"+notEmptyList+"notemptycount"+notemptycount);
		
		//=====================================================================================================================================//
		
		List<Integer> Int = Arrays.asList(100, 4, 7, 3, 2, 34, 21, 53, 17, 32, 63, 52);
		
		//Summarystatistics and return average,count,max,min
		IntSummaryStatistics intsummary=Int.stream().mapToInt(c->c).summaryStatistics();
		
		System.out.println("intsummary"+intsummary.getAverage()+","+intsummary.getCount()+","
		+intsummary.getMax()+","+intsummary.getMin());
		
		//Uppercase
		String touppercase=companyList.stream().map(c->c.toUpperCase()).collect(Collectors.joining(" 	"));
		System.out.println("touppercase"+touppercase);
		
		//Lowercase
		List<String> tolowercase=companyList.stream().map(c->c.toLowerCase()).collect(Collectors.toList());
		System.out.println("tolowercase"+tolowercase);
		
		//Print arraylist
		companyList.stream().distinct().forEach(System.out::println);
		
		//List of cubes
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> cubes=	numbers.stream().map(c->c*c*c).distinct().collect(Collectors.toList());
		cubes.stream().distinct().forEach(System.out::println);
		
		
	}
}
