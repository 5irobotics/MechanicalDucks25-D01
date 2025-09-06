package org.firstinspires.ftc.teamcode.season.Tele.subsystems;//package org.firstinspires.ftc.teamcode.summersamples.D01code.armbot.subsystems;
//
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.I2cDeviceSynch;
//
//import ftclib.core.sensor.GoBildaPinpointDriver;
//import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;
//
//public class driveAutoClone {
//
//    private final GoBildaPinpointDriver pinpoint;
//
//    // Robot pose (updated from Pinpoint)
//    private double x = 0, y = 0;        // in mm
//    private double heading = 0;         // in radians
//
//    // Adjust based on where your pods are mounted (in millimeters)
//    private static final double X_OFFSET = 0.0;
//    private static final double Y_OFFSET = -100.0;
//
//    public driveAutoClone(HardwareMap hardwareMap) {
//        // Initialize pinpoint device (name must match config)
//        I2cDeviceSynch pinpointDevice = hardwareMap.get(I2cDeviceSynch.class, "pinpoint");
//        pinpoint = new GoBildaPinpointDriver(pinpointDevice);
//
//        // Set pod offsets from robot center (X: forward pod, Y: strafe pod)
//        pinpoint.setOffsets(X_OFFSET, Y_OFFSET);
//
//        // Set the encoder resolution for goBILDA 4-Bar Odometry Pods
//        pinpoint.setEncoderResolution(GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_4_BAR_POD);
//
//        // Set encoder directions if needed (FORWARD is default)
//        pinpoint.setEncoderDirections(
//                GoBildaPinpointDriver.EncoderDirection.FORWARD, // X pod
//                GoBildaPinpointDriver.EncoderDirection.FORWARD  // Y pod
//        );
//
//        // Reset pose and IMU at init
//        pinpoint.resetPosAndIMU();
//    }
//
//    public void update() {
//        pinpoint.update();
//        Pose2D pose = pinpoint.getPosition();
//
//        x = pose.x;
//        y = pose.y;
//        heading = pinpoint.getHeading(); // in radians
//    }
//
//    // Accessors for pose
//    public double getXmm() {
//        return x;
//    }
//
//    public double getYmm() {
//        return y;
//    }
//
//    public double getHeadingRadians() {
//        return heading;
//    }
//
//    public double getHeadingDegrees() {
//        return Math.toDegrees(heading);
//    }
//
//    public void resetPosition() {
//        pinpoint.resetPosAndIMU();
//    }
//}
