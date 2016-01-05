package com.techhounds.subsystems;

import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import static com.techhounds.RobotMap.Solenoids.*;
/**
 *
 */
public class RampSubsystem extends AbstractSolenoidSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	static RampSubsystem instance;
	public RampSubsystem(){
		super(true, RobotMap.Solenoids.RAMP_MOVER_SOLENOID);
	}
	public static RampSubsystem getInstance(){
		if(instance == null){
			instance = new RampSubsystem();
		}
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

