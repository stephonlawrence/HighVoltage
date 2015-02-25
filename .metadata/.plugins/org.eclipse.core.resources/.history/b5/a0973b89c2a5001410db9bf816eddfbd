
package org.usfirst.frc.team369.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	Talon drive1;
	Talon drive2;
	Talon drive3;
	Talon drive4;
	Talon strafe1;
	RobotDrive robot;
	Joystick joy1;
	
    public void robotInit() {
    	drive1 = new Talon(1);
    	drive2 = new Talon(2);
    	drive3 = new Talon(3);
    	drive4 = new Talon(4);
    	strafe1 = new Talon(5);
    	robot = new RobotDrive(drive1, drive2, drive3, drive4);
    	joy1 = new Joystick(1);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        robot.setSafetyEnabled(true);
        while(isOperatorControl() && isEnabled()){
        	robot.arcadeDrive(joy1);
        	if(joy1.getRawButton(4)){
        		strafe1.set(1.0);
        	}else if(joy1.getRawButton(5)){
        		strafe1.set(1.0);
        	}else{
        		strafe1.set(0);
        	}
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
