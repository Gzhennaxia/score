package com.gzhennaxia.score.mapper;

import com.gzhennaxia.score.entity.Record;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecordMapperTest {

    @Autowired
    private RecordMapper mapper;

    @Test
    public void insert() {

        Record record = new Record();
        record.setTitle("test");
        Integer ret = mapper.insert(record);
        System.out.println(ret);
    }

}