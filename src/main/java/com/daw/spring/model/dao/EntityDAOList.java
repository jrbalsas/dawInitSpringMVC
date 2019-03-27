package com.daw.spring.model.dao;

import com.daw.spring.model.Entity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("entityDAOList")
public class EntityDAOList implements EntityDAO{

    private static ArrayList<Entity> entities=null;
    private static int idEntity = 1;

    public EntityDAOList() {
        if (entities == null) {
            entities = new ArrayList<>();

            entities.add(new Entity(idEntity++, "entity 1"));
            entities.add(new Entity(idEntity++, "entity 2"));
            entities.add(new Entity(idEntity++, "entity 3"));
        }
    }
    
    @Override
    public Entity findById(Integer id) {
        Entity found=null;
        for (Entity e: entities) {
               if (e.getId()==id) found=e;
        }
        return found;
    }
    @Override
    public List<Entity> findAll() {
        return entities;
    }

    @Override
    public boolean create(Entity e) {
        Entity nc=new Entity(e);
        nc.setId(idEntity);
        entities.add(nc);
        e.setId(idEntity);
        idEntity++;
        return true;
    }
        
    @Override
    public boolean update(Entity e) {
        boolean result=false;
        Entity nc=new Entity(e);
        for (int i=0; i<entities.size();i++) {
            if (entities.get(i).getId()==nc.getId()) {
                entities.set(i, nc);
                result=true;
            }
        }       
        return result;
    }
    
    @Override
    public boolean delete(Integer id) {
        boolean result=false;
        for (int i=0; i<entities.size();i++) {
            if (entities.get(i).getId()==id) {
                entities.remove(i);
                result=true;
            }
        }       
        return result;
    }
    
    public int numEntities() {
        return entities.size();
    }

}
