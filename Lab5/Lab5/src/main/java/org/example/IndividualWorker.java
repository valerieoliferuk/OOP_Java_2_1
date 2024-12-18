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
        if (request.priority == 1){
            System.out.println("A reqular worker " + name + " did the following request: "+ request.description);
            isRequestHandled = 1;
        }else{
            nextWorker.handleRequest(request);
        }
    }
}
