package com.xue.client.functional;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xue.client.functional.vo.BasisVo;
import com.xue.client.functional.vo.OriginalVo;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConversionTools {

    public List ConversionList(List<OriginalVo> originalList){


        List<BasisVo> generateList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(originalList)) {
            //conversion Object
            generateList = originalList.stream().map(originalVo -> {
                BasisVo basisVo = new BasisVo();
                basisVo.setIntField(originalVo.getAge());
                basisVo.setStrField(originalVo.getName());
                return basisVo;
            }).collect(Collectors.toList());
        }
        System.out.println(JSON.toJSON(generateList));
        return generateList;
    }
}
