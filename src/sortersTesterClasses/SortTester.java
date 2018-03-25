package sortersTesterClasses;


import sorterClasses.InsertionSortSorter;


public class SortTester {
	
	
	public static void main(String[] args){
		Integer[] array = {5,9,20,22,20,5,4,13,17,8,22,1,3,7,11,9,10};
		
		InsertionSortSorter<Integer> sort = new InsertionSortSorter<>();
		InsertionSortSorter<Integer> sort2 = new InsertionSortSorter<>();
		Integer[] arr = new Integer[array.length];
		Integer[] arr2 = new Integer[array.length];
		for(int i=0; i<array.length; i++){
			arr[i] = new Integer(array[i]);
			System.out.println(arr[i]);
		}
		
		for(int j= array.length-1; j>=0; j--){
			arr2[j] = new Integer(array[j]);
			System.out.println(arr2[j]);
		}
		sort.sort(arr, null);
		sort2.sort(arr2, null);
		
	}
	

}
