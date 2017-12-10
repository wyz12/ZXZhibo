package zxwl.com.zxzhibo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TXLivePusher mLivePusher1 = new TXLivePusher(Main2Activity.this);
        TXLivePushConfig txLivePushConfig1 = new TXLivePushConfig();
        mLivePusher1.setConfig(txLivePushConfig1);
        String rtmpUrl = "rtmp://13746.livepush.myqcloud.com/live/13746_0b70100b1b?bizid=13746&txSecret=66ab00c10bb21c83b9328582df1f00b1&txTime=5A2EAB7F";
        mLivePusher1.startPusher(rtmpUrl);


        TXCloudVideoView mCaptureView = (TXCloudVideoView) findViewById(R.id.video_view);
        mLivePusher1.startCameraPreview(mCaptureView);

    }
}
