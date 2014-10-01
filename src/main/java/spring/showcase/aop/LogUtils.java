/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.showcase.aop;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import static java.util.logging.Level.ALL;
import static java.util.logging.Level.CONFIG;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.FINER;
import static java.util.logging.Level.FINEST;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.OFF;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Level.WARNING;
import java.util.logging.Logger;

/**
 *
 * @author Bartek
 */
public class LogUtils {
    
    private static final Logger LOG = Logger.getLogger(LogUtils.class.getName());
    private Level CurrentLevelType;
    
    private final Map<String, Level> typeMap = new HashMap<>();
    {
        typeMap.put("OFF", OFF);
        typeMap.put("SEVERE", SEVERE);
        typeMap.put("WARNING", WARNING);
        typeMap.put("INFO", INFO);
        typeMap.put("CONFIG", CONFIG);
        typeMap.put("FINE", FINE);
        typeMap.put("FINER", FINER);
        typeMap.put("FINEST", FINEST);
        typeMap.put("ALL", ALL);
    }
    
    public void setType(String type){
        CurrentLevelType = typeMap.containsKey(type)? typeMap.get(type) : OFF;
    }
    
    public void logTimeToConsole(){
        LOG.log(CurrentLevelType,
                WrapTypeIntoVisibleString(CurrentLevelType));
    }
    public void LogTimeToFile(){
        //TODO
    }
    
    //This method should return something that will be visible in console
    public String WrapTypeIntoVisibleString(Level level){
        return "::===:"+level.getName()+":====::";
    }
}

