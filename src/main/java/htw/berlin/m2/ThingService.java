package htw.berlin.m2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThingService {

    @Autowired
    ThingRepository repo;

    public Thing save(Thing thing) {
        return repo.save(thing);
    }

    public Thing get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Thing> getAll() {
        Iterable<Thing> iterator = repo.findAll();
        List<Thing> things = new ArrayList<Thing>();
        for (Thing thing : iterator) things.add(thing);
        return things;
    }
}
