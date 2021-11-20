public interface HashTableIntf {
	// Return false in case of collision.
	public boolean Add(int key);

	public boolean Search(int key);

	public boolean Delete(int key);
}
