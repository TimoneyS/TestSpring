package com.ray.world.data.dao.alive.animal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ray.world.common.Sex;
import com.ray.world.data.entity.alive.animal.Dog;

@Component
public class DogDAOImpl implements DogDAO {

    @Autowired
    JdbcOperations jdbcOperations;

    private static final class DogRowMapper implements RowMapper<Dog> {

        @Override
        public Dog mapRow(ResultSet rs, int rownum) throws SQLException {
            Dog d = new Dog();
            d.setId(rs.getInt("id"));
            d.setName(rs.getString("name"));
            d.setBirthday(rs.getDate("birthday"));
            d.setColor(rs.getString("color"));
            d.setSex(Sex.get(rs.getInt("sex")));
            return d;
        }

    }

    private static String INSET_DOG          = "insert into dog (id, name, birthday, color, sex) values (?, ?, ?, ?, ?)";
    private static String SELECT_DOG_BY_NAME = "select id, name, birthday, color, sex from dog d where d.name = ?";
    private static String SELECT_DOG_BY_ID   = "select id, name, birthday, color, sex from dog d where d.id = ?";
    @Override
    public List<Dog> getDogsByName(String name) {
        
        // return jdbcOperations.queryForList(SELECT_DOG_BY_NAME, new DogRowMapper(), name, Dog.class);
        return null;
    }

    @Override
    public Dog getDogById(Integer id) {
        return jdbcOperations
                .queryForObject(
                        SELECT_DOG_BY_ID, new DogRowMapper(), id);
    }

    @Override
    public void createDog(Dog dog) {
        jdbcOperations.update(INSET_DOG, dog.getId(), dog.getName(), dog.getBirthday(), dog.getColor(),
                dog.getSex().getValue());
    }

    @Override
    public void updateDogById(Dog dog) {
    }

    @Override
    public void deleteDogById(Integer id) {
        // TODO Auto-generated method stub
    }

}
