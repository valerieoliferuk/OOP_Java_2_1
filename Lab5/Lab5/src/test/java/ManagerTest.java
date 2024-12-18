import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManagerTest {
    private Manager manager;
    private Worker smallworker;
    private CEO ceo;
    private Request request;

    @BeforeEach
    public void setup(){
        manager = new Manager("Ann", "Design Dep Manager");
        smallworker = new IndividualWorker("Jane", "worker");
        ceo = new CEO("Gwen", "the god");
        manager.addWorker(smallworker);

    }

    @Test
    public void addWorkerTest(){
        List<Worker> expectedLst = List.of(smallworker);
        assertEquals(expectedLst, manager.getTeamMembers());
    }
    @Test
    public void removeWorkerTest(){
        manager.removeWorker(smallworker);
        assertTrue(manager.getTeamMembers().isEmpty());
    }

    @Test
    public void handleRequestTest(){
        manager.setNextWorker(ceo);
        request = new Request(3, "start a project");
        manager.handleRequest(request);
        assertEquals(1, ceo.getIsRequestHandled());
    }
}
