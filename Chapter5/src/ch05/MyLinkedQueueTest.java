package ch05;

public class MyLinkedQueueTest {

	public static void main(String[] args) {

		MyLinkedQueue linkedQueue = new MyLinkedQueue();
		linkedQueue.enQueue("A");
		linkedQueue.enQueue("B");
		linkedQueue.enQueue("C");
		
		linkedQueue.printAll();
		
		System.out.println(linkedQueue.deQueue());
		System.out.println(linkedQueue.deQueue());
		
	}

}
