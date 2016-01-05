package com.techhounds.subsystems;

import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CollectorSolenoidSubsystem extends AbstractSolenoidSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static CollectorSolenoidSubsystem instance;
	public CollectorSolenoidSubsystem(){
		super(false, RobotMap.Solenoids.COLLECTOR_MOVER_SOLENOID);
	}
	
	public static CollectorSolenoidSubsystem getInstance(){
		if(instance == null){
			instance = new CollectorSolenoidSubsystem();
		}
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

