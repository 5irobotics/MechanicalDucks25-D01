package org.firstinspires.ftc.teamcode.season.Tele.subsystems;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class driveTeleOpMain extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }

    public void Move(double y, double x,
                     DcMotor motorfl, DcMotor motorbl, DcMotor motorfr, DcMotor motorbr) {
       motorfl.setPower(y + x);
       motorbl.setPower(y - x);
       motorfr.setPower(y - x);
       motorbr.setPower(y + x);
    }

    public void DPAD(boolean up, boolean right, boolean down, boolean left,
                     DcMotor motorfl, DcMotor motorbl, DcMotor motorfr, DcMotor motorbr) {

        if (up){
            motorfl.setPower(-1);
            motorbl.setPower(-1);
            motorfr.setPower(-1);
            motorbr.setPower(-1);
        }
        if (right){
            motorfl.setPower(1);
            motorbl.setPower(-1);
            motorfr.setPower(-1);
            motorbr.setPower(1);
        }
        if (down){
            motorfl.setPower(1);
            motorbl.setPower(1);
            motorfr.setPower(1);
            motorbr.setPower(1);
        }
        if (left){
            motorfl.setPower(-1);
            motorbl.setPower(1);
            motorfr.setPower(1);
            motorbr.setPower(-1);
        }

    }












     public void rotation(boolean right, boolean left,
                          DcMotor motorfl, DcMotor motorbl, DcMotor motorfr, DcMotor motorbr){
         if (right){
             motorfl.setPower(-1);
             motorbl.setPower(-1);
             motorfr.setPower(1);
             motorbr.setPower(1);

         }
         if (left){
             motorfl.setPower(1);
             motorbl.setPower(1);
             motorfr.setPower(-1);
             motorbr.setPower(-1);

         }
    }
}
