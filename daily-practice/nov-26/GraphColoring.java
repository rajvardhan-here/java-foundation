/** M-coloring using backtracking; useful for small graph instances. */
public class GraphColoring {
    private static boolean canUse(int[][] graph, int[] colors, int vertex, int color) {
        for (int v = 0; v < graph.length; v++) if (graph[vertex][v] == 1 && colors[v] == color) return false;
        return true;
    }
    private static boolean assign(int[][] graph, int m, int[] colors, int vertex) {
        if (vertex == graph.length) return true;
        for (int color = 1; color <= m; color++) {
            if (canUse(graph, colors, vertex, color)) {
                colors[vertex] = color;
                if (assign(graph, m, colors, vertex + 1)) return true;
                colors[vertex] = 0;
            }
        }
        return false;
    }
    public static int[] color(int[][] graph, int m) {
        int[] colors = new int[graph.length];
        return assign(graph, m, colors, 0) ? colors : null;
    }
    public static void main(String[] args) {
        int[][] graph = {{0,1,1,1},{1,0,1,0},{1,1,0,1},{1,0,1,0}};
        System.out.println(java.util.Arrays.toString(color(graph, 3)));
    }
}