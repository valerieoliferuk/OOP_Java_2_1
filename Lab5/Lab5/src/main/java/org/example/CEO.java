package org.example;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Worker{
    protected List<Manager> teamMembersManagers;

    public CEO(String name, String role){
        super(name, role);
        teamMembersManagers = new ArrayList<>();
    }
    public void addManager(Manager manager){
        teamMembersManagers.add(manager);
    }
    public void removeManager(Manager manager){
        teamMembersManagers.remove(manager);
    }

    public List<Manager> getTeamMembersManagers(){
        return teamMembersManagers;
    }
    @Override
    public void handleRequest(Request request){
        if (request.priority == 3){
            System.out.println("The CEO " + name + " did the following request: "+ request.description);
            isRequestHandled = 1;
        }else{
            nextWorker.handleRequest(request);
        }
    }

    @Override
    public void getDetails(){
        System.out.println("CEO: "+ name + "with team members: ");
        for (int i=0; i<teamMembersManagers.size(); i++){
            System.out.println("Member " + i + " : " + name);
        }
    }

}
