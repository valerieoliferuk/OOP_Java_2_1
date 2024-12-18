package org.example;


public class Main {

    public static void main(String[] args) {
        CEO ceo = new CEO("AAA", "ceo");
        IndividualWorker regularWorker1 = new IndividualWorker("Alice", "small worker");
        IndividualWorker regularWorker2 = new IndividualWorker("Roman", "small worker");
        Manager manager = new Manager("David", "manager");
        Request request = new Request(2, "Delegate tasks");
        Request request2 = new Request(1, "Approve department budget");
        Request request3 = new Request(3, "Make strategic decisions");
        manager.addWorker(regularWorker1);
        manager.addWorker(regularWorker2);
        manager.getDetails();
        regularWorker1.setNextWorker(manager);
        regularWorker2.setNextWorker(manager);
        manager.setNextWorker(ceo);
        regularWorker1.handleRequest(request);
        regularWorker2.handleRequest(request2);
        manager.handleRequest(request3);
        }
    }