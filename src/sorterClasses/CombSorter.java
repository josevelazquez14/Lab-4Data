package sorterClasses;

public class CombSorter<E> extends AbstractSorter<E> {

	public CombSorter() {
		super("Comb Sorter");
		// TODO Auto-generated constructor stub
	}

	public void sort(int[] key_array) throws Exception {
	      int t;
	      boolean proceed = true;
	      for(int i = 0; i < key_array.length && proceed; i++) {
	         proceed = false;
	         for(int j = 0; j < key_array.length - i - 1; j++) {
	            if(key_array[j] > key_array[j + 1]) {
	               t = key_array[j];
	               key_array[j] = key_array[j + 1];
	               key_array[j + 1] = t;
	               proceed = true;
	            }
	         }
	      }
	   }

	@Override
	protected void auxSort() {
		// TODO Auto-generated method stub
		
	}
	
}
