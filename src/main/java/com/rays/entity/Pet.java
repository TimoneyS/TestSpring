package com.rays.entity;

public interface Pet {
    public void play();
    public void play(@Animal()Pet obj);
    public void play(@Human()PetMaster obj);
    public void eat();
}
