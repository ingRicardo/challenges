package javas;

import java.util.ArrayList;
import java.util.List;

public class PlainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec = new int[] { 2, 3, 3, 4 };
		int[] vec2 = new int[] { 1 };
		int[] vec3 = new int[] { 2, 3 };
		List<Object> array = new ArrayList<Object>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(4);
		array.add(vec);
		array.add(vec2);
		array.add(vec3);
		int s = vec.length + vec2.length + vec3.length + array.size() - 3;

		System.out.println("input :");
		System.out.println(array);
		System.out.println("output : ");
		int[] v = array(array, s);
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
		}

	}

	public static int[] array(List<Object> array, int s) {
		int[] fvec = new int[s];
		int k = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) instanceof int[]) {
				int[] v = (int[]) array.get(i);
				for (int j = 0; j < v.length; j++) {
					fvec[k] = v[j];
					k++;
				}
			} else {
				fvec[k] = (int) array.get(i);
				k++;
			}
		}

		return fvec;
	}
}
  
