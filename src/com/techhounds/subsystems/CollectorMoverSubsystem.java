package com.techhounds.subsystems;

import static com.techhounds.RobotMap.CollectorMover.*;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The {@link Subsystem} for raising and lowering the collector.
 */
public class CollectorMoverSubsystem extends Subsystem {

    private static CollectorMoverSubsystem instance;

    private Solenoid mover;

    private CollectorMoverSubsystem() {
        mover = new Solenoid(COLLECTOR_MOVER_SOLENOID);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    /**
     * Returns the single instance of the {@link CollectorMoverSubsystem},
     * creating it if necessary.
     *
     * @return the instance
     */
    public static CollectorMoverSubsystem getInstance() {
        if (instance == null) {
            instance = new CollectorMoverSubsystem();
        }
        return instance;
    }
}
