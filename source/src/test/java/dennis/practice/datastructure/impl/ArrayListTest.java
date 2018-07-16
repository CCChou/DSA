package dennis.practice.datastructure.impl;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ArrayListTest extends TestCase {
    private ArrayList<String> list;
    
    @Before
    public void setUp() {
        list = new ArrayList<>();
    }
    
    @Test
    public void testEmpty() {
        assertEquals(true, list.isEmpty());
    }
    
    @Test
    public void testContains() {
        list.add("Dennis");
        assertEquals(true, list.contains("Dennis"));
    }
    
    @Test
    public void testSize() {
        list.add("Dennis");
        assertEquals(1, list.size());
    }
    
    @Test
    public void testGet() {
        list.add("Bob");
        assertEquals("Bob", list.get(0));
    }
    
    @Test
    public void testAdd() {
        list.add("Dennis");
        list.add(0, "Andy");
        assertEquals("Andy", list.get(0));
    }
    
    @Test
    public void testRemove() {
        list.add("Dennis");
        assertEquals(true, list.contains("Dennis"));
        
        list.remove(0);
        assertEquals(false, list.contains("Dennis"));
    }
}
