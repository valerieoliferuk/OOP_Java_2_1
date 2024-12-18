package org.example;

public class IndividualWorker extends Worker {

    public IndividualWorker(String name, String role) {
        super(name, role);
    }

    @Override
    public void getDetails(){
        System.out.println("Individual worker: " + name + ", role: " + role);
    }
    @Override
    public void handleRequest(Request request){

    }
}
