package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ClistTest {
	
	/**
	 * <h1>addArrayListandshowOutput</h1>
	 * <p>
	 * This programe add hardcoded arguments to an ArrayList and then 
	 * Print out the entire ArrayList
	 * 
	 * @author suresh
	 * @version 1.0
	 */
	@Test(priority=1,enabled=false)
	public void addArrayListandshowOutput() {
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("London");
		arraylist.add("NewYork");
		arraylist.add("Toronto");
						
		for(String eachList:arraylist) {
			System.out.println("List contains========"+eachList);
		}		
	}
	
/*************************************************************************************************************************************/	
	
/*************************************************************************************************************************************/
	
	/**
	 * <h1>addArrayListandshowOutput</h1>
	 * <p>
	 * This program helps to understand how to Insert first and Last element in an ArrayList
	 * 
	 * @author suresh
	 * @version 1.0
	 */
	@Test(priority=2,enabled=false)
	public void addArrayListInsertFirstAndLastElement() {
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("London");
		arraylist.add("NewYork");
		arraylist.add("Toronto");
		arraylist.add(arraylist.size()-arraylist.size(), "FirstElement");
		arraylist.add(arraylist.size(), "LastElement");
						
		for(String eachList:arraylist) {
			System.out.println("List contains========"+eachList);
		}		
	}
	
/*************************************************************************************************************************************/	
	
/*************************************************************************************************************************************/	
	
	/**
	 * <h1>addArrayListandshowOutput</h1>
	 * <p>
	 * This program helps to understand how to Insert an element in Nth Position
	 * Print out the entire ArrayList
	 * 
	 * @see Outputreferences:
	 * List contains========London
	 * List contains========NewYork
	 * List contains========LastElementMinusNthPosition
	 * List contains========Toronto
	 * 
	 * @author suresh
	 * @version 1.0
	 */
	@Test(priority=3,enabled=false)
	public void addArrayListInsertAtLastElementMinusNthPosition() {
		
		//This will determine where to add the element in the arraylist
		int positionBeforeLastPointInArrayList=1;
		
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("London");
		arraylist.add("NewYork");
		arraylist.add("Toronto");
		
		arraylist.add(arraylist.size()-positionBeforeLastPointInArrayList, "LastElementMinusNthPosition");
						
		for(String eachList:arraylist) {
			System.out.println("List contains========"+eachList);
		}		
	}
	
/*************************************************************************************************************************************/	
	
/*************************************************************************************************************************************/
	
	/**
	 * <h1>addArrayListandshowOutput</h1>
	 * <p>
	 * This program helps to understand how concat two arraylist
	 * Print out the entire ArrayList
	 * 
	 *  
	 * @author suresh
	 * @version 1.0
	 */
	@Test(priority=4,enabled=false)
	public void concatTwoArray() {
		
		List<String> arraylist1=new ArrayList<String>();
		arraylist1.add("London");
		arraylist1.add("NewYork");
		arraylist1.add("Toronto");
		System.out.println("Arraylist1 before added"+arraylist1);
		
		List<String> arraylist2=new ArrayList<String>();
		arraylist2.add("Microsoft");
		arraylist2.add("Oracle");
		arraylist2.add("Amazon");
		
		arraylist1.addAll(arraylist2);
		System.out.println("Arraylist1 after added"+arraylist1);
	}
	
/*************************************************************************************************************************************/	
	
/*************************************************************************************************************************************/
	
	/**
	 * <h1>addArrayListandshowOutput</h1>
	 * <p>
	 * This program helps to understand hoe to convert array to an ArrayList
	 * Print out the entire ArrayList
	 * 
	 *  
	 * @author suresh
	 * @version 1.0
	 */
	@Test(priority=5,enabled=true)
	public void convertArraytoArrayList() {
		
		String[]  ar= {"suresh","Rajesh","Krishnan","Indira"};
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("AsArray"+ar[i]);
		}
		List<String> arrayList=Arrays.asList(ar);
		
		for(String array:arrayList) {
			System.out.println("ArrayList"+array);
		}
		
		
	}
	
/*************************************************************************************************************************************/	
	
/*************************************************************************************************************************************/

}
