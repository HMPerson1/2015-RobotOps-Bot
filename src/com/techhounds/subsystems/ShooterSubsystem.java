package com.techhounds.subsystems;

import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSubsystem extends AbstractShooterSubsystem {
    
    static ShooterSubsystem instance;
    
    public ShooterSubsystem(){
    	super(RobotMap.Lobber.SHOOTER, true);
    }
    public static ShooterSubsystem getInstance(){
    	if(instance == null){
    		instance = new ShooterSubsystem();
    	}
    	return instance;
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

