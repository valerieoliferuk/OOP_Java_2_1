package org.example;

public abstract class Request {
    protected int priority;
    protected String description;

    public Request(int priority, String description){
        this.description = description;
        this.priority = priority;
    }

    public String getDescription(){
        return description;
    }

    public int getPriority(){
        return priority;
    }
}
