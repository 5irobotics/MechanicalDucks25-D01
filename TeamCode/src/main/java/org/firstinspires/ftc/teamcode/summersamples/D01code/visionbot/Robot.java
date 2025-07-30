package org.firstinspires.ftc.teamcode.summersamples.D01code.visionbot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.summersamples.D01code.visionbot.subsystems.drive;


@TeleOp
public class Robot extends OpMode {
    /*

    declare variables

     */

    public DcMotor FLeft;
    public DcMotor FRight;
    public DcMotor BLeft;
    public DcMotor BRight;


    // subsystems
    private final drive drivesubsystem = new drive();



    public void init() {
        FLeft  = hardwareMap.get(DcMotor.class, "fleft");
        FRight  = hardwareMap.get(DcMotor.class, "fright");
        BLeft  = hardwareMap.get(DcMotor.class, "bleft");
        BRight  = hardwareMap.get(DcMotor.class, "bright");
       
    }

    public void loop(){
      drivesubsystem.Move(gamepad1.right_stick_y, gamepad1.right_stick_x, FLeft, BLeft, FRight, BRight);
    }
}
