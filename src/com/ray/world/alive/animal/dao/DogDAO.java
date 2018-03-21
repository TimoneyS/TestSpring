package com.ray.world.alive.animal.dao;

import com.ray.world.alive.animal.entity.Dog;

public interface DogDAO {
    public Dog getDog();
    public void createDog();
    public void updateDog();
    public void deleteDog();
    
}
