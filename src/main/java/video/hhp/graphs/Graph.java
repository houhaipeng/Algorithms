package video.hhp.graphs;

import java.util.ArrayList;
import java.util.Arrays;


public class Graph {
    //存储顶点集合
    private ArrayList<String> vertexList;
    //存储图的对应的邻接矩阵
    private int[][] edges;
    //表示边的数目
    private int numOfEdges;

    public Graph(int n) {
        //初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
    }

    //返回节点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //得到边的数目
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //返回节点i(下标)对应的数据
    public String getValueByIndex(int i) {
        return vertexList.get(i);
    }

    //返回v1-v2的权值
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    //显示图对应的矩阵
    public void showGraph() {
        for (int[] link : edges) {
            System.out.println(Arrays.toString(link));
        }
    }
    //插入节点
    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    //添加边

    /**
     *
     * @param v1 顶点的下标，即第几个顶点
     * @param v2
     * @param weight v1-v2边的权重，0-无连接,1-有连接
     */
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    public static void main(String[] args) {
        int n = 5;
        String vertexs[] = {"A", "B", "C", "D", "E"};
        //创建图对象
        Graph graph = new Graph(n);
        //循环添加顶点
        for (String vertex : vertexs) {
            graph.insertVertex(vertex);
        }
        //添加边
        //A-B A-C B-C B-D B-D
        graph.insertEdge(0, 1, 1);//A-B
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);

        graph.showGraph();
    }
}
