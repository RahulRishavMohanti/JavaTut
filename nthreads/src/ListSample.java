import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(3,66,77,3);
		List<String> sList = Arrays.asList("Smith","Peter","Roger","Uma");
		
		print(iList);
		print(sList);
		List<Integer> idList = new ArrayList<>();
		List<String> sdList = new ArrayList<>();
		copy(idList, iList);
		copy(sdList,sList);
		System.out.println(idList);
		System.out.println(sdList);
	}
	private static <T> void copy(List<T> dest, List<T> src) {
		// TODO Auto-generated method stub
		for (T elem: src) {
			dest.add(elem);
		}
		
	}
	//only accessors work.
	private static void print(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
