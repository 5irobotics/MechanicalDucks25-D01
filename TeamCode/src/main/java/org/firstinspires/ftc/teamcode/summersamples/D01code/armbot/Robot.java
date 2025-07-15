package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Robot extends OpMode {
    /*

    declare variables

     */

    public DcMotor FLeft;
    public DcMotor FRight;
    public DcMotor BLeft;
    public DcMotor BRight;

    public void init() {
        FLeft  = hardwareMap.get(DcMotor.class, "fleft");
        FRight  = hardwareMap.get(DcMotor.class, "fright");
        BLeft  = hardwareMap.get(DcMotor.class, "bleft");
        BRight  = hardwareMap.get(DcMotor.class, "bright");
    }

    public void loop(){

    }
}
