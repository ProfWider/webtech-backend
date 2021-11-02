package htw.berlin.m2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
