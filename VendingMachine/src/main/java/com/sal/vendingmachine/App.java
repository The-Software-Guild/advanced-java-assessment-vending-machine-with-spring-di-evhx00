
package com.sal.vendingmachine;

//Adding springframework
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sal.vendingmachine.dao.VendingMachineException;
import com.sal.vendingmachine.controller.VendingMachineController;


/**
 *
 * @author salajrawi
 */
public class App {
    public static void main(String[] args) throws VendingMachineException{
       //Runs whole program
        /*
        UserIO io = new UserIOImpl();
        VendingMachineView view = new VendingMachineView(io);
        VendingMachineService service = new VendingMachineServiceImpl();
        VendingMachineController controller = new VendingMachineController(view, service);
        */

        //Add SpringDL

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller = ctx.getBean("controller", VendingMachineController.class);
        controller.run();
    }
}
