package edu.mum.cs.repository;

import java.util.List;

public interface StarbucksRepository {
    List<String> getAdvice(String roast);
}
