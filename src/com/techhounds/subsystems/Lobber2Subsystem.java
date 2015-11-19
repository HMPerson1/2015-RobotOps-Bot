package com.techhounds.subsystems;

import static com.techhounds.RobotMap.Lobber2.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class Lobber2Subsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static Lobber2Subsystem instance;
	
	private Victor lobber2;
	
	private Lobber2Subsystem() {
		super("LOBBER 2 SUBSYSTEM");
		
		lobber2 = new Victor(LOBBER_2_MOTOR);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static Lobber2Subsystem getInstance() {
    	if (instance == null){
    		instance = new Lobber2Subsystem();
    	}
    	return instance;
    }
}

