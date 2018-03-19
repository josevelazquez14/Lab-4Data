package sortersTesterClasses;

import java.util.ArrayList;

import dataGenerator.DataGenerator;
import sorterClasses.BubbleSortSorter;
import java.util.Comparator;



public class EnteroTester {

	
	
	public static void main(String[] args){
		BubbleSortSorter<Entero> sort = new BubbleSortSorter<>();
		DataGenerator elements = new DataGenerator(8);
		
		Integer[] intArr = elements.generateData();
		Entero[] arr = new Entero[8];
		
		for(int i=0; i<8; i++){
			arr[i] = new Entero(intArr[i]);
			System.out.println(arr[i]);
		}
		sort.sort(arr, null);
		
	}
	
	
}
