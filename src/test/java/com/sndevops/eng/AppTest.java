package com.sndevops.eng;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

public class AppTest {
    
    @Test 
    public void test1() { 
        Assert.assertTrue(true); 
    }
    
    @Test 
    public void test2() { 
        throw new RuntimeException();
    }
    
    @Test 
    public void test3() { 
        Assert.assertTrue(true); 
    }
    
    @Test
    @Ignore
    public void test4() { 
        throw new RuntimeException();
    }
    
    @Test 
    public void test5() { 
        Assert.assertTrue(false); 
    }
    @Test 
    public void test6() { 
        Assert.assertTrue(true); 
    }
}
 

