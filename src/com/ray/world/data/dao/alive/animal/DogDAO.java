package com.ray.world.data.dao.alive.animal;

import com.ray.world.data.entity.alive.animal.Dog;

public interface DogDAO {
    public Dog getDog();
    public void createDog();
    public void updateDog();
    public void deleteDog();
    
}
