import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalyzer {

	
	public static void main (String args[]){
		
		Map<LocalDateTime, Integer> stepMap = new HashMap<>();
		LocalDate date = LocalDate.of(2018, 10, 19);
		stepMap.put(date.atTime(12, 0), 0);
		stepMap.put(date.atTime(12, 1), 0);
		stepMap.put(date.atTime(12, 2), 60); // first 300 starts here
		stepMap.put(date.atTime(12, 3), 60);
		stepMap.put(date.atTime(12, 4), 60);
		stepMap.put(date.atTime(12, 5), 60);
		stepMap.put(date.atTime(12, 6), 60); // first 300 ends here
		stepMap.put(date.atTime(12, 7), 0);
		stepMap.put(date.atTime(12, 8), 50); // second 300 starts here
		stepMap.put(date.atTime(12, 9), 50);
		stepMap.put(date.atTime(12, 10), 50);
		stepMap.put(date.atTime(12, 11), 50);
		stepMap.put(date.atTime(12, 12), 50);
		stepMap.put(date.atTime(12, 13), 50); // second 300 ends here
		
		int bouts = getBouts(date, stepMap);
		
		if(bouts == 1){
			System.out.print("You won !!");
		}
		
	}
	
	private static int getBouts(LocalDate date, Map<LocalDateTime, Integer> stepMap){
		

		
		
		return 0;
	}
	
}
