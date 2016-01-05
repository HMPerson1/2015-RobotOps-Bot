package com.techhounds.subsystems;

import static com.techhounds.RobotMap.CollectorPanels.*;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The {@link Subsystem} for the collector spinner.
 */
public class CollectorPanelsSubsystem extends Subsystem {

    private static CollectorPanelsSubsystem instance;

    private Servo leftPanel;
    private Servo rightPanel;

    /**
     * Creates and initializes a new {@link CollectorPanelsSubsystem}.
     * Private because singleton.
     */
    private CollectorPanelsSubsystem() {
        super("COLLECTOR PANELS SUBSYSTEM");

        leftPanel = new Servo(LEFT_PANEL_SERVO);
        rightPanel = new Servo(RIGHT_PANEL_SERVO);
    }
    
    public void setDown(){
    	leftPanel.set(LEFT_DOWN_POSITION);
    	rightPanel.set(RIGHT_DOWN_POSITION);
    	
    }
    public void setUp(){
    	leftPanel.set(LEFT_UP_POSITION);
    	rightPanel.set(RIGHT_UP_POSITION);
    }
    public boolean atTop(){
    	return leftPanel.get() == LEFT_UP_POSITION && rightPanel.get() == RIGHT_UP_POSITION;
    }
    public boolean atBottom(){
    	return leftPanel.get() == LEFT_DOWN_POSITION && rightPanel.get() == RIGHT_UP_POSITION;
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
