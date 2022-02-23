package com.example;

import org.junit.*;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;
    private static int count=0;

    @BeforeClass
    public static void before(){
        System.out.println("The count starts at: " + count++);
    }

    @Before
    public void setup(){
        this.utilities = new Utilities();

    }

    @Test
    public void everyNthChar() {
        //char [] input = {'h','e','l','l','o'};
        //char [] output = {'e','l'};
        //assertArrayEquals(output, utilities.everyNthChar(input,2) );
        assertArrayEquals(new char[] {'e','l'}, utilities.everyNthChar(new char[] {'h','e','l','l','o'}, 2));
        assertArrayEquals(new char[] {'h','e','l','l','o'}, utilities.everyNthChar(new char[] {'h','e','l','l','o'}, 8));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF",utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF",utilities.removePairs("ABCCABDEEF"));
        assertEquals(null,utilities.removePairs(null));
        assertEquals("",utilities.removePairs(""));
    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10,5));

    }

    @Test(expected = ArithmeticException.class)
    public void converter_exception() {
        utilities.converter(10,0);
    }

    @Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("Strings"));
        assertNotNull(utilities.nullIfOddLength("String"));
    }

    @After
    public void after(){
        System.out.println("The count is: " + count++);
    }


    @AfterClass
    public static void afterClass(){

        System.out.println("The count is: " + count++);
    }
}