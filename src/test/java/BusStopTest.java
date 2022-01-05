import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;

    @Before
    public void before() {
        busStop = new BusStop("Edinburgh");
        bus = new Bus("Edinburgh", 5);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        person5 = new Person();
        person6 = new Person();
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person1);
        assertEquals(1, busStop.queueSize());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addToQueue(person1);
        busStop.removeFromQueue();
        assertEquals(0, busStop.queueSize());
    }

    @Test
    public void canNotRemovePersonFromQueueIfEmpty() {
        busStop.removeFromQueue();
        assertEquals(0, busStop.queueSize());
    }

}
