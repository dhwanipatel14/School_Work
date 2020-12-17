import java.util.LinkedList;
/**
 This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
 /**
 Reverses the elements in a linked list
 @param strings the linked list to reverse
 */
 public static void reverse(LinkedList<String> strings)
 {
 // Complete this static method based on its JavaDoc comment.
	 if(strings.size()>1) {
		 String word = strings.removeFirst();
		 reverse(strings);
		 strings.addLast(word);
	 }
 }
}