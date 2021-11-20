package circularqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestCircularQueue {

	@Test
	void test() {
		fail("Not yet implemented");
	}	
	@Test
	void testForEmptyInitially() {
		CircularQueue queue = new CircularQueue(4);
		assertTrue(queue.isEmpty());
	}
	@Test
	void testForFullInitially() {
		CircularQueue queue = new CircularQueue(4);
		assertFalse(queue.isFull());
	}
	@Test
	void testPushUntilFull() {
		CircularQueue queue = new CircularQueue(4);
		queue.insertElement(10);
		queue.insertElement(12);
		queue.insertElement(14);
		queue.insertElement(16);
		assertTrue(queue.isFull());
	}
	@Test
	void testPushPopAndValidateValue() {
		CircularQueue queue = new CircularQueue(1);
		int element = 10;
		queue.insertElement(element);
		assertTrue(queue.delete() == element);
	}

}
