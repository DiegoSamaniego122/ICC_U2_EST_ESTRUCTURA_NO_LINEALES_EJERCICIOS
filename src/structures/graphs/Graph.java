package structures.graphs;

import java.util.*;

import models.Node;

public class Graph<T> {

    private Map<Node<T>, List<Node<T>>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addNode(Node<T> node) {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(Node<T> from, Node<T> to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());

        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }

    public List<Node<T>> getNeighbors(Node<T> node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }

    // 🔧 CLAVE: reutilizar nodos
    private Node<T> getOrCreateNode(T value, int edad) {
        for (Node<T> node : adjList.keySet()) {
            if (node.getValue().equals(value) && node.getEdad() == edad) {
                return node;
            }
        }
        Node<T> newNode = new Node<>(value, edad);
        addNode(newNode);
        return newNode;
    }

    public void addConocido(T v1, int e1, T v2, int e2) {
        Node<T> n1 = getOrCreateNode(v1, e1);
        Node<T> n2 = getOrCreateNode(v2, e2);
        addEdge(n1, n2);
    }

    // BFS
    public void bfs(Node<T> start) {
        Set<Node<T>> visitados = new LinkedHashSet<>();
        Queue<Node<T>> queue = new LinkedList<>();

        visitados.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();
            System.out.print(current.getValue() + " (" + current.getEdad() + ") ");

            for (Node<T> vecino : getNeighbors(current)) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    queue.add(vecino);
                }
            }
        }
    }

    // DFS
    public void dfs(Node<T> start) {
        Set<Node<T>> visitados = new LinkedHashSet<>();
        dfsRec(start, visitados);
    }

    private void dfsRec(Node<T> node, Set<Node<T>> visitados) {
        visitados.add(node);
        System.out.print(node.getValue() + " (" + node.getEdad() + ") ");

        for (Node<T> vecino : getNeighbors(node)) {
            if (!visitados.contains(vecino)) {
                dfsRec(vecino, visitados);
            }
        }
    }
}

