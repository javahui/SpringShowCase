/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaee.showcase.listeners;

import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 *
 * @author Bartek
 */

/*
* Example of simple(as everywhere) servlet listener - it is 
* not feature of spring, but i think that nice to knows 
* about something like this.
*/
public class LoggerListener implements ServletRequestListener {
    
    private static final Logger LOG = Logger.getLogger(LoggerListener.class.getName());
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        LOG.log(SEVERE,
                "========REQUEST DESTROYED=========");
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        LOG.log(SEVERE,
                "========REQUEST INITIALIZED=======");
    }
    
}
