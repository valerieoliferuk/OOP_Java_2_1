package org.example;

public abstract class Worker {
    protected String name;
    protected String role;

    public Worker(String name, String role){
        this.name = name;
        this.role = role;
    }

    public abstract void getDetails();
}
// this is an abstract class, and moreover it won't have a body in his
// one method, so it doesn't need unit-tests