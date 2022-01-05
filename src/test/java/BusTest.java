import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 5);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        person5 = new Person();
        person6 = new Person();
        busStop = new BusStop("Edinburgh");
    }

    @Test
    public void canGetNumberOfPeopleOnBus() {
        assertEquals(0, bus.numberPassengers());
    }

    @Test
    public void canCheckBusNotFull() {
        assertEquals(true, bus.checkSpace());
    }

    @Test
    public void canCheckBusFull() {
        bus.addPerson(person1);
        bus.addPerson(person2);
        bus.addPerson(person3);
        bus.addPerson(person4);
        bus.addPerson(person5);
        assertEquals(false, bus.checkSpace());
    }

    @Test
    public void canAddPassengerWhenSpace() {
        bus.addPerson(person1);
        bus.addPerson(person2);
        bus.addPerson(person3);
        bus.addPerson(person4);
        assertEquals(4, bus.numberPassengers());
    }

    @Test
    public void canNotAddPassengerWhenNoSpace() {
        bus.addPerson(person1);
        bus.addPerson(person2);
        bus.addPerson(person3);
        bus.addPerson(person4);
        bus.addPerson(person5);
        bus.addPerson(person6);
        assertEquals(5, bus.numberPassengers());
    }

}
