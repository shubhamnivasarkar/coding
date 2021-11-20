// Implement hash table with Bucket size as 1
public class HashTable01 implements HashTableIntf {
	class Bucket {
		int key;
	}

	/*
		class Bucket {
			private int key;
			public Bucket() {}
			public boolean Add(int key) {} // Implement chaining.
			public boolean Search(int key) {}
		}
	 */
	Bucket[] ht;
	int size;

	public HashTable01(int size) {
		this.size = size;
		ht = new Bucket[size];
	}

	private int HashFunctionModN(int key) {
		return key % size;
	}

	@Override
	public boolean Add(int key) {
		// Find the bucket id of the key, using hash function.
		int bucketId = HashFunctionModN(key);
		System.out.println("For key " + key + ", bucketId is " + bucketId);

		// Check if storing key will result in collision.
		if (ht[bucketId] != null) {
			// Bucket stores some key.
			if (ht[bucketId].key != key) { // ht[bucketId].Search(key)
				// Key is not the one that we are trying to store.
				// = Collision.
				System.out.println("Collision for key " + key);
				return false;
			}
			// Handle duplicate key by doing nothing.
			System.out.println("Duplicate key " + key);
			return true;
		}

		ht[bucketId] = new Bucket();
		ht[bucketId].key = key; // ht[bucketId].Add(key);
		System.out.println("Added key " + key);

		return true;
	}

	@Override
	public boolean Search(int key) {
		// Find the bucket id of the key, using hash function.
		int bucketId = HashFunctionModN(key);
		System.out.println("For key " + key + ", bucketId is " + bucketId);

		if (ht[bucketId] != null) {
			if (ht[bucketId].key == key) {
				System.out.println("Found key " + key);
				return true;
			}
			System.out.println("Not found key " + key);
			return false;
		}

		System.out.println("Bucket empty");
		return false;
	}

	@Override
	public boolean Delete(int key) {
		// TODO Auto-generated method stub
		return false;
	}

}
