package com.techhounds.subsystems;

import static com.techhounds.RobotMap.Lobber2.*;
import com.techhounds.Robot;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

public class Lobber2Subsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private boolean IsEnabled;
	
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
    
    public double getPower() {
    	return IsEnabled ? Math.abs(lobber2.get()) : 0;
    }
    
    public void setPower(double power) {
    	lobber2.set(Robot.checkRange(power, -1, 1));
    }
}

