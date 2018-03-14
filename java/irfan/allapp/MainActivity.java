package irfan.allapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button facebook,youtube,ucbrowser,googlemap,paytm,irctc,music,ums,hotstar,gmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facebook=(Button) findViewById(R.id.facebook);
        youtube=(Button) findViewById(R.id.youtube);
        ucbrowser=(Button) findViewById(R.id.ucbrowser);
        googlemap=(Button) findViewById(R.id.google);
        paytm=(Button) findViewById(R.id.paytm);
        music=(Button) findViewById(R.id.music);
        irctc=(Button) findViewById(R.id.irctc);

        ums=(Button) findViewById(R.id.ums);
        hotstar=(Button) findViewById(R.id.hotstar);
        gmail=(Button) findViewById(R.id.gmail);

    }
    public void dothis(View v)
    {
        int k=v.getId();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(k==facebook.getId())
        {
            ft.replace(R.id.frag,new First(),"First");
        }
        else if(k==youtube.getId())
        {
            ft.replace(R.id.frag,new Second(),"Second");
        }
        else if(k==ucbrowser.getId())
        {
            ft.replace(R.id.frag,new Third(),"third");
        }

        else if(k==googlemap.getId())
        {
            ft.replace(R.id.frag,new Fourth(),"fourth");
        }

        else if(k==music.getId())
        {
            ft.replace(R.id.frag,new First(),"five");
        }
        else if(k==paytm.getId())
        {
            ft.replace(R.id.frag,new Six(),"six");
        }

        else if(k==irctc.getId())
        {
            ft.replace(R.id.frag,new Seven(),"seven");
        }

        else if(k==ums.getId())
        {
            ft.replace(R.id.frag,new Eight(),"eight");
        }

        else if(k==hotstar.getId())
        {
            ft.replace(R.id.frag,new Nine(),"nine");
        }

        else if(k==gmail.getId())
        {
            ft.replace(R.id.frag,new Ten(),"ten");
        }

        ft.commit();

    }
}
