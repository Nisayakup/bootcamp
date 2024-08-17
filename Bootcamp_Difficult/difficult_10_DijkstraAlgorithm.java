package Bootcamp_Difficult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class difficult_10_DijkstraAlgorithm {
	
	
    static class Edge {
        int target;
        int weight;

        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    // Method to perform Dijkstra's algorithm
    public static int[] dijkstra(Map<Integer, List<Edge>> graph, int startNode) {
        // Priority queue to store nodes to be explored
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));

        // Distance array to store the shortest distance from startNode to each node
        int[] distances = new int[graph.size()];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startNode] = 0;

        // Start with the startNode
        priorityQueue.add(new Node(startNode, 0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();

            if (currentNode.distance > distances[currentNode.id]) {
                continue;
            }

            List<Edge> edges = graph.getOrDefault(currentNode.id, new ArrayList<>());
            for (Edge edge : edges) {
                int newDist = currentNode.distance + edge.weight;
                if (newDist < distances[edge.target]) {
                    distances[edge.target] = newDist;
                    priorityQueue.add(new Node(edge.target, newDist));
                }
            }
        }

        return distances;
    }

    // Inner class to represent a node in the priority queue
    static class Node {
        int id;
        int distance;

        Node(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }
    }

    // Main method to test Dijkstra's algorithm
    public static void main(String[] args) {
        // Create a graph represented by an adjacency list
        Map<Integer, List<Edge>> graph = new HashMap<>();

        // Add edges to the graph
        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 1);
        addEdge(graph, 2, 1, 2);
        addEdge(graph, 1, 3, 1);
        addEdge(graph, 2, 3, 5);
        addEdge(graph, 3, 4, 3);

        // Find shortest paths from node 0
        int[] distances = dijkstra(graph, 0);

        // Print the shortest distances
        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Node " + i + ": " + (distances[i] == Integer.MAX_VALUE ? "Infinity" : distances[i]));
        }
    }

    // Helper method to add an edge to the graph
    private static void addEdge(Map<Integer, List<Edge>> graph, int from, int to, int weight) {
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(new Edge(to, weight));
    }
}



