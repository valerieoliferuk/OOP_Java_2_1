import org.example.CEO;
import org.example.Manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CEOTest {
        private Manager manager;
        private CEO ceo;


        @BeforeEach
        public void setup(){
            manager = new Manager("Alice", "Media Dep Manager");
            ceo = new CEO("Andriana", "the goddess");
            ceo.addManager(manager);
        }
        @Test
        public void addManagerTest(){
            List<Manager> expectedLst = List.of(manager);
            assertEquals(expectedLst, ceo.getTeamMembersManagers());
        }
        @Test
        public void removeManagerTest(){
            ceo.removeManager(manager);
            assertTrue(ceo.getTeamMembersManagers().isEmpty());
        }



}
