package com.sndevops.eng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    
    @Test 
    public void test1() { 
        Assert.assertTrue(true); 
    }
    
    @Test 
    public void test2() { 
        throw new RuntimeException();
    }
}
 

