package com.jessitron.hg.undeprecate;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;

import java.util.Set;

public class UseDeprecatedMethod {
    public String carrot() {

     //   com/google/common/collect/ConcurrentHashMultiset

        ConcurrentHashMultiset<String> chm = ConcurrentHashMultiset.create();
        chm.add("foo");

        Set<Multiset.Entry<String>> entrySet = chm.createEntrySet();

        int len = entrySet.size();

        return "carrot " + len;
    }
}
