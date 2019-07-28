package edu.mum.cs.repository;

import edu.mum.cs.data.Database;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarbucksRepositoryImpl implements StarbucksRepository {
    @Override
    public List<String> getAdvice(String roast) {
        return Database.getAdvice(roast);
    }
}
