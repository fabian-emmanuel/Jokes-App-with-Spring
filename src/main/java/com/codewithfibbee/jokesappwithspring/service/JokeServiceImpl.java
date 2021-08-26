package com.codewithfibbee.jokesappwithspring.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
