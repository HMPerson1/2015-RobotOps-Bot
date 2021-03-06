package com.techhounds.subsystems;

import static com.techhounds.RobotMap.Drive.*;

import com.techhounds.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The {@link Subsystem} for the drive train.
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

        robotDrive = new RobotDrive(FRONT_LEFT_MOTOR, REAR_LEFT_MOTOR, FRONT_RIGHT_MOTOR, REAR_RIGHT_MOTOR);
        robotDrive.setInvertedMotor(MotorType.kFrontLeft,true);
        robotDrive.setInvertedMotor(MotorType.kRearLeft, true);
        robotDrive.setExpiration(.1);
    }

    /**
     * Drive the robot.
     *
     * @param x
     *            the x component of the target velocity
     * @param y
     *            the y component of the target velocity
     * @param rotation
     *            the target rotational velocity
     */
    public void driveMecanum(double x, double y, double rotation) {
    	//SmartDashboard.putString("We are doing stuff", "Yes");
        robotDrive.mecanumDrive_Cartesian(x, y, rotation, 0);
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
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

    public void stopMotors() {
        robotDrive.stopMotor();
    }
}
