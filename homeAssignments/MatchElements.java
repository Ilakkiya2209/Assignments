package homeAssignments;

public class MatchElements {

	public static void main(String[] args) {
		int[] arrone={3,2,11,4,6,7};
		int[] arrtwo={1,2,8,4,9,7};
		
		for (int i = 0; i < arrone.length; i++) {
			
		
		for (int j = 0; j < arrtwo.length; j++) {
			
			if (arrone[i]==arrtwo[j]) {
				System.out.println("Matching element is:"+arrtwo[j]);
				
			}
			
		}
		}

	}

}
