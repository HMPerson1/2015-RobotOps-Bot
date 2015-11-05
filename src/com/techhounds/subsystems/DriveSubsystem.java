package com.techhounds.subsystems;

import com.techhounds.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    private static DriveSubsystem instance;

    private RobotDrive robotDrive;

    /**
     * Creates and initializes a new {@link DriveSubsystem}.
     * Private because singleton.
     */
    private DriveSubsystem() {
        super("DRIVE SUBSYSTEM");

        robotDrive = new RobotDrive(RobotMap.FRONT_LEFT_MOTOR, RobotMap.REAR_LEFT_MOTOR,
                                    RobotMap.FRONT_RIGHT_MOTOR, RobotMap.REAR_RIGHT_MOTOR);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    /**
     * Returns the single instance of the {@link DriveSubsystem}, creating it if
     * necessary.
     * 
     * @return the instance
     */
    public static DriveSubsystem getInstance() {
        if (instance == null) {
            instance = new DriveSubsystem();
        }
        return instance;
    }
}
