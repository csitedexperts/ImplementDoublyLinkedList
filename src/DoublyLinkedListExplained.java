
public class DoublyLinkedListExplained {


	public static void main(String a[]){

		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println(dll.size());
		
		dll.append(1, "A");
		dll.append(2, "B");
		dll.prepend(3, "C");
		dll.append(4, "D");
		dll.append(5, "E");

		dll.displayAllNodes();

		dll.iterateForward();
		dll.removeFirst();
		dll.removeLast();
		dll.iterateBackward();
	}
}