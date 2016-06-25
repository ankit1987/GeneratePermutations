package com.shopback;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Created by ankit on 25/6/16.
 */


public class GeneratePemutationsTest {

    GeneratePermutations permutations = null;

    @Before
    public void initialize() {
        permutations = new GeneratePermutations();
    }

    @Test
    public void testPermutation(){
        String s = "ABC";
        Set<String> permuationSet = permutations.getAllPermutations(s);
        Assert.assertEquals("ouput doesn't contains !n Permutations", 6, permuationSet.size());
    }

    @Test
    public void testDuplicate() {
        String s = "AAA";
        Set<String> permuationSet = permutations.getAllPermutations(s);
        Assert.assertEquals("ouput does contains duplicate string", 1, permuationSet.size());
    }



    @Test
    public void testNullString(){
        String s = null;
        Set<String> permuationSet = permutations.getAllPermutations(s);
        Assert.assertEquals("ouput fails ", null, permuationSet);
    }

}
