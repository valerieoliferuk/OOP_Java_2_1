import org.example.IndividualWorker;
import org.example.Manager;
import org.example.Request;
import org.example.Worker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IndividualWorkerTest {
    private IndividualWorker regularWorker;
    private Request request;
    private Manager manager;


    @Test
    public void handleRequestTest(){
        regularWorker = new IndividualWorker("Alice", "small worker");
        manager = new Manager("David", "manager");
        request = new Request(2, "Delegate tasks");
        regularWorker.setNextWorker(manager);
        regularWorker.handleRequest(request);
        assertEquals(1, manager.getIsRequestHandled());
    }
}
