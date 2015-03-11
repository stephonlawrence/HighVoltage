package org.usfirst.frc.team369.robot;

import edu.wpi.first.wpilibj.*;

import org.json.*;

import java.io.File;
/*
	All sensors should be stored here
*/

public class Sensors {
	// set up json array for sensors
	JSONArray json = new JSONArray();

	// get gyro
	Gyro gyro = new Gyro(0);
	JSONObject gyroJSON = new JSONObject();

	// get accelerometer
	BuiltInAccelerometer accelerometer = new BuiltInAccelerometer();
	JSONObject accelerometerJSON = new JSONObject();

	// manual switch for autonomous
	DigitalInput autoSwitch = new DigitalInput(0);
	JSONObject autoSwitchJSON = new JSONObject();

	// limit switch for elevator bottom limit
	DigitalInput elevatorBottom = new DigitalInput(1);
	JSONObject elevatorBottomJSON = new JSONObject();

	public sensors(){
		setupSensors();

		// add all values to the main json data
		json.put(gyroJSON);
		json.put(accelerometerJSON);
		json.put(autoSwitchJSON);
		json.put(elevatorBottomJSON);
	}

	private setupSensors (){
		// set up json for the gyro sensor
		jsonSetVals(gyroJSON, "gyro", "double", "0");
		
		// set up json for the accelerometer
		jsonSetVals(accelerometerJSON, "accelerometer", "double", "0");

		// set up json for autoSwitch
		jsonSetVals(autoSwitchJSON, "utoSwitch", "boolean", "false");

		// set up json for alevatorBottom
		jsonSetVals(elevatorBottomJSON, "elevatorBottom", "boolean", "false");

	}

	private jsonSetVals(JSONObject obj, Object name, Object type, Object value){
		obj.put("name", name);
		obj.put("type", type);
		obj.put("value", value);
	}

	public update(){

		// update json for the gyro sensor
		jsonSetVals(gyroJSON, "gyro", "double", gyro.get());
		
		// update json for the accelerometer
		jsonSetVals(accelerometerJSON, "accelerometer", "double", accelerometer.getY();

		// update json for autoSwitch
		jsonSetVals(autoSwitchJSON, "utoSwitch", "boolean", autoSwitch.get());

		// update json for alevatorBottom
		jsonSetVals(elevatorBottomJSON, "elevatorBottom", "boolean", elevatorBottom.get());

	}

}