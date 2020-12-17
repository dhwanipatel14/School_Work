import java.util.ArrayList;
import java.util.List;

public class ArrayListUtil<T>{
	/*
	 * Method to reverse the arrayList
	 * @param list list of elements in arrayList
	 */
		public static <T> void reverse(ArrayList<T> list) {
			ArrayList<T> reverseList =  new ArrayList<T>();
			//Looping from end to front
			for(int i=list.size()-1;i>0;i--) {
				reverseList.add(list.get(i));
			}
			list.clear();
			list.addAll(reverseList);
			
		}
		/*
		 * Method to return arrayList of Generic Type
		 */
		public static <T> ArrayList<T> returnReverse(ArrayList<T> list){
			ArrayList<T> reverse =  new ArrayList<T>();
			for(int i=list.size()-1;i>0;i--) {
				reverse.add(list.get(i));
			}		
			return reverse;
			
		}
}
