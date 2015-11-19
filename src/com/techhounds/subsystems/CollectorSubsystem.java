package com.techhounds.subsystems;

import static com.techhounds.RobotMap.Collector.*;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The {@link Subsystem} for the collector spinner.
 */
public class CollectorSubsystem extends Subsystem {

    private static CollectorSubsystem instance;

    private Victor motor;

    private CollectorSubsystem() {
        motor = new Victor(COLLECTOR_MOTOR);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    /**
     * Returns the single instance of the {@link CollectorSubsystem}, creating
     * it if necessary.
     *
     * @return the instance
     */
    public static CollectorSubsystem getInstance() {
        if (instance == null) {
            instance = new CollectorSubsystem();
        }
        return instance;
    }
}
