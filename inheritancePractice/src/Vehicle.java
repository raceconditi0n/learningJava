public class Vehicle {
    private int moves;
    private int passengers;

    public Vehicle(int moves, int passengers){
        this.moves = moves;
        this.passengers = passengers;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


}
