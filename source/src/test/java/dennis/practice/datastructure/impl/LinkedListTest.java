package dennis.practice.datastructure.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList<String> list;
    
    @Before
    public void setUp() {
        list = new LinkedList<>();
    }
    
    @Test
    public void testEmpty() {
        Assert.assertEquals(true, list.isEmpty());
    }
    
    @Test
    public void testContains() {
        list.add("Dennis");
        Assert.assertEquals(true, list.contains("Dennis"));
    }
    
    @Test
    public void testSize() {
        list.add("Dennis");
        Assert.assertEquals(1, list.size());
    }
    
    @Test
    public void testGet() {
        list.add("Bob");
        Assert.assertEquals("Bob", list.get(0));
    }
    
    @Test
    public void testAdd() {
        list.add("Dennis");
        list.add(0, "Andy");
        Assert.assertEquals("Andy", list.get(0));
    }
    
    @Test
    public void testRemove() {
        list.add("Dennis");
        Assert.assertEquals(true, list.contains("Dennis"));
        
        list.remove(0);
        Assert.assertEquals(false, list.contains("Dennis"));
    }
}
