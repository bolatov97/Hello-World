package com.example.demo6.dd;

import org.apache.ibatis.annotations.Select;

public interface Repos {
    @Select("SELECT * FROM Inter")
    Inter findFirst();
}


