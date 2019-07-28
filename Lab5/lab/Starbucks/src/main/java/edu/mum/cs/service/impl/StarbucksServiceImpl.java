package edu.mum.cs.service.impl;

import edu.mum.cs.repository.StarbucksRepository;
import edu.mum.cs.service.StarbucksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarbucksServiceImpl implements StarbucksService {

    private StarbucksRepository starbucksRepository;

    @Autowired
    public StarbucksServiceImpl(StarbucksRepository starbucksRepository) {
        this.starbucksRepository = starbucksRepository;
    }

    @Override
    public List<String> getAdvice(String roast) {
        return this.starbucksRepository.getAdvice(roast);
    }
}
