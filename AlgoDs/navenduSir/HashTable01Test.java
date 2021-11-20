import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTable01Test {
	@Test
	void test01Add() {
		HashTable01 ht = new HashTable01(10);
		assertTrue(ht.Add(5));
	}
	@Test
	void test02AddDuplicate() {
		HashTable01 ht = new HashTable01(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Add(5));
	}
	@Test
	void test03AddCollision() {
		HashTable01 ht = new HashTable01(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Add(25));
	}
	@Test
	void test04SearchNotFound() {
		HashTable01 ht = new HashTable01(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Search(25));
	}
	@Test
	void test05SearchFound() {
		HashTable01 ht = new HashTable01(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Search(5));
	}
	@Test
	void test06SearchNotFoundInEmptyBucket() {
		HashTable01 ht = new HashTable01(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Search(7));
	}
}
