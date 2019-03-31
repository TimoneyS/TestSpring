package com.ray.world.data.dao.alive.animal;

import java.util.List;

import com.ray.world.data.entity.alive.animal.Dog;

public interface DogDAO {
    
    public List<Dog> getDogsByName(String name);
    public Dog getDogById(Integer id);
    public void createDog(Dog dog);
    public void updateDogById(Dog dog);
    public void deleteDogById(Integer id);
    
}
