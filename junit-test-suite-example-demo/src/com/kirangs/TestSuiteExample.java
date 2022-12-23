package com.kirangs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * we can run this class directly here 
 * i.e right click and run as junit test
 * */

@RunWith(Suite.class)
@SuiteClasses({MyFirstTestClass.class,MySecondTestClass.class})
public class TestSuiteExample {

}
