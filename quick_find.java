public class QuickFindUF {
    // ID array - DS supporting this implementation
    private int[] id;

    // Constructor - create arr
    // Set id of each obj to itself
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    // Find operation - check if id of p = id of q
    // Return true if connected
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // Find id of 1st & 2nd arg, go through whole array
    // looking for el-s whose ids are equal to first id and set their id to 2nd arg
    // id
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid)
                id[i] = qid;
    }
}