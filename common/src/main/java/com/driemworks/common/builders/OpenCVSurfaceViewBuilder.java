package com.driemworks.common.builders;

import android.app.Activity;
import android.view.View;

import com.driemworks.common.enums.Resolution;
import com.driemworks.common.views.OpenCVSurfaceView;

import org.opencv.android.CameraBridgeViewBase;

/**
 * Builder for a CustomSurfaceView object
 * @author Tony
 */
public class OpenCVSurfaceViewBuilder {

    /**
     * The custom surface view
     */
    private OpenCVSurfaceView openCVSurfaceView;

    /**
     * Constructor for the OpenCVSurfaceViewBuilder
     * @param activity The activity associated with the view
     * @param id The view id in the activity
     */
    public OpenCVSurfaceViewBuilder(Activity activity, int id) {
        openCVSurfaceView = (OpenCVSurfaceView) activity.findViewById(id);
    }

    public OpenCVSurfaceViewBuilder(Activity activity, int id, View.OnTouchListener onTouchListener) {
        openCVSurfaceView = (OpenCVSurfaceView) activity.findViewById(id);
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
    }

    /**
     * Set the CvCameraViewListener
     * @param cameraViewListener The CvCameraViewListener2
     * @return {@link OpenCVSurfaceViewBuilder}
     */
    public OpenCVSurfaceViewBuilder setCvCameraViewListener(
            CameraBridgeViewBase.CvCameraViewListener2 cameraViewListener) {
        openCVSurfaceView.setCvCameraViewListener(cameraViewListener);
        return this;
    }

    /**
     * Set the maximum frame size
     * @param resolution The Resolution to set
     * @return {@link OpenCVSurfaceViewBuilder}
     */
    public OpenCVSurfaceViewBuilder setMaxFrameSize(Resolution resolution) {
        openCVSurfaceView.setMaxFrameSize(resolution.getWidth(), resolution.getHeight());
        return this;
    }

    /**
     * Set the on touch listener
     * @param listener The OnTouchListener
     * @return {@link OpenCVSurfaceViewBuilder}
     */
    public OpenCVSurfaceViewBuilder setOnTouchListener(View.OnTouchListener listener) {
        openCVSurfaceView.setOnTouchListener(listener);
        return this;
    }

    /**
     * Build the CustomSurfaceView
     * @return {@link OpenCVSurfaceView}
     */
    public OpenCVSurfaceView build() {
        return openCVSurfaceView;
    }

}
