package org.usfirst.frc.team369.robot;

import edu.wpi.first.wpilibj.*;

import org.json.*;

import java.io.File;

/*
	Main Robot Code Starts Here

*/

public class Robot extends IterativeRobot {
	
	// set up all the sensors
	Sensors sensors;
	
	public void robotInit() {
		sensors = new Sensors();
	}

	public void autonomousInit(){
		sensors.gyro.reset();
	}


/*
 * The idea of the new objective based autonomous
 * is the make it easier to understan the code.
 * After doing a set of code, move on to the next
 * objective. Each objective has a desired task.
 * Once it's task is complete move on to the next task.
 * This allows for me to have a double tote autonomous
 * without having to repeat code, so all I would have to do
 * is after on objective is finished repeat another.

 * Objectives needs to be a seperate function that accepts a
 * parameter that would tell it what objective to move on to next.
 * if it doesn't get any value then it should continue adding 1 to the
 * objective counter.
 */

	public void auto1(timer){
		int objective;
		if(timer == 0){
			objective = 0;
		}
		if(objective == 0){
			//drive forward until sensor

			//stop when sensor hits

			//if we touch container stop
			objective++;
		}
		if(objective == 1){
			//close arms and pick up

			//after hits specific height stop
			objective++;
		}
		if(objective == 2){
			//turn 90deg

			//when finished stop
			objective++;
		}

		if(objective == 3){
			//drive forward and drop elevator

			//after certian time stop

		}
	}

	public void auto2(timer){

	}

	public void autonomousPeriodic(){
		sensors.update();
		int counter = counter || 0;
		if(sensors.autoSwitch.get()){
			auto1(counter);
		}else if(!sensors.autoSwitch.get()){
			auto2(counter);
		}
		counter++;
		Timer.delay(0.01);
	}


}