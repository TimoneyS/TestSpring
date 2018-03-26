package com.ray.world.data.dao.alive.animal;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ray.util.Assert;
import com.ray.world.common.Sex;
import com.ray.world.data.entity.alive.animal.Dog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.ray.world.WorldConfig.class)
public class TestDogDAO {
    
    @Autowired
    DogDAO dogDao;
    
    public void testCreateDog() {
        Dog d = new Dog();
        
        d.setBirthday(new Date());
        d.setColor("Pink");
        d.setId(null);
        d.setName("Little Black");
        d.setSex(Sex.Male);
        
        dogDao.createDog(d);
    }
    
    @Test
    public void testGetDogById() {
        Dog d = dogDao.getDogById(1);
        
        Assert.assertEqual(d.getName(), "Little Black");
        
    }
    
}
