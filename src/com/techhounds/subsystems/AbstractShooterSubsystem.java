package com.techhounds.subsystems;

import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public abstract class AbstractShooterSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon motor;
	private boolean inverted;
	
	public AbstractShooterSubsystem(int port, boolean inverted){
		motor = new Talon(port);
		this.inverted = inverted;
	}
	public void setMotor(double power){
		power = RobotMap.rangeCheck(power);
		power *= (inverted ? -1 : 1);
		motor.set(power);
	}
	public double getPower(){
		return motor.get() * (inverted ? -1 : 1);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

