import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int numberPassengers() {
        return this.passengers.size();
    }

    public boolean checkSpace() {
        return this.capacity - this.numberPassengers() > 0;
    }
    
    public void addPerson(Person person) {
        if (this.checkSpace()) {
            this.passengers.add(person);
        }
    }
    
}
