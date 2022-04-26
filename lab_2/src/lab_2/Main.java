package lab_2;

public class Main {

	public static void main(String[] args) throws Exception {
		Box box1 = new Box();
		var box2 = new Box(5.2);
		var box3 = new Box(3.5, 5, 8.5);
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		
		var queue = new Queue<Integer>(5);
		System.out.println(queue);
		System.out.println(queue.GetState());
		var queue1 = new Queue<String>();
		System.out.println(queue1);
		System.out.println(queue1.GetState());
		
		queue.Push(1);
		queue.Push(21);
		queue.Push(31);
		System.out.println(queue);
		
		var firstValue = queue.Pop(false);
		System.out.println("First value in queue = " + firstValue);
		var lastValue = queue.Pop(true);
		System.out.println("Last value in queue = " + lastValue);
		System.out.println(queue);
		
		queue1.Push("test");
		queue1.Push("test1");
		queue1.Push("test2");
		System.out.println(queue1);
		var lastString = queue1.Pop(true);
		System.out.println(lastString);
		System.out.println(queue1);
		
		var areaBox1 = box1.Area();
		var volumeBox1 = box1.Volume();
		System.out.println("Box1 area = " + areaBox1);
		System.out.println("Box1 volume = " + volumeBox1);
		
		var areaBox2 = box2.Area();
		var volumeBox2 = box2.Volume();
		System.out.println("Box2 area = " + areaBox2);
		System.out.println("Box2 volume = " + volumeBox2);
		
		var areaBox3 = box3.Area();
		var volumeBox3 = box3.Volume();
		System.out.println("Box3 area = " + areaBox3);
		System.out.println("Box3 volume = " + volumeBox3);
		
		var queue2 = new Queue<Integer>(3);
		var isEmpty = queue2.IsEmpty();
		var state = isEmpty ? "empty" : "not empty";
		System.out.println("The queue is " + state);
		
		queue2.Push(100);
		queue2.Push(200);
		queue2.Push(300);
		
		isEmpty = queue2.IsEmpty();
		state = isEmpty ? "empty" : "not empty";
		System.out.println("The queue is " + state);
		
		var isFull = queue2.IsFull();
		state = isFull ? "full" : "not full";
		System.out.println("The queue is " + state);
	}

}
