package com.dart.carrentalplatform.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 4:49 PM
 */
public class PinyinUtil {

    public static String getHeadPinyin(String str){
        return getPinyin(str,true);
    }
    public static String getPinyin(String str){
        return getPinyin(str,true);
    }
    private static String getPinyin(String str,boolean isHeader){
        HanyuPinyinOutputFormat format=getFormat();
        StringBuilder builder = new StringBuilder();
        try{
            for(int i = 0;i<str.length();i++){
                String[] strs= PinyinHelper.toHanyuPinyinStringArray(str.charAt(i),format);
                if(isHeader)
                    builder.append(strs[0].charAt(0));
                else
                    builder.append(strs[0]);
            }
        }catch (BadHanyuPinyinOutputFormatCombination e){
            e.printStackTrace();
        }
        return builder.toString();
    }

    private static HanyuPinyinOutputFormat getFormat(){
        HanyuPinyinOutputFormat format=new HanyuPinyinOutputFormat();
        format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        return format;
    }

}
