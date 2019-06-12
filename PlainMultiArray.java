/**
 * 
 */
package challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Alfredo Macias Olvera
 * 
 */
public class PlainMultiArray {

	/** 
	 * @param args [1,23, [1, [ 2, [1] , 2]], [1]] take an array with unknown depth
	 *             and make it flat [1,23,1,2,1,2,1]
	 */
	static List<Integer> arrF = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> array = new ArrayList<Object>();
		int[] ve = new int[] { 1 };
		int[] ve2 = new int[] { 1 };

		array.add(1);
		array.add(23);

		List<Object> array2 = new ArrayList<Object>();
		array2.add(1);

		List<Object> array3 = new ArrayList<Object>();
		array3.add(2);
		array3.add(ve2);

		array2.add(array3);
		array2.add(2);
		array.add(array2);
		array.add(ve);
		
		System.out.print("Input -> ");
		System.out.println(array);
		recu(array);
		int [] res = new int[arrF.size()];
		System.out.print("Output -> ");
		for(int i =0; i <arrF.size(); i++) {						
			res[i] = arrF.get(i);
			System.out.print(res[i]+",");
		}
	
	}
	public static void recu(List<Object> array) {
		
		for (int i=0; i< array.size(); i++) {
			if (array.get(i) instanceof int[]) {
				int [] v = (int[]) array.get(i); 
				for (int j = 0 ; j < v.length; j++) {			
					arrF.add(v[j]);
				}
			}else if (array.get(i) instanceof ArrayList) {
				List<Object> list = (List<Object>) array.get(i);
				recu(list);
			}else {
				arrF.add((Integer) array.get(i));
			}
		}

	}
}
