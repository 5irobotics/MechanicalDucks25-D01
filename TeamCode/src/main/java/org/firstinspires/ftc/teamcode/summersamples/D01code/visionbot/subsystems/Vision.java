package org.firstinspires.ftc.teamcode.summersamples.D01code.visionbot.subsystems;

import android.util.Size;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;


@Autonomous
public class Vision extends OpMode{

    private DcMotor FLeft;
    private DcMotor FRight;
    private DcMotor BRight;
    private DcMotor BLeft;
    private AprilTagProcessor Webcam;

    @Override
    public void init() {

        BLeft = hardwareMap.get(DcMotor.class, "BLeft");
        BRight = hardwareMap.get(DcMotor.class, "BRight");
        FLeft = hardwareMap.get(DcMotor.class, "FLeft");
        FRight = hardwareMap.get(DcMotor.class, "FRight");
        Webcam = hardwareMap.get(AprilTagProcessor.class, "Webcam");


        BLeft.setDirection(DcMotor.Direction.REVERSE);
        FLeft.setDirection(DcMotor.Direction.REVERSE);

        AprilTagProcessor tagProcessor = new AprilTagProcessor.Builder()
                .setDrawAxes(true)
                .setDrawCubeProjection(true)
                .setDrawTagID(true)
                .setDrawTagOutline(true)
                .build();

        VisionPortal visionPortal = new VisionPortal.Builder()
                .addProcessor(tagProcessor)
                .setCamera(hardwareMap.get(WebcamName.class, "Webcam"))
                .setCameraResolution(new Size(640, 480))
                .build();

    }

    @Override
    public void loop() {
        if (!Webcam.getDetections().isEmpty()) {
            AprilTagDetection tag = Webcam.getDetections().get(0);
            int detectedTagID = tag.id;

            if (detectedTagID == 4) {
                // The robot has detected AprilTag ID 4, stop moving
                BLeft.setPower(0);
                BRight.setPower(0);
                FLeft.setPower(0);
                FRight.setPower(0);

                telemetry.addData("Detected AprilTag ID 4", true);
                telemetry.update();

                // Add a delay to allow time for telemetry to update and for the robot to stop
                try {
                    wait(1000);// Adjust the sleep time as needed
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                // AprilTag not detected, keep moving
                BLeft.setPower(-0.3);
                BRight.setPower(0.3);
                FLeft.setPower(0.3);
                FRight.setPower(-0.3 );
            }
        }
    }
}
