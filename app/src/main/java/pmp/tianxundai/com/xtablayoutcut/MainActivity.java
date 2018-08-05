package pmp.tianxundai.com.xtablayoutcut;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.androidkun.xtablayout.XTabLayout;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    List<Fragment> fragments = new ArrayList<>();
    private XTabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (XTabLayout) findViewById(R.id.xTablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        List<String> titles = new ArrayList<>();
        titles.add("一本");
        titles.add("二本");
        titles.add("三A");
        titles.add("三B");
        titles.add("一本");
        titles.add("二本");
        titles.add("三A");
        titles.add("三B");
        for (int i = 0; i < titles.size(); i++) {
            fragments.add(new BlankFragment(i));
        }
        MyFragmentAdapter adatper = new MyFragmentAdapter(getSupportFragmentManager(), fragments, titles);


        viewPager.setAdapter(adatper);
        viewPager.setOffscreenPageLimit(4);
        //将TabLayout和ViewPager关联起来。

        tabLayout.setupWithViewPager(viewPager);
        //给TabLayout设置适配器
        tabLayout.setupWithViewPager(viewPager);
    }
}
