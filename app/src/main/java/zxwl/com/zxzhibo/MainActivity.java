package zxwl.com.zxzhibo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 观看
     */
    private Button mWatch;
    /**
     * 开播
     */
    private Button mLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mWatch = (Button) findViewById(R.id.watch);
        mWatch.setOnClickListener(this);
        mLive = (Button) findViewById(R.id.live);
        mLive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.watch:
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
                break;
            case R.id.live:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;
        }
    }
}
