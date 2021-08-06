package net.zerotodev.api.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class MyUtilTest {
    @Mock
    MyUtil myUtil;

    @BeforeEach
    void setUp() {
    MockitoAnnotations.initMocks(this);
    myUtil = new MyUtil();
    }

    @DisplayName("입력한 날짜까지 앞으로 며칠 남았는가 ? ")
    @Test
    void test_howLongRemain() {
        System.out.println(myUtil.howLongRemain(LocalDate.now(), "12","25"));
    }
    @DisplayName("사용한 시간은 얼마인가 ? ")
    @Test
    void test_usedTime() {
        System.out.println(myUtil.usedTime("9", "30","00", "18", "00","00" ));
    }

}