package homeAssignments;

import java.util.Arrays;

public class missingelements {

	public static void main(String[] args) {
		int [] data= {1,4,3,2,8,6,7};
		Arrays.sort(data);
		//1,2,3,4,6,7,8
	for (int i = 0; i < data.length-1; i++) {
		
		if (data[i]!=i+1) {
			System.out.println("Missing element is:"+(i+1));
			break;
			
		}
		
	}

	}

}
