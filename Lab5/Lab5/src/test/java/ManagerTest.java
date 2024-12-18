import org.example.IndividualWorker;
import org.example.Manager;
import org.example.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManagerTest {
    private Manager manager;
    private Worker smallworker;

    @BeforeEach
    public void setup(){
        manager = new Manager("Ann", "Design Dep Manager");
        smallworker = new IndividualWorker("Jane", "worker");
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
}
