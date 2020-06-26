package com.bigkoo.pickerviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.contrarywind.adapter.SimpleArrayWheelAdapter;
import com.contrarywind.listener.OnSimpleItemSelectedListener;
import com.contrarywind.view.SimpleWheelView;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author: Created by lixiaotong on 2019-07-30
 * e-mail: 516030811@qq.com
 */
public class TestCircleWheelViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_circle_wheelview);

        SimpleWheelView wheelView = findViewById(R.id.wheelview);
        wheelView.setTextSize(20);
        wheelView.setLineSpacingMultiplier(2f);
        // wheelView.setDividerWidth(6);
        wheelView.setDividerType(SimpleWheelView.DividerType.CIRCLE);

        final List<String> mOptionsItems = new ArrayList<>();
        mOptionsItems.add("10");
        mOptionsItems.add("20");
        mOptionsItems.add("30");
        mOptionsItems.add("40");
        mOptionsItems.add("50");
        mOptionsItems.add("60");
        mOptionsItems.add("70");

        wheelView.setAdapter(new SimpleArrayWheelAdapter(mOptionsItems));
        wheelView.setOnItemSelectedListener(new OnSimpleItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(TestCircleWheelViewActivity.this, "" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
