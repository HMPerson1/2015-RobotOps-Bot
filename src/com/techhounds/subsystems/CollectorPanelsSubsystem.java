package com.techhounds.subsystems;

import static com.techhounds.RobotMap.CollectorPanels.*;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The {@link Subsystem} for the collector spinner.
 */
public class CollectorPanelsSubsystem extends Subsystem {

    private static CollectorPanelsSubsystem instance;

    private Victor upMotor;
    private Victor downMotor;

    /**
     * Creates and initializes a new {@link CollectorPanelsSubsystem}.
     * Private because singleton.
     */
    private CollectorPanelsSubsystem() {
        super("COLLECTOR PANELS SUBSYSTEM");

        upMotor = new Victor(COLLECTOR_PANEL_UP_MOTOR);
        downMotor = new Victor(COLLECTOR_PANEL_DOWN_MOTOR);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    /**
     * Returns the single instance of the {@link CollectorPanelsSubsystem},
     * creating it if necessary.
     *
     * @return the instance
     */
    public static CollectorPanelsSubsystem getInstance() {
        if (instance == null) {
            instance = new CollectorPanelsSubsystem();
        }
        return instance;
    }
}
