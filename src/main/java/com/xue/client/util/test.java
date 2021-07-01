package com.xue.client.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class test {
    public void test(){
        List<String> list = new ArrayList<>();
        Set<String> set=new HashSet<String>(list);
        boolean  result= list.size() == set.size() ? true : false;

        List<Obj> objList = new ArrayList<>();
        List<String> itemCodeList = objList.stream().map(Obj::getStr)
                .collect(Collectors.toList());
        long count = objList.stream().distinct().count();
        if (objList.size() != count) {//重复

        }
    }

    class Obj{
        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}
