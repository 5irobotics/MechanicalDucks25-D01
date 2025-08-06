package org.firstinspires.ftc.teamcode.summersamples.D01code.visionbot.subsystems;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class drive extends OpMode {
    public void Move(double y, double x, DcMotor motorfl, DcMotor motorbl, DcMotor motorfr, DcMotor motorbr) {
        motorfl.setPower(y + x);
        motorbl.setPower(y - x);
        motorfr.setPower(y - x);
        motorfl.setPower(y + x);
    }


    @Override
    public void init() {
        
    }

    @Override
    public void loop() {

    }
}
