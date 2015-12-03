package com.techhounds.commands;

import com.techhounds.OI;
import com.techhounds.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 * {@link Command} to drive the robot.
 */
public class Drive extends Command {

    private final OI oi = OI.getInstance();
    private final DriveSubsystem drive = DriveSubsystem.getInstance();

    public Drive() {
        requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drive.driveMecanum(oi.getDriverLeftXAxis(), oi.getDriverLeftYAxis(), oi.getDriverRightXAxis());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        drive.stopMotors();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
