package org.firstinspires.ftc.teamcode.season.Tele;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems.driveAutoClone;

@Autonomous
public class MainAuto extends LinearOpMode {


    /*

    declare variables

     */

    public DcMotor FLeft;
    public DcMotor FRight;
    public DcMotor BLeft;
    public DcMotor BRight;
    public DcMotor Arm;



    @Override
    public void runOpMode() throws InterruptedException {
        // Create and initialize your RobotDrive object
        driveAutoClone robot = new driveAutoClone(hardwareMap);

        telemetry.addLine("Robot Initialized. Waiting for Start...");
        telemetry.update();

        waitForStart();

        if (isStopRequested()) return;

        // Example: Drive to position (1000mm, 1000mm) facing 90 degrees (field forward)
        robot.goToPosition(
                1000, 1000,   // target x (mm), y (mm)
                90,           // target heading in degrees
                0.5,          // max power
                20,           // position tolerance in mm
                5             // heading tolerance in degrees
        );

        // Report final position
        telemetry.addLine("Arrived at Target!");
        telemetry.addData("X (mm)", robot.getXmm());
        telemetry.addData("Y (mm)", robot.getYmm());
        telemetry.addData("Heading (deg)", robot.getHeadingDegrees());
        telemetry.update();

        sleep(3000);
    }

}
