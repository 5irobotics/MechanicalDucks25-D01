package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
public class driveAutoClone extends OpMode {

    final static double L = 20.12; // distance between encoder 1 and 2 in cm
    final static double B = 11.5; // distance between the midpoint of encoder 1 and 2 and encoder 3
    final static double R = 3.0; // wheel radius in cm
    final static double N = 8192; // encoder ticks per revolution, REV encoder
    final static double cm_per_tick = 2.0 * Math.PI * R / N;

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }

    public void odometry(DcMotor currentRightPosition, DcMotor currentLeftPosition, DcMotor currentAuxPosition) {
        oldRightPosition = currentRightPosition;
        oldLeftPosition = currentLeftPosition;
        oldAuxPosition = currentAuxPosition;

        currentRightPosition = -encoderRight.getCurrentPosition();
        currentLeftPosition = encoderLeft.getCurrentPosition();
        currentAuxPosition = encoderAux.getCurrentPosition();

        int dn1 = currentLeftPosition  - oldLeftPosition;
        int dn2 = currentRightPosition - oldRightPosition;
        int dn3 = currentAuxPosition - oldAuxPosition;

        // the robot has moved and turned a tiny bit between two measurements:
        double dtheta = cm_per_tick * ((dn2-dn1) / (LENGTH));
        double dx = cm_per_tick * ((dn1+dn2) / 2.0);
        double dy = cm_per_tick * (dn3 + ((dn2-dn1) / 2.0));

        telemetrydx = dx;
        telemetrydy = dy;
        telemetrydh = dtheta;

        // small movement of the robot gets added to the field coordinate system:
        pos.h += dtheta / 2;
        pos.x += dx * Math.cos(pos.h) - dy * Math.sin(pos.h);
        pos.y += dx * Math.sin(pos.h) + dy * Math.cos(pos.h);
        pos.h += dtheta / 2;
        pos.h = normDiff(pos.h);
    }



}
