package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker{
    protected List<Worker> teamMembers;
    public Manager(String name, String role){
        super(name, role);
        teamMembers = new ArrayList<>();
    }
    public void addWorker(Worker worker){
        teamMembers.add(worker);
    }
    public void removeWorker(Worker worker){
        teamMembers.remove(worker);
    }

    public List<Worker> getTeamMembers() {
        return teamMembers;
    }

    @Override
    public void handleRequest(Request request){
        if (request.priority == 2){
            System.out.println("A manager " + name + " did the following request: "+ request.description);
            isRequestHandled = 1;
        }else{
            nextWorker.handleRequest(request);
        }
    }

    @Override
    public void getDetails(){
        System.out.println("Manager: " + name + " with team members: ");
        for (int i=0; i< teamMembers.size(); i++){
            Worker member = teamMembers.get(i);
            System.out.println("Member "+i+" :"+member.name);
        }
    }
}
