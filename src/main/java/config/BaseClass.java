package config;

import Specification.RickAndMortySp;
import org.junit.BeforeClass;

public class BaseClass {
    static final String URL="https://rickandmortyapi.com/api/";
    @BeforeClass
    public static void before(){
        RickAndMortySp.createRMspecif(URL);
    }
}

