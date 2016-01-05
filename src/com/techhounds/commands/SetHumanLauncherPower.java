package com.techhounds.commands;

import com.techhounds.Robot;
import com.techhounds.RobotMap;
import com.techhounds.subsystems.LobberSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetHumanLauncherPower extends Command {
	LobberSubsystem launcher;
	double power;
    public SetHumanLauncherPower(double power) {
    	launcher = LobberSubsystem.getInstance(RobotMap.Lobber.HUMAN_LOBBER);
    	requires(launcher);
    	this.power = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	launcher.setPower(power);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
