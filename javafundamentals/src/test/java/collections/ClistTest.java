package collections;

import java.util.ArrayList;
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
	@Test(priority=1,enabled=true)
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
	@Test(priority=2,enabled=true)
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
	@Test(priority=3,enabled=true)
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

}
