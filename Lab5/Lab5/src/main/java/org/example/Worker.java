package org.example;


public abstract class Worker {
    protected String name;
    protected String role;
    protected Worker nextWorker;
    protected int isRequestHandled = 0;

    public Worker(String name, String role){
        this.name = name;
        this.role = role;
    }

    public void setNextWorker(Worker nextWorker){
        this.nextWorker = nextWorker;
    }

    public void handleRequest(Request request){
        if (nextWorker!=null){
            nextWorker.handleRequest(request);
        }else {
            System.out.println("Request cannot be handled");
            isRequestHandled = -1;
        }
    }

    public int getIsRequestHandled(){
        return isRequestHandled;
    }

    public abstract void getDetails();

}