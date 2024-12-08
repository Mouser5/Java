public enum Direction {
    NORTH,EAST,SOUTH,WEST;

    public Direction next() {
        Direction[] directions = Direction.values();
        int nextOrdinal = (this.ordinal() + 1) % directions.length;
        return directions[nextOrdinal];
    }
}

public class Main {
    public static void main(String[] args) {
        Direction currentDirection = Direction.NORTH;
        System.out.println("Current direction: " + currentDirection);

        Direction nextDirection = currentDirection.next();
        System.out.println("Next direction: " + nextDirection);
    }
}
