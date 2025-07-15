package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class arm extends OpMode {
    /*

    declare variables

     */

    public DcMotor arm;

    public void init() {
        arm  = hardwareMap.get(DcMotor.class, "arm");
    }

    public void loop(){

    }
}
