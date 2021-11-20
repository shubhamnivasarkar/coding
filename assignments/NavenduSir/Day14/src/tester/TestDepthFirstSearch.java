package tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import depth_first_search.DepthFirstSearch;

class TestDepthFirstSearch {

	@Test
	void testDepthFirstSearch() {
		DepthFirstSearch dfs = new DepthFirstSearch(5);
		dfs.addNode(0, 1);
		dfs.addNode(0, 2);
		dfs.addNode(0, 3);
		dfs.addNode(2, 3);
		dfs.addNode(3, 4);
		dfs.DFS(0);
		
		assertTrue(true);
		
	}

}
