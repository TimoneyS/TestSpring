package com.ray.world.factory.alive.animal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ray.world.common.Sex;
import com.ray.world.data.entity.alive.animal.Cat;
import com.ray.world.factory.alive.animal.CatFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.ray.world.WorldConfig.class)
public class TestWorld {
    
    @Autowired
    private CatFactory factory;
    
    @Test
    public void catNotNull() {
        Assert.assertNotNull(factory);
    }
    
    public void createCat() {
        Cat cat = factory.create( "Kitty", "pink", Sex.Female);
        Assert.assertEquals(cat.getName(), "Kitty");
        Assert.assertEquals(cat.getColor(), "pink");
        Assert.assertEquals(cat.getSex(), Sex.Female);
    }
    
}
