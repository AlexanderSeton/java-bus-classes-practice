import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int queueSize() {
        return this.queue.size();
    }

    public void addToQueue(Person person) {
        this.queue.add(person);
    }

    public void addToFrontOfQueue(Person person) {
        this.queue.add(0, person);
    }

    public Person removeFromQueue() {
        Person removedPerson = null;
        if (this.queue.size() != 0) {
            removedPerson = this.queue.get(0);
            this.queue.remove(0);
        }
        return removedPerson;
    }

    public Person getPersonAtFrontOfQueue() {
        Person firstPerson = null;
        if (this.queue.size() != 0) {
            firstPerson = this.queue.get(0);
        }
        return firstPerson;
    }

}
