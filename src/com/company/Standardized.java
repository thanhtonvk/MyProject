package com.company;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Standardized {
    public static String Chuanhoaxau(String ten){
        ten = ten.trim();
        ten = ten.toLowerCase();
        String chuoi = "";
        for(int i = 0;i<ten.split("").length;i++){
            if(ten.charAt(i)>='!'&&ten.charAt(i)<='`'){
                continue;
            }
            else chuoi+=ten.charAt(i);
        }
        // Loại bỏ dấu cách
        chuoi = chuoi.replaceAll("\\s+"," ");
        String result="";
        String kq = "";
        for(int i = 0;i<chuoi.split(" ").length;i++){
            result=chuoi.split(" ")[i];
            result = result.replace(result.split("")[0],result.split("")[0].toUpperCase());
            kq +=(" ")+result;
        }
        return kq;
    }
    public static  void Sort(ArrayList<String> arrayList){
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String string1 = Normalizer.normalize(o1, Normalizer.Form.NFKD).replaceAll("\\p{M}","").toLowerCase().replace("đ","d");
                String string2 = Normalizer.normalize(o2,Normalizer.Form.NFKD).replaceAll("\\p{M}","").toLowerCase().replace("đ","d");
                String []tmp1 = string1.strip().split(" ");
                String []tmp2 = string1.strip().split(" ");
                return tmp1[tmp1.length-1].compareToIgnoreCase(tmp2[tmp2.length-1]);
            }
        });
    }
}
