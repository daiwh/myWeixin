package daiwenhai.weixin;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Appsrart extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE); //去掉标题栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setContentView(R.layout.appsrart);
        Toast.makeText(getApplicationContext(), "欢迎使用此版本的微信", Toast.LENGTH_LONG).show();
       // overridePendingTransition(R.anim.hyperspace_in, R.anim.hyperspace_out);//第一个参数为第一个activity进入时的动画，第二个人参数为第二个activity退出时的动画
       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Appsrart.this, Welcome.class);
                startActivity(intent);
                Appsrart.this.finish();
            }
        }, 1000);
    }
}
