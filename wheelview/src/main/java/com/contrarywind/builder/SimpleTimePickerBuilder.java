package com.contrarywind.builder;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.view.View;
import android.view.ViewGroup;

import com.contrarywind.configure.SimplePickerOptions;
import com.contrarywind.listener.SimpleCustomListener;
import com.contrarywind.listener.OnSimpleTimeSelectChangeListener;
import com.contrarywind.listener.OnSimpleTimeSelectListener;
import com.contrarywind.view.SimpleTimePickerView;
import com.contrarywind.view.SimpleWheelView;

import java.util.Calendar;

/**
 * Created by xiaosongzeem on 2018/3/20.
 */

public class SimpleTimePickerBuilder {

    private SimplePickerOptions mPickerOptions;

    //Required
    public SimpleTimePickerBuilder(Context context, OnSimpleTimeSelectListener listener) {
        mPickerOptions = new SimplePickerOptions(SimplePickerOptions.TYPE_PICKER_TIME);
        mPickerOptions.context = context;
        mPickerOptions.timeSelectListener = listener;
    }

    //Option
    public SimpleTimePickerBuilder setGravity(int gravity) {
        mPickerOptions.textGravity = gravity;
        return this;
    }

    public SimpleTimePickerBuilder addOnCancelClickListener(View.OnClickListener cancelListener) {
        mPickerOptions.cancelListener = cancelListener;
        return this;
    }

    /**
     * new boolean[]{true, true, true, false, false, false}
     * control the "year","month","day","hours","minutes","seconds " display or hide.
     * 分别控制“年”“月”“日”“时”“分”“秒”的显示或隐藏。
     *
     * @param type 布尔型数组，长度需要设置为6。
     * @return TimePickerBuilder
     */
    public SimpleTimePickerBuilder setType(boolean[] type) {
        mPickerOptions.type = type;
        return this;
    }

    public SimpleTimePickerBuilder setSubmitText(String textContentConfirm) {
        mPickerOptions.textContentConfirm = textContentConfirm;
        return this;
    }

    public SimpleTimePickerBuilder isDialog(boolean isDialog) {
        mPickerOptions.isDialog = isDialog;
        return this;
    }

    public SimpleTimePickerBuilder setCancelText(String textContentCancel) {
        mPickerOptions.textContentCancel = textContentCancel;
        return this;
    }

    public SimpleTimePickerBuilder setTitleText(String textContentTitle) {
        mPickerOptions.textContentTitle = textContentTitle;
        return this;
    }

    public SimpleTimePickerBuilder setSubmitColor(int textColorConfirm) {
        mPickerOptions.textColorConfirm = textColorConfirm;
        return this;
    }

    public SimpleTimePickerBuilder setCancelColor(int textColorCancel) {
        mPickerOptions.textColorCancel = textColorCancel;
        return this;
    }

    /**
     * ViewGroup 类型的容器
     *
     * @param decorView 选择器会被添加到此容器中
     * @return TimePickerBuilder
     */
    public SimpleTimePickerBuilder setDecorView(ViewGroup decorView) {
        mPickerOptions.decorView = decorView;
        return this;
    }

    public SimpleTimePickerBuilder setBgColor(int bgColorWheel) {
        mPickerOptions.bgColorWheel = bgColorWheel;
        return this;
    }

    public SimpleTimePickerBuilder setTitleBgColor(int bgColorTitle) {
        mPickerOptions.bgColorTitle = bgColorTitle;
        return this;
    }

    public SimpleTimePickerBuilder setTitleColor(int textColorTitle) {
        mPickerOptions.textColorTitle = textColorTitle;
        return this;
    }

    public SimpleTimePickerBuilder setSubCalSize(int textSizeSubmitCancel) {
        mPickerOptions.textSizeSubmitCancel = textSizeSubmitCancel;
        return this;
    }

    public SimpleTimePickerBuilder setTitleSize(int textSizeTitle) {
        mPickerOptions.textSizeTitle = textSizeTitle;
        return this;
    }

    public SimpleTimePickerBuilder setContentTextSize(int textSizeContent) {
        mPickerOptions.textSizeContent = textSizeContent;
        return this;
    }

    /**
     * 设置最大可见数目
     *
     * @param count suggest value: 3, 5, 7, 9
     */
    public SimpleTimePickerBuilder setItemVisibleCount(int count) {
        mPickerOptions.itemsVisibleCount = count;
        return this;
    }

    /**
     * 透明度是否渐变
     *
     * @param isAlphaGradient true of false
     */
    public SimpleTimePickerBuilder isAlphaGradient(boolean isAlphaGradient) {
        mPickerOptions.isAlphaGradient = isAlphaGradient;
        return this;
    }

    /**
     * 因为系统Calendar的月份是从0-11的,所以如果是调用Calendar的set方法来设置时间,月份的范围也要是从0-11
     *
     * @param date
     * @return TimePickerBuilder
     */
    public SimpleTimePickerBuilder setDate(Calendar date) {
        mPickerOptions.date = date;
        return this;
    }

    public SimpleTimePickerBuilder setLayoutRes(int res, SimpleCustomListener customListener) {
        mPickerOptions.layoutRes = res;
        mPickerOptions.customListener = customListener;
        return this;
    }


    /**
     * 设置起始时间
     * 因为系统Calendar的月份是从0-11的,所以如果是调用Calendar的set方法来设置时间,月份的范围也要是从0-11
     */

    public SimpleTimePickerBuilder setRangDate(Calendar startDate, Calendar endDate) {
        mPickerOptions.startDate = startDate;
        mPickerOptions.endDate = endDate;
        return this;
    }


    /**
     * 设置间距倍数,但是只能在1.0-4.0f之间
     *
     * @param lineSpacingMultiplier
     */
    public SimpleTimePickerBuilder setLineSpacingMultiplier(float lineSpacingMultiplier) {
        mPickerOptions.lineSpacingMultiplier = lineSpacingMultiplier;
        return this;
    }

    /**
     * 设置分割线的颜色
     *
     * @param dividerColor
     */

    public SimpleTimePickerBuilder setDividerColor(@ColorInt int dividerColor) {
        mPickerOptions.dividerColor = dividerColor;
        return this;
    }

    /**
     * 设置分割线的类型
     *
     * @param dividerType
     */
    public SimpleTimePickerBuilder setDividerType(SimpleWheelView.DividerType dividerType) {
        mPickerOptions.dividerType = dividerType;
        return this;
    }

    /**
     * {@link #setOutSideColor} instead.
     *
     * @param backgroundId color resId.
     */
    @Deprecated
    public SimpleTimePickerBuilder setBackgroundId(int backgroundId) {
        mPickerOptions.outSideColor = backgroundId;
        return this;
    }

    /**
     * 显示时的外部背景色颜色,默认是灰色
     *
     * @param outSideColor
     */
    public SimpleTimePickerBuilder setOutSideColor(@ColorInt int outSideColor) {
        mPickerOptions.outSideColor = outSideColor;
        return this;
    }

    /**
     * 设置分割线之间的文字的颜色
     *
     * @param textColorCenter
     */
    public SimpleTimePickerBuilder setTextColorCenter(@ColorInt int textColorCenter) {
        mPickerOptions.textColorCenter = textColorCenter;
        return this;
    }

    /**
     * 设置分割线以外文字的颜色
     *
     * @param textColorOut
     */
    public SimpleTimePickerBuilder setTextColorOut(@ColorInt int textColorOut) {
        mPickerOptions.textColorOut = textColorOut;
        return this;
    }

    public SimpleTimePickerBuilder isCyclic(boolean cyclic) {
        mPickerOptions.cyclic = cyclic;
        return this;
    }

    public SimpleTimePickerBuilder setOutSideCancelable(boolean cancelable) {
        mPickerOptions.cancelable = cancelable;
        return this;
    }

    public SimpleTimePickerBuilder setLunarCalendar(boolean lunarCalendar) {
        mPickerOptions.isLunarCalendar = lunarCalendar;
        return this;
    }


    public SimpleTimePickerBuilder setLabel(String label_year, String label_month, String label_day, String label_hours, String label_mins, String label_seconds) {
        mPickerOptions.label_year = label_year;
        mPickerOptions.label_month = label_month;
        mPickerOptions.label_day = label_day;
        mPickerOptions.label_hours = label_hours;
        mPickerOptions.label_minutes = label_mins;
        mPickerOptions.label_seconds = label_seconds;
        return this;
    }

    /**
     * 设置X轴倾斜角度[ -90 , 90°]
     *
     * @param x_offset_year    年
     * @param x_offset_month   月
     * @param x_offset_day     日
     * @param x_offset_hours   时
     * @param x_offset_minutes 分
     * @param x_offset_seconds 秒
     * @return
     */
    public SimpleTimePickerBuilder setTextXOffset(int x_offset_year, int x_offset_month, int x_offset_day,
                                                  int x_offset_hours, int x_offset_minutes, int x_offset_seconds) {
        mPickerOptions.x_offset_year = x_offset_year;
        mPickerOptions.x_offset_month = x_offset_month;
        mPickerOptions.x_offset_day = x_offset_day;
        mPickerOptions.x_offset_hours = x_offset_hours;
        mPickerOptions.x_offset_minutes = x_offset_minutes;
        mPickerOptions.x_offset_seconds = x_offset_seconds;
        return this;
    }

    public SimpleTimePickerBuilder isCenterLabel(boolean isCenterLabel) {
        mPickerOptions.isCenterLabel = isCenterLabel;
        return this;
    }

    /**
     * @param listener 切换item项滚动停止时，实时回调监听。
     * @return
     */
    public SimpleTimePickerBuilder setTimeSelectChangeListener(OnSimpleTimeSelectChangeListener listener) {
        mPickerOptions.timeSelectChangeListener = listener;
        return this;
    }

    public SimpleTimePickerView build() {
        return new SimpleTimePickerView(mPickerOptions);
    }
}
