package depth_first_search;

public class DepthFirstSearch {

	int[][] adjMat;
	int n;
	
	public DepthFirstSearch(int n) {
		this.n = n;
		adjMat = new int[n][n];
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				adjMat[i][j]=0;
			}
		}
	}
	
	public void addNode(int v,int u) {
		adjMat[v][u]=1;
		adjMat[u][v]=1;
	}
	
	public void DFSHelper(int start, boolean[] isVisited, int[] result, int[] resultCount) {
		if(!isVisited[start]) {
			isVisited[start] = true;
			System.out.print(start);
			result[resultCount[0]] = start;
			resultCount[0]++;
		}
		for(int i=0; i<n;++i) {
			if (adjMat[start][i] != 0) {
				if (!isVisited[i]) {
					DFSHelper(i, isVisited, result, resultCount);
			}
		}
	}
}
		
	public int[] DFS(int start) {
		boolean[] isVisited = new boolean[n];
		for(int i=0;i<n;++i) {
			isVisited[i] = false;
		}
		int[] result = new int[n];
		int[] resultCount;
		resultCount = new int[1];
		resultCount[0] = 0;
			DFSHelper(start, isVisited, result, resultCount);
		return result;	
	}
	
}
