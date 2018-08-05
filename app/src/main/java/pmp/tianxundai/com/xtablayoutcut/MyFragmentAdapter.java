package pmp.tianxundai.com.xtablayoutcut;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 创建人： 九尾妖狐
 * 创建时间： 2018/8/5 21:51
 * 功能描述： 碎片适配器
 * 联系方式：1037438704@qq.com
 * @author dell-pc
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> datas;
    private List<String> titles;

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> datas, List<String> titles) {
        super(fm);
        this.datas = datas;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return datas == null ? null : datas.get(position);
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles == null ? null : titles.get(position);
    }
}