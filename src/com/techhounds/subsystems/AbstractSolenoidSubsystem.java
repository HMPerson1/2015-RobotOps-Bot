package com.techhounds.subsystems;

import static com.techhounds.RobotMap.Solenoids.*;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The {@link Subsystem} for raising and lowering the collector.
 */
public abstract class AbstractSolenoidSubsystem extends Subsystem {

    
	private boolean inverted;
    private Solenoid solenoid;
    

    /**
     * Creates and initializes a new {@link AbstractSolenoidSubsystem}.
     * Private because singleton.
     */
    protected AbstractSolenoidSubsystem(boolean inverted, int port) {        
        solenoid = new Solenoid(port);
        this.inverted = inverted;
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void set(boolean up){
    	if(inverted){
    		up = !up;
    	}
    	solenoid.set(up);
    }

    /**
     * Returns the single instance of the {@link SolenoidSubsystem},
     * creating it if necessary.
     *
     * @return the instance
     */
}
