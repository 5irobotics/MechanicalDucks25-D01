package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems;


import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp
public class drive extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        
    }

    public void Move(double y, double x, DcMotor motorfl, DcMotor motorbl, DcMotor motorfr, DcMotor motorbr) {
       motorfl.setPower(y + x);
       motorbl.setPower(y - x);
       motorfr.setPower(y - x);
       motorfl.setPower(y + x);
    }



}
