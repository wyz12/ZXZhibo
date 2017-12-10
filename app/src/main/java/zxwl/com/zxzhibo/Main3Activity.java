package zxwl.com.zxzhibo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TXCloudVideoView mView = (TXCloudVideoView)findViewById(R.id.video_view);


        TXLivePlayer mLivePlayer = new TXLivePlayer(Main3Activity.this);


        mLivePlayer.setPlayerView(mView);


        String flvUrl = "http://13746.liveplay.myqcloud.com/live/13746_0b70100b1b.flv";
        mLivePlayer.startPlay(flvUrl, TXLivePlayer.PLAY_TYPE_LIVE_FLV); //推荐FLV
    }
}
