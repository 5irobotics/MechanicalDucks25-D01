package org.firstinspires.ftc.teamcode.summersamples.D01code.visionbot.subsystems;


import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class drive {
    public void Move(double y, double x, DcMotor motorfl, DcMotor motorbl, DcMotor motorfr, DcMotor motorbr) {
        motorfl.setPower(y + x);
        motorbl.setPower(y - x);
        motorfr.setPower(y - x);
        motorfl.setPower(y + x);
    }



}
