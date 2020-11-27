package com.sndevops.eng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest1 {
// rrt   13411
    // Test
    
    // Unit Test
    private String INPUT = "13412";
    @Test 
    public void testLength() { 
        Assert.assertEquals(INPUT,"13412");  
    }
}
