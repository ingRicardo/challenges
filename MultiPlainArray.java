/**
 * 
 */
package challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TIJUANA
 *
 */
public class MultiPlainArray {

	/**
	 * @param args [1,23, [1, [ 2, [1] , 2]], [1]] take an array with unknown depth
	 *             and make it flat [1,23,1,2,1,2,1]
	 */
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

		int size = ve.length + ve2.length + array2.size() + array3.size();
		int[] f = test(array, size);
		System.out.print("Output : ->  ");
		for (int i : f) {
			System.out.print(i);
		}
	}

	public static int[] test(List<Object> arr, int r) {
		System.out.println("input : -> " + arr);
		int[] fvec = new int[r];
		int s = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) instanceof int[]) {
				int[] v = (int[]) arr.get(i);
				for (int j : v) {

					fvec[s] = j;
					s++;
				}
			} else if (arr.get(i) instanceof ArrayList) {

				List<Object> list = (List<Object>) arr.get(i);

				for (Object object : list) {
					if (object instanceof int[]) {
						int[] v = (int[]) object;

						for (int j : v) {

							fvec[s] = v[j];
							s++;
						}
					} else if (object instanceof ArrayList) {
						List<Object> lists = (List<Object>) object;

						for (int k = 0; k < lists.size(); k++) {
							if (lists.get(k) instanceof int[]) {

								int[] v = (int[]) lists.get(k);

								for (int j : v) {
									if (v instanceof int[]) {
										for (int w = 0; w < v.length; w++) {

											fvec[s] = v[w];
											s++;
										}
									}
								}
							} else {

								fvec[s] = (int) lists.get(k);
								s++;
							}
						}

					} else {

						fvec[s] = (int) object;
						s++;
					}
				}
			} else {

				fvec[s] = (int) arr.get(i);
				s++;
				if (arr.get(i) instanceof int[]) {
					int[] ve = (int[]) arr.get(i);
					for (int w = 0; w < ve.length; w++) {

						fvec[s] = ve[w];
						s++;
					}
				}
			}
		}

		return fvec;
	}

}
