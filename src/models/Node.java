package models;



public class Node<T> {

    private T value;
    private int edad;

    public Node(T value, int edad) {
        this.value = value;
        this.edad = edad;
    }

    public T getValue() {
        return value;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Node<?> other = (Node<?>) obj;

        if (edad != other.edad) return false;
        if (value == null) return other.value == null;
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + edad;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }
}
