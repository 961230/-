package com.hansol.internprac;

import com.hansol.internprac.preprocess.DecordGZ;
import org.junit.jupiter.api.Test;

public class gunzipTest {
    @Test
    public void 압축해제_테스트(){
        //given
        DecordGZ dz = new DecordGZ();
        //when
        dz.decompress();
        //then

    }
}
